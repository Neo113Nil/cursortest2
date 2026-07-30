package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class p11 extends e11 implements Set {
    public static final /* synthetic */ int o = 0;
    public transient k11 n;

    public static int g(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        lh.e("collection too large");
        return 0;
    }

    public static p11 j(int i, Object... objArr) {
        if (i == 0) {
            return o82.v;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new nl2(obj);
        }
        int g = g(i);
        Object[] objArr2 = new Object[g];
        int i2 = g - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
            int hashCode = obj2.hashCode();
            int c0 = l41.c0(hashCode);
            while (true) {
                int i6 = c0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                c0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new nl2(obj4);
        }
        if (g(i4) < g / 2) {
            return j(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new o82(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p11) && (this instanceof o82) && (((p11) obj) instanceof o82) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public k11 f() {
        k11 k11Var = this.n;
        if (k11Var != null) {
            return k11Var;
        }
        k11 k = k();
        this.n = k;
        return k;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public k11 k() {
        Object[] array = toArray(e11.m);
        g11 g11Var = k11.n;
        return k11.f(array.length, array);
    }

    @Override // defpackage.e11
    public Object writeReplace() {
        return new o11(toArray(e11.m));
    }
}
