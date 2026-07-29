package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public enum cw {
    NATIVE(TapjoyConstants.TJC_PLUGIN_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");


    /* renamed from: d, reason: collision with root package name */
    private final String f7909d;

    cw(String str) {
        this.f7909d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7909d;
    }
}
