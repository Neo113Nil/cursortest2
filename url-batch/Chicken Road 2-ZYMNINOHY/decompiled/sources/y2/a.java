package y2;

import a.AbstractC0124a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f16260c = new a(new int[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16262b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f16261a = iArr;
        this.f16262b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i4 = aVar.f16262b;
            int i5 = this.f16262b;
            if (i5 == i4) {
                for (int i6 = 0; i6 < i5; i6++) {
                    AbstractC0124a.m(i6, i5);
                    int i7 = this.f16261a[i6];
                    AbstractC0124a.m(i6, aVar.f16262b);
                    if (i7 == aVar.f16261a[i6]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f16262b; i5++) {
            i4 = (i4 * 31) + this.f16261a[i5];
        }
        return i4;
    }

    public final String toString() {
        int i4 = this.f16262b;
        if (i4 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i4 * 5);
        sb.append('[');
        int[] iArr = this.f16261a;
        sb.append(iArr[0]);
        for (int i5 = 1; i5 < i4; i5++) {
            sb.append(", ");
            sb.append(iArr[i5]);
        }
        sb.append(']');
        return sb.toString();
    }
}
