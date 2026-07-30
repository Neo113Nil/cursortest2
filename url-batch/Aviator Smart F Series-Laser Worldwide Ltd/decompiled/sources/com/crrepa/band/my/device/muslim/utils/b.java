package com.crrepa.band.my.device.muslim.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.muslim.model.AllahName;
import com.crrepa.band.my.training.GpsStateChangeReceiver;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.crrepa.band.my.training.utils.h;
import com.crrepa.ble.conn.bean.CRPMuslimLocationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimPrayerCalculationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimTasbihSettingInfo;
import com.crrepa.ble.conn.type.CRPMuslimPrayerAsrCalculationType;
import com.crrepa.ble.conn.type.CRPMuslimPrayerCalculationType;
import com.crrepa.ble.conn.type.CRPMuslimPrayerNotifcationType;
import com.github.mikephil.charting.utils.i;
import com.orhanobut.logger.f;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class b {
    private static b instance;
    public static double latitude;
    public static double longitude;

    class a implements Observer {
        a() {
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
            b.setLocationError();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public void onNext(LocationCityInfo locationCityInfo) {
            f.d("muslim ==> 同步获取 经度：" + locationCityInfo.getLongitude() + " 纬度：" + locationCityInfo.getLatitude());
            if (locationCityInfo.getLatitude() == i.DOUBLE_EPSILON || locationCityInfo.getLongitude() == i.DOUBLE_EPSILON) {
                b.setLocationError();
                return;
            }
            b.latitude = locationCityInfo.getLatitude();
            b.longitude = locationCityInfo.getLongitude();
            b.this.sendMuslimLocation();
        }
    }

    /* renamed from: com.crrepa.band.my.device.muslim.utils.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C0180b {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType;

        static {
            int[] iArr = new int[CRPMuslimPrayerCalculationType.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType = iArr;
            try {
                iArr[CRPMuslimPrayerCalculationType.JAFARI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType[CRPMuslimPrayerCalculationType.KARACHI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType[CRPMuslimPrayerCalculationType.MWL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType[CRPMuslimPrayerCalculationType.ISNA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType[CRPMuslimPrayerCalculationType.MAKKAH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType[CRPMuslimPrayerCalculationType.SIHAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static b getInstance() {
        if (instance == null) {
            synchronized (b.class) {
                try {
                    if (instance == null) {
                        instance = new b();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public static boolean isLocationError() {
        return latitude == i.DOUBLE_EPSILON && longitude == i.DOUBLE_EPSILON;
    }

    private void sendSyncMuslimAllahNameList() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AllahName allahName : c.getAllahNameList()) {
            if (allahName.isFavorite()) {
                arrayList.add(Integer.valueOf(allahName.getIndex() - 1));
            } else {
                arrayList2.add(Integer.valueOf(allahName.getIndex() - 1));
            }
        }
        f.d("watch-muslim ==> sendSyncAllahName-favoriteList : " + arrayList);
        i4.getInstance().sendMuslimNameState(true, arrayList);
        f.d("watch-muslim ==> sendSyncAllahName-cancelList : " + arrayList2);
        i4.getInstance().sendMuslimNameState(false, arrayList2);
    }

    private void sendSyncMuslimPrayerCalculationType() {
        sendMuslimPrayMethodType();
    }

    private void sendSyncMuslimPrayerNotification() {
        sendMuslimPraySwitchArray(c.getPraySwitchState(), c.getPrayTimeSwitchArray(false));
    }

    private void sendSyncMuslimTasbihSetting() {
        sendMuslimTasbihSetting(null);
    }

    public static void setLocationError() {
        latitude = i.DOUBLE_EPSILON;
        longitude = i.DOUBLE_EPSILON;
    }

    public CRPMuslimPrayerAsrCalculationType getAsrCalculationType(int i8) {
        return i8 == 1 ? CRPMuslimPrayerAsrCalculationType.HANAFI : CRPMuslimPrayerAsrCalculationType.SHAFII;
    }

    public int getAsrMethodType(CRPMuslimPrayerAsrCalculationType cRPMuslimPrayerAsrCalculationType) {
        return cRPMuslimPrayerAsrCalculationType == CRPMuslimPrayerAsrCalculationType.HANAFI ? 1 : 0;
    }

    public CRPMuslimPrayerCalculationType getCalculationType(int i8) {
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? CRPMuslimPrayerCalculationType.MWL : CRPMuslimPrayerCalculationType.SIHAT : CRPMuslimPrayerCalculationType.MAKKAH : CRPMuslimPrayerCalculationType.ISNA : CRPMuslimPrayerCalculationType.MWL : CRPMuslimPrayerCalculationType.KARACHI : CRPMuslimPrayerCalculationType.JAFARI;
    }

    public int getMethodType(CRPMuslimPrayerCalculationType cRPMuslimPrayerCalculationType) {
        int i8 = C0180b.$SwitchMap$com$crrepa$ble$conn$type$CRPMuslimPrayerCalculationType[cRPMuslimPrayerCalculationType.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 4) {
            return 3;
        }
        if (i8 != 5) {
            return i8 != 6 ? 2 : 5;
        }
        return 4;
    }

    public boolean[] getPrayTypeStatusArray(Map<CRPMuslimPrayerNotifcationType, Boolean> map) {
        Boolean bool = Boolean.TRUE;
        return new boolean[]{bool.equals(map.get(CRPMuslimPrayerNotifcationType.FAJR)), bool.equals(map.get(CRPMuslimPrayerNotifcationType.SUNRISE)), bool.equals(map.get(CRPMuslimPrayerNotifcationType.DHUHR)), bool.equals(map.get(CRPMuslimPrayerNotifcationType.ASR)), bool.equals(map.get(CRPMuslimPrayerNotifcationType.MAGHRIB)), bool.equals(map.get(CRPMuslimPrayerNotifcationType.ISHA))};
    }

    public int getTasbihRepeatMode(boolean[] zArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < zArr.length; i9++) {
            if (zArr[i9]) {
                i8 = (int) (i8 + Math.pow(2.0d, i9));
            }
        }
        return i8;
    }

    public boolean[] getWeekDateStateArray(int i8) {
        boolean[] zArr = new boolean[7];
        for (int i9 = 0; i9 < 7; i9++) {
            boolean z7 = true;
            if ((i8 / ((int) Math.pow(2.0d, i9))) % 2 != 1) {
                z7 = false;
            }
            zArr[i9] = z7;
        }
        return zArr;
    }

    public void querySyncMuslimData(Context context, h1.a aVar) {
        i4.getInstance().queryMuslimTasbihSetting(aVar);
        i4.getInstance().queryMuslimPrayerNotification();
        i4.getInstance().queryMuslimPrayerCalculationType();
        i4.getInstance().queryMuslimPrayerCompensation(new i1.b());
        sendLocationChange(context);
    }

    public GpsStateChangeReceiver registerGpsStateChangeReceiver(Context context) {
        GpsStateChangeReceiver gpsStateChangeReceiver = new GpsStateChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(gpsStateChangeReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(gpsStateChangeReceiver, intentFilter);
        }
        return gpsStateChangeReceiver;
    }

    public void sendLocationChange(Context context) {
        h.getLocationAddress(context).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    public void sendMuslimAllahNameList(boolean z7, int i8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i8 - 1));
        f.d("watch-muslim ==> sendAllahNameChange-isFavorite : " + z7 + "; indexList : " + arrayList);
        i4.getInstance().sendMuslimNameState(z7, arrayList);
    }

    public void sendMuslimLocation() {
        CRPMuslimLocationInfo cRPMuslimLocationInfo = new CRPMuslimLocationInfo(latitude, longitude, TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000);
        f.d("watch-muslim ==> sendMuslimLocation-locationInfo : " + cRPMuslimLocationInfo);
        i4.getInstance().sendMuslimLocation(cRPMuslimLocationInfo);
    }

    public void sendMuslimPrayMethodType() {
        CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo = new CRPMuslimPrayerCalculationInfo();
        CRPMuslimPrayerCalculationType calculationType = getCalculationType(c.getPrayMethod());
        f.d("watch-muslim ==> sendMethodTypeChange-methodType : " + calculationType);
        cRPMuslimPrayerCalculationInfo.setType(calculationType);
        if (c.isShowAsrMethod()) {
            CRPMuslimPrayerAsrCalculationType asrCalculationType = getAsrCalculationType(c.getAsrJuristicMethod());
            cRPMuslimPrayerCalculationInfo.setAsrType(asrCalculationType);
            f.d("watch-muslim ==> sendMethodTypeChange-asrMethodType : " + asrCalculationType);
        }
        i4.getInstance().sendMuslimPrayerCalculationType(cRPMuslimPrayerCalculationInfo);
    }

    public void sendMuslimPraySwitchArray(boolean z7, boolean[] zArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(CRPMuslimPrayerNotifcationType.FAJR, Boolean.valueOf(z7 && zArr[0]));
        hashMap.put(CRPMuslimPrayerNotifcationType.SUNRISE, Boolean.valueOf(z7 && zArr[1]));
        hashMap.put(CRPMuslimPrayerNotifcationType.DHUHR, Boolean.valueOf(z7 && zArr[2]));
        hashMap.put(CRPMuslimPrayerNotifcationType.ASR, Boolean.valueOf(z7 && zArr[3]));
        hashMap.put(CRPMuslimPrayerNotifcationType.MAGHRIB, Boolean.valueOf(z7 && zArr[4]));
        hashMap.put(CRPMuslimPrayerNotifcationType.ISHA, Boolean.valueOf(z7 && zArr[5]));
        f.d("watch-muslim ==> sendPraySwitchChange-isOpen : " + z7 + "; switchStatusArray : " + Arrays.toString(zArr));
        StringBuilder sb = new StringBuilder();
        sb.append("watch-muslim ==> sendPraySwitchChange-statusMap : ");
        sb.append(hashMap);
        f.d(sb.toString());
        i4.getInstance().sendMuslimPrayerNotification(z7, hashMap);
    }

    public void sendMuslimTasbihSetting(CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo) {
        if (cRPMuslimTasbihSettingInfo == null) {
            cRPMuslimTasbihSettingInfo = new CRPMuslimTasbihSettingInfo();
            cRPMuslimTasbihSettingInfo.setEnable(c.getTasbihSwitchState());
            cRPMuslimTasbihSettingInfo.setInterval((byte) c.getTasbihIntervalTime());
            int[] tasbihStartTime = c.getTasbihStartTime();
            cRPMuslimTasbihSettingInfo.setStartHour((byte) tasbihStartTime[0]);
            cRPMuslimTasbihSettingInfo.setStartMinutes((byte) tasbihStartTime[1]);
            int[] tasbihEndTime = c.getTasbihEndTime();
            cRPMuslimTasbihSettingInfo.setEndHour((byte) tasbihEndTime[0]);
            cRPMuslimTasbihSettingInfo.setEndMinutes((byte) tasbihEndTime[1]);
            cRPMuslimTasbihSettingInfo.setRepeatMode((byte) getTasbihRepeatMode(c.getTasbihWeekDateStateArray(false)));
        }
        f.d("watch-muslim ==> sendTasbihSettingChange-settingInfo : " + cRPMuslimTasbihSettingInfo);
        i4.getInstance().sendMuslimTasbihSetting(cRPMuslimTasbihSettingInfo);
    }

    public void sendSyncMuslimData(Context context) {
        sendSyncMuslimPrayerCalculationType();
        sendSyncMuslimPrayerNotification();
        sendSyncMuslimTasbihSetting();
        sendSyncMuslimAllahNameList();
        sendLocationChange(context);
    }

    public void unregisterGpsStateChangeReceiver(Context context, GpsStateChangeReceiver gpsStateChangeReceiver) {
        context.unregisterReceiver(gpsStateChangeReceiver);
    }
}
