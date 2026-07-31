package B;

import a0.C0238c;
import e2.InterfaceC0424c;
import m.C0630o;

/* loaded from: classes.dex */
public final class G extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final G f281f = new G(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final G f282g = new G(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final G f283h = new G(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i3, int i4) {
        super(i3);
        this.f284e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f284e) {
            case 0:
                long j3 = ((C0238c) obj).f4722a;
                return l0.c.D(j3) ? new C0630o(C0238c.d(j3), C0238c.e(j3)) : N.f302a;
            case 1:
                C0630o c0630o = (C0630o) obj;
                return new C0238c(l0.c.e(c0630o.f6859a, c0630o.f6860b));
            default:
                return R1.y.f4171a;
        }
    }
}
