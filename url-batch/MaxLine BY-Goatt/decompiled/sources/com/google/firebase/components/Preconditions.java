package com.google.firebase.components;

import defpackage.ch2;
import defpackage.lh;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Preconditions {
    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        lh.e(str);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        ch2.l(str);
        return null;
    }

    public static void checkState(boolean z, String str) {
        if (z) {
            return;
        }
        lh.g(str);
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
