package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m.C0847u;
import p.C0935k;
import q.InterfaceC1021Z;

/* renamed from: D.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178w extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f2064e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f2065i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2066j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z.P f2067k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0156o f2068l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0170t f2069m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0847u f2070n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1021Z f2071o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0935k f2072p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2073q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2074r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L2.c f2075s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0178w(Function0 function0, S.o oVar, boolean z4, Z.P p4, C0156o c0156o, C0170t c0170t, C0847u c0847u, InterfaceC1021Z interfaceC1021Z, C0935k c0935k, L2.c cVar, int i2, int i4, int i5) {
        super(2);
        this.f2063d = i5;
        this.f2064e = function0;
        this.f2065i = oVar;
        this.f2066j = z4;
        this.f2067k = p4;
        this.f2068l = c0156o;
        this.f2069m = c0170t;
        this.f2070n = c0847u;
        this.f2071o = interfaceC1021Z;
        this.f2072p = c0935k;
        this.f2075s = cVar;
        this.f2073q = i2;
        this.f2074r = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        switch (this.f2063d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f2073q | 1);
                W0.b(this.f2064e, this.f2065i, this.f2066j, this.f2067k, this.f2068l, this.f2069m, this.f2070n, this.f2071o, this.f2072p, this.f2075s, c0216p, U3, this.f2074r);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f2073q | 1);
                O.a aVar = (O.a) this.f2075s;
                W0.g(this.f2064e, this.f2065i, this.f2066j, this.f2067k, this.f2068l, this.f2069m, this.f2070n, this.f2071o, this.f2072p, aVar, c0216p, U4, this.f2074r);
                break;
        }
        return Unit.f7487a;
    }
}
