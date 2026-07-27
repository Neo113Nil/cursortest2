package r;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.C0898m;
import q.InterfaceC1021Z;
import q.InterfaceC1029h;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058b extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f9437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f9438e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1021Z f9439i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f9440j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1029h f9441k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S.e f9442l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0898m f9443m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9444n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f9445o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f9446p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9447q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1058b(S.o oVar, v vVar, InterfaceC1021Z interfaceC1021Z, boolean z4, InterfaceC1029h interfaceC1029h, S.e eVar, C0898m c0898m, boolean z5, Function1 function1, int i2, int i4) {
        super(2);
        this.f9437d = oVar;
        this.f9438e = vVar;
        this.f9439i = interfaceC1021Z;
        this.f9440j = z4;
        this.f9441k = interfaceC1029h;
        this.f9442l = eVar;
        this.f9443m = c0898m;
        this.f9444n = z5;
        this.f9445o = function1;
        this.f9446p = i2;
        this.f9447q = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f9446p | 1);
        C0898m c0898m = this.f9443m;
        m3.s.a(this.f9437d, this.f9438e, this.f9439i, this.f9440j, this.f9441k, this.f9442l, c0898m, this.f9444n, this.f9445o, (C0216p) obj, U3, this.f9447q);
        return Unit.f7487a;
    }
}
