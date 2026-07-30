package m0;

import L.C0026b;
import e0.C0114b;
import java.util.HashMap;

/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2747a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2748b;

    /* renamed from: c, reason: collision with root package name */
    public final C0026b f2749c;

    /* renamed from: d, reason: collision with root package name */
    public C0201k f2750d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2751e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2752f;

    public C0202l(C0114b c0114b, boolean z2) {
        C0026b c0026b = new C0026b(c0114b, "flutter/restoration", n0.o.f2789a, 8);
        this.f2751e = false;
        this.f2752f = false;
        C0193c c0193c = new C0193c(10, this);
        this.f2749c = c0026b;
        this.f2747a = z2;
        c0026b.J(c0193c);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
