package com.appsflyer.internal;

import java.util.Locale;

/* loaded from: classes.dex */
public enum AFf1sSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
