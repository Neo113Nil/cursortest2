package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class R3 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4043v3[] f27306a;

    public R3(InterfaceC4043v3... interfaceC4043v3Arr) {
        this.f27306a = interfaceC4043v3Arr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r11.b(r5) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3675oC a(Class cls, InterfaceC2916aB interfaceC2916aB) {
        InterfaceC4043v3 interfaceC4043v3;
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        for (InterfaceC4043v3 interfaceC4043v32 : this.f27306a) {
            if (cls.isAssignableFrom(interfaceC4043v32.getClass())) {
                interfaceC4043v3 = (InterfaceC4043v3) cls.cast(interfaceC4043v32);
            }
            interfaceC4043v3 = null;
            if (interfaceC4043v3 != null) {
                int length = objArr.length;
                int i4 = i + 1;
                int d2 = PB.d(length, i4);
                if (d2 > length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i] = interfaceC4043v3;
                i = i4;
            }
        }
        return UB.p(objArr, i);
    }

    public final R3 b(R3 r32) {
        return r32 == null ? this : c(r32.f27306a);
    }

    public final R3 c(InterfaceC4043v3... interfaceC4043v3Arr) {
        int length = interfaceC4043v3Arr.length;
        if (length == 0) {
            return this;
        }
        String str = AbstractC3548lu.f32613a;
        InterfaceC4043v3[] interfaceC4043v3Arr2 = this.f27306a;
        int length2 = interfaceC4043v3Arr2.length;
        Object[] copyOf = Arrays.copyOf(interfaceC4043v3Arr2, length2 + length);
        System.arraycopy(interfaceC4043v3Arr, 0, copyOf, length2, length);
        return new R3((InterfaceC4043v3[]) copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && R3.class == obj.getClass() && Arrays.equals(this.f27306a, ((R3) obj).f27306a);
    }

    public final int hashCode() {
        return Long.hashCode(com.anythink.basead.exoplayer.b.f6539b) + (Arrays.hashCode(this.f27306a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f27306a);
        return D.y.o(new StringBuilder(String.valueOf(arrays).length() + 8), "entries=", arrays, "");
    }

    public R3(List list) {
        this.f27306a = (InterfaceC4043v3[]) list.toArray(new InterfaceC4043v3[0]);
    }
}
