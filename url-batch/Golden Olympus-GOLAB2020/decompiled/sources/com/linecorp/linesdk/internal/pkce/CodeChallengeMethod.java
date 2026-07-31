package com.linecorp.linesdk.internal.pkce;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public enum CodeChallengeMethod {
    PLAIN("plain"),
    S256("S256");


    @NonNull
    private final String value;

    CodeChallengeMethod(@NonNull String str) {
        this.value = str;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
