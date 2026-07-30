package m0;

import e0.h0;
import java.util.HashMap;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f809a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f810b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f811c;

    /* renamed from: d, reason: collision with root package name */
    public k f812d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f813e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f814f;

    public l(g0.b bVar, boolean z2) {
        h0 h0Var = new h0(bVar, "flutter/restoration", n0.m.f936a);
        this.f813e = false;
        this.f814f = false;
        androidx.lifecycle.n nVar = new androidx.lifecycle.n(21, this);
        this.f811c = h0Var;
        this.f809a = z2;
        h0Var.h(nVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
