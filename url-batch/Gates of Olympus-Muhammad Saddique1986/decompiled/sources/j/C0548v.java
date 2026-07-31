package j;

import java.util.Arrays;
import k2.C0572d;

/* renamed from: j.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548v {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f6336a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public int f6337b;

    public final void a(Object obj) {
        int i3 = this.f6337b + 1;
        Object[] objArr = this.f6336a;
        if (objArr.length < i3) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i3, (objArr.length * 3) / 2));
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f6336a = copyOf;
        }
        Object[] objArr2 = this.f6336a;
        int i4 = this.f6337b;
        objArr2[i4] = obj;
        this.f6337b = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0548v) {
            C0548v c0548v = (C0548v) obj;
            int i3 = c0548v.f6337b;
            int i4 = this.f6337b;
            if (i3 == i4) {
                Object[] objArr = this.f6336a;
                Object[] objArr2 = c0548v.f6336a;
                C0572d g02 = O2.d.g0(0, i4);
                int i5 = g02.f6419d;
                int i6 = g02.f6420e;
                if (i5 > i6) {
                    return true;
                }
                while (f2.j.a(objArr[i5], objArr2[i5])) {
                    if (i5 == i6) {
                        return true;
                    }
                    i5++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f6336a;
        int i3 = this.f6337b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            i4 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f6336a;
        int i3 = this.f6337b;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i4];
            if (i4 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i4 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i4++;
        }
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
