package G0;

import f2.j;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2081a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2082b;

    /* renamed from: c, reason: collision with root package name */
    public int f2083c;

    public final int a(int i3, Object obj) {
        int i4 = this.f2083c;
        if (i4 == 0) {
            return -1;
        }
        int a3 = a.a(this.f2081a, i4, i3);
        if (a3 < 0) {
            return a3;
        }
        if (j.a(obj, this.f2082b[a3 << 1])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f2081a[i5] == i3) {
            if (j.a(obj, this.f2082b[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f2081a[i6] == i3; i6--) {
            if (j.a(obj, this.f2082b[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int b() {
        int i3 = this.f2083c;
        if (i3 == 0) {
            return -1;
        }
        int a3 = a.a(this.f2081a, i3, 0);
        if (a3 < 0) {
            return a3;
        }
        if (this.f2082b[a3 << 1] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f2081a[i4] == 0) {
            if (this.f2082b[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f2081a[i5] == 0; i5--) {
            if (this.f2082b[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof c)) {
                if (!(obj instanceof Map) || this.f2083c != ((Map) obj).size()) {
                    return false;
                }
                int i3 = this.f2083c;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object[] objArr = this.f2082b;
                    int i5 = i4 << 1;
                    Object obj2 = objArr[i5];
                    Object obj3 = objArr[i5 + 1];
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !((Map) obj).containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(obj4)) {
                        return false;
                    }
                }
                return true;
            }
            c cVar = (c) obj;
            int i6 = this.f2083c;
            if (i6 != cVar.f2083c) {
                return false;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                Object[] objArr2 = this.f2082b;
                int i8 = i7 << 1;
                Object obj5 = objArr2[i8];
                Object obj6 = objArr2[i8 + 1];
                int b3 = obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5);
                Object obj7 = b3 >= 0 ? cVar.f2082b[(b3 << 1) + 1] : null;
                if (obj6 == null) {
                    if (obj7 == null) {
                        if ((obj5 == null ? cVar.b() : cVar.a(obj5.hashCode(), obj5)) >= 0) {
                        }
                    }
                    return false;
                }
                if (!obj6.equals(obj7)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f2081a;
        Object[] objArr = this.f2082b;
        int i3 = this.f2083c;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            i6 += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final String toString() {
        int i3 = this.f2083c;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        int i4 = this.f2083c;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            int i6 = i5 << 1;
            Object obj = this.f2082b[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f2082b[i6 + 1];
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
