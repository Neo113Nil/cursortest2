package com.onesignal.core.internal.device.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icefishing.icefishingliveapp.A;
import com.onesignal.common.AndroidUtils;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import t4.f;
import y4.EnumC5252a;
import y4.c;

/* loaded from: classes2.dex */
public final class a implements c {
    public static final C0189a Companion = new C0189a(null);
    private static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";
    private final f _applicationService;

    /* renamed from: com.onesignal.core.internal.device.impl.a$a, reason: collision with other inner class name */
    public static final class C0189a {
        public /* synthetic */ C0189a(e eVar) {
            this();
        }

        private C0189a() {
        }
    }

    public a(f _applicationService) {
        h.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
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
            Object invoke = cls.getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), this._applicationService.getAppContext());
            h.c(invoke, "null cannot be cast to non-null type kotlin.Int");
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

    @Override // y4.c
    public EnumC5252a getDeviceType() {
        if (supportsADM()) {
            return EnumC5252a.Fire;
        }
        boolean supportsHMS = getSupportsHMS();
        boolean supportsGooglePush = supportsGooglePush();
        if (supportsGooglePush && supportsHMS) {
            return AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), PREFER_HMS_METADATA_NAME) ? EnumC5252a.Huawei : EnumC5252a.Android;
        }
        return supportsGooglePush ? EnumC5252a.Android : supportsHMS ? EnumC5252a.Huawei : isGMSInstalledAndEnabled() ? EnumC5252a.Android : isHMSCoreInstalledAndEnabledFallback() ? EnumC5252a.Huawei : EnumC5252a.Android;
    }

    @Override // y4.c
    public boolean getHasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    @Override // y4.c
    public boolean getHasFCMLibrary() {
        try {
            A a9 = FirebaseMessaging.f36352k;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // y4.c
    public y4.b getJetpackLibraryStatus() {
        return !AndroidUtils.INSTANCE.hasNotificationManagerCompat() ? y4.b.MISSING : y4.b.OK;
    }

    @Override // y4.c
    public boolean getSupportsHMS() {
        if (hasHMSAvailabilityLibrary() && getHasAllHMSLibrariesForPushKit()) {
            return isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    @Override // y4.c
    public boolean isAndroidDeviceType() {
        return getDeviceType() == EnumC5252a.Android;
    }

    @Override // y4.c
    public boolean isFireOSDeviceType() {
        return getDeviceType() == EnumC5252a.Fire;
    }

    @Override // y4.c
    public boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled(GOOGLE_PLAY_SERVICES_PACKAGE);
    }

    @Override // y4.c
    public boolean isHuaweiDeviceType() {
        return getDeviceType() == EnumC5252a.Huawei;
    }

    @Override // y4.c
    public boolean supportsGooglePush() {
        if (getHasFCMLibrary()) {
            return isGMSInstalledAndEnabled();
        }
        return false;
    }
}
