package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public enum cv {
    HTML("html"),
    NATIVE(TapjoyConstants.TJC_PLUGIN_NATIVE);


    /* renamed from: c, reason: collision with root package name */
    private final String f7905c;

    cv(String str) {
        this.f7905c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7905c;
    }
}
