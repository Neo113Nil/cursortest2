package n0;

import L1.z;
import e2.C0380d;
import h1.C0438i;
import j.C0494l;
import java.util.concurrent.CancellationException;
import k2.InterfaceC0534f;
import o.C0732h;
import r0.InterfaceC0838k;
import u.C0941i;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final K.d f6213a;

    public f(int i3) {
        switch (i3) {
            case 1:
                this.f6213a = new K.d(new C0732h[16]);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f6213a = new K.d(new C0941i[16]);
                break;
            default:
                this.f6213a = new K.d(new e[16]);
                break;
        }
    }

    public boolean a(C0494l c0494l, InterfaceC0838k interfaceC0838k, C2.c cVar, boolean z3) {
        K.d dVar = this.f6213a;
        int i3 = dVar.f2642f;
        if (i3 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f2640d;
        int i4 = 0;
        boolean z4 = false;
        do {
            z4 = ((e) objArr[i4]).a(c0494l, interfaceC0838k, cVar, z3) || z4;
            i4++;
        } while (i4 < i3);
        return z4;
    }

    public void b(CancellationException cancellationException) {
        K.d dVar = this.f6213a;
        int i3 = dVar.f2642f;
        InterfaceC0534f[] interfaceC0534fArr = new InterfaceC0534f[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            interfaceC0534fArr[i4] = ((C0732h) dVar.f2640d[i4]).f6531b;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            interfaceC0534fArr[i5].v(cancellationException);
        }
        if (!dVar.l()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void c(C2.c cVar) {
        K.d dVar = this.f6213a;
        int i3 = dVar.f2642f;
        while (true) {
            i3--;
            if (-1 >= i3) {
                return;
            }
            if (((e) dVar.f2640d[i3]).f6206c.f843b == 0) {
                dVar.o(i3);
            }
        }
    }

    public void d() {
        int i3 = 0;
        while (true) {
            K.d dVar = this.f6213a;
            if (i3 >= dVar.f2642f) {
                return;
            }
            e eVar = (e) dVar.f2640d[i3];
            if (eVar.f6205b.p) {
                i3++;
                eVar.d();
            } else {
                eVar.f();
                dVar.o(i3);
            }
        }
    }

    public void e() {
        K.d dVar = this.f6213a;
        int i3 = 0;
        int i4 = new C0380d(0, dVar.f2642f - 1, 1).f4769e;
        if (i4 >= 0) {
            while (true) {
                ((C0732h) dVar.f2640d[i3]).f6531b.resumeWith(z.f2729a);
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
