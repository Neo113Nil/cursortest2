package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.StatFs;
import android.os.SystemClock;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.LGPD;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i7 {
    public static final i7 a = new i7();

    public final j7 a(s9 s9Var, ah ahVar, String str, bf privacyApi, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object consent;
        Object consent2;
        Object consent3;
        Object consent4;
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        k7 k7Var = k7.a;
        if (!k7Var.o()) {
            xb.b("EnvironmentManager not initialized. Call EnvironmentManager.init() first.", (Throwable) null, 2, (Object) null);
            return new j7(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
        Application c = k7Var.c();
        b c2 = c(c);
        String a2 = a((Context) c);
        long d = d(c);
        long a3 = a();
        int b2 = b(c);
        boolean e = e(c);
        int a4 = a(c);
        if (ahVar == null || (str3 = ahVar.c()) == null) {
            str3 = "session not ready";
        }
        String str8 = str3;
        int f = ahVar != null ? ahVar.f() : -1;
        String str9 = str2 == null ? "App was not init yet" : str2;
        String b3 = k7Var.b();
        DataUseConsent a5 = privacyApi.a("gdpr");
        if (a5 == null || (consent4 = a5.getConsent()) == null || (str4 = consent4.toString()) == null) {
            str4 = "gdpr not available";
        }
        String str10 = str4;
        DataUseConsent a6 = privacyApi.a("us_privacy");
        if (a6 == null || (consent3 = a6.getConsent()) == null || (str5 = consent3.toString()) == null) {
            str5 = "ccpa not available";
        }
        String str11 = str5;
        DataUseConsent a7 = privacyApi.a("coppa");
        if (a7 == null || (consent2 = a7.getConsent()) == null || (str6 = consent2.toString()) == null) {
            str6 = "coppa not available";
        }
        String str12 = str6;
        DataUseConsent a8 = privacyApi.a(LGPD.LGPD_STANDARD);
        if (a8 == null || (consent = a8.getConsent()) == null || (str7 = consent.toString()) == null) {
            str7 = "lgpd not available";
        }
        return new j7(str8, f, str9, b3, "9.12.1", false, str10, str11, str12, str7, a(s9Var), k7Var.g(), k7Var.h(), k7Var.i(), k7Var.j(), k7Var.d(), k7Var.f(), k7Var.k(), str == null ? "connection type not provided" : str, a2, c2.a(), c2.b(), b2, e, a4, d, a3, ahVar != null ? ahVar.d() : 0, ahVar != null ? ahVar.e() : 0, ahVar != null ? ahVar.a() : 0, ahVar != null ? ahVar.b() : -1L, SystemClock.uptimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b c(Application application) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 3;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            if (application == null) {
                return new b(i2, objArr3 == true ? 1 : 0, i, defaultConstructorMarker);
            }
            Object systemService = application.getSystemService("batterymanager");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            BatteryManager batteryManager = (BatteryManager) systemService;
            return new b(batteryManager.getIntProperty(4), batteryManager.isCharging());
        } catch (Exception e) {
            xb.a("Cannot create environment device battery for tracking", e);
            return new b(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i, defaultConstructorMarker);
        }
    }

    public final long d(Application application) {
        if (application == null) {
            return -1L;
        }
        try {
            return new StatFs(application.getCacheDir() + "/.chartboost").getAvailableBytes();
        } catch (Exception e) {
            xb.a("Cannot create environment device storage for tracking", e);
            return -1L;
        }
    }

    public static final class b {
        public final int a;
        public final boolean b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "DeviceBattery(batteryLevel=" + this.a + ", isCharging=" + this.b + ")";
        }

        public b(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final int a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public /* synthetic */ b(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    public final boolean e(Application application) {
        if (application == null) {
            return false;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getRingerMode() != 2;
        } catch (Exception e) {
            xb.a("Cannot create environment audio for tracking", e);
            return false;
        }
    }

    public final int b(AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.checkNotNull(devices);
        if (devices.length == 0) {
            return a.f.b();
        }
        AudioDeviceInfo audioDeviceInfo = devices[0];
        Intrinsics.checkNotNullExpressionValue(audioDeviceInfo, "get(...)");
        int type = audioDeviceInfo.getType();
        if (type == 2) {
            return a.c.b();
        }
        if (type == 4) {
            return a.d.b();
        }
        if (type != 8) {
            return a.f.b();
        }
        return a.e.b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c = new a("BUILTIN_SPEAKER", 0, 0);
        public static final a d = new a("WIRED_HEADPHONES", 1, 1);
        public static final a e = new a("BLUETOOTH_A2DP", 2, 2);
        public static final a f = new a(NativeAdContent.ViewTag.OTHER, 3, 3);
        public static final /* synthetic */ a[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int b;

        static {
            a[] a = a();
            g = a;
            h = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{c, d, e, f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }

        public a(String str, int i, int i2) {
            this.b = i2;
        }

        public final int b() {
            return this.b;
        }
    }

    public final int a(Application application) {
        try {
            if (application == null) {
                return a.f.b();
            }
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return b((AudioManager) systemService);
        } catch (Exception e) {
            xb.a("Cannot create environment audio output for tracking", e);
            return a.f.b();
        }
    }

    public final int b(Application application) {
        if (application == null) {
            return -1;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (int) ((streamVolume / streamMaxVolume) * 100);
            }
            return -1;
        } catch (Exception e) {
            xb.a("Cannot create environment audio for tracking", e);
            return -1;
        }
    }

    public final int a(AudioManager audioManager) {
        if (audioManager.isSpeakerphoneOn()) {
            return a.c.b();
        }
        return a.f.b();
    }

    public final long a() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / 1048576;
        } catch (Exception e) {
            xb.a("Cannot create environment runtime for tracking", e);
            return -1L;
        }
    }

    public final String a(s9 s9Var) {
        String e = k7.a.e();
        if (!Intrinsics.areEqual(e, "unknown")) {
            return e;
        }
        if (s9Var == null) {
            return "unknown";
        }
        String a2 = s9Var.a();
        if (a2 == null) {
            a2 = s9Var.g();
        }
        return a2 == null ? "unknown" : a2;
    }

    public final String a(Context context) {
        try {
            v6 l = k7.a.l();
            if (l == null) {
                return "Cannot retrieve orientation";
            }
            String b2 = qe.b(context, l);
            return b2 == null ? "Cannot retrieve orientation" : b2;
        } catch (Exception e) {
            xb.a("Cannot retrieve orientation", e);
            return "Cannot retrieve orientation";
        }
    }
}
