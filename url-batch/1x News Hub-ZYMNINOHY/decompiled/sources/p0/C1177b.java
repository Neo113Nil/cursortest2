package p0;

import E1.AbstractActivityC0029e;
import O1.g;
import P1.q;
import P1.r;
import a.AbstractC0129a;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import io.appmetrica.analytics.impl.C0642l9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177b implements q, r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10213a;

    /* renamed from: b, reason: collision with root package name */
    public g f10214b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0029e f10215c;

    /* renamed from: d, reason: collision with root package name */
    public int f10216d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f10217e;

    public C1177b(Context context) {
        this.f10213a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P1.q
    public final boolean a(int i3, int i4, Intent intent) {
        boolean z;
        int i5;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i6;
        AbstractActivityC0029e abstractActivityC0029e = this.f10215c;
        boolean z2 = false;
        z2 = false;
        if (abstractActivityC0029e != null) {
            if (this.f10217e == null) {
                this.f10216d = 0;
                return false;
            }
            if (i3 == 209) {
                Context context = this.f10213a;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    z2 = true;
                }
                i5 = 16;
                i6 = z2;
            } else if (i3 == 210) {
                if (Build.VERSION.SDK_INT >= 30) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    i5 = 22;
                    i6 = isExternalStorageManager;
                }
            } else if (i3 == 211) {
                i5 = 23;
                i6 = Settings.canDrawOverlays(abstractActivityC0029e);
            } else if (i3 == 212) {
                if (Build.VERSION.SDK_INT >= 26) {
                    canRequestPackageInstalls = abstractActivityC0029e.getPackageManager().canRequestPackageInstalls();
                    i5 = 24;
                    i6 = canRequestPackageInstalls;
                }
            } else if (i3 == 213) {
                i5 = 27;
                i6 = ((NotificationManager) abstractActivityC0029e.getSystemService("notification")).isNotificationPolicyAccessGranted();
            } else if (i3 == 214) {
                AlarmManager alarmManager = (AlarmManager) abstractActivityC0029e.getSystemService("alarm");
                if (Build.VERSION.SDK_INT >= 31) {
                    canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                    z = canScheduleExactAlarms;
                } else {
                    z = true;
                }
                i5 = 34;
                i6 = z;
            }
            this.f10217e.put(Integer.valueOf(i5), Integer.valueOf(i6));
            int i7 = this.f10216d - 1;
            this.f10216d = i7;
            g gVar = this.f10214b;
            if (gVar != null && i7 == 0) {
                gVar.f1173a.success(this.f10217e);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // P1.r
    public final boolean b(int i3, String[] strArr, int[] iArr) {
        int i4;
        int i5 = 4;
        int i6 = 7;
        int i7 = 3;
        if (i3 != 24) {
            this.f10216d = 0;
            return false;
        }
        if (this.f10217e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List asList = Arrays.asList(strArr);
        int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
        if (indexOf >= 0) {
            int J2 = S0.a.J(this.f10215c, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
            this.f10217e.put(36, Integer.valueOf(J2));
            int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
            if (indexOf2 >= 0) {
                int J3 = S0.a.J(this.f10215c, "android.permission.READ_CALENDAR", iArr[indexOf2]);
                Integer valueOf = Integer.valueOf(J2);
                Integer valueOf2 = Integer.valueOf(J3);
                HashSet hashSet = new HashSet();
                hashSet.add(valueOf);
                hashSet.add(valueOf2);
                Integer I2 = S0.a.I(hashSet);
                this.f10217e.put(37, I2);
                this.f10217e.put(0, I2);
            }
        }
        int i8 = 0;
        while (i8 < strArr.length) {
            String str = strArr[i8];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                int i9 = -1;
                switch (str.hashCode()) {
                    case -2062386608:
                        if (str.equals("android.permission.READ_SMS")) {
                            i9 = 0;
                            break;
                        }
                        break;
                    case -1928411001:
                        if (str.equals("android.permission.READ_CALENDAR")) {
                            i9 = 1;
                            break;
                        }
                        break;
                    case -1925850455:
                        if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                            i9 = 2;
                            break;
                        }
                        break;
                    case -1921431796:
                        if (str.equals("android.permission.READ_CALL_LOG")) {
                            i9 = i7;
                            break;
                        }
                        break;
                    case -1888586689:
                        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                            i9 = i5;
                            break;
                        }
                        break;
                    case -1813079487:
                        if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                            i9 = 5;
                            break;
                        }
                        break;
                    case -1783097621:
                        if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                            i9 = 6;
                            break;
                        }
                        break;
                    case -1561629405:
                        if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                            i9 = i6;
                            break;
                        }
                        break;
                    case -1479758289:
                        if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                            i9 = 8;
                            break;
                        }
                        break;
                    case -1238066820:
                        if (str.equals("android.permission.BODY_SENSORS")) {
                            i9 = 9;
                            break;
                        }
                        break;
                    case -1164582768:
                        if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                            i9 = 10;
                            break;
                        }
                        break;
                    case -909527021:
                        if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                            i9 = 11;
                            break;
                        }
                        break;
                    case -895679497:
                        if (str.equals("android.permission.RECEIVE_MMS")) {
                            i9 = 12;
                            break;
                        }
                        break;
                    case -895673731:
                        if (str.equals("android.permission.RECEIVE_SMS")) {
                            i9 = 13;
                            break;
                        }
                        break;
                    case -798669607:
                        if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                            i9 = 14;
                            break;
                        }
                        break;
                    case -406040016:
                        if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                            i9 = 15;
                            break;
                        }
                        break;
                    case -63024214:
                        if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                            i9 = 16;
                            break;
                        }
                        break;
                    case -5573545:
                        if (str.equals("android.permission.READ_PHONE_STATE")) {
                            i9 = 17;
                            break;
                        }
                        break;
                    case 52602690:
                        if (str.equals("android.permission.SEND_SMS")) {
                            i9 = 18;
                            break;
                        }
                        break;
                    case 112197485:
                        if (str.equals("android.permission.CALL_PHONE")) {
                            i9 = 19;
                            break;
                        }
                        break;
                    case 175802396:
                        if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                            i9 = 20;
                            break;
                        }
                        break;
                    case 214526995:
                        if (str.equals("android.permission.WRITE_CONTACTS")) {
                            i9 = 21;
                            break;
                        }
                        break;
                    case 361658321:
                        if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                            i9 = 22;
                            break;
                        }
                        break;
                    case 463403621:
                        if (str.equals("android.permission.CAMERA")) {
                            i9 = 23;
                            break;
                        }
                        break;
                    case 603653886:
                        if (str.equals("android.permission.WRITE_CALENDAR")) {
                            i9 = 24;
                            break;
                        }
                        break;
                    case 610633091:
                        if (str.equals("android.permission.WRITE_CALL_LOG")) {
                            i9 = 25;
                            break;
                        }
                        break;
                    case 691260818:
                        if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                            i9 = 26;
                            break;
                        }
                        break;
                    case 710297143:
                        if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                            i9 = 27;
                            break;
                        }
                        break;
                    case 784519842:
                        if (str.equals("android.permission.USE_SIP")) {
                            i9 = 28;
                            break;
                        }
                        break;
                    case 970694249:
                        if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                            i9 = 29;
                            break;
                        }
                        break;
                    case 1166454870:
                        if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                            i9 = 30;
                            break;
                        }
                        break;
                    case 1271781903:
                        if (str.equals("android.permission.GET_ACCOUNTS")) {
                            i9 = 31;
                            break;
                        }
                        break;
                    case 1365911975:
                        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            i9 = 32;
                            break;
                        }
                        break;
                    case 1777263169:
                        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                            i9 = 33;
                            break;
                        }
                        break;
                    case 1780337063:
                        if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                            i9 = 34;
                            break;
                        }
                        break;
                    case 1831139720:
                        if (str.equals("android.permission.RECORD_AUDIO")) {
                            i9 = 35;
                            break;
                        }
                        break;
                    case 1977429404:
                        if (str.equals("android.permission.READ_CONTACTS")) {
                            i9 = 36;
                            break;
                        }
                        break;
                    case 2024715147:
                        if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                            i9 = 37;
                            break;
                        }
                        break;
                    case 2062356686:
                        if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                            i9 = 38;
                            break;
                        }
                        break;
                    case 2114579147:
                        if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                            i9 = 39;
                            break;
                        }
                        break;
                    case 2133799037:
                        if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                            i9 = 40;
                            break;
                        }
                        break;
                }
                switch (i9) {
                    case 0:
                    case 8:
                    case 12:
                    case 13:
                    case 18:
                        i4 = 13;
                        break;
                    case 1:
                    case 24:
                        i4 = 0;
                        break;
                    case 2:
                        i4 = 17;
                        break;
                    case 3:
                    case 10:
                    case 17:
                    case C0642l9.f7777C /* 19 */:
                    case C0642l9.f7780F /* 25 */:
                    case 28:
                    case C0642l9.L /* 40 */:
                        i4 = 8;
                        break;
                    case 4:
                    case 16:
                        i4 = i7;
                        break;
                    case 5:
                        i4 = 22;
                        break;
                    case 6:
                        i4 = 27;
                        break;
                    case 7:
                        i4 = 23;
                        break;
                    case 9:
                        i4 = 12;
                        break;
                    case 11:
                        i4 = 31;
                        break;
                    case 14:
                        i4 = 30;
                        break;
                    case 15:
                    case 32:
                        i4 = 15;
                        break;
                    case C0642l9.f7778D /* 20 */:
                        i4 = 9;
                        break;
                    case C0642l9.f7779E /* 21 */:
                    case 31:
                    case 36:
                        i4 = 2;
                        break;
                    case 22:
                        i4 = 35;
                        break;
                    case 23:
                        i4 = 1;
                        break;
                    case C0642l9.f7781G /* 26 */:
                        i4 = 33;
                        break;
                    case C0642l9.f7782H /* 27 */:
                        i4 = 32;
                        break;
                    case C0642l9.f7783I /* 29 */:
                        i4 = 34;
                        break;
                    case 30:
                        i4 = 29;
                        break;
                    case 33:
                        i4 = 24;
                        break;
                    case 34:
                        i4 = 19;
                        break;
                    case C0642l9.f7784J /* 35 */:
                        i4 = i6;
                        break;
                    case 37:
                        i4 = i5;
                        break;
                    case C0642l9.f7785K /* 38 */:
                        i4 = 28;
                        break;
                    case 39:
                        i4 = 18;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                if (i4 != 20) {
                    int i10 = iArr[i8];
                    if (i4 == 8) {
                        Integer num = (Integer) this.f10217e.get(8);
                        Integer valueOf3 = Integer.valueOf(S0.a.J(this.f10215c, str, i10));
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(num);
                        hashSet2.add(valueOf3);
                        this.f10217e.put(8, S0.a.I(hashSet2));
                    } else if (i4 == i6) {
                        if (!this.f10217e.containsKey(Integer.valueOf(i6))) {
                            this.f10217e.put(Integer.valueOf(i6), Integer.valueOf(S0.a.J(this.f10215c, str, i10)));
                        }
                        if (!this.f10217e.containsKey(14)) {
                            this.f10217e.put(14, Integer.valueOf(S0.a.J(this.f10215c, str, i10)));
                        }
                    } else if (i4 == i5) {
                        int J4 = S0.a.J(this.f10215c, str, i10);
                        if (!this.f10217e.containsKey(Integer.valueOf(i5))) {
                            this.f10217e.put(Integer.valueOf(i5), Integer.valueOf(J4));
                        }
                    } else if (i4 == i7) {
                        int J5 = S0.a.J(this.f10215c, str, i10);
                        if (Build.VERSION.SDK_INT < 29 && !this.f10217e.containsKey(Integer.valueOf(i5))) {
                            this.f10217e.put(Integer.valueOf(i5), Integer.valueOf(J5));
                        }
                        if (!this.f10217e.containsKey(5)) {
                            this.f10217e.put(5, Integer.valueOf(J5));
                        }
                        this.f10217e.put(Integer.valueOf(i4), Integer.valueOf(J5));
                    } else {
                        if (i4 == 9 || i4 == 32) {
                            this.f10217e.put(Integer.valueOf(i4), Integer.valueOf(c(i4)));
                        } else if (!this.f10217e.containsKey(Integer.valueOf(i4))) {
                            this.f10217e.put(Integer.valueOf(i4), Integer.valueOf(S0.a.J(this.f10215c, str, i10)));
                        }
                        i8++;
                        i7 = 3;
                        i5 = 4;
                        i6 = 7;
                    }
                }
            }
            i8++;
            i7 = 3;
            i5 = 4;
            i6 = 7;
        }
        int length = this.f10216d - iArr.length;
        this.f10216d = length;
        g gVar = this.f10214b;
        if (gVar != null && length == 0) {
            gVar.f1173a.success(this.f10217e);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (new t.g(r6).f10354a.areNotificationsEnabled() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(int i3) {
        int i4;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i5 = 1;
        Context context = this.f10213a;
        if (i3 == 17) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    return S0.a.h(this.f10215c, "android.permission.POST_NOTIFICATIONS");
                }
            }
            return 1;
        }
        if (i3 == 21) {
            ArrayList n3 = S0.a.n(context, 21);
            if (n3 != null && !n3.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i3 == 30 || i3 == 28 || i3 == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList n4 = S0.a.n(context, 21);
            if (n4 != null && !n4.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i3 != 37 && i3 != 0) || d()) {
            ArrayList n5 = S0.a.n(context, i3);
            if (n5 == null) {
                Log.d("permissions_handler", "No android specific permissions needed for: " + i3);
                return 1;
            }
            if (n5.size() != 0) {
                if (context.getApplicationInfo().targetSdkVersion >= 23) {
                    HashSet hashSet = new HashSet();
                    Iterator it = n5.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (i3 == 16) {
                            String packageName = context.getPackageName();
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                                hashSet.add(0);
                            } else {
                                hashSet.add(1);
                            }
                        } else if (i3 == 22) {
                            if (Build.VERSION.SDK_INT < 30) {
                                hashSet.add(2);
                            }
                            isExternalStorageManager = Environment.isExternalStorageManager();
                            hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                        } else if (i3 == 23) {
                            hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                        } else if (i3 == 24) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                                hashSet.add(Integer.valueOf(canRequestPackageInstalls ? 1 : 0));
                            }
                        } else if (i3 == 27) {
                            hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                        } else if (i3 == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                                hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                            } else {
                                hashSet.add(1);
                            }
                        } else if (i3 == 9 || i3 == 32) {
                            int g3 = AbstractC0129a.g(context, str);
                            i4 = i5;
                            if ((Build.VERSION.SDK_INT >= 34 ? AbstractC0129a.g(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : g3) == 0 && g3 == -1) {
                                hashSet.add(3);
                            } else if (g3 == 0) {
                                hashSet.add(1);
                            } else {
                                hashSet.add(Integer.valueOf(S0.a.h(this.f10215c, str)));
                            }
                            i5 = i4;
                        } else if (AbstractC0129a.g(context, str) != 0) {
                            hashSet.add(Integer.valueOf(S0.a.h(this.f10215c, str)));
                        }
                        i4 = i5;
                        i5 = i4;
                    }
                    return !hashSet.isEmpty() ? S0.a.I(hashSet).intValue() : i5;
                }
                return 1;
            }
            Log.d("permissions_handler", "No permissions found in manifest for: " + n5 + i3);
            if (i3 == 22 && Build.VERSION.SDK_INT < 30) {
                return 2;
            }
        }
        return 0;
    }

    public final boolean d() {
        ArrayList n3 = S0.a.n(this.f10213a, 37);
        boolean z = n3 != null && n3.contains("android.permission.WRITE_CALENDAR");
        boolean z2 = n3 != null && n3.contains("android.permission.READ_CALENDAR");
        if (z && z2) {
            return true;
        }
        if (!z) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z2) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void e(int i3, String str) {
        if (this.f10215c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f10215c.getPackageName()));
        }
        this.f10215c.startActivityForResult(intent, i3);
        this.f10216d++;
    }
}
