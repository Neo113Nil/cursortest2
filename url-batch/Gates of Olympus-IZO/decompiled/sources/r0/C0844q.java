package r0;

import java.util.Map;
import t0.C0910s;
import t0.C0911t;

/* renamed from: r0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844q implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f7161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f7162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f7163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7164f;

    public C0844q(int i3, int i4, Map map, r rVar, w wVar, Y1.c cVar) {
        this.f7159a = i3;
        this.f7160b = i4;
        this.f7161c = map;
        this.f7162d = rVar;
        this.f7163e = wVar;
        this.f7164f = cVar;
    }

    @Override // r0.B
    public final int f() {
        return this.f7159a;
    }

    @Override // r0.B
    public final int h() {
        return this.f7160b;
    }

    @Override // r0.B
    public final Map i() {
        return this.f7161c;
    }

    @Override // r0.B
    public final void j() {
        C0910s c0910s;
        boolean B = this.f7162d.B();
        Y1.c cVar = this.f7164f;
        w wVar = this.f7163e;
        if (!B || (c0910s = ((C0911t) wVar.f7178d.f7735x.f2353c).f7956M) == null) {
            cVar.j(((C0911t) wVar.f7178d.f7735x.f2353c).f7826l);
        } else {
            cVar.j(c0910s.f7826l);
        }
    }

    @Override // r0.B
    public final Y1.c k() {
        return null;
    }
}
