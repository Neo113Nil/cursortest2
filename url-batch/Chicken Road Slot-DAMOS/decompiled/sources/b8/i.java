package b8;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i extends b implements Set {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f1427i = 0;

    /* renamed from: e, reason: collision with root package name */
    public transient g f1428e;

    public static int k(int i3) {
        int max = Math.max(i3, 2);
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
        a1.e("collection too large");
        return 0;
    }

    public static i m(int i3, Object... objArr) {
        if (i3 == 0) {
            return y.f1460x;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new a0(obj);
        }
        int k10 = k(i3);
        Object[] objArr2 = new Object[k10];
        int i10 = k10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i13);
                throw new NullPointerException(sb2.toString());
            }
            int hashCode = obj2.hashCode();
            int K = g8.b.K(hashCode);
            while (true) {
                int i14 = K & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                K++;
            }
        }
        Arrays.fill(objArr, i12, i3, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new a0(obj4);
        }
        if (k(i12) < k10 / 2) {
            return m(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new y(i11, i10, i12, objArr, objArr2);
    }

    @Override // b8.b
    public g b() {
        g gVar = this.f1428e;
        if (gVar != null) {
            return gVar;
        }
        g n10 = n();
        this.f1428e = n10;
        return n10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof i) && (this instanceof y) && (((i) obj) instanceof y) && hashCode() != obj.hashCode()) {
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

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a.a.M(this);
    }

    public g n() {
        Object[] array = toArray(b.f1414d);
        d dVar = g.f1423e;
        return g.k(array.length, array);
    }
}
