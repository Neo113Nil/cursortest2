package q;

import A.AbstractC0017m;
import p0.InterfaceC0947H;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028g implements InterfaceC1027f, InterfaceC1029h {

    /* renamed from: a, reason: collision with root package name */
    public final float f9256a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9257b;

    public C1028g(float f4) {
        this.f9256a = f4;
        this.f9257b = f4;
    }

    @Override // q.InterfaceC1027f, q.InterfaceC1029h
    public final float a() {
        return this.f9257b;
    }

    @Override // q.InterfaceC1027f
    public final void b(M0.b bVar, int i2, int[] iArr, M0.k kVar, int[] iArr2) {
        int i4;
        int i5;
        if (iArr.length == 0) {
            return;
        }
        int l4 = bVar.l(this.f9256a);
        boolean z4 = kVar == M0.k.f3556e;
        C1023b c1023b = AbstractC1031j.f9265a;
        if (z4) {
            i4 = 0;
            i5 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                int min = Math.min(i4, i2 - i6);
                iArr2[length] = min;
                i5 = Math.min(l4, (i2 - min) - i6);
                i4 = iArr2[length] + i6 + i5;
            }
        } else {
            int length2 = iArr.length;
            int i7 = 0;
            i4 = 0;
            i5 = 0;
            int i8 = 0;
            while (i7 < length2) {
                int i9 = iArr[i7];
                int min2 = Math.min(i4, i2 - i9);
                iArr2[i8] = min2;
                int min3 = Math.min(l4, (i2 - min2) - i9);
                int i10 = iArr2[i8] + i9 + min3;
                i7++;
                i8++;
                i5 = min3;
                i4 = i10;
            }
        }
        if (i4 - i5 < i2) {
            int round = Math.round((1 + (kVar != M0.k.f3555d ? (-1.0f) * (-1) : -1.0f)) * ((i2 - r11) / 2.0f));
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + round;
            }
        }
    }

    @Override // q.InterfaceC1029h
    public final void c(int i2, InterfaceC0947H interfaceC0947H, int[] iArr, int[] iArr2) {
        b(interfaceC0947H, i2, iArr, M0.k.f3555d, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1028g)) {
            return false;
        }
        if (!M0.e.a(this.f9256a, ((C1028g) obj).f9256a)) {
            return false;
        }
        Object obj2 = C1030i.f9259d;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C1030i.f9259d.hashCode() + AbstractC0017m.d(Float.hashCode(this.f9256a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) M0.e.c(this.f9256a)) + ", " + C1030i.f9259d + ')';
    }
}
