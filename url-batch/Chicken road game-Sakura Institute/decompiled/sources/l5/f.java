package l5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements Iterable, Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final f f6023i = new f("");

    /* renamed from: f, reason: collision with root package name */
    public final t5.c[] f6024f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6025g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6026h;

    public f(t5.c... cVarArr) {
        this.f6024f = (t5.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        this.f6025g = 0;
        this.f6026h = cVarArr.length;
        for (t5.c cVar : cVarArr) {
            o5.j.b("Can't construct a path with a null value!", cVar != null);
        }
    }

    public static f B(f fVar, f fVar2) {
        t5.c z8 = fVar.z();
        t5.c z9 = fVar2.z();
        if (z8 == null) {
            return fVar2;
        }
        if (z8.equals(z9)) {
            return B(fVar.C(), fVar2.C());
        }
        throw new g5.b("INTERNAL ERROR: " + fVar2 + " is not contained in " + fVar);
    }

    public final f A() {
        if (isEmpty()) {
            return null;
        }
        return new f(this.f6024f, this.f6025g, this.f6026h - 1);
    }

    public final f C() {
        boolean isEmpty = isEmpty();
        int i7 = this.f6025g;
        if (!isEmpty) {
            i7++;
        }
        return new f(this.f6024f, i7, this.f6026h);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(size());
        i5.l lVar = new i5.l(this);
        while (lVar.hasNext()) {
            arrayList.add(((t5.c) lVar.next()).f8889f);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        f fVar = (f) obj;
        if (size() != fVar.size()) {
            return false;
        }
        int i7 = this.f6025g;
        for (int i8 = fVar.f6025g; i7 < this.f6026h && i8 < fVar.f6026h; i8++) {
            if (!this.f6024f[i7].equals(fVar.f6024f[i8])) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public final f g(f fVar) {
        int size = fVar.size() + size();
        t5.c[] cVarArr = new t5.c[size];
        System.arraycopy(this.f6024f, this.f6025g, cVarArr, 0, size());
        System.arraycopy(fVar.f6024f, fVar.f6025g, cVarArr, size(), fVar.size());
        return new f(cVarArr, 0, size);
    }

    public final int hashCode() {
        int i7 = 0;
        for (int i8 = this.f6025g; i8 < this.f6026h; i8++) {
            i7 = (i7 * 37) + this.f6024f[i8].f8889f.hashCode();
        }
        return i7;
    }

    public final boolean isEmpty() {
        return this.f6025g >= this.f6026h;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i5.l(this);
    }

    public final f m(t5.c cVar) {
        int size = size();
        int i7 = size + 1;
        t5.c[] cVarArr = new t5.c[i7];
        System.arraycopy(this.f6024f, this.f6025g, cVarArr, 0, size);
        cVarArr[size] = cVar;
        return new f(cVarArr, 0, i7);
    }

    public final int size() {
        return this.f6026h - this.f6025g;
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = this.f6025g; i7 < this.f6026h; i7++) {
            sb.append("/");
            sb.append(this.f6024f[i7].f8889f);
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        int i7;
        int i8 = fVar.f6025g;
        int i9 = fVar.f6026h;
        int i10 = this.f6025g;
        while (true) {
            i7 = this.f6026h;
            if (i10 >= i7 || i8 >= i9) {
                break;
            }
            int compareTo = this.f6024f[i10].compareTo(fVar.f6024f[i8]);
            if (compareTo != 0) {
                return compareTo;
            }
            i10++;
            i8++;
        }
        if (i10 == i7 && i8 == i9) {
            return 0;
        }
        return i10 == i7 ? -1 : 1;
    }

    public final boolean x(f fVar) {
        if (size() > fVar.size()) {
            return false;
        }
        int i7 = fVar.f6025g;
        int i8 = this.f6025g;
        while (i8 < this.f6026h) {
            if (!this.f6024f[i8].equals(fVar.f6024f[i7])) {
                return false;
            }
            i8++;
            i7++;
        }
        return true;
    }

    public final t5.c y() {
        if (isEmpty()) {
            return null;
        }
        return this.f6024f[this.f6026h - 1];
    }

    public final t5.c z() {
        if (isEmpty()) {
            return null;
        }
        return this.f6024f[this.f6025g];
    }

    public f(List list) {
        this.f6024f = new t5.c[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f6024f[i7] = t5.c.e((String) it.next());
            i7++;
        }
        this.f6025g = 0;
        this.f6026h = list.size();
    }

    public f(String str) {
        String[] split = str.split("/", -1);
        int i7 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i7++;
            }
        }
        this.f6024f = new t5.c[i7];
        int i8 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.f6024f[i8] = t5.c.e(str3);
                i8++;
            }
        }
        this.f6025g = 0;
        this.f6026h = this.f6024f.length;
    }

    public f(t5.c[] cVarArr, int i7, int i8) {
        this.f6024f = cVarArr;
        this.f6025g = i7;
        this.f6026h = i8;
    }
}
