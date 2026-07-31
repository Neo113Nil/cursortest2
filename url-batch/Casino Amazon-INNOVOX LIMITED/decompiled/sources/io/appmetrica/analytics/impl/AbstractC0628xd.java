package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0628xd {

    /* renamed from: a, reason: collision with root package name */
    public static C0649y9 f1565a;

    public static final synchronized C0649y9 a(Context context) {
        C0649y9 c0649y9;
        synchronized (AbstractC0628xd.class) {
            c0649y9 = f1565a;
            if (c0649y9 == null) {
                c0649y9 = new C0649y9(context, "uuid.dat");
                f1565a = c0649y9;
            }
        }
        return c0649y9;
    }
}
