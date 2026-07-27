package w;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import z2.C1403G;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final P f11139a;

    /* renamed from: b, reason: collision with root package name */
    public final A.a0 f11140b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.y f11141c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11142d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11143e;

    /* renamed from: f, reason: collision with root package name */
    public final A.j0 f11144f;

    /* renamed from: g, reason: collision with root package name */
    public final G0.s f11145g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f11146h;

    /* renamed from: i, reason: collision with root package name */
    public final C1254C f11147i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1260I f11148j;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f11149k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11150l;

    public c0(P p4, A.a0 a0Var, G0.y yVar, boolean z4, boolean z5, A.j0 j0Var, G0.s sVar, p0 p0Var, C1254C c1254c, C1277q c1277q, int i2) {
        J j4 = M.f11037a;
        this.f11139a = p4;
        this.f11140b = a0Var;
        this.f11141c = yVar;
        this.f11142d = z4;
        this.f11143e = z5;
        this.f11144f = j0Var;
        this.f11145g = sVar;
        this.f11146h = p0Var;
        this.f11147i = c1254c;
        this.f11148j = j4;
        this.f11149k = c1277q;
        this.f11150l = i2;
    }

    public final void a(List list) {
        y.t tVar = this.f11139a.f11057d;
        ArrayList I3 = C1403G.I(list);
        I3.add(0, new G0.k());
        this.f11149k.invoke(tVar.i(I3));
    }
}
