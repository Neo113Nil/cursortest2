package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class H extends AbstractC0273x implements Set {

    /* renamed from: b, reason: collision with root package name */
    public transient C f2736b;

    public static int h(int i3) {
        int max = Math.max(i3, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static H j(int i3, Object... objArr) {
        if (i3 == 0) {
            return X.f2810i;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new Z(obj);
        }
        int h3 = h(i3);
        Object[] objArr2 = new Object[h3];
        int i4 = h3 - 1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0033i.h(i7, "at index "));
            }
            int hashCode = obj2.hashCode();
            int b3 = AbstractC0216d1.b(hashCode);
            while (true) {
                int i8 = b3 & i4;
                Object obj3 = objArr2[i8];
                if (obj3 == null) {
                    objArr[i6] = obj2;
                    objArr2[i8] = obj2;
                    i5 += hashCode;
                    i6++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    b3++;
                }
            }
        }
        Arrays.fill(objArr, i6, i3, (Object) null);
        if (i6 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new Z(obj4);
        }
        if (h(i6) < h3 / 2) {
            return j(i6, objArr);
        }
        int length = objArr.length;
        if (i6 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i6);
        }
        return new X(i5, i4, i6, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public C e() {
        C c3 = this.f2736b;
        if (c3 != null) {
            return c3;
        }
        C i3 = i();
        this.f2736b = i3;
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof H) && (this instanceof X)) {
            H h3 = (H) obj;
            h3.getClass();
            if ((h3 instanceof X) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 += next != null ? next.hashCode() : 0;
        }
        return i3;
    }

    public C i() {
        Object[] array = toArray(AbstractC0273x.f2957a);
        C0279z c0279z = C.f2714b;
        return C.j(array.length, array);
    }
}
