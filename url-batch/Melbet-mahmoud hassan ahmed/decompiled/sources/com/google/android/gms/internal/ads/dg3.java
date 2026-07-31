package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class dg3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final yl3 f4220a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final yl3 f4221b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final yl3 f4222c;

    static {
        new cg3();
        new ag3();
        f4220a = yl3.G();
        f4221b = yl3.G();
        f4222c = yl3.G();
        try {
            ee3.n(new fg3());
            ee3.n(new jg3());
            ge3.a();
            if (rf3.b()) {
                return;
            }
            ee3.k(new ag3(), new cg3(), true);
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }
}
