package q;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;

/* renamed from: q.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006J extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f9171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9172e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9173i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9174j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O[] f9175k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1008L f9176l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9177m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f9178n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int[] f9179o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006J(int[] iArr, int i2, int i4, int i5, AbstractC0954O[] abstractC0954OArr, C1008L c1008l, int i6, InterfaceC0947H interfaceC0947H, int[] iArr2) {
        super(1);
        this.f9171d = iArr;
        this.f9172e = i2;
        this.f9173i = i4;
        this.f9174j = i5;
        this.f9175k = abstractC0954OArr;
        this.f9176l = c1008l;
        this.f9177m = i6;
        this.f9178n = interfaceC0947H;
        this.f9179o = iArr2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC1024c abstractC1024c;
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        int[] iArr = this.f9171d;
        int i2 = iArr != null ? iArr[this.f9172e] : 0;
        int i4 = this.f9173i;
        for (int i5 = i4; i5 < this.f9174j; i5++) {
            AbstractC0954O abstractC0954O = this.f9175k[i5];
            Intrinsics.c(abstractC0954O);
            Object r2 = abstractC0954O.r();
            d0 d0Var = r2 instanceof d0 ? (d0) r2 : null;
            this.f9178n.getLayoutDirection();
            C1008L c1008l = this.f9176l;
            if (d0Var != null) {
                c1008l.getClass();
                abstractC1024c = d0Var.f9250c;
                if (abstractC1024c != null) {
                    int b4 = abstractC1024c.b(this.f9177m - abstractC0954O.f0(), M0.k.f3555d) + i2;
                    c1008l.getClass();
                    AbstractC0953N.d(abstractC0953N, abstractC0954O, this.f9179o[i5 - i4], b4);
                }
            }
            abstractC1024c = c1008l.f9187d;
            int b42 = abstractC1024c.b(this.f9177m - abstractC0954O.f0(), M0.k.f3555d) + i2;
            c1008l.getClass();
            AbstractC0953N.d(abstractC0953N, abstractC0954O, this.f9179o[i5 - i4], b42);
        }
        return Unit.f7487a;
    }
}
