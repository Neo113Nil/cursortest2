package F;

import I.C0113p;
import b0.C0288u;
import m.AbstractC0595e;

/* renamed from: F.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053m0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0043h0 f1300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.e f1303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053m0(C0043h0 c0043h0, boolean z3, boolean z4, Y1.e eVar) {
        super(2);
        this.f1300e = c0043h0;
        this.f1301f = z3;
        this.f1302g = z4;
        this.f1303h = eVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            B0.C a3 = b1.a(H.h.f1700g, c0113p);
            boolean z3 = this.f1302g;
            C0043h0 c0043h0 = this.f1300e;
            G.a.a(((C0288u) l.L.a(!z3 ? c0043h0.f1259g : this.f1301f ? c0043h0.f1254b : c0043h0.f1257e, AbstractC0595e.i(100, 0, null, 6), null, c0113p, 48, 12).getValue()).f4298a, a3, this.f1303h, c0113p, 0);
        }
        return L1.z.f2729a;
    }
}
