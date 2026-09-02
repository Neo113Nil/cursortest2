package M;

import D.u;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f311a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f312b;

    /* renamed from: c, reason: collision with root package name */
    public final C.b f313c;

    /* renamed from: d, reason: collision with root package name */
    public k f314d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f315e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f316f;

    public l(F.b bVar, boolean z2) {
        C.b bVar2 = new C.b(bVar, "flutter/restoration", N.n.f353a);
        this.f315e = false;
        this.f316f = false;
        u uVar = new u(18, this);
        this.f313c = bVar2;
        this.f311a = z2;
        bVar2.i(uVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
