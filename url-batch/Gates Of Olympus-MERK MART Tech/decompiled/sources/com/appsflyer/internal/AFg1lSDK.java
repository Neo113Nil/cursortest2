package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFg1lSDK extends AFg1pSDK {
    private final boolean AFInAppEventParameterName;
    private final AFd1mSDK AFInAppEventType;

    public AFg1lSDK(AFd1mSDK aFd1mSDK) {
        Intrinsics.checkNotNullParameter(aFd1mSDK, "");
        this.AFInAppEventType = aFd1mSDK;
        this.AFInAppEventParameterName = true;
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void d(AFg1jSDK aFg1jSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1jSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.afInfoLog().values("D", AFKeystoreWrapper(str, aFg1jSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void e(AFg1jSDK aFg1jSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1jSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z4) {
            this.AFInAppEventType.afInfoLog().values(ExifInterface.LONGITUDE_EAST, AFKeystoreWrapper(str, aFg1jSDK));
        }
        if (z4) {
            this.AFInAppEventType.afInfoLog().AFKeystoreWrapper(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void i(AFg1jSDK aFg1jSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1jSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.afInfoLog().values("I", AFKeystoreWrapper(str, aFg1jSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void w(AFg1jSDK aFg1jSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1jSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.afInfoLog().values(ExifInterface.LONGITUDE_WEST, AFKeystoreWrapper(str, aFg1jSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void v(AFg1jSDK aFg1jSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1jSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.afInfoLog().values(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, AFKeystoreWrapper(str, aFg1jSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void force(AFg1jSDK aFg1jSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1jSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventType.afInfoLog().values("F", AFKeystoreWrapper(str, aFg1jSDK));
    }
}
