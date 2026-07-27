package q;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;

/* renamed from: q.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040s extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O[] f9334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1041t f9335e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f9337j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int[] f9338k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040s(AbstractC0954O[] abstractC0954OArr, C1041t c1041t, int i2, InterfaceC0947H interfaceC0947H, int[] iArr) {
        super(1);
        this.f9334d = abstractC0954OArr;
        this.f9335e = c1041t;
        this.f9336i = i2;
        this.f9337j = interfaceC0947H;
        this.f9338k = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        AbstractC0954O[] abstractC0954OArr = this.f9334d;
        int length = abstractC0954OArr.length;
        int i2 = 0;
        int i4 = 0;
        while (i2 < length) {
            AbstractC0954O abstractC0954O = abstractC0954OArr[i2];
            int i5 = i4 + 1;
            Intrinsics.c(abstractC0954O);
            Object r2 = abstractC0954O.r();
            d0 d0Var = r2 instanceof d0 ? (d0) r2 : null;
            M0.k layoutDirection = this.f9337j.getLayoutDirection();
            C1041t c1041t = this.f9335e;
            c1041t.getClass();
            AbstractC1024c abstractC1024c = d0Var != null ? d0Var.f9250c : null;
            int i6 = this.f9336i;
            AbstractC0953N.d(abstractC0953N, abstractC0954O, abstractC1024c != null ? abstractC1024c.b(i6 - abstractC0954O.f9005d, layoutDirection) : c1041t.f9343b.a(0, i6 - abstractC0954O.f9005d, layoutDirection), this.f9338k[i4]);
            i2++;
            i4 = i5;
        }
        return Unit.f7487a;
    }
}
