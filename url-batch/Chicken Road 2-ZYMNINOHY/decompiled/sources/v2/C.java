package v2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f15559a;

    /* renamed from: b, reason: collision with root package name */
    public int f15560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15561c;

    public C(int i4) {
        r.d(i4, "initialCapacity");
        this.f15559a = new Object[i4];
        this.f15560b = 0;
    }

    public static int e(int i4, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i5 <= i4) {
            return i4;
        }
        int i6 = i4 + (i4 >> 1) + 1;
        if (i6 < i5) {
            i6 = Integer.highestOneBit(i5 - 1) << 1;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    public abstract C a(Object obj);

    public final void b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f15559a;
        int i4 = this.f15560b;
        this.f15560b = i4 + 1;
        objArr[i4] = obj;
    }

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(collection.size());
            if (collection instanceof D) {
                this.f15560b = ((D) collection).c(this.f15560b, this.f15559a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void d(int i4) {
        Object[] objArr = this.f15559a;
        int e4 = e(objArr.length, this.f15560b + i4);
        if (e4 > objArr.length || this.f15561c) {
            this.f15559a = Arrays.copyOf(this.f15559a, e4);
            this.f15561c = false;
        }
    }
}
