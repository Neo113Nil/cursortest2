package g2;

import b2.C0518b;
import j2.AbstractC0720j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o2.C0924c;

/* loaded from: classes.dex */
public final class e implements Iterable, Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final e f6694j = new e("");

    /* renamed from: d, reason: collision with root package name */
    public final C0924c[] f6695d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6696e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6697i;

    public e(C0924c... c0924cArr) {
        this.f6695d = (C0924c[]) Arrays.copyOf(c0924cArr, c0924cArr.length);
        this.f6696e = 0;
        this.f6697i = c0924cArr.length;
        for (C0924c c0924c : c0924cArr) {
            AbstractC0720j.b("Can't construct a path with a null value!", c0924c != null);
        }
    }

    public static e E(e eVar, e eVar2) {
        C0924c C3 = eVar.C();
        C0924c C4 = eVar2.C();
        if (C3 == null) {
            return eVar2;
        }
        if (C3.equals(C4)) {
            return E(eVar.F(), eVar2.F());
        }
        throw new C0518b("INTERNAL ERROR: " + eVar2 + " is not contained in " + eVar);
    }

    public final C0924c B() {
        if (isEmpty()) {
            return null;
        }
        return this.f6695d[this.f6697i - 1];
    }

    public final C0924c C() {
        if (isEmpty()) {
            return null;
        }
        return this.f6695d[this.f6696e];
    }

    public final e D() {
        if (isEmpty()) {
            return null;
        }
        return new e(this.f6695d, this.f6696e, this.f6697i - 1);
    }

    public final e F() {
        boolean isEmpty = isEmpty();
        int i2 = this.f6696e;
        if (!isEmpty) {
            i2++;
        }
        return new e(this.f6695d, i2, this.f6697i);
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList(size());
        d2.l lVar = new d2.l(this);
        while (lVar.hasNext()) {
            arrayList.add(((C0924c) lVar.next()).f8920d);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        e eVar = (e) obj;
        if (size() != eVar.size()) {
            return false;
        }
        int i2 = this.f6696e;
        for (int i4 = eVar.f6696e; i2 < this.f6697i && i4 < eVar.f6697i; i4++) {
            if (!this.f6695d[i2].equals(eVar.f6695d[i4])) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public final e h(e eVar) {
        int size = eVar.size() + size();
        C0924c[] c0924cArr = new C0924c[size];
        System.arraycopy(this.f6695d, this.f6696e, c0924cArr, 0, size());
        System.arraycopy(eVar.f6695d, eVar.f6696e, c0924cArr, size(), eVar.size());
        return new e(c0924cArr, 0, size);
    }

    public final int hashCode() {
        int i2 = 0;
        for (int i4 = this.f6696e; i4 < this.f6697i; i4++) {
            i2 = (i2 * 37) + this.f6695d[i4].f8920d.hashCode();
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.f6696e >= this.f6697i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d2.l(this);
    }

    public final e j(C0924c c0924c) {
        int size = size();
        int i2 = size + 1;
        C0924c[] c0924cArr = new C0924c[i2];
        System.arraycopy(this.f6695d, this.f6696e, c0924cArr, 0, size);
        c0924cArr[size] = c0924c;
        return new e(c0924cArr, 0, i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        int i2;
        int i4;
        int i5 = eVar.f6696e;
        int i6 = this.f6696e;
        while (true) {
            i2 = eVar.f6697i;
            i4 = this.f6697i;
            if (i6 >= i4 || i5 >= i2) {
                break;
            }
            int compareTo = this.f6695d[i6].compareTo(eVar.f6695d[i5]);
            if (compareTo != 0) {
                return compareTo;
            }
            i6++;
            i5++;
        }
        if (i6 == i4 && i5 == i2) {
            return 0;
        }
        return i6 == i4 ? -1 : 1;
    }

    public final int size() {
        return this.f6697i - this.f6696e;
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = this.f6696e; i2 < this.f6697i; i2++) {
            sb.append("/");
            sb.append(this.f6695d[i2].f8920d);
        }
        return sb.toString();
    }

    public final boolean w(e eVar) {
        if (size() > eVar.size()) {
            return false;
        }
        int i2 = this.f6696e;
        int i4 = eVar.f6696e;
        while (i2 < this.f6697i) {
            if (!this.f6695d[i2].equals(eVar.f6695d[i4])) {
                return false;
            }
            i2++;
            i4++;
        }
        return true;
    }

    public e(ArrayList arrayList) {
        this.f6695d = new C0924c[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f6695d[i2] = C0924c.c((String) it.next());
            i2++;
        }
        this.f6696e = 0;
        this.f6697i = arrayList.size();
    }

    public e(String str) {
        String[] split = str.split("/", -1);
        int i2 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i2++;
            }
        }
        this.f6695d = new C0924c[i2];
        int i4 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.f6695d[i4] = C0924c.c(str3);
                i4++;
            }
        }
        this.f6696e = 0;
        this.f6697i = this.f6695d.length;
    }

    public e(C0924c[] c0924cArr, int i2, int i4) {
        this.f6695d = c0924cArr;
        this.f6696e = i2;
        this.f6697i = i4;
    }
}
