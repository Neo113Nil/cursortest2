package com.onesignal.core.internal.device.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import ea.f;
import ja.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements c {
    public static final C0017a Companion = new C0017a(null);
    private static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";
    private final f _applicationService;

    public a(f fVar) {
        fVar.getClass();
        this._applicationService = fVar;
    }

    private final boolean hasHMSAGConnectLibrary() {
        try {
            Class.forName("com.huawei.agconnect.config.AGConnectServicesConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSAvailabilityLibrary() {
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSPushKitLibrary() {
        try {
            Class.forName("com.huawei.hms.aaid.HmsInstanceId");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabled() {
        try {
            Class<?> cls = Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            Object invoke = cls.getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getMethod("getInstance", null).invoke(null, null), this._applicationService.getAppContext());
            invoke.getClass();
            return ((Integer) invoke).intValue() == 0;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabledFallback() {
        return packageInstalledAndEnabled(HMS_CORE_SERVICES_PACKAGE);
    }

    private final boolean packageInstalledAndEnabled(String str) {
        try {
            return this._applicationService.getAppContext().getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final boolean supportsADM() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // ja.c
    public ja.a getDeviceType() {
        if (supportsADM()) {
            return ja.a.Fire;
        }
        boolean supportsHMS = getSupportsHMS();
        boolean supportsGooglePush = supportsGooglePush();
        if (supportsGooglePush && supportsHMS) {
            return AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), PREFER_HMS_METADATA_NAME) ? ja.a.Huawei : ja.a.Android;
        }
        return supportsGooglePush ? ja.a.Android : supportsHMS ? ja.a.Huawei : isGMSInstalledAndEnabled() ? ja.a.Android : isHMSCoreInstalledAndEnabledFallback() ? ja.a.Huawei : ja.a.Android;
    }

    @Override // ja.c
    public boolean getHasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    @Override // ja.c
    public boolean getHasFCMLibrary() {
        return true;
    }

    @Override // ja.c
    public ja.b getJetpackLibraryStatus() {
        return !AndroidUtils.INSTANCE.hasNotificationManagerCompat() ? ja.b.MISSING : ja.b.OK;
    }

    @Override // ja.c
    public boolean getSupportsHMS() {
        if (hasHMSAvailabilityLibrary() && getHasAllHMSLibrariesForPushKit()) {
            return isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    @Override // ja.c
    public boolean isAndroidDeviceType() {
        return getDeviceType() == ja.a.Android;
    }

    @Override // ja.c
    public boolean isFireOSDeviceType() {
        return getDeviceType() == ja.a.Fire;
    }

    @Override // ja.c
    public boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled(GOOGLE_PLAY_SERVICES_PACKAGE);
    }

    @Override // ja.c
    public boolean isHuaweiDeviceType() {
        return getDeviceType() == ja.a.Huawei;
    }

    @Override // ja.c
    public boolean supportsGooglePush() {
        if (getHasFCMLibrary()) {
            return isGMSInstalledAndEnabled();
        }
        return false;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.device.impl.a$a, reason: collision with other inner class name */
    public static final class C0017a {
        public /* synthetic */ C0017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0017a() {
        }
    }
}
