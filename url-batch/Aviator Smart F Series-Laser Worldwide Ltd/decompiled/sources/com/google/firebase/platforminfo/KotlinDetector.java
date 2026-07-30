package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import y5.d;

/* loaded from: classes4.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return d.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
