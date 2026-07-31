package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFh1mSDK {
    public final String AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final String values;

    public AFh1mSDK(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventParameterName = str;
        this.values = str2;
        this.AFKeystoreWrapper = str3;
        this.valueOf = z;
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
