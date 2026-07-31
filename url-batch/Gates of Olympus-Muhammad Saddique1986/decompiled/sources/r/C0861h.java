package r;

import r0.InterfaceC0887I;

/* renamed from: r.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861h implements InterfaceC0860g {

    /* renamed from: a, reason: collision with root package name */
    public final float f8048a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8049b;

    public C0861h(float f3) {
        this.f8048a = f3;
        this.f8049b = f3;
    }

    @Override // r.InterfaceC0859f, r.InterfaceC0862i
    public final float a() {
        return this.f8049b;
    }

    @Override // r.InterfaceC0859f
    public final void b(O0.b bVar, int i3, int[] iArr, O0.k kVar, int[] iArr2) {
        int i4;
        int i5;
        if (iArr.length == 0) {
            return;
        }
        int l3 = bVar.l(this.f8048a);
        boolean z3 = kVar == O0.k.f3742e;
        C0855b c0855b = AbstractC0864k.f8051a;
        if (z3) {
            i4 = 0;
            i5 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                int min = Math.min(i4, i3 - i6);
                iArr2[length] = min;
                i5 = Math.min(l3, (i3 - min) - i6);
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
                int min3 = Math.min(l3, (i3 - min2) - i9);
                int i10 = iArr2[i8] + i9 + min3;
                i7++;
                i8++;
                i5 = min3;
                i4 = i10;
            }
        }
        if (i4 - i5 < i3) {
            int round = Math.round((1 + (kVar != O0.k.f3741d ? (-1.0f) * (-1) : -1.0f)) * ((i3 - r11) / 2.0f));
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + round;
            }
        }
    }

    @Override // r.InterfaceC0862i
    public final void c(int i3, InterfaceC0887I interfaceC0887I, int[] iArr, int[] iArr2) {
        b(interfaceC0887I, i3, iArr, O0.k.f3741d, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0861h)) {
            return false;
        }
        if (!O0.e.a(this.f8048a, ((C0861h) obj).f8048a)) {
            return false;
        }
        Object obj2 = C0863j.f8050e;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0863j.f8050e.hashCode() + A.k.e(Float.hashCode(this.f8048a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) O0.e.b(this.f8048a)) + ", " + C0863j.f8050e + ')';
    }
}
