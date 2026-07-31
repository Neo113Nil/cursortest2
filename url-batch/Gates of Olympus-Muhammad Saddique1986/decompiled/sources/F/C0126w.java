package F;

import e2.InterfaceC0424c;
import r.AbstractC0864k;
import r.C0858e;
import r.InterfaceC0859f;
import r.InterfaceC0860g;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0887I;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126w extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0859f f1844h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1845i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f1846j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887I f1847k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0860g f1848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0126w(AbstractC0893O abstractC0893O, int i3, AbstractC0893O abstractC0893O2, InterfaceC0859f interfaceC0859f, long j3, AbstractC0893O abstractC0893O3, InterfaceC0887I interfaceC0887I, InterfaceC0860g interfaceC0860g, int i4) {
        super(1);
        this.f1841e = abstractC0893O;
        this.f1842f = i3;
        this.f1843g = abstractC0893O2;
        this.f1844h = interfaceC0859f;
        this.f1845i = j3;
        this.f1846j = abstractC0893O3;
        this.f1847k = interfaceC0887I;
        this.f1848l = interfaceC0860g;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        int max;
        int h3;
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        AbstractC0893O abstractC0893O = this.f1841e;
        int i3 = abstractC0893O.f8127e;
        int i4 = this.f1842f;
        int i5 = 0;
        AbstractC0892N.f(abstractC0892N, abstractC0893O, 0, (i4 - i3) / 2);
        C0858e c0858e = AbstractC0864k.f8055e;
        InterfaceC0859f interfaceC0859f = this.f1844h;
        boolean a3 = f2.j.a(interfaceC0859f, c0858e);
        AbstractC0893O abstractC0893O2 = this.f1843g;
        AbstractC0893O abstractC0893O3 = this.f1846j;
        long j3 = this.f1845i;
        if (a3) {
            int h4 = O0.a.h(j3);
            int i6 = abstractC0893O2.f8126d;
            max = (h4 - i6) / 2;
            int i7 = abstractC0893O.f8126d;
            if (max < i7) {
                h3 = i7 - max;
            } else if (i6 + max > O0.a.h(j3) - abstractC0893O3.f8126d) {
                h3 = (O0.a.h(j3) - abstractC0893O3.f8126d) - (abstractC0893O2.f8126d + max);
            }
            max += h3;
        } else if (f2.j.a(interfaceC0859f, AbstractC0864k.f8052b)) {
            max = (O0.a.h(j3) - abstractC0893O2.f8126d) - abstractC0893O3.f8126d;
        } else {
            max = Math.max(this.f1847k.l(AbstractC0132z.f1908b), abstractC0893O.f8126d);
        }
        InterfaceC0860g interfaceC0860g = this.f1848l;
        if (f2.j.a(interfaceC0860g, c0858e)) {
            i5 = (i4 - abstractC0893O2.f8127e) / 2;
        } else if (f2.j.a(interfaceC0860g, AbstractC0864k.f8054d)) {
            i5 = i4 - abstractC0893O2.f8127e;
        }
        AbstractC0892N.f(abstractC0892N, abstractC0893O2, max, i5);
        AbstractC0892N.f(abstractC0892N, abstractC0893O3, O0.a.h(j3) - abstractC0893O3.f8126d, (i4 - abstractC0893O3.f8127e) / 2);
        return R1.y.f4171a;
    }
}
