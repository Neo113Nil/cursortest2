package i;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4804a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public int f4805b;

    public final void a(Object obj) {
        int i7 = this.f4805b + 1;
        Object[] objArr = this.f4804a;
        if (objArr.length < i7) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i7, (objArr.length * 3) / 2));
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4804a = copyOf;
        }
        Object[] objArr2 = this.f4804a;
        int i8 = this.f4805b;
        objArr2[i8] = obj;
        this.f4805b = i8 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i7 = vVar.f4805b;
            int i8 = this.f4805b;
            if (i7 == i8) {
                Object[] objArr = this.f4804a;
                Object[] objArr2 = vVar.f4804a;
                w6.d o2 = v1.g.o(0, i8);
                int i9 = o2.f9521f;
                int i10 = o2.f9522g;
                if (i9 > i10) {
                    return true;
                }
                while (r6.k.a(objArr[i9], objArr2[i9])) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f4804a;
        int i7 = this.f4805b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            i8 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f4804a;
        int i7 = this.f4805b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i8++;
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
