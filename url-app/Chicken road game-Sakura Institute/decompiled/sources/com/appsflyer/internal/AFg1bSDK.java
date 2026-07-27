package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFg1bSDK extends AFg1fSDK {
    private final boolean AFInAppEventParameterName;
    private final AFd1kSDK valueOf;

    public AFg1bSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.valueOf = aFd1kSDK;
        this.AFInAppEventParameterName = true;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.valueOf.v().AFKeystoreWrapper("D", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z7) {
            this.valueOf.v().AFKeystoreWrapper("E", values(str, aFg1aSDK));
        }
        if (z7) {
            this.valueOf.v().values(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.v().AFKeystoreWrapper("F", values(str, aFg1aSDK));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.valueOf.v().AFKeystoreWrapper("I", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.valueOf.v().AFKeystoreWrapper("V", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z4) {
            this.valueOf.v().AFKeystoreWrapper("W", values(str, aFg1aSDK));
        }
    }
}
