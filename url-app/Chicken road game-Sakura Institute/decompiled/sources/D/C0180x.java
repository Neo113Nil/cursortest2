package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m.C0847u;
import p.C0935k;
import q.InterfaceC1021Z;

/* renamed from: D.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180x extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f2081e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f2082i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2083j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z.P f2084k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0156o f2085l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0170t f2086m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0847u f2087n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1021Z f2088o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0935k f2089p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2090q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L2.c f2091r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0180x(Function0 function0, S.o oVar, boolean z4, Z.P p4, C0156o c0156o, C0170t c0170t, C0847u c0847u, InterfaceC1021Z interfaceC1021Z, C0935k c0935k, L2.c cVar, int i2, int i4) {
        super(2);
        this.f2080d = i4;
        this.f2081e = function0;
        this.f2082i = oVar;
        this.f2083j = z4;
        this.f2084k = p4;
        this.f2085l = c0156o;
        this.f2086m = c0170t;
        this.f2087n = c0847u;
        this.f2088o = interfaceC1021Z;
        this.f2089p = c0935k;
        this.f2091r = cVar;
        this.f2090q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f2080d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f2090q | 1);
                O.a aVar = (O.a) this.f2091r;
                C0847u c0847u = this.f2087n;
                InterfaceC1021Z interfaceC1021Z = this.f2088o;
                W0.d(this.f2081e, this.f2082i, this.f2083j, this.f2084k, this.f2085l, this.f2086m, c0847u, interfaceC1021Z, this.f2089p, aVar, (C0216p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f2090q | 1);
                C0847u c0847u2 = this.f2087n;
                InterfaceC1021Z interfaceC1021Z2 = this.f2088o;
                W0.h(this.f2081e, this.f2082i, this.f2083j, this.f2084k, this.f2085l, this.f2086m, c0847u2, interfaceC1021Z2, this.f2089p, this.f2091r, (C0216p) obj, U4);
                break;
        }
        return Unit.f7487a;
    }
}
