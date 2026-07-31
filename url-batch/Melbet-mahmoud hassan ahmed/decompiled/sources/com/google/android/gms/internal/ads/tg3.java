package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class tg3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final yl3 f12207a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final yl3 f12208b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final yl3 f12209c;

    static {
        new sg3();
        yl3 G = yl3.G();
        f12207a = G;
        f12208b = G;
        f12209c = G;
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        ee3.n(new wg3());
        ee3.m(new sg3(), true);
        if (rf3.b()) {
            return;
        }
        ee3.m(new pg3(), true);
    }
}
