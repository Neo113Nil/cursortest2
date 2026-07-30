package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.mK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3575mK implements InterfaceC3946tE {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f32678e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3140eH f32679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32680b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f32681c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f32682d;

    public C3575mK(JG jg) {
        this.f32679a = C3686oN.i(C3031cH.j(C3086dH.b(jg.f25755b.f26132a), jg.f25756c));
        LG lg = jg.f25755b;
        this.f32680b = lg.f26133b;
        this.f32681c = jg.f25757d.b();
        if (lg.f26134c.equals(C3731pE.J)) {
            this.f32682d = Arrays.copyOf(f32678e, 1);
        } else {
            this.f32682d = new byte[0];
        }
    }

    public C3575mK(NG ng) {
        String valueOf = String.valueOf(ng.f26506b.f27330d);
        this.f32679a = new O5("HMAC".concat(valueOf), new SecretKeySpec(((C3791qK) ng.f26507c.f26395u).b(), "HMAC"));
        RG rg = ng.f26506b;
        this.f32680b = rg.f27328b;
        this.f32681c = ng.f26508d.b();
        if (rg.f27329c.equals(QG.f27134d)) {
            this.f32682d = Arrays.copyOf(f32678e, 1);
        } else {
            this.f32682d = new byte[0];
        }
    }

    public C3575mK(O5 o52, int i) {
        this.f32679a = o52;
        this.f32680b = i;
        this.f32681c = new byte[0];
        this.f32682d = new byte[0];
        o52.n(i, new byte[0]);
    }
}
