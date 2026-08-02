package v0;

import I.C0079n;
import java.util.HashMap;
import w0.p;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3517a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3518b;

    /* renamed from: c, reason: collision with root package name */
    public final C0079n f3519c;

    /* renamed from: d, reason: collision with root package name */
    public i f3520d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3521e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3522f;

    public j(o0.b bVar, boolean z2) {
        C0079n c0079n = new C0079n(bVar, "flutter/restoration", p.f3564a, null);
        this.f3521e = false;
        this.f3522f = false;
        n0.d dVar = new n0.d(14, this);
        this.f3519c = c0079n;
        this.f3517a = z2;
        c0079n.j(dVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
