package com.facebook.login;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum CodeChallengeMethod {
    S256("S256"),
    PLAIN("plain");

    /* synthetic */ CodeChallengeMethod(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "S256" : str);
    }

    CodeChallengeMethod(String str) {
    }
}
