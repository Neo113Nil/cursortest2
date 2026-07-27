package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C0216k;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366r1 implements InterfaceC0375u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0328e1 f5241b = new C0328e1(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5242a;

    public C0366r1(InterfaceC0375u1... interfaceC0375u1Arr) {
        this.f5242a = interfaceC0375u1Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0375u1
    public C1 a(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            InterfaceC0375u1 interfaceC0375u1 = ((InterfaceC0375u1[]) this.f5242a)[i2];
            if (interfaceC0375u1.b(cls)) {
                return interfaceC0375u1.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0375u1
    public boolean b(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (((InterfaceC0375u1[]) this.f5242a)[i2].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i2, int i3) {
        ((Z0) this.f5242a).g0(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public void d(int i2, long j2) {
        ((Z0) this.f5242a).i0(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public void e(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((Z0) this.f5242a).e0(i2, (String) list.get(i3));
        }
    }

    public void f(int i2, int i3) {
        ((Z0) this.f5242a).g0(i2, i3);
    }

    public void g(int i2, long j2) {
        ((Z0) this.f5242a).i0(i2, j2);
    }

    public void h(int i2, boolean z) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        Z0 z02 = (Z0) this.f5242a;
        z02.h0(i2 << 3);
        int i3 = z02.f5152e;
        try {
            int i6 = i3 + 1;
            try {
                z02.f5150c[i3] = z ? (byte) 1 : (byte) 0;
                z02.f5152e = i6;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i6;
                throw new C0216k(i3, z02.f5151d, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e6) {
            indexOutOfBoundsException = e6;
        }
    }

    public void i(int i2, Y0 y02) {
        ((Z0) this.f5242a).X(i2, y02);
    }

    public void j(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((Z0) this.f5242a).X(i2, (Y0) list.get(i3));
        }
    }

    public void k(int i2, double d6) {
        ((Z0) this.f5242a).a0(i2, Double.doubleToRawLongBits(d6));
    }

    public void l(int i2, int i3) {
        ((Z0) this.f5242a).c0(i2, i3);
    }

    public void m(int i2, int i3) {
        ((Z0) this.f5242a).Y(i2, i3);
    }

    public void n(int i2, long j2) {
        ((Z0) this.f5242a).a0(i2, j2);
    }

    public void o(int i2, float f3) {
        ((Z0) this.f5242a).Y(i2, Float.floatToRawIntBits(f3));
    }

    public void p(int i2, Object obj, D1 d12) {
        Z0 z02 = (Z0) this.f5242a;
        z02.f0(i2, 3);
        d12.h((S0) obj, z02.f5149b);
        z02.f0(i2, 4);
    }

    public void q(int i2, int i3) {
        ((Z0) this.f5242a).c0(i2, i3);
    }

    public void r(int i2, long j2) {
        ((Z0) this.f5242a).i0(i2, j2);
    }

    public void s(int i2, Object obj, D1 d12) {
        S0 s02 = (S0) obj;
        Z0 z02 = (Z0) this.f5242a;
        z02.h0((i2 << 3) | 2);
        z02.h0(s02.a(d12));
        d12.h(s02, z02.f5149b);
    }

    public void t(int i2, int i3) {
        ((Z0) this.f5242a).Y(i2, i3);
    }

    public void u(int i2, long j2) {
        ((Z0) this.f5242a).a0(i2, j2);
    }

    public C0366r1() {
        A1 a12 = A1.f5019c;
        C0366r1 c0366r1 = new C0366r1(C0328e1.f5176b, f5241b);
        Charset charset = AbstractC0349l1.f5205a;
        this.f5242a = c0366r1;
    }

    public C0366r1(Z0 z02) {
        Charset charset = AbstractC0349l1.f5205a;
        this.f5242a = z02;
        z02.f5149b = this;
    }
}
