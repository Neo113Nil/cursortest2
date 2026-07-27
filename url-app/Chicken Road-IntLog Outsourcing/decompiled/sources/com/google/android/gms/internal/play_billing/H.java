package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class H extends AbstractC0382x implements Set {

    /* renamed from: b, reason: collision with root package name */
    public transient C f5052b;

    public static int h(int i2) {
        int max = Math.max(i2, 2);
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

    public static H j(int i2, Object... objArr) {
        if (i2 == 0) {
            return Y.f5136i;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C0315a0(obj);
        }
        int h3 = h(i2);
        Object[] objArr2 = new Object[h3];
        int i3 = h3 - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0279e.d(i8, "at index "));
            }
            int hashCode = obj2.hashCode();
            int c2 = AbstractC0325d1.c(hashCode);
            while (true) {
                int i9 = c2 & i3;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    c2++;
                }
            }
        }
        Arrays.fill(objArr, i7, i2, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C0315a0(obj4);
        }
        if (h(i7) < h3 / 2) {
            return j(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new Y(i6, i3, i7, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public C e() {
        C c2 = this.f5052b;
        if (c2 != null) {
            return c2;
        }
        C i2 = i();
        this.f5052b = i2;
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof H) && (this instanceof Y)) {
            H h3 = (H) obj;
            h3.getClass();
            if ((h3 instanceof Y) && hashCode() != obj.hashCode()) {
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
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 += next != null ? next.hashCode() : 0;
        }
        return i2;
    }

    public C i() {
        Object[] array = toArray(AbstractC0382x.f5286a);
        C0388z c0388z = C.f5030b;
        return C.j(array.length, array);
    }
}
