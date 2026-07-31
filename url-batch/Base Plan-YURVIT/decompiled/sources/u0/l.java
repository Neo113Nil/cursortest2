package u0;

import B0.C0008i;
import java.util.HashMap;
import o0.C0211b;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3027a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3028b;

    /* renamed from: c, reason: collision with root package name */
    public final C0008i f3029c;

    /* renamed from: d, reason: collision with root package name */
    public k f3030d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3031e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3032f;

    public l(m0.b bVar, boolean z2) {
        C0008i c0008i = new C0008i(bVar, "flutter/restoration", v0.o.f3092a, 12);
        this.f3031e = false;
        this.f3032f = false;
        C0211b c0211b = new C0211b(13, this);
        this.f3029c = c0008i;
        this.f3027a = z2;
        c0008i.I(c0211b);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
