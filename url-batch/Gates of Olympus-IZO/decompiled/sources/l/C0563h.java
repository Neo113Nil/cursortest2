package l;

import e2.C0380d;
import java.util.List;
import java.util.NoSuchElementException;
import r0.InterfaceC0827A;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563h implements InterfaceC0827A {

    /* renamed from: a, reason: collision with root package name */
    public final C0568m f5471a;

    public C0563h(C0568m c0568m) {
        this.f5471a = c0568m;
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        r0.H h3;
        r0.H h4;
        int i3;
        int i4;
        int i5;
        int size = list.size();
        r0.H[] hArr = new r0.H[size];
        int size2 = list.size();
        long j4 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            h3 = null;
            if (i7 >= size2) {
                break;
            }
            r0.z zVar = (r0.z) list.get(i7);
            Object r3 = zVar.r();
            C0565j c0565j = r3 instanceof C0565j ? (C0565j) r3 : null;
            if (c0565j != null && ((Boolean) c0565j.f5472a.getValue()).booleanValue()) {
                r0.H b2 = zVar.b(j3);
                long e3 = I2.l.e(b2.f7114d, b2.f7115e);
                hArr[i7] = b2;
                j4 = e3;
            }
            i7++;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            r0.z zVar2 = (r0.z) list.get(i8);
            if (hArr[i8] == null) {
                hArr[i8] = zVar2.b(j3);
            }
        }
        if (o3.B()) {
            i4 = (int) (j4 >> 32);
        } else {
            if (size == 0) {
                h4 = null;
            } else {
                h4 = hArr[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    int i10 = h4 != null ? h4.f7114d : 0;
                    C0380d c0380d = new C0380d(1, i9, 1);
                    int i11 = c0380d.f4770f;
                    int i12 = c0380d.f4769e;
                    boolean z3 = i11 <= 0 ? 1 >= i12 : 1 <= i12;
                    int i13 = z3 ? 1 : i12;
                    while (z3) {
                        if (i13 != i12) {
                            i3 = i13 + i11;
                            z3 = z3;
                        } else {
                            if (!z3) {
                                throw new NoSuchElementException();
                            }
                            z3 = false;
                            i3 = i13;
                        }
                        r0.H h5 = hArr[i13];
                        int i14 = h5 != null ? h5.f7114d : 0;
                        if (i10 < i14) {
                            h4 = h5;
                            i13 = i3;
                            i10 = i14;
                        } else {
                            i13 = i3;
                        }
                    }
                }
            }
            i4 = h4 != null ? h4.f7114d : 0;
        }
        if (o3.B()) {
            i6 = (int) (4294967295L & j4);
        } else {
            if (size != 0) {
                h3 = hArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = h3 != null ? h3.f7115e : 0;
                    C0380d c0380d2 = new C0380d(1, i15, 1);
                    int i17 = c0380d2.f4770f;
                    int i18 = c0380d2.f4769e;
                    boolean z4 = i17 <= 0 ? 1 >= i18 : 1 <= i18;
                    int i19 = z4 ? 1 : i18;
                    while (z4) {
                        if (i19 != i18) {
                            i5 = i19 + i17;
                            z4 = z4;
                        } else {
                            if (!z4) {
                                throw new NoSuchElementException();
                            }
                            z4 = false;
                            i5 = i19;
                        }
                        r0.H h6 = hArr[i19];
                        int i20 = h6 != null ? h6.f7115e : 0;
                        i19 = i5;
                        if (i16 < i20) {
                            h3 = h6;
                            i16 = i20;
                        }
                    }
                }
            }
            if (h3 != null) {
                i6 = h3.f7115e;
            }
        }
        if (!o3.B()) {
            this.f5471a.f5481c.setValue(new M0.i(I2.l.e(i4, i6)));
        }
        return o3.Y(i4, i6, M1.v.f2804d, new C0562g(hArr, this, i4, i6));
    }
}
