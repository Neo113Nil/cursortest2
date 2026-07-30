package t5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class f implements s {

    /* renamed from: i, reason: collision with root package name */
    public static final g8.h f8893i = new g8.h(1);

    /* renamed from: f, reason: collision with root package name */
    public final i5.c f8894f;

    /* renamed from: g, reason: collision with root package name */
    public final s f8895g;

    /* renamed from: h, reason: collision with root package name */
    public String f8896h;

    public f() {
        this.f8896h = null;
        this.f8894f = new i5.b(f8893i);
        this.f8895g = k.f8908j;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(s sVar) {
        if (isEmpty()) {
            return sVar.isEmpty() ? 0 : -1;
        }
        if (sVar.i() || sVar.isEmpty()) {
            return 1;
        }
        return sVar == s.f8921e ? -1 : 0;
    }

    @Override // t5.s
    public s b(l5.f fVar) {
        c z8 = fVar.z();
        return z8 == null ? this : d(z8).b(fVar.C());
    }

    @Override // t5.s
    public s c() {
        return this.f8895g;
    }

    @Override // t5.s
    public s d(c cVar) {
        if (cVar.equals(c.f8888i)) {
            s sVar = this.f8895g;
            if (!sVar.isEmpty()) {
                return sVar;
            }
        }
        i5.c cVar2 = this.f8894f;
        return cVar2.a(cVar) ? (s) cVar2.g(cVar) : k.f8908j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        i5.c cVar = fVar.f8894f;
        if (!c().equals(fVar.c())) {
            return false;
        }
        i5.c cVar2 = this.f8894f;
        if (cVar2.size() != cVar.size()) {
            return false;
        }
        Iterator it = cVar2.iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((c) entry.getKey()).equals(entry2.getKey()) || !((s) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // t5.s
    public String f(int i7) {
        boolean z8;
        if (i7 != 1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        s sVar = this.f8895g;
        if (!sVar.isEmpty()) {
            sb.append("priority:");
            sb.append(sVar.f(1));
            sb.append(":");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        int i8 = 0;
        loop0: while (true) {
            z8 = false;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                arrayList.add(qVar);
                if (z8 || !qVar.f8920b.c().isEmpty()) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            Collections.sort(arrayList, t.f8922a);
        }
        int size = arrayList.size();
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            q qVar2 = (q) obj;
            String v5 = qVar2.f8920b.v();
            if (!v5.equals("")) {
                sb.append(":");
                sb.append(qVar2.f8919a.f8889f);
                sb.append(":");
                sb.append(v5);
            }
        }
        return sb.toString();
    }

    public final void g(e eVar, boolean z8) {
        i5.c cVar = this.f8894f;
        if (!z8 || c().isEmpty()) {
            cVar.z(eVar);
        } else {
            cVar.z(new d(this, eVar));
        }
    }

    @Override // t5.s
    public Object getValue() {
        return r(false);
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            q qVar = (q) it.next();
            i7 = r6.i.a(i7 * 31, 17, qVar.f8919a.f8889f) + qVar.f8920b.hashCode();
        }
        return i7;
    }

    @Override // t5.s
    public boolean i() {
        return false;
    }

    @Override // t5.s
    public boolean isEmpty() {
        return this.f8894f.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new i5.e(this.f8894f.iterator(), 1);
    }

    @Override // t5.s
    public int j() {
        return this.f8894f.size();
    }

    @Override // t5.s
    public c k(c cVar) {
        return (c) this.f8894f.y(cVar);
    }

    public final void m(int i7, StringBuilder sb) {
        int i8;
        i5.c cVar = this.f8894f;
        boolean isEmpty = cVar.isEmpty();
        s sVar = this.f8895g;
        if (isEmpty && sVar.isEmpty()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        Iterator it = cVar.iterator();
        while (true) {
            i8 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i9 = i7 + 2;
            while (i8 < i9) {
                sb.append(" ");
                i8++;
            }
            sb.append(((c) entry.getKey()).f8889f);
            sb.append("=");
            if (entry.getValue() instanceof f) {
                ((f) entry.getValue()).m(i9, sb);
            } else {
                sb.append(((s) entry.getValue()).toString());
            }
            sb.append("\n");
        }
        if (!sVar.isEmpty()) {
            int i10 = i7 + 2;
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append(" ");
            }
            sb.append(".priority=");
            sb.append(sVar.toString());
            sb.append("\n");
        }
        while (i8 < i7) {
            sb.append(" ");
            i8++;
        }
        sb.append("}");
    }

    @Override // t5.s
    public s n(s sVar) {
        i5.c cVar = this.f8894f;
        return cVar.isEmpty() ? k.f8908j : new f(cVar, sVar);
    }

    @Override // t5.s
    public s o(c cVar, s sVar) {
        if (cVar.equals(c.f8888i)) {
            return n(sVar);
        }
        i5.c cVar2 = this.f8894f;
        if (cVar2.a(cVar)) {
            cVar2 = cVar2.B(cVar);
        }
        if (!sVar.isEmpty()) {
            cVar2 = cVar2.A(sVar, cVar);
        }
        return cVar2.isEmpty() ? k.f8908j : new f(cVar2, this.f8895g);
    }

    @Override // t5.s
    public Object r(boolean z8) {
        Integer g9;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        boolean z9 = true;
        int i7 = 0;
        int i8 = 0;
        for (Map.Entry entry : this.f8894f) {
            String str = ((c) entry.getKey()).f8889f;
            hashMap.put(str, ((s) entry.getValue()).r(z8));
            i7++;
            if (z9) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (g9 = o5.j.g(str)) == null || g9.intValue() < 0) {
                    z9 = false;
                } else if (g9.intValue() > i8) {
                    i8 = g9.intValue();
                }
            }
        }
        if (z8 || !z9 || i8 >= i7 * 2) {
            if (z8) {
                s sVar = this.f8895g;
                if (!sVar.isEmpty()) {
                    hashMap.put(".priority", sVar.getValue());
                }
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i8 + 1);
        for (int i9 = 0; i9 <= i8; i9++) {
            arrayList.add(hashMap.get("" + i9));
        }
        return arrayList;
    }

    @Override // t5.s
    public boolean s(c cVar) {
        return !d(cVar).isEmpty();
    }

    @Override // t5.s
    public Iterator t() {
        return new i5.e(this.f8894f.t(), 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m(0, sb);
        return sb.toString();
    }

    @Override // t5.s
    public s u(l5.f fVar, s sVar) {
        c z8 = fVar.z();
        if (z8 == null) {
            return sVar;
        }
        if (!z8.equals(c.f8888i)) {
            return o(z8, d(z8).u(fVar.C(), sVar));
        }
        o5.j.c(j1.c.h0(sVar));
        return n(sVar);
    }

    @Override // t5.s
    public String v() {
        if (this.f8896h == null) {
            String f9 = f(1);
            this.f8896h = f9.isEmpty() ? "" : o5.j.e(f9);
        }
        return this.f8896h;
    }

    public f(i5.c cVar, s sVar) {
        this.f8896h = null;
        if (cVar.isEmpty() && !sVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f8895g = sVar;
        this.f8894f = cVar;
    }
}
