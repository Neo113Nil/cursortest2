package o;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5442a;

    /* renamed from: b, reason: collision with root package name */
    public int f5443b;

    public e0(int i) {
        this.f5442a = i == 0 ? p0.f5518a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.f5443b + 1;
        Object[] objArr = this.f5442a;
        if (objArr.length < i) {
            l(i, objArr);
        }
        Object[] objArr2 = this.f5442a;
        int i8 = this.f5443b;
        objArr2[i8] = obj;
        this.f5443b = i8 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f5443b;
        int size = list.size() + i;
        Object[] objArr = this.f5442a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.f5442a;
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            objArr2[i8 + i] = list.get(i8);
        }
        this.f5443b = list.size() + this.f5443b;
    }

    public final void c() {
        d6.l.L(this.f5442a, 0, this.f5443b);
        this.f5443b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f5442a[0];
        }
        p.a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i) {
        if (i >= 0 && i < this.f5443b) {
            return this.f5442a[i];
        }
        m(i);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            int i = e0Var.f5443b;
            int i8 = this.f5443b;
            if (i == i8) {
                Object[] objArr = this.f5442a;
                Object[] objArr2 = e0Var.f5442a;
                v6.d u02 = r2.o.u0(0, i8);
                int i9 = u02.f7492d;
                int i10 = u02.f7493e;
                if (i9 > i10) {
                    return true;
                }
                while (q6.i.a(objArr[i9], objArr2[i9])) {
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

    public final int f(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.f5442a;
            int i8 = this.f5443b;
            while (i < i8) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.f5442a;
        int i9 = this.f5443b;
        while (i < i9) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f5443b == 0;
    }

    public final boolean h() {
        return this.f5443b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f5442a;
        int i = this.f5443b;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            i8 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i8;
    }

    public final boolean i(Object obj) {
        int f6 = f(obj);
        if (f6 < 0) {
            return false;
        }
        j(f6);
        return true;
    }

    public final Object j(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f5443b)) {
            m(i);
            throw null;
        }
        Object[] objArr = this.f5442a;
        Object obj = objArr[i];
        if (i != i8 - 1) {
            d6.l.H(objArr, objArr, i, i + 1, i8);
        }
        int i9 = this.f5443b - 1;
        this.f5443b = i9;
        objArr[i9] = null;
        return obj;
    }

    public final void k(int i, int i8) {
        int i9;
        if (i < 0 || i > (i9 = this.f5443b) || i8 < 0 || i8 > i9) {
            p.a.d("Start (" + i + ") and end (" + i8 + ") must be in 0.." + this.f5443b);
            throw null;
        }
        if (i8 < i) {
            p.a.c("Start (" + i + ") is more than end (" + i8 + ')');
            throw null;
        }
        if (i8 != i) {
            if (i8 < i9) {
                Object[] objArr = this.f5442a;
                d6.l.H(objArr, objArr, i, i8, i9);
            }
            int i10 = this.f5443b;
            int i11 = i10 - (i8 - i);
            d6.l.L(this.f5442a, i11, i10);
            this.f5443b = i11;
        }
    }

    public final void l(int i, Object[] objArr) {
        q6.i.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        d6.l.H(objArr, objArr2, 0, 0, length);
        this.f5442a = objArr2;
    }

    public final void m(int i) {
        StringBuilder l3 = a0.q.l("Index ", i, " must be in 0..");
        l3.append(this.f5443b - 1);
        p.a.d(l3.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f5442a;
        int i = this.f5443b;
        int i8 = 0;
        while (true) {
            if (i8 >= i) {
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
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ e0() {
        this(16);
    }
}
