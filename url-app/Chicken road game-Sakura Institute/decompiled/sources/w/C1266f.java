package w;

import A.C0022s;
import G.C0192d;
import G.C0216p;
import Z.AbstractC0319p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p.C0935k;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1266f extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11180d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f11181e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f11182i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A0.L f11183j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0022s f11184k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f11185l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0935k f11186m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0319p f11187n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f11188o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11189p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11190q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f11191r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11192s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f11193t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L2.c f11194u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11195v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11196w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11197x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11198y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266f(G0.y yVar, Function1 function1, S.o oVar, A0.L l4, C0022s c0022s, Function1 function12, C0935k c0935k, AbstractC0319p abstractC0319p, boolean z4, int i2, int i4, G0.m mVar, N n2, boolean z5, boolean z6, L2.c cVar, int i5, int i6) {
        super(2);
        this.f11197x = yVar;
        this.f11181e = function1;
        this.f11182i = oVar;
        this.f11183j = l4;
        this.f11184k = c0022s;
        this.f11185l = function12;
        this.f11186m = c0935k;
        this.f11187n = abstractC0319p;
        this.f11188o = z4;
        this.f11189p = i2;
        this.f11190q = i4;
        this.f11198y = mVar;
        this.f11191r = n2;
        this.f11192s = z5;
        this.f11193t = z6;
        this.f11194u = cVar;
        this.f11195v = i5;
        this.f11196w = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        switch (this.f11180d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f11195v | 1);
                int U4 = C0192d.U(this.f11196w);
                AbstractC1267g.a((String) this.f11197x, this.f11181e, this.f11182i, this.f11188o, this.f11192s, this.f11183j, (O) this.f11198y, this.f11191r, this.f11193t, this.f11189p, this.f11190q, this.f11184k, this.f11185l, this.f11186m, this.f11187n, this.f11194u, c0216p, U3, U4);
                break;
            default:
                ((Number) obj2).intValue();
                int U5 = C0192d.U(this.f11195v | 1);
                int U6 = C0192d.U(this.f11196w);
                M.c((G0.y) this.f11197x, this.f11181e, this.f11182i, this.f11183j, this.f11184k, this.f11185l, this.f11186m, this.f11187n, this.f11188o, this.f11189p, this.f11190q, (G0.m) this.f11198y, this.f11191r, this.f11192s, this.f11193t, this.f11194u, c0216p, U5, U6);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266f(String str, Function1 function1, S.o oVar, boolean z4, boolean z5, A0.L l4, O o4, N n2, boolean z6, int i2, int i4, C0022s c0022s, Function1 function12, C0935k c0935k, AbstractC0319p abstractC0319p, L2.c cVar, int i5, int i6) {
        super(2);
        this.f11197x = str;
        this.f11181e = function1;
        this.f11182i = oVar;
        this.f11188o = z4;
        this.f11192s = z5;
        this.f11183j = l4;
        this.f11198y = o4;
        this.f11191r = n2;
        this.f11193t = z6;
        this.f11189p = i2;
        this.f11190q = i4;
        this.f11184k = c0022s;
        this.f11185l = function12;
        this.f11186m = c0935k;
        this.f11187n = abstractC0319p;
        this.f11194u = cVar;
        this.f11195v = i5;
        this.f11196w = i6;
    }
}
