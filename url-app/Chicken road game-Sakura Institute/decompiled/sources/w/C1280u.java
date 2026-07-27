package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s0.C1146h0;
import s0.L0;

/* renamed from: w.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280u extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f11346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X.p f11347e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11348i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11349j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11350k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G0.s f11351l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280u(P p4, X.p pVar, boolean z4, boolean z5, A.a0 a0Var, G0.s sVar) {
        super(1);
        this.f11346d = p4;
        this.f11347e = pVar;
        this.f11348i = z4;
        this.f11349j = z5;
        this.f11350k = a0Var;
        this.f11351l = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        L0 l02;
        long j4 = ((Y.c) obj).f4372a;
        P p4 = this.f11346d;
        if (!p4.b()) {
            this.f11347e.a(X.i.f4327k);
        } else if (!this.f11348i && (l02 = p4.f11056c) != null) {
            ((C1146h0) l02).b();
        }
        if (p4.b() && this.f11349j) {
            if (p4.a() != EnumC1257F.f11024e) {
                o0 d4 = p4.d();
                if (d4 != null) {
                    int a4 = this.f11351l.a(d4.b(j4, true));
                    p4.f11073t.invoke(G0.y.a((G0.y) p4.f11057d.f11494e, null, M1.a.j(a4, a4), 5));
                    if (p4.f11054a.f11118a.f328a.length() > 0) {
                        p4.f11064k.setValue(EnumC1257F.f11025i);
                    }
                }
            } else {
                this.f11350k.e(new Y.c(j4));
            }
        }
        return Unit.f7487a;
    }
}
