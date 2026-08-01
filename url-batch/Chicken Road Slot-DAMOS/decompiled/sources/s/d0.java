package s;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8284a;

    /* renamed from: b, reason: collision with root package name */
    public int f8285b;

    public d0(int i3) {
        this.f8284a = i3 == 0 ? n0.f8348a : new Object[i3];
    }

    public final void a(Object obj) {
        int i3 = this.f8285b + 1;
        Object[] objArr = this.f8284a;
        if (objArr.length < i3) {
            m(i3, objArr);
        }
        Object[] objArr2 = this.f8284a;
        int i10 = this.f8285b;
        objArr2[i10] = obj;
        this.f8285b = i10 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i3 = this.f8285b;
        int size = list.size() + i3;
        Object[] objArr = this.f8284a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.f8284a;
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr2[i10 + i3] = list.get(i10);
        }
        this.f8285b = list.size() + this.f8285b;
    }

    public final void c(d0 d0Var) {
        d0Var.getClass();
        if (d0Var.h()) {
            return;
        }
        int i3 = this.f8285b + d0Var.f8285b;
        Object[] objArr = this.f8284a;
        if (objArr.length < i3) {
            m(i3, objArr);
        }
        kotlin.collections.v.d(this.f8285b, 0, d0Var.f8285b, d0Var.f8284a, this.f8284a);
        this.f8285b += d0Var.f8285b;
    }

    public final void d() {
        kotlin.collections.v.i(this.f8284a, 0, this.f8285b);
        this.f8285b = 0;
    }

    public final Object e() {
        if (h()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.f8284a[0];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            int i3 = d0Var.f8285b;
            int i10 = this.f8285b;
            if (i3 == i10) {
                Object[] objArr = this.f8284a;
                Object[] objArr2 = d0Var.f8284a;
                IntRange f3 = be.f.f(0, i10);
                int i11 = f3.f5599d;
                int i12 = f3.f5600e;
                if (i11 > i12) {
                    return true;
                }
                while (Intrinsics.a(objArr[i11], objArr2[i11])) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i3) {
        if (i3 >= 0 && i3 < this.f8285b) {
            return this.f8284a[i3];
        }
        n(i3);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.f8284a;
        int i3 = 0;
        if (obj == null) {
            int i10 = this.f8285b;
            while (i3 < i10) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int i11 = this.f8285b;
        while (i3 < i11) {
            if (obj.equals(objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f8285b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f8284a;
        int i3 = this.f8285b;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            Object obj = objArr[i11];
            i10 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i10;
    }

    public final boolean i() {
        return this.f8285b != 0;
    }

    public final boolean j(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return false;
        }
        k(g);
        return true;
    }

    public final Object k(int i3) {
        int i10;
        if (i3 < 0 || i3 >= (i10 = this.f8285b)) {
            n(i3);
            throw null;
        }
        Object[] objArr = this.f8284a;
        Object obj = objArr[i3];
        if (i3 != i10 - 1) {
            kotlin.collections.v.d(i3, i3 + 1, i10, objArr, objArr);
        }
        int i11 = this.f8285b - 1;
        this.f8285b = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void l(int i3, int i10) {
        int i11;
        if (i3 < 0 || i3 > (i11 = this.f8285b) || i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException("Start (" + i3 + ") and end (" + i10 + ") must be in 0.." + this.f8285b);
        }
        if (i10 < i3) {
            throw new IllegalArgumentException("Start (" + i3 + ") is more than end (" + i10 + ')');
        }
        if (i10 != i3) {
            if (i10 < i11) {
                Object[] objArr = this.f8284a;
                kotlin.collections.v.d(i3, i10, i11, objArr, objArr);
            }
            int i12 = this.f8285b;
            int i13 = i12 - (i10 - i3);
            kotlin.collections.v.i(this.f8284a, i13, i12);
            this.f8285b = i13;
        }
    }

    public final void m(int i3, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i3, (length * 3) / 2)];
        kotlin.collections.v.d(0, 0, length, objArr, objArr2);
        this.f8284a = objArr2;
    }

    public final void n(int i3) {
        StringBuilder i10 = n0.l.i(i3, "Index ", " must be in 0..");
        i10.append(this.f8285b - 1);
        throw new IndexOutOfBoundsException(i10.toString());
    }

    public final String toString() {
        a3.e eVar = new a3.e(18, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f8284a;
        int i3 = this.f8285b;
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) eVar.invoke(obj));
            i10++;
        }
        return sb2.toString();
    }

    public /* synthetic */ d0() {
        this(16);
    }
}
