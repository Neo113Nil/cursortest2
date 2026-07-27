package o2;

import d2.AbstractC0546c;
import d2.C0545b;
import d2.C0548e;
import j2.AbstractC0720j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r0.B;

/* loaded from: classes.dex */
public class f implements s {

    /* renamed from: j, reason: collision with root package name */
    public static final A3.i f8924j = new A3.i(1);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0546c f8925d;

    /* renamed from: e, reason: collision with root package name */
    public final s f8926e;

    /* renamed from: i, reason: collision with root package name */
    public String f8927i;

    public f() {
        this.f8927i = null;
        this.f8925d = new C0545b(f8924j);
        this.f8926e = k.f8939k;
    }

    @Override // o2.s
    public String A() {
        if (this.f8927i == null) {
            String u4 = u(1);
            this.f8927i = u4.isEmpty() ? "" : AbstractC0720j.e(u4);
        }
        return this.f8927i;
    }

    @Override // o2.s
    public s b(C0924c c0924c) {
        if (c0924c.equals(C0924c.f8919j)) {
            s sVar = this.f8926e;
            if (!sVar.isEmpty()) {
                return sVar;
            }
        }
        AbstractC0546c abstractC0546c = this.f8925d;
        return abstractC0546c.e(c0924c) ? (s) abstractC0546c.h(c0924c) : k.f8939k;
    }

    @Override // o2.s
    public s d(g2.e eVar, s sVar) {
        C0924c C3 = eVar.C();
        if (C3 == null) {
            return sVar;
        }
        if (!C3.equals(C0924c.f8919j)) {
            return m(C3, b(C3).d(eVar.F(), sVar));
        }
        AbstractC0720j.c(m3.s.n(sVar));
        return f(sVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(s sVar) {
        if (isEmpty()) {
            return sVar.isEmpty() ? 0 : -1;
        }
        if (sVar.y() || sVar.isEmpty()) {
            return 1;
        }
        return sVar == s.f8952g ? -1 : 0;
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
        if (!k().equals(fVar.k())) {
            return false;
        }
        AbstractC0546c abstractC0546c = this.f8925d;
        int size = abstractC0546c.size();
        AbstractC0546c abstractC0546c2 = fVar.f8925d;
        if (size != abstractC0546c2.size()) {
            return false;
        }
        Iterator it = abstractC0546c.iterator();
        Iterator it2 = abstractC0546c2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((C0924c) entry.getKey()).equals(entry2.getKey()) || !((s) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // o2.s
    public s f(s sVar) {
        AbstractC0546c abstractC0546c = this.f8925d;
        return abstractC0546c.isEmpty() ? k.f8939k : new f(abstractC0546c, sVar);
    }

    @Override // o2.s
    public C0924c g(C0924c c0924c) {
        return (C0924c) this.f8925d.B(c0924c);
    }

    @Override // o2.s
    public Object getValue() {
        return t(false);
    }

    public final void h(e eVar, boolean z4) {
        AbstractC0546c abstractC0546c = this.f8925d;
        if (!z4 || k().isEmpty()) {
            abstractC0546c.C(eVar);
        } else {
            abstractC0546c.C(new d(this, eVar));
        }
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            q qVar = (q) it.next();
            i2 = B.a(qVar.f8950a.f8920d, i2 * 31, 17) + qVar.f8951b.hashCode();
        }
        return i2;
    }

    @Override // o2.s
    public boolean i(C0924c c0924c) {
        return !b(c0924c).isEmpty();
    }

    @Override // o2.s
    public boolean isEmpty() {
        return this.f8925d.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0548e(this.f8925d.iterator(), 1);
    }

    public final void j(int i2, StringBuilder sb) {
        int i4;
        AbstractC0546c abstractC0546c = this.f8925d;
        boolean isEmpty = abstractC0546c.isEmpty();
        s sVar = this.f8926e;
        if (isEmpty && sVar.isEmpty()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        Iterator it = abstractC0546c.iterator();
        while (true) {
            i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i5 = i2 + 2;
            while (i4 < i5) {
                sb.append(" ");
                i4++;
            }
            sb.append(((C0924c) entry.getKey()).f8920d);
            sb.append("=");
            if (entry.getValue() instanceof f) {
                ((f) entry.getValue()).j(i5, sb);
            } else {
                sb.append(((s) entry.getValue()).toString());
            }
            sb.append("\n");
        }
        if (!sVar.isEmpty()) {
            int i6 = i2 + 2;
            for (int i7 = 0; i7 < i6; i7++) {
                sb.append(" ");
            }
            sb.append(".priority=");
            sb.append(sVar.toString());
            sb.append("\n");
        }
        while (i4 < i2) {
            sb.append(" ");
            i4++;
        }
        sb.append("}");
    }

    @Override // o2.s
    public s k() {
        return this.f8926e;
    }

    @Override // o2.s
    public s m(C0924c c0924c, s sVar) {
        if (c0924c.equals(C0924c.f8919j)) {
            return f(sVar);
        }
        AbstractC0546c abstractC0546c = this.f8925d;
        if (abstractC0546c.e(c0924c)) {
            abstractC0546c = abstractC0546c.E(c0924c);
        }
        if (!sVar.isEmpty()) {
            abstractC0546c = abstractC0546c.D(sVar, c0924c);
        }
        return abstractC0546c.isEmpty() ? k.f8939k : new f(abstractC0546c, this.f8926e);
    }

    @Override // o2.s
    public s p(g2.e eVar) {
        C0924c C3 = eVar.C();
        return C3 == null ? this : b(C3).p(eVar.F());
    }

    @Override // o2.s
    public Object t(boolean z4) {
        Integer g4;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        boolean z5 = true;
        int i2 = 0;
        int i4 = 0;
        for (Map.Entry entry : this.f8925d) {
            String str = ((C0924c) entry.getKey()).f8920d;
            hashMap.put(str, ((s) entry.getValue()).t(z4));
            i2++;
            if (z5) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (g4 = AbstractC0720j.g(str)) == null || g4.intValue() < 0) {
                    z5 = false;
                } else if (g4.intValue() > i4) {
                    i4 = g4.intValue();
                }
            }
        }
        if (z4 || !z5 || i4 >= i2 * 2) {
            if (z4) {
                s sVar = this.f8926e;
                if (!sVar.isEmpty()) {
                    hashMap.put(".priority", sVar.getValue());
                }
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i4 + 1);
        for (int i5 = 0; i5 <= i4; i5++) {
            arrayList.add(hashMap.get("" + i5));
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        j(0, sb);
        return sb.toString();
    }

    @Override // o2.s
    public String u(int i2) {
        boolean z4;
        if (i2 != 1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        s sVar = this.f8926e;
        if (!sVar.isEmpty()) {
            sb.append("priority:");
            sb.append(sVar.u(1));
            sb.append(":");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        loop0: while (true) {
            z4 = false;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                arrayList.add(qVar);
                if (z4 || !qVar.f8951b.k().isEmpty()) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            Collections.sort(arrayList, t.f8953a);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            q qVar2 = (q) it2.next();
            String A4 = qVar2.f8951b.A();
            if (!A4.equals("")) {
                sb.append(":");
                sb.append(qVar2.f8950a.f8920d);
                sb.append(":");
                sb.append(A4);
            }
        }
        return sb.toString();
    }

    @Override // o2.s
    public Iterator x() {
        return new C0548e(this.f8925d.x(), 1);
    }

    @Override // o2.s
    public boolean y() {
        return false;
    }

    @Override // o2.s
    public int z() {
        return this.f8925d.size();
    }

    public f(AbstractC0546c abstractC0546c, s sVar) {
        this.f8927i = null;
        if (abstractC0546c.isEmpty() && !sVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f8926e = sVar;
        this.f8925d = abstractC0546c;
    }
}
