package m;

import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import j.C0548v;
import k2.C0572d;

/* renamed from: m.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615K extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U f6629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0615K(U u3, int i3) {
        super(1);
        this.f6628e = i3;
        this.f6629f = u3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6628e) {
            case 0:
                long longValue = ((Number) obj).longValue();
                U u3 = this.f6629f;
                long j3 = longValue - u3.f6682l;
                u3.f6682l = longValue;
                long R2 = AbstractC0508a.R(j3 / u3.f6686p);
                C0548v c0548v = u3.f6683m;
                int i3 = c0548v.f6337b;
                int i4 = 0;
                if (i3 != 0) {
                    Object[] objArr = c0548v.f6336a;
                    for (int i5 = 0; i5 < i3; i5++) {
                        C0614J c0614j = (C0614J) objArr[i5];
                        U.g(u3, c0614j, R2);
                        c0614j.f6622c = true;
                    }
                    l0 l0Var = u3.f6675e;
                    if (l0Var != null) {
                        l0Var.p();
                    }
                    int i6 = c0548v.f6337b;
                    Object[] objArr2 = c0548v.f6336a;
                    C0572d g02 = O2.d.g0(0, i6);
                    int i7 = g02.f6419d;
                    int i8 = g02.f6420e;
                    if (i7 <= i8) {
                        while (true) {
                            objArr2[i7 - i4] = objArr2[i7];
                            if (((C0614J) objArr2[i7]).f6622c) {
                                i4++;
                            }
                            if (i7 != i8) {
                                i7++;
                            }
                        }
                    }
                    S1.k.r0(objArr2, null, i6 - i4, i6);
                    c0548v.f6337b -= i4;
                }
                C0614J c0614j2 = u3.f6684n;
                if (c0614j2 != null) {
                    c0614j2.f6626g = u3.f6676f;
                    U.g(u3, c0614j2, R2);
                    u3.o(c0614j2.f6623d);
                    if (c0614j2.f6623d == 1.0f) {
                        u3.f6684n = null;
                    }
                    u3.n();
                }
                break;
            default:
                this.f6629f.f6682l = ((Number) obj).longValue();
                break;
        }
        return R1.y.f4171a;
    }
}
