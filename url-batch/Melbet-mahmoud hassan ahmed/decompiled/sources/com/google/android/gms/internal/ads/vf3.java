package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class vf3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13335a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final yl3 f13336b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final yl3 f13337c;

    static {
        new uf3();
        f13335a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f13336b = yl3.G();
        f13337c = yl3.G();
        try {
            ee3.n(new xf3());
            if (rf3.b()) {
                return;
            }
            ee3.m(new uf3(), true);
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }
}
