package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class PB {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f26876a;

    /* renamed from: b, reason: collision with root package name */
    public int f26877b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26878c;

    public PB(int i) {
        AbstractC2720Pd.p(i, "initialCapacity");
        this.f26876a = new Object[i];
        this.f26877b = 0;
    }

    public static int d(int i, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i4 <= i) {
            return i;
        }
        int i9 = i + (i >> 1) + 1;
        if (i9 < i4) {
            int highestOneBit = Integer.highestOneBit(i4 - 1);
            i9 = highestOneBit + highestOneBit;
        }
        if (i9 < 0) {
            return Integer.MAX_VALUE;
        }
        return i9;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f26876a;
        int i = this.f26877b;
        this.f26877b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof QB) {
                this.f26877b = ((QB) collection).h(this.f26876a, this.f26877b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract PB c(Object obj);

    public final void e(int i) {
        int length = this.f26876a.length;
        int d2 = d(length, this.f26877b + i);
        if (d2 > length || this.f26878c) {
            this.f26876a = Arrays.copyOf(this.f26876a, d2);
            this.f26878c = false;
        }
    }
}
