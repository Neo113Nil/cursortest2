package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1053wd {

    /* renamed from: a, reason: collision with root package name */
    public static C1075x9 f12936a;

    public static final synchronized C1075x9 a(Context context) {
        C1075x9 c1075x9;
        synchronized (AbstractC1053wd.class) {
            c1075x9 = f12936a;
            if (c1075x9 == null) {
                c1075x9 = new C1075x9(context, "uuid.dat");
                f12936a = c1075x9;
            }
        }
        return c1075x9;
    }
}
