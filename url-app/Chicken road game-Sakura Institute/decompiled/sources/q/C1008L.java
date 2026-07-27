package q;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import p0.AbstractC0954O;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1412P;

/* renamed from: q.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008L implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1027f f9184a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1029h f9185b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9186c;

    /* renamed from: d, reason: collision with root package name */
    public final C1045x f9187d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9188e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9189f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9190g;

    /* renamed from: h, reason: collision with root package name */
    public final C1005I f9191h;

    /* renamed from: i, reason: collision with root package name */
    public final M2.p f9192i = C1007K.f9180e;

    /* renamed from: j, reason: collision with root package name */
    public final M2.p f9193j = C1007K.f9181i;

    /* renamed from: k, reason: collision with root package name */
    public final M2.p f9194k = C1007K.f9182j;

    public C1008L(InterfaceC1027f interfaceC1027f, InterfaceC1029h interfaceC1029h, float f4, C1045x c1045x, float f5, int i2, int i4, C1005I c1005i) {
        this.f9184a = interfaceC1027f;
        this.f9185b = interfaceC1029h;
        this.f9186c = f4;
        this.f9187d = c1045x;
        this.f9188e = f5;
        this.f9189f = i2;
        this.f9190g = i4;
        this.f9191h = c1005i;
    }

    @Override // q.c0
    public final InterfaceC0946G b(AbstractC0954O[] abstractC0954OArr, InterfaceC0947H interfaceC0947H, int[] iArr, int i2, int i4, int[] iArr2, int i5, int i6, int i7) {
        InterfaceC0946G t4;
        t4 = interfaceC0947H.t(i2, i4, C1412P.c(), new C1006J(iArr2, i5, i6, i7, abstractC0954OArr, this, i4, interfaceC0947H, iArr));
        return t4;
    }

    @Override // q.c0
    public final void c(int i2, InterfaceC0947H interfaceC0947H, int[] iArr, int[] iArr2) {
        this.f9184a.b(interfaceC0947H, i2, iArr, interfaceC0947H.getLayoutDirection(), iArr2);
    }

    @Override // q.c0
    public final int d(AbstractC0954O abstractC0954O) {
        return abstractC0954O.g0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008L)) {
            return false;
        }
        C1008L c1008l = (C1008L) obj;
        c1008l.getClass();
        return this.f9184a.equals(c1008l.f9184a) && this.f9185b.equals(c1008l.f9185b) && M0.e.a(this.f9186c, c1008l.f9186c) && Intrinsics.a(this.f9187d, c1008l.f9187d) && M0.e.a(this.f9188e, c1008l.f9188e) && this.f9189f == c1008l.f9189f && this.f9190g == c1008l.f9190g && Intrinsics.a(this.f9191h, c1008l.f9191h);
    }

    public final int hashCode() {
        int a4 = AbstractC0017m.a(this.f9186c, (this.f9185b.hashCode() + ((this.f9184a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31);
        this.f9187d.getClass();
        return this.f9191h.hashCode() + AbstractC0784j.c(this.f9190g, AbstractC0784j.c(this.f9189f, AbstractC0017m.a(this.f9188e, (Float.hashCode(-1.0f) + a4) * 31, 31), 31), 31);
    }

    @Override // q.c0
    public final long i(int i2, int i4, int i5, boolean z4) {
        return e0.a(i2, i4, i5, z4);
    }

    @Override // q.c0
    public final int j(AbstractC0954O abstractC0954O) {
        return abstractC0954O.f0();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f9184a + ", verticalArrangement=" + this.f9185b + ", mainAxisSpacing=" + ((Object) M0.e.c(this.f9186c)) + ", crossAxisAlignment=" + this.f9187d + ", crossAxisArrangementSpacing=" + ((Object) M0.e.c(this.f9188e)) + ", maxItemsInMainAxis=" + this.f9189f + ", maxLines=" + this.f9190g + ", overflow=" + this.f9191h + ')';
    }
}
