package y0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final int f16084a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16085b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16086c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16087d;

    public E(int i4, int i5, int i6, byte[] bArr) {
        this.f16084a = i4;
        this.f16085b = bArr;
        this.f16086c = i5;
        this.f16087d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e4 = (E) obj;
            if (this.f16084a == e4.f16084a && this.f16086c == e4.f16086c && this.f16087d == e4.f16087d && Arrays.equals(this.f16085b, e4.f16085b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f16085b) + (this.f16084a * 31)) * 31) + this.f16086c) * 31) + this.f16087d;
    }
}
