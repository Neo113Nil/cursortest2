package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hfm extends heb implements Set, j$.util.Set {
    private static final long serialVersionUID = 912559;
    private transient hel a;

    static int d(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            hoq.y(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static hfk i(int i) {
        hnu.ap(i, "expectedSize");
        return new hfk(i);
    }

    public static hfm j(int i, Object... objArr) {
        if (i == 0) {
            return hjb.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new hjn(obj);
        }
        int d = d(i);
        Object[] objArr2 = new Object[d];
        int i2 = d - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            hnu.s(obj2, i5);
            int hashCode = obj2.hashCode();
            int af = hnu.af(hashCode);
            while (true) {
                int i6 = af & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    af++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new hjn(obj4);
        }
        if (d(i4) < d / 2) {
            return j(i4, objArr);
        }
        if (t(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new hjb(objArr, i3, objArr2, i2, i4);
    }

    public static hfm n(Collection collection) {
        if ((collection instanceof hfm) && !(collection instanceof SortedSet)) {
            hfm hfmVar = (hfm) collection;
            if (!hfmVar.l()) {
                return hfmVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static hfm o(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? j(length, (Object[]) objArr.clone()) : new hjn(objArr[0]) : hjb.a;
    }

    public static hfm p(Object obj, Object obj2) {
        return j(2, obj, obj2);
    }

    public static hfm q(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    public static hfm r(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(4, obj, obj2, obj3, obj4);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @SafeVarargs
    public static hfm s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return j(i, objArr2);
    }

    public static boolean t(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean b() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof hfm) && b() && ((hfm) obj).b() && hashCode() != obj.hashCode()) {
            return false;
        }
        return hnu.m(this, obj);
    }

    @Override // defpackage.heb
    public hel g() {
        hel helVar = this.a;
        if (helVar != null) {
            return helVar;
        }
        hel h = h();
        this.a = h;
        return h;
    }

    public hel h() {
        return hel.h(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return hnu.h(this);
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract hjr iterator();

    @Override // defpackage.heb
    public Object writeReplace() {
        return new hfl(toArray());
    }
}
