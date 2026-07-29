package com.aiming.mdt.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.aiming.mdt.a.C0097;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0290;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.aiming.mdt.a.ʽʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0162 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String f539 = "KEY,VALUE";

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String f540 = "table_core";

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String f541 = "KEY VARCHAR(30),VALUE VARCHAR";

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String f542 = "adtiming.db";

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f543 = 1;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private Map<String, Object> f544;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private ReadWriteLock f545;

    /* renamed from: ʾ, reason: contains not printable characters */
    private C0097 f546;

    /* renamed from: com.aiming.mdt.a.ʽʿˈˉ$ʻʽ, reason: contains not printable characters */
    static final class C0163 {

        /* renamed from: ʽ, reason: contains not printable characters */
        private static C0162 f547 = new C0162(0);
    }

    private C0162() {
        this.f544 = new HashMap();
        this.f545 = new ReentrantReadWriteLock();
    }

    /* synthetic */ C0162(byte b2) {
        this();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m617(Map<String, Object> map) {
        this.f545.writeLock().lock();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            String key = next.getKey();
            Object value = next.getValue();
            if (this.f544.containsKey(key)) {
                Object obj = this.f544.get(key);
                if (obj == null || obj.equals(value)) {
                    it.remove();
                } else {
                    arrayList.add(key);
                }
            }
        }
        if (arrayList.size() != 0) {
            m625((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        if (map.size() != 0) {
            String[] strArr = new String[map.size()];
            int i = 0;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                strArr[i] = String.format("\"%s\",\"%s\"", entry.getKey(), entry.getValue());
                i++;
            }
            if (this.f546.m371(f540, f539, strArr)) {
                this.f544.putAll(map);
            }
        }
        this.f545.writeLock().unlock();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static <T> T m618(Class<T> cls, Object obj) {
        try {
            String valueOf = String.valueOf(obj);
            if (cls == String.class) {
                obj = (T) String.valueOf(valueOf);
            } else if (cls == Integer.TYPE) {
                obj = (T) Integer.valueOf(valueOf);
            } else if (cls == Long.TYPE) {
                obj = (T) Long.valueOf(valueOf);
            } else if (cls == Float.TYPE) {
                obj = (T) Float.valueOf(valueOf);
            } else if (cls == Boolean.TYPE) {
                obj = (T) Boolean.valueOf(valueOf);
            } else if (cls == Double.TYPE) {
                obj = (T) Double.valueOf(valueOf);
            }
            return (T) obj;
        } catch (Exception e) {
            C0282.m972("DataCache", e);
            C0076.m232().m236(e);
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static C0162 m619() {
        return C0163.f547;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m620(Context context) {
        C0097 c0097;
        int i;
        int i2;
        TelephonyManager telephonyManager;
        c0097 = C0097.C0098.f291;
        this.f546 = c0097;
        this.f546.m368(context, f542, f543);
        this.f546.m367(f540, f541);
        this.f545.readLock().lock();
        try {
            ArrayList<String[]> m372 = this.f546.m372(f540, f539, new String[0]);
            if (m372 != null) {
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < m372.size(); i5++) {
                    String[] strArr = m372.get(i5);
                    if (i5 == 0) {
                        int i6 = i4;
                        int i7 = i3;
                        for (int i8 = 0; i8 < strArr.length; i8++) {
                            String str = strArr[i8];
                            if (str.equals("KEY")) {
                                i7 = i8;
                            }
                            if (str.equals("VALUE")) {
                                i6 = i8;
                            }
                        }
                        i3 = i7;
                        i4 = i6;
                    } else {
                        this.f544.put(strArr[i3], strArr[i4]);
                    }
                }
            }
        } catch (Exception e) {
            C0282.m972("DataCache", e);
            C0076.m232().m236(e);
        }
        this.f545.readLock().unlock();
        HashMap hashMap = new HashMap();
        hashMap.put("Device", Build.DEVICE);
        hashMap.put("Brand", Build.BRAND);
        hashMap.put("Model", Build.MODEL);
        hashMap.put("Product", Build.PRODUCT);
        hashMap.put("Manufacturer", Build.MANUFACTURER);
        hashMap.put("SDKVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("OSVersion", Build.VERSION.RELEASE);
        hashMap.put("OSBuild", Build.ID);
        hashMap.put("Display", Build.DISPLAY);
        m617(hashMap);
        m617(C0290.m981(context));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("Lang", Locale.getDefault().getDisplayLanguage());
        hashMap2.put("LangCode", Locale.getDefault().getLanguage());
        m617(hashMap2);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i9 = resources.getConfiguration().screenLayout;
        int i10 = displayMetrics.densityDpi;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 < 140) {
                i = 0;
            } else if (i10 > 200) {
                i = 2;
            }
            i2 = i9 & 15;
            switch (i2) {
                case 1:
                    i11 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i11 = 3;
                    break;
                case 4:
                    i11 = 4;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("DeviceType", Integer.valueOf(i2 >= 3 ? 1 : 0));
            hashMap3.put("WidthPixels", Integer.valueOf(displayMetrics.widthPixels));
            hashMap3.put("HeightPixels", Integer.valueOf(displayMetrics.heightPixels));
            hashMap3.put("DensityLevel", Integer.valueOf(i));
            hashMap3.put("ScreenSize", Integer.valueOf(i11));
            hashMap3.put("ScreenType", Integer.valueOf(i2));
            hashMap3.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap3.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            hashMap3.put("densityDpi", Integer.valueOf(i10));
            m617(hashMap3);
            m617(C0290.m985(context));
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            HashMap hashMap4 = new HashMap();
            if (telephonyManager != null) {
                hashMap4.put("NetworkOperator", telephonyManager.getNetworkOperatorName());
                hashMap4.put("NetworkIso", telephonyManager.getNetworkCountryIso());
                hashMap4.put("SimOperator", telephonyManager.getSimOperatorName());
                hashMap4.put("SimIso", telephonyManager.getSimCountryIso());
            }
            m617(hashMap4);
        }
        i = 1;
        i2 = i9 & 15;
        switch (i2) {
        }
        HashMap hashMap32 = new HashMap();
        hashMap32.put("DeviceType", Integer.valueOf(i2 >= 3 ? 1 : 0));
        hashMap32.put("WidthPixels", Integer.valueOf(displayMetrics.widthPixels));
        hashMap32.put("HeightPixels", Integer.valueOf(displayMetrics.heightPixels));
        hashMap32.put("DensityLevel", Integer.valueOf(i));
        hashMap32.put("ScreenSize", Integer.valueOf(i11));
        hashMap32.put("ScreenType", Integer.valueOf(i2));
        hashMap32.put("xdpi", Float.valueOf(displayMetrics.xdpi));
        hashMap32.put("ydpi", Float.valueOf(displayMetrics.ydpi));
        hashMap32.put("densityDpi", Integer.valueOf(i10));
        m617(hashMap32);
        m617(C0290.m985(context));
        telephonyManager = (TelephonyManager) context.getSystemService("phone");
        HashMap hashMap42 = new HashMap();
        if (telephonyManager != null) {
        }
        m617(hashMap42);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m621(String str, Object obj) {
        Object obj2;
        this.f545.writeLock().lock();
        if (!this.f544.containsKey(str) || ((obj2 = this.f544.get(str)) != null && !obj2.equals(obj))) {
            this.f544.put(str, obj);
        }
        this.f545.writeLock().unlock();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final <T> T m622(String str, Class<T> cls) {
        this.f545.readLock().lock();
        T t = this.f544.containsKey(str) ? (T) m618(cls, this.f544.get(str)) : null;
        this.f545.readLock().unlock();
        return t;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final boolean m623(String str) {
        return this.f544.containsKey(str);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m624(String str, Object obj) {
        Map<String, Object> map;
        if (this.f546 == null) {
            return;
        }
        this.f545.writeLock().lock();
        try {
        } catch (Exception e) {
            C0282.m972("AdtAds init", e);
            C0076.m232().m236(e);
        }
        if (!this.f544.containsKey(str)) {
            if (this.f546.m371(f540, f539, String.format("\"%s\",\"%s\"", str, obj))) {
                map = this.f544;
            }
            this.f545.writeLock().unlock();
        } else {
            Object obj2 = this.f544.get(str);
            if (obj2 != null && !obj2.equals(obj) && this.f546.m370(f540, new String[]{String.format("%s=\"%s\"", "VALUE", obj)}, String.format("%s=\"%s\"", "KEY", str))) {
                map = this.f544;
            }
            this.f545.writeLock().unlock();
        }
        map.put(str, obj);
        this.f545.writeLock().unlock();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m625(String... strArr) {
        if (this.f546 == null) {
            return;
        }
        this.f545.writeLock().lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (this.f544.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != 0) {
                if (this.f546.m369(f540, "KEY", (String[]) arrayList.toArray(new String[arrayList.size()]))) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        this.f544.remove(arrayList.get(i));
                    }
                }
            }
        } catch (Exception e) {
            C0282.m972("AdtAds init", e);
            C0076.m232().m236(e);
        }
        this.f545.writeLock().unlock();
    }
}
