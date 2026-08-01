package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o0 {
    protected transient int zza;

    public static void d(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof x1) {
            List a9 = ((x1) iterable).a();
            if (list != null) {
                kotlin.collections.i0.j();
                return;
            }
            list.size();
            Iterator it = a9.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof v0) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                v0.k(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof k2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof m2) {
                m2 m2Var = (m2) list;
                int i3 = m2Var.f2526i + size;
                int length = m2Var.f2525e.length;
                if (i3 > length) {
                    if (length != 0) {
                        while (length < i3) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        m2Var.f2525e = Arrays.copyOf(m2Var.f2525e, length);
                    } else {
                        m2Var.f2525e = new Object[Math.max(i3, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    i1.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                i1.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            k1 k1Var = (k1) this;
            int m10 = k1Var.m();
            byte[] bArr = new byte[m10];
            boolean z10 = b1.f2157b;
            z0 z0Var = new z0(m10, bArr);
            k1Var.f(z0Var);
            if (z0Var.x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (z0Var.x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(v4.a.p(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public final void b(OutputStream outputStream) {
        k1 k1Var = (k1) this;
        int m10 = k1Var.m();
        boolean z10 = b1.f2157b;
        if (m10 > 4096) {
            m10 = 4096;
        }
        a1 a1Var = new a1(outputStream, m10);
        k1Var.f(a1Var);
        if (a1Var.f2129e > 0) {
            a1Var.B();
        }
    }

    public abstract int c(o2 o2Var);
}
