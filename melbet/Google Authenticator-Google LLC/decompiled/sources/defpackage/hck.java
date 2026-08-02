package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hck extends AbstractSet implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    hck() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object al = hnu.al(i2);
        if (i4 != 0) {
            hnu.an(al, i3 & i5, i4 + 1);
        }
        Object j = j();
        int[] l = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int aj = hnu.aj(j, i6);
            while (aj != 0) {
                int i7 = aj - 1;
                int i8 = l[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int aj2 = hnu.aj(al, i10);
                hnu.an(al, i10, aj);
                l[i7] = ((~i5) & i9) | (aj2 & i5);
                aj = i8 & i;
            }
        }
        this.c = al;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.b & (-32));
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.Y(readInt, "Invalid size: "));
        }
        f(readInt);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int min;
        if (g()) {
            hoq.I(g(), "Arrays already allocated");
            int i = this.b;
            int ak = hnu.ak(i);
            this.c = hnu.al(ak);
            k(ak - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set d = d();
        if (d != null) {
            return d.add(obj);
        }
        int[] l = l();
        Object[] m = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int ag = hnu.ag(obj);
        int h = h();
        int i4 = ag & h;
        int aj = hnu.aj(j(), i4);
        if (aj != 0) {
            int i5 = ~h;
            int i6 = ag & i5;
            boolean z = false;
            int i7 = 0;
            while (true) {
                int i8 = aj - 1;
                int i9 = l[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && Objects.equals(obj, m[i8])) {
                    return z;
                }
                int i11 = i9 & h;
                int i12 = i7 + 1;
                if (i11 != 0) {
                    aj = i11;
                    i7 = i12;
                    z = false;
                } else {
                    if (i12 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                        int a = a();
                        while (a >= 0) {
                            linkedHashSet.add(c(a));
                            a = b(a);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        e();
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > h) {
                        h = i(h, (h < 32 ? 4 : 2) * (h + 1), ag, i2);
                    } else {
                        l[i8] = (i3 & h) | i10;
                    }
                }
            }
        } else if (i3 > h) {
            h = i(h, (h < 32 ? 4 : 2) * (h + 1), ag, i2);
        } else {
            hnu.an(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), min);
            this.a = Arrays.copyOf(m(), min);
        }
        l()[i2] = (~h) & ag;
        m()[i2] = obj;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set d = d();
        if (d != null) {
            this.b = hnu.bb(size(), 3);
            d.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        hnu.am(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set d = d();
        if (d != null) {
            return d.contains(obj);
        }
        int ag = hnu.ag(obj);
        int h = h();
        int aj = hnu.aj(j(), ag & h);
        if (aj != 0) {
            int i = ~h;
            int i2 = ag & i;
            do {
                int i3 = aj - 1;
                int i4 = l()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, c(i3))) {
                    return true;
                }
                aj = i4 & h;
            } while (aj != 0);
        }
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        this.b = hnu.bb(i, 1);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set d = d();
        return d != null ? d.iterator() : new hcj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!g()) {
            Set d = d();
            if (d != null) {
                return d.remove(obj);
            }
            int h = h();
            int ai = hnu.ai(obj, null, h, j(), l(), m(), null);
            if (ai != -1) {
                Object j = j();
                int[] l = l();
                Object[] m = m();
                int size = size();
                int i3 = size - 1;
                if (ai < i3) {
                    int i4 = ai + 1;
                    Object obj2 = m[i3];
                    m[ai] = obj2;
                    m[i3] = null;
                    l[ai] = l[i3];
                    l[i3] = 0;
                    int ag = hnu.ag(obj2) & h;
                    int aj = hnu.aj(j, ag);
                    if (aj == size) {
                        hnu.an(j, ag, i4);
                    } else {
                        while (true) {
                            i = aj - 1;
                            i2 = l[i];
                            int i5 = i2 & h;
                            if (i5 == size) {
                                break;
                            }
                            aj = i5;
                        }
                        l[i] = (i2 & (~h)) | (i4 & h);
                    }
                } else {
                    m[ai] = null;
                    l[ai] = 0;
                }
                this.e--;
                e();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set d = d();
        return d != null ? d.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set d = d();
        if (d != null) {
            return d.toArray(objArr);
        }
        Object[] m = m();
        int i = this.e;
        hoq.G(0, i, m.length);
        int length = objArr.length;
        if (length < i) {
            objArr = hnu.q(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(m, 0, objArr, 0, i);
        return objArr;
    }

    public hck(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set d = d();
        return d != null ? d.toArray() : Arrays.copyOf(m(), this.e);
    }
}
