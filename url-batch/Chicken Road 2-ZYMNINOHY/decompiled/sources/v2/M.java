package v2;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class M extends D implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15576c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient I f15577b;

    public static int i(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            AbstractC0124a.g("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static M j(int i4, Object... objArr) {
        if (i4 == 0) {
            return h0.f15638j;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new n0(obj);
        }
        int i5 = i(i4);
        Object[] objArr2 = new Object[i5];
        int i6 = i5 - 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0005f.j(i9, "at index "));
            }
            int hashCode = obj2.hashCode();
            int q4 = r.q(hashCode);
            while (true) {
                int i10 = q4 & i6;
                Object obj3 = objArr2[i10];
                if (obj3 == null) {
                    objArr[i8] = obj2;
                    objArr2[i10] = obj2;
                    i7 += hashCode;
                    i8++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                q4++;
            }
        }
        Arrays.fill(objArr, i8, i4, (Object) null);
        if (i8 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new n0(obj4);
        }
        if (i(i8) < i5 / 2) {
            return j(i8, objArr);
        }
        int length = objArr.length;
        if (i8 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new h0(i7, i6, i8, objArr, objArr2);
    }

    public static M k(Collection collection) {
        if ((collection instanceof M) && !(collection instanceof SortedSet)) {
            M m4 = (M) collection;
            if (!m4.g()) {
                return m4;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    @Override // v2.D
    public I b() {
        I i4 = this.f15577b;
        if (i4 != null) {
            return i4;
        }
        I l4 = l();
        this.f15577b = l4;
        return l4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof M) && (this instanceof h0)) {
            M m4 = (M) obj;
            m4.getClass();
            if ((m4 instanceof h0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return r.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r.k(this);
    }

    public I l() {
        Object[] array = toArray(D.f15562a);
        G g4 = I.f15571b;
        return I.i(array.length, array);
    }
}
