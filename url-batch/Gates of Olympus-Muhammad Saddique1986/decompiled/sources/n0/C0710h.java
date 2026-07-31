package n0;

import j.C0538l;
import java.util.concurrent.CancellationException;
import k2.C0572d;
import p.C0765h;
import q2.InterfaceC0819f;
import r0.InterfaceC0919p;
import t.C0981i;
import z.C1256t;

/* renamed from: n0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0710h {

    /* renamed from: a, reason: collision with root package name */
    public final K.d f7291a;

    public C0710h(int i3) {
        switch (i3) {
            case 1:
                this.f7291a = new K.d(new C0765h[16]);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7291a = new K.d(new C0981i[16]);
                break;
            default:
                this.f7291a = new K.d(new C0709g[16]);
                break;
        }
    }

    public boolean a(C0538l c0538l, InterfaceC0919p interfaceC0919p, C1256t c1256t, boolean z3) {
        K.d dVar = this.f7291a;
        int i3 = dVar.f3216f;
        if (i3 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f3214d;
        int i4 = 0;
        boolean z4 = false;
        do {
            z4 = ((C0709g) objArr[i4]).a(c0538l, interfaceC0919p, c1256t, z3) || z4;
            i4++;
        } while (i4 < i3);
        return z4;
    }

    public void b(CancellationException cancellationException) {
        K.d dVar = this.f7291a;
        int i3 = dVar.f3216f;
        InterfaceC0819f[] interfaceC0819fArr = new InterfaceC0819f[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            interfaceC0819fArr[i4] = ((C0765h) dVar.f3214d[i4]).f7672b;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            interfaceC0819fArr[i5].C(cancellationException);
        }
        if (!dVar.l()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void c(C1256t c1256t) {
        K.d dVar = this.f7291a;
        int i3 = dVar.f3216f;
        while (true) {
            i3--;
            if (-1 >= i3) {
                return;
            }
            if (((C0709g) dVar.f3214d[i3]).f7284c.f3330b == 0) {
                dVar.o(i3);
            }
        }
    }

    public void d() {
        int i3 = 0;
        while (true) {
            K.d dVar = this.f7291a;
            if (i3 >= dVar.f3216f) {
                return;
            }
            C0709g c0709g = (C0709g) dVar.f3214d[i3];
            if (c0709g.f7283b.f4501p) {
                i3++;
                c0709g.d();
            } else {
                c0709g.f();
                dVar.o(i3);
            }
        }
    }

    public void e() {
        K.d dVar = this.f7291a;
        int i3 = 0;
        int i4 = new C0572d(0, dVar.f3216f - 1, 1).f6420e;
        if (i4 >= 0) {
            while (true) {
                ((C0765h) dVar.f3214d[i3]).f7672b.u(R1.y.f4171a);
                if (i3 == i4) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        dVar.h();
    }
}
