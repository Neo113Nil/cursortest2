package com.iab.omid.library.startio.adsession;

import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes2.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(ViewProps.NONE);

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.owner;
    }
}
