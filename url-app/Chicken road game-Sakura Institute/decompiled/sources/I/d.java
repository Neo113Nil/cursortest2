package I;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;
import z2.C1441y;

/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f3330d;

    /* renamed from: e, reason: collision with root package name */
    public a f3331e;

    /* renamed from: i, reason: collision with root package name */
    public int f3332i = 0;

    public d(Object[] objArr) {
        this.f3330d = objArr;
    }

    public final void a(int i2, Object obj) {
        i(this.f3332i + 1);
        Object[] objArr = this.f3330d;
        int i4 = this.f3332i;
        if (i2 != i4) {
            C1436t.f(objArr, objArr, i2 + 1, i2, i4);
        }
        objArr[i2] = obj;
        this.f3332i++;
    }

    public final void b(Object obj) {
        i(this.f3332i + 1);
        Object[] objArr = this.f3330d;
        int i2 = this.f3332i;
        objArr[i2] = obj;
        this.f3332i = i2 + 1;
    }

    public final void c(int i2, d dVar) {
        if (dVar.k()) {
            return;
        }
        i(this.f3332i + dVar.f3332i);
        Object[] objArr = this.f3330d;
        int i4 = this.f3332i;
        if (i2 != i4) {
            C1436t.f(objArr, objArr, dVar.f3332i + i2, i2, i4);
        }
        C1436t.f(dVar.f3330d, objArr, i2, 0, dVar.f3332i);
        this.f3332i += dVar.f3332i;
    }

    public final void d(int i2, List list) {
        if (list.isEmpty()) {
            return;
        }
        i(list.size() + this.f3332i);
        Object[] objArr = this.f3330d;
        if (i2 != this.f3332i) {
            C1436t.f(objArr, objArr, list.size() + i2, i2, this.f3332i);
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i2 + i4] = list.get(i4);
        }
        this.f3332i = list.size() + this.f3332i;
    }

    public final boolean e(int i2, Collection collection) {
        int i4 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f3332i);
        Object[] objArr = this.f3330d;
        if (i2 != this.f3332i) {
            C1436t.f(objArr, objArr, collection.size() + i2, i2, this.f3332i);
        }
        for (Object obj : collection) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C1441y.g();
                throw null;
            }
            objArr[i4 + i2] = obj;
            i4 = i5;
        }
        this.f3332i = collection.size() + this.f3332i;
        return true;
    }

    public final List f() {
        a aVar = this.f3331e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f3331e = aVar2;
        return aVar2;
    }

    public final void g() {
        Object[] objArr = this.f3330d;
        int i2 = this.f3332i;
        while (true) {
            i2--;
            if (-1 >= i2) {
                this.f3332i = 0;
                return;
            }
            objArr[i2] = null;
        }
    }

    public final boolean h(Object obj) {
        int i2 = this.f3332i - 1;
        if (i2 >= 0) {
            for (int i4 = 0; !Intrinsics.a(this.f3330d[i4], obj); i4++) {
                if (i4 != i2) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i2) {
        Object[] objArr = this.f3330d;
        if (objArr.length < i2) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i2, objArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f3330d = copyOf;
        }
    }

    public final int j(Object obj) {
        int i2 = this.f3332i;
        if (i2 <= 0) {
            return -1;
        }
        Object[] objArr = this.f3330d;
        int i4 = 0;
        while (!Intrinsics.a(obj, objArr[i4])) {
            i4++;
            if (i4 >= i2) {
                return -1;
            }
        }
        return i4;
    }

    public final boolean k() {
        return this.f3332i == 0;
    }

    public final boolean l() {
        return this.f3332i != 0;
    }

    public final boolean m(Object obj) {
        int j4 = j(obj);
        if (j4 < 0) {
            return false;
        }
        n(j4);
        return true;
    }

    public final Object n(int i2) {
        Object[] objArr = this.f3330d;
        Object obj = objArr[i2];
        int i4 = this.f3332i;
        if (i2 != i4 - 1) {
            C1436t.f(objArr, objArr, i2, i2 + 1, i4);
        }
        int i5 = this.f3332i - 1;
        this.f3332i = i5;
        objArr[i5] = null;
        return obj;
    }

    public final void o(int i2, int i4) {
        if (i4 > i2) {
            int i5 = this.f3332i;
            if (i4 < i5) {
                Object[] objArr = this.f3330d;
                C1436t.f(objArr, objArr, i2, i4, i5);
            }
            int i6 = this.f3332i;
            int i7 = i6 - (i4 - i2);
            int i8 = i6 - 1;
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    this.f3330d[i9] = null;
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f3332i = i7;
        }
    }

    public final void p(Comparator comparator) {
        Object[] objArr = this.f3330d;
        int i2 = this.f3332i;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i2, comparator);
    }
}
