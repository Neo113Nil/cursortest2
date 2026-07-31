package r;

import H2.AbstractC0080b;

/* renamed from: r.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810g implements InterfaceC0809f {

    /* renamed from: a, reason: collision with root package name */
    public final float f7058a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7059b;

    public C0810g(float f3) {
        this.f7058a = f3;
        this.f7059b = f3;
    }

    @Override // r.InterfaceC0808e, r.InterfaceC0811h
    public final float a() {
        return this.f7059b;
    }

    @Override // r.InterfaceC0808e
    public final void b(M0.b bVar, int i3, int[] iArr, M0.j jVar, int[] iArr2) {
        int i4;
        int i5;
        if (iArr.length == 0) {
            return;
        }
        int k3 = bVar.k(this.f7058a);
        boolean z3 = jVar == M0.j.f2776e;
        C0807d c0807d = AbstractC0813j.f7061a;
        if (z3) {
            i4 = 0;
            i5 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                int min = Math.min(i4, i3 - i6);
                iArr2[length] = min;
                i5 = Math.min(k3, (i3 - min) - i6);
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
                int min2 = Math.min(i4, i3 - i9);
                iArr2[i8] = min2;
                int min3 = Math.min(k3, (i3 - min2) - i9);
                int i10 = iArr2[i8] + i9 + min3;
                i7++;
                i8++;
                i5 = min3;
                i4 = i10;
            }
        }
        if (i4 - i5 < i3) {
            int round = Math.round((1 + (jVar != M0.j.f2775d ? (-1.0f) * (-1) : -1.0f)) * ((i3 - r11) / 2.0f));
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + round;
            }
        }
    }

    @Override // r.InterfaceC0811h
    public final void c(r0.C c3, int i3, int[] iArr, int[] iArr2) {
        b(c3, i3, iArr, M0.j.f2775d, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0810g)) {
            return false;
        }
        if (!M0.e.a(this.f7058a, ((C0810g) obj).f7058a)) {
            return false;
        }
        Object obj2 = C0812i.f7060e;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0812i.f7060e.hashCode() + AbstractC0080b.f(Float.hashCode(this.f7058a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) M0.e.b(this.f7058a)) + ", " + C0812i.f7060e + ')';
    }
}
