package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hci extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    hci() {
        p(3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.Y(readInt, "Invalid size: "));
        }
        p(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator k = k();
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final int y(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object al = hnu.al(i2);
        if (i4 != 0) {
            hnu.an(al, i3 & i5, i4 + 1);
        }
        Object i6 = i();
        int[] v = v();
        for (int i7 = 0; i7 <= i; i7++) {
            int aj = hnu.aj(i6, i7);
            while (aj != 0) {
                int i8 = aj - 1;
                int i9 = v[i8];
                int i10 = ((~i) & i9) | i7;
                int i11 = i10 & i5;
                int aj2 = hnu.aj(al, i11);
                hnu.an(al, i11, aj);
                v[i8] = ((~i5) & i10) | (aj2 & i5);
                aj = i9 & i;
            }
        }
        this.g = al;
        z(i5);
        return i5;
    }

    private final void z(int i) {
        this.e = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.e & (-32));
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public int b() {
        hoq.I(u(), "Arrays already allocated");
        int i = this.e;
        int ak = hnu.ak(i);
        this.g = hnu.al(ak);
        z(ak - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    public int c() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (u()) {
            return;
        }
        o();
        Map n = n();
        if (n != null) {
            this.e = hnu.bb(size(), 3);
            n.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(w(), 0, this.f, (Object) null);
        Arrays.fill(x(), 0, this.f, (Object) null);
        hnu.am(i());
        Arrays.fill(v(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map n = n();
        return n != null ? n.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map n = n();
        if (n != null) {
            return n.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (Objects.equals(obj, j(i))) {
                return true;
            }
        }
        return false;
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        hcd hcdVar = new hcd(this);
        this.i = hcdVar;
        return hcdVar;
    }

    public final int f(Object obj) {
        if (u()) {
            return -1;
        }
        int ag = hnu.ag(obj);
        int e = e();
        int aj = hnu.aj(i(), ag & e);
        if (aj != 0) {
            int i = ~e;
            int i2 = ag & i;
            do {
                int i3 = aj - 1;
                int i4 = v()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, g(i3))) {
                    return i3;
                }
                aj = i4 & e;
            } while (aj != 0);
        }
        return -1;
    }

    public final Object g(int i) {
        return w()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map n = n();
        if (n != null) {
            return n.get(obj);
        }
        int f = f(obj);
        if (f == -1) {
            return null;
        }
        return j(f);
    }

    public final Object h(Object obj) {
        int e;
        int ai;
        if (u() || (ai = hnu.ai(obj, null, (e = e()), i(), v(), w(), null)) == -1) {
            return a;
        }
        Object j = j(ai);
        r(ai, e);
        this.f--;
        o();
        return j;
    }

    public final Object i() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(int i) {
        return x()[i];
    }

    final Iterator k() {
        Map n = n();
        return n != null ? n.entrySet().iterator() : new hcb(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        hcf hcfVar = new hcf(this);
        this.h = hcfVar;
        return hcfVar;
    }

    public Map l() {
        Map m = m(e() + 1);
        int c = c();
        while (c >= 0) {
            m.put(g(c), j(c));
            c = d(c);
        }
        this.g = m;
        this.b = null;
        this.c = null;
        this.d = null;
        o();
        return m;
    }

    public Map m(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    final Map n() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void o() {
        this.e += 32;
    }

    public void p(int i) {
        hoq.y(i >= 0, "Expected size must be >= 0");
        this.e = hnu.bb(i, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int length;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (u()) {
            b();
        }
        Map n = n();
        if (n != null) {
            return n.put(obj3, obj4);
        }
        int[] v = v();
        Object[] w = w();
        Object[] x = x();
        int i3 = this.f;
        int i4 = i3 + 1;
        int ag = hnu.ag(obj3);
        int e = e();
        int i5 = ag & e;
        int aj = hnu.aj(i(), i5);
        if (aj != 0) {
            int i6 = ~e;
            int i7 = ag & i6;
            int i8 = 0;
            while (true) {
                int i9 = aj - 1;
                int i10 = v[i9];
                int i11 = i10 & i6;
                i = 1;
                if (i11 == i7 && Objects.equals(obj3, w[i9])) {
                    Object obj5 = x[i9];
                    x[i9] = obj4;
                    return obj5;
                }
                int i12 = i10 & e;
                int i13 = i8 + 1;
                if (i12 != 0) {
                    obj3 = obj;
                    obj4 = obj2;
                    i8 = i13;
                    aj = i12;
                } else {
                    if (i13 >= 9) {
                        return l().put(obj3, obj4);
                    }
                    if (i4 > e) {
                        e = y(e, (e < 32 ? 4 : 2) * (e + 1), ag, i3);
                    } else {
                        v[i9] = (i4 & e) | i11;
                    }
                }
            }
        } else {
            if (i4 > e) {
                i2 = y(e, (e < 32 ? 4 : 2) * (e + 1), ag, i3);
                i = 1;
                length = v().length;
                if (i4 > length) {
                    int i14 = i;
                    int min = Math.min(1073741823, (Math.max(i14, length >>> 1) + length) | i14);
                    if (min != length) {
                        s(min);
                    }
                }
                q(i3, obj3, obj4, ag, i2);
                this.f = i4;
                o();
                return null;
            }
            hnu.an(i(), i5, i4);
            i = 1;
        }
        i2 = e;
        length = v().length;
        if (i4 > length) {
        }
        q(i3, obj3, obj4, ag, i2);
        this.f = i4;
        o();
        return null;
    }

    public void q(int i, Object obj, Object obj2, int i2, int i3) {
        v()[i] = i2 & (~i3);
        w()[i] = obj;
        t(i, obj2);
    }

    public void r(int i, int i2) {
        Object i3 = i();
        int[] v = v();
        Object[] w = w();
        Object[] x = x();
        int size = size();
        int i4 = size - 1;
        if (i >= i4) {
            w[i] = null;
            x[i] = null;
            v[i] = 0;
            return;
        }
        int i5 = i + 1;
        Object obj = w[i4];
        w[i] = obj;
        x[i] = x[i4];
        w[i4] = null;
        x[i4] = null;
        v[i] = v[i4];
        v[i4] = 0;
        int ag = hnu.ag(obj) & i2;
        int aj = hnu.aj(i3, ag);
        if (aj == size) {
            hnu.an(i3, ag, i5);
            return;
        }
        while (true) {
            int i6 = aj - 1;
            int i7 = v[i6];
            int i8 = i7 & i2;
            if (i8 == size) {
                v[i6] = ((~i2) & i7) | (i5 & i2);
                return;
            }
            aj = i8;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map n = n();
        if (n != null) {
            return n.remove(obj);
        }
        Object h = h(obj);
        if (h == a) {
            return null;
        }
        return h;
    }

    public void s(int i) {
        this.b = Arrays.copyOf(v(), i);
        this.c = Arrays.copyOf(w(), i);
        this.d = Arrays.copyOf(x(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map n = n();
        return n != null ? n.size() : this.f;
    }

    public final void t(int i, Object obj) {
        x()[i] = obj;
    }

    final boolean u() {
        return this.g == null;
    }

    public final int[] v() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        hch hchVar = new hch(this);
        this.j = hchVar;
        return hchVar;
    }

    public final Object[] w() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] x() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    public hci(int i) {
        p(i);
    }
}
