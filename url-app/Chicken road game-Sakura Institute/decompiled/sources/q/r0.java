package q;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;

/* loaded from: classes.dex */
public final class r0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f9329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9330e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f9331i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9332j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f9333k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, int i2, AbstractC0954O abstractC0954O, int i4, InterfaceC0947H interfaceC0947H) {
        super(1);
        this.f9329d = s0Var;
        this.f9330e = i2;
        this.f9331i = abstractC0954O;
        this.f9332j = i4;
        this.f9333k = interfaceC0947H;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M2.p, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r02 = this.f9329d.f9341v;
        AbstractC0954O abstractC0954O = this.f9331i;
        AbstractC0953N.e((AbstractC0953N) obj, abstractC0954O, ((M0.h) r02.h(new M0.j(u3.d.c(this.f9330e - abstractC0954O.f9005d, this.f9332j - abstractC0954O.f9006e)), this.f9333k.getLayoutDirection())).f3548a);
        return Unit.f7487a;
    }
}
