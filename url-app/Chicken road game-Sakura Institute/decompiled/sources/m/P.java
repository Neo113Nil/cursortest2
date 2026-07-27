package m;

import G.C0192d;
import G.C0216p;
import Z.C0316m;
import a.AbstractC0345a;
import e0.AbstractC0557b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p0.C0949J;

/* loaded from: classes.dex */
public final class P extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0557b f8038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f8039e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.c f8040i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0949J f8041j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f8042k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0316m f8043l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8044m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8045n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(AbstractC0557b abstractC0557b, S.o oVar, S.c cVar, C0949J c0949j, float f4, C0316m c0316m, int i2, int i4) {
        super(2);
        this.f8038d = abstractC0557b;
        this.f8039e = oVar;
        this.f8040i = cVar;
        this.f8041j = c0949j;
        this.f8042k = f4;
        this.f8043l = c0316m;
        this.f8044m = i2;
        this.f8045n = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f8044m | 1);
        C0949J c0949j = this.f8041j;
        AbstractC0345a.b(this.f8038d, this.f8039e, this.f8040i, c0949j, this.f8042k, this.f8043l, (C0216p) obj, U3, this.f8045n);
        return Unit.f7487a;
    }
}
