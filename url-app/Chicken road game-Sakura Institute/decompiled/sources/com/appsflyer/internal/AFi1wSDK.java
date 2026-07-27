package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFi1wSDK {
    public final String AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final String values;

    public AFi1wSDK(String str, String str2, String str3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventParameterName = str;
        this.values = str2;
        this.AFKeystoreWrapper = str3;
        this.valueOf = z4;
    }

    public final boolean values() {
        return this.valueOf;
    }
}
