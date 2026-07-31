package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ge3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5587a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f5588b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final yl3 f5589c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final yl3 f5590d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final yl3 f5591e;

    static {
        new me3();
        f5587a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new ve3();
        f5588b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new ye3();
        new se3();
        new gf3();
        new kf3();
        new bf3();
        new nf3();
        yl3 G = yl3.G();
        f5589c = G;
        f5590d = G;
        f5591e = G;
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        ee3.n(new je3());
        tg3.a();
        ee3.m(new me3(), true);
        ee3.m(new ve3(), true);
        if (rf3.b()) {
            return;
        }
        ee3.m(new se3(), true);
        ye3.k(true);
        ee3.m(new bf3(), true);
        ee3.m(new gf3(), true);
        ee3.m(new kf3(), true);
        ee3.m(new nf3(), true);
    }
}
