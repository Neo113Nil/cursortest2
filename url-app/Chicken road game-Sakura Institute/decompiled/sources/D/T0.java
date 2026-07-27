package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;
import q.InterfaceC1021Z;

/* loaded from: classes.dex */
public final class T0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1629e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1630i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1631j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1632k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1633l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1634m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1635n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1636o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1637p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1638q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U0 f1639r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f1640s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(int i2, int i4, AbstractC0954O abstractC0954O, AbstractC0954O abstractC0954O2, AbstractC0954O abstractC0954O3, AbstractC0954O abstractC0954O4, AbstractC0954O abstractC0954O5, AbstractC0954O abstractC0954O6, AbstractC0954O abstractC0954O7, AbstractC0954O abstractC0954O8, AbstractC0954O abstractC0954O9, U0 u02, InterfaceC0947H interfaceC0947H) {
        super(1);
        this.f1628d = i2;
        this.f1629e = i4;
        this.f1630i = abstractC0954O;
        this.f1631j = abstractC0954O2;
        this.f1632k = abstractC0954O3;
        this.f1633l = abstractC0954O4;
        this.f1634m = abstractC0954O5;
        this.f1635n = abstractC0954O6;
        this.f1636o = abstractC0954O7;
        this.f1637p = abstractC0954O8;
        this.f1638q = abstractC0954O9;
        this.f1639r = u02;
        this.f1640s = interfaceC0947H;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2;
        float f4;
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        U0 u02 = this.f1639r;
        float f5 = u02.f1660c;
        InterfaceC0947H interfaceC0947H = this.f1640s;
        float e4 = interfaceC0947H.e();
        M0.k layoutDirection = interfaceC0947H.getLayoutDirection();
        float f6 = S0.f1617a;
        AbstractC0953N.e(abstractC0953N, this.f1637p, 0L);
        AbstractC0954O abstractC0954O = this.f1638q;
        int e5 = this.f1628d - E.v.e(abstractC0954O);
        InterfaceC1021Z interfaceC1021Z = u02.f1661d;
        int a4 = O2.c.a(interfaceC1021Z.d() * e4);
        int a5 = O2.c.a(androidx.compose.foundation.layout.b.e(interfaceC1021Z, layoutDirection) * e4);
        float f7 = E.v.f2253c * e4;
        AbstractC0954O abstractC0954O2 = this.f1630i;
        if (abstractC0954O2 != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O2, 0, Math.round((1 + 0.0f) * ((e5 - abstractC0954O2.f9006e) / 2.0f)));
        }
        boolean z4 = u02.f1659b;
        AbstractC0954O abstractC0954O3 = this.f1635n;
        if (abstractC0954O3 != null) {
            if (z4) {
                i2 = Math.round((1 + 0.0f) * ((e5 - abstractC0954O3.f9006e) / 2.0f));
            } else {
                i2 = a4;
            }
            int O3 = u3.d.O(f5, i2, -(abstractC0954O3.f9006e / 2));
            if (abstractC0954O2 == null) {
                f4 = 0.0f;
            } else {
                f4 = (1 - f5) * (E.v.f(abstractC0954O2) - f7);
            }
            AbstractC0953N.f(abstractC0953N, abstractC0954O3, O2.c.a(f4) + a5, O3);
        }
        AbstractC0954O abstractC0954O4 = this.f1632k;
        if (abstractC0954O4 != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O4, E.v.f(abstractC0954O2), S0.e(z4, e5, a4, abstractC0954O3, abstractC0954O4));
        }
        int f8 = E.v.f(abstractC0954O4) + E.v.f(abstractC0954O2);
        AbstractC0954O abstractC0954O5 = this.f1634m;
        AbstractC0953N.f(abstractC0953N, abstractC0954O5, f8, S0.e(z4, e5, a4, abstractC0954O3, abstractC0954O5));
        AbstractC0954O abstractC0954O6 = this.f1636o;
        if (abstractC0954O6 != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O6, f8, S0.e(z4, e5, a4, abstractC0954O3, abstractC0954O6));
        }
        int i4 = this.f1629e;
        AbstractC0954O abstractC0954O7 = this.f1631j;
        AbstractC0954O abstractC0954O8 = this.f1633l;
        if (abstractC0954O8 != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O8, (i4 - E.v.f(abstractC0954O7)) - abstractC0954O8.f9005d, S0.e(z4, e5, a4, abstractC0954O3, abstractC0954O8));
        }
        if (abstractC0954O7 != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O7, i4 - abstractC0954O7.f9005d, Math.round((1 + 0.0f) * ((e5 - abstractC0954O7.f9006e) / 2.0f)));
        }
        if (abstractC0954O != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O, 0, e5);
        }
        return Unit.f7487a;
    }
}
