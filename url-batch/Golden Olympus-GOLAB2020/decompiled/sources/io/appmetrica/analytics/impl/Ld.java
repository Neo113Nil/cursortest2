package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class Ld {

    /* renamed from: a, reason: collision with root package name */
    public static S9 f37919a;

    public static final synchronized S9 a(Context context) {
        S9 s9;
        synchronized (Ld.class) {
            s9 = f37919a;
            if (s9 == null) {
                s9 = new S9(context, "uuid.dat");
                f37919a = s9;
            }
        }
        return s9;
    }
}
