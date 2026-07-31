package r;

import e2.InterfaceC0424c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0887I;

/* renamed from: r.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872t extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O[] f8084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873u f8085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8086g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887I f8087h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f8088i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0872t(AbstractC0893O[] abstractC0893OArr, C0873u c0873u, int i3, InterfaceC0887I interfaceC0887I, int[] iArr) {
        super(1);
        this.f8084e = abstractC0893OArr;
        this.f8085f = c0873u;
        this.f8086g = i3;
        this.f8087h = interfaceC0887I;
        this.f8088i = iArr;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        int round;
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        AbstractC0893O[] abstractC0893OArr = this.f8084e;
        int length = abstractC0893OArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            AbstractC0893O abstractC0893O = abstractC0893OArr[i3];
            int i5 = i4 + 1;
            f2.j.c(abstractC0893O);
            Object t3 = abstractC0893O.t();
            C0853O c0853o = t3 instanceof C0853O ? (C0853O) t3 : null;
            O0.k layoutDirection = this.f8087h.getLayoutDirection();
            this.f8085f.getClass();
            C0876x c0876x = c0853o != null ? c0853o.f7986c : null;
            int i6 = this.f8086g;
            if (c0876x != null) {
                round = c0876x.a(i6 - abstractC0893O.f8126d, layoutDirection);
            } else {
                round = Math.round((1 + (layoutDirection != O0.k.f3741d ? (-1.0f) * (-1) : -1.0f)) * (((i6 - abstractC0893O.f8126d) - 0) / 2.0f));
            }
            AbstractC0892N.d(abstractC0892N, abstractC0893O, round, this.f8088i[i4]);
            i3++;
            i4 = i5;
        }
        return R1.y.f4171a;
    }
}
