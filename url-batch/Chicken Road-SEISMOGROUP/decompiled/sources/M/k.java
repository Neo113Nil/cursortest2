package M;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f369a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f370b;

    /* renamed from: c, reason: collision with root package name */
    public final A.e f371c;

    /* renamed from: d, reason: collision with root package name */
    public j f372d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f374f;

    public k(G.b bVar, boolean z) {
        A.e eVar = new A.e(bVar, "flutter/restoration", N.n.f411a, null);
        this.f373e = false;
        this.f374f = false;
        B.k kVar = new B.k(19, this);
        this.f371c = eVar;
        this.f369a = z;
        eVar.l(kVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
