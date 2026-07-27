package D;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class H extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0128e1 f1298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1299e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1300i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O.a f1301j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A0.L f1302k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f1303l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f1304m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1305n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q.a0 f1306o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0128e1 c0128e1, boolean z4, boolean z5, O.a aVar, A0.L l4, Function2 function2, Function2 function22, float f4, q.a0 a0Var) {
        super(2);
        this.f1298d = c0128e1;
        this.f1299e = z4;
        this.f1300i = z5;
        this.f1301j = aVar;
        this.f1302k = l4;
        this.f1303l = function2;
        this.f1304m = function22;
        this.f1305n = f4;
        this.f1306o = a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            C0128e1 c0128e1 = this.f1298d;
            boolean z4 = this.f1299e;
            boolean z5 = this.f1300i;
            J.c(this.f1301j, this.f1302k, !z4 ? c0128e1.f1772f : !z5 ? c0128e1.f1768b : c0128e1.f1777k, this.f1303l, this.f1304m, !z4 ? c0128e1.f1773g : !z5 ? c0128e1.f1769c : c0128e1.f1778l, !z4 ? c0128e1.f1774h : !z5 ? c0128e1.f1770d : c0128e1.f1779m, this.f1305n, this.f1306o, c0216p, 0);
        }
        return Unit.f7487a;
    }
}
