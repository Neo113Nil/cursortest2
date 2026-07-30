package com.google.firebase.platforminfo;

import defpackage.m81;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            m81.o.getClass();
            return "2.2.10";
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
