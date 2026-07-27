package s;

import kotlin.jvm.internal.Intrinsics;
import o.N;
import r0.n0;
import s0.C1160o0;
import y0.C1317a;
import y0.C1318b;

/* renamed from: s.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089E extends S.n implements n0 {

    /* renamed from: A, reason: collision with root package name */
    public C1087C f9883A;

    /* renamed from: t, reason: collision with root package name */
    public S2.c f9884t;

    /* renamed from: u, reason: collision with root package name */
    public r.d f9885u;

    /* renamed from: v, reason: collision with root package name */
    public N f9886v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9887w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9888x;

    /* renamed from: y, reason: collision with root package name */
    public y0.g f9889y;

    /* renamed from: z, reason: collision with root package name */
    public final C1087C f9890z = new C1087C(this, 0);

    public C1089E(S2.c cVar, r.d dVar, N n2, boolean z4, boolean z5) {
        this.f9884t = cVar;
        this.f9885u = dVar;
        this.f9886v = n2;
        this.f9887w = z4;
        this.f9888x = z5;
        B0();
    }

    public final void B0() {
        this.f9889y = new y0.g(new C1086B(this, 1), new C1086B(this, 2), this.f9888x);
        this.f9883A = this.f9887w ? new C1087C(this, 1) : null;
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        S2.e[] eVarArr = y0.s.f11639a;
        y0.t tVar = y0.q.f11623l;
        S2.e[] eVarArr2 = y0.s.f11639a;
        S2.e eVar = eVarArr2[6];
        tVar.a(iVar, Boolean.TRUE);
        iVar.s(y0.q.f11609E, this.f9890z);
        if (this.f9886v == N.f8665d) {
            y0.g gVar = this.f9889y;
            if (gVar == null) {
                Intrinsics.g("scrollAxisRange");
                throw null;
            }
            y0.t tVar2 = y0.q.f11627p;
            S2.e eVar2 = eVarArr2[11];
            tVar2.a(iVar, gVar);
        } else {
            y0.g gVar2 = this.f9889y;
            if (gVar2 == null) {
                Intrinsics.g("scrollAxisRange");
                throw null;
            }
            y0.t tVar3 = y0.q.f11626o;
            S2.e eVar3 = eVarArr2[10];
            tVar3.a(iVar, gVar2);
        }
        C1087C c1087c = this.f9883A;
        if (c1087c != null) {
            iVar.s(y0.h.f11555f, new C1317a(null, c1087c));
        }
        iVar.s(y0.h.f11549A, new C1317a(null, new C1160o0(13, new C1086B(this, 0))));
        this.f9885u.getClass();
        C1318b c1318b = new C1318b(-1, 1);
        y0.t tVar4 = y0.q.f11617f;
        S2.e eVar4 = eVarArr2[20];
        tVar4.a(iVar, c1318b);
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }
}
