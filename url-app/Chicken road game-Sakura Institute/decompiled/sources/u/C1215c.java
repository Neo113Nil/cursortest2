package u;

import S2.e;
import kotlin.jvm.functions.Function1;
import m.C0850x;
import n.p;
import p.C0935k;
import s.C1093I;
import y0.f;
import y0.i;
import y0.q;
import y0.s;
import y0.t;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1215c extends C0850x {

    /* renamed from: N, reason: collision with root package name */
    public boolean f10888N;

    /* renamed from: O, reason: collision with root package name */
    public Function1 f10889O;

    /* renamed from: P, reason: collision with root package name */
    public final C1093I f10890P;

    public C1215c(boolean z4, C0935k c0935k, boolean z5, f fVar, Function1 function1) {
        super(c0935k, null, z5, null, fVar, new p(function1, z4));
        this.f10888N = z4;
        this.f10889O = function1;
        this.f10890P = new C1093I(5, this);
    }

    @Override // m.C0850x
    public final void E0(i iVar) {
        z0.a aVar = this.f10888N ? z0.a.f11778d : z0.a.f11779e;
        e[] eVarArr = s.f11639a;
        t tVar = q.B;
        e eVar = s.f11639a[22];
        tVar.a(iVar, aVar);
    }
}
