package e2;

import java.util.Map;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2743a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2744b;

    /* renamed from: c, reason: collision with root package name */
    public int f2745c;

    public final int a(int i7, Object obj) {
        int i8;
        int i9 = this.f2745c;
        if (i9 == 0) {
            return -1;
        }
        int[] iArr = this.f2743a;
        int i10 = i9 - 1;
        int i11 = 0;
        while (true) {
            if (i11 > i10) {
                i8 = ~i11;
                break;
            }
            i8 = (i11 + i10) >>> 1;
            int i12 = iArr[i8];
            if (i12 >= i7) {
                if (i12 <= i7) {
                    break;
                }
                i10 = i8 - 1;
            } else {
                i11 = i8 + 1;
            }
        }
        if (i8 < 0 || k.a(obj, this.f2744b[i8 << 1])) {
            return i8;
        }
        int i13 = i8 + 1;
        while (i13 < i9 && this.f2743a[i13] == i7) {
            if (k.a(obj, this.f2744b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = i8 - 1; i14 >= 0 && this.f2743a[i14] == i7; i14--) {
            if (k.a(obj, this.f2744b[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    public final int b() {
        int i7;
        int i8 = this.f2745c;
        if (i8 == 0) {
            return -1;
        }
        int[] iArr = this.f2743a;
        int i9 = i8 - 1;
        int i10 = 0;
        while (true) {
            if (i10 > i9) {
                i7 = ~i10;
                break;
            }
            i7 = (i10 + i9) >>> 1;
            int i11 = iArr[i7];
            if (i11 >= 0) {
                if (i11 <= 0) {
                    break;
                }
                i9 = i7 - 1;
            } else {
                i10 = i7 + 1;
            }
        }
        if (i7 < 0 || this.f2744b[i7 << 1] == null) {
            return i7;
        }
        int i12 = i7 + 1;
        while (i12 < i8 && this.f2743a[i12] == 0) {
            if (this.f2744b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = i7 - 1; i13 >= 0 && this.f2743a[i13] == 0; i13--) {
            if (this.f2744b[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c)) {
                if ((obj instanceof Map) && this.f2745c == ((Map) obj).size()) {
                    int i7 = this.f2745c;
                    for (int i8 = 0; i8 < i7; i8++) {
                        Object[] objArr = this.f2744b;
                        int i9 = i8 << 1;
                        Object obj2 = objArr[i9];
                        Object obj3 = objArr[i9 + 1];
                        Object obj4 = ((Map) obj).get(obj2);
                        if (obj3 == null) {
                            if (obj4 == null && ((Map) obj).containsKey(obj2)) {
                            }
                        } else if (!obj3.equals(obj4)) {
                        }
                    }
                }
                return false;
            }
            c cVar = (c) obj;
            int i10 = this.f2745c;
            if (i10 == cVar.f2745c) {
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr2 = this.f2744b;
                    int i12 = i11 << 1;
                    Object obj5 = objArr2[i12];
                    Object obj6 = objArr2[i12 + 1];
                    int b9 = obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5);
                    Object obj7 = b9 >= 0 ? cVar.f2744b[(b9 << 1) + 1] : null;
                    if (obj6 == null) {
                        if (obj7 == null) {
                            if ((obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5)) >= 0) {
                            }
                        }
                    } else if (!obj6.equals(obj7)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f2743a;
        Object[] objArr = this.f2744b;
        int i7 = this.f2745c;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    public final String toString() {
        int i7 = this.f2745c;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        int i8 = this.f2745c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            int i10 = i9 << 1;
            Object obj = this.f2744b[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f2744b[i10 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
