package l;

import e2.InterfaceC0424c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580f extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O[] f6489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0581g f6490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6492h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0580f(AbstractC0893O[] abstractC0893OArr, C0581g c0581g, int i3, int i4) {
        super(1);
        this.f6489e = abstractC0893OArr;
        this.f6490f = c0581g;
        this.f6491g = i3;
        this.f6492h = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
        for (AbstractC0893O abstractC0893O : this.f6489e) {
            if (abstractC0893O != null) {
                long a3 = this.f6490f.f6493a.f6502b.a(O2.d.d(abstractC0893O.f8126d, abstractC0893O.f8127e), O2.d.d(this.f6491g, this.f6492h), O0.k.f3741d);
                AbstractC0892N.d(abstractC0892N, abstractC0893O, (int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
        }
        return R1.y.f4171a;
    }
}
