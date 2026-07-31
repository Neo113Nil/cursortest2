package j;

import e2.AbstractC0381e;
import e2.C0380d;
import java.util.Arrays;

/* renamed from: j.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504v {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5218a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public int f5219b;

    public final void a(Object obj) {
        int i3 = this.f5219b + 1;
        Object[] objArr = this.f5218a;
        if (objArr.length < i3) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i3, (objArr.length * 3) / 2));
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f5218a = copyOf;
        }
        Object[] objArr2 = this.f5218a;
        int i4 = this.f5219b;
        objArr2[i4] = obj;
        this.f5219b = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0504v) {
            C0504v c0504v = (C0504v) obj;
            int i3 = c0504v.f5219b;
            int i4 = this.f5219b;
            if (i3 == i4) {
                Object[] objArr = this.f5218a;
                Object[] objArr2 = c0504v.f5218a;
                C0380d Q2 = AbstractC0381e.Q(0, i4);
                int i5 = Q2.f4768d;
                int i6 = Q2.f4769e;
                if (i5 > i6) {
                    return true;
                }
                while (Z1.i.a(objArr[i5], objArr2[i5])) {
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
        Object[] objArr = this.f5218a;
        int i3 = this.f5219b;
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
        Object[] objArr = this.f5218a;
        int i3 = this.f5219b;
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
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
