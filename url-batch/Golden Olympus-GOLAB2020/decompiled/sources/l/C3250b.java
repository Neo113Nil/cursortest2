package l;

import com.ironsource.b9;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3250b implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    c f41287b;

    /* renamed from: c, reason: collision with root package name */
    private c f41288c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f41289d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private int f41290e = 0;

    /* renamed from: l.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.C3250b.e
        c b(c cVar) {
            return cVar.f41294e;
        }

        @Override // l.C3250b.e
        c c(c cVar) {
            return cVar.f41293d;
        }
    }

    /* renamed from: l.b$b, reason: collision with other inner class name */
    private static class C0234b extends e {
        C0234b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.C3250b.e
        c b(c cVar) {
            return cVar.f41293d;
        }

        @Override // l.C3250b.e
        c c(c cVar) {
            return cVar.f41294e;
        }
    }

    /* renamed from: l.b$c */
    static class c implements Map.Entry {

        /* renamed from: b, reason: collision with root package name */
        final Object f41291b;

        /* renamed from: c, reason: collision with root package name */
        final Object f41292c;

        /* renamed from: d, reason: collision with root package name */
        c f41293d;

        /* renamed from: e, reason: collision with root package name */
        c f41294e;

        c(Object obj, Object obj2) {
            this.f41291b = obj;
            this.f41292c = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f41291b.equals(cVar.f41291b) && this.f41292c.equals(cVar.f41292c);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f41291b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f41292c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f41291b.hashCode() ^ this.f41292c.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f41291b + "=" + this.f41292c;
        }
    }

    /* renamed from: l.b$d */
    public class d extends f implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        private c f41295b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f41296c = true;

        d() {
        }

        @Override // l.C3250b.f
        void a(c cVar) {
            c cVar2 = this.f41295b;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f41294e;
                this.f41295b = cVar3;
                this.f41296c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f41296c) {
                this.f41296c = false;
                this.f41295b = C3250b.this.f41287b;
            } else {
                c cVar = this.f41295b;
                this.f41295b = cVar != null ? cVar.f41293d : null;
            }
            return this.f41295b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f41296c) {
                return C3250b.this.f41287b != null;
            }
            c cVar = this.f41295b;
            return (cVar == null || cVar.f41293d == null) ? false : true;
        }
    }

    /* renamed from: l.b$e */
    private static abstract class e extends f implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        c f41298b;

        /* renamed from: c, reason: collision with root package name */
        c f41299c;

        e(c cVar, c cVar2) {
            this.f41298b = cVar2;
            this.f41299c = cVar;
        }

        private c e() {
            c cVar = this.f41299c;
            c cVar2 = this.f41298b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // l.C3250b.f
        public void a(c cVar) {
            if (this.f41298b == cVar && cVar == this.f41299c) {
                this.f41299c = null;
                this.f41298b = null;
            }
            c cVar2 = this.f41298b;
            if (cVar2 == cVar) {
                this.f41298b = b(cVar2);
            }
            if (this.f41299c == cVar) {
                this.f41299c = e();
            }
        }

        abstract c b(c cVar);

        abstract c c(c cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f41299c;
            this.f41299c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41299c != null;
        }
    }

    /* renamed from: l.b$f */
    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry b() {
        return this.f41287b;
    }

    protected c d(Object obj) {
        c cVar = this.f41287b;
        while (cVar != null && !cVar.f41291b.equals(obj)) {
            cVar = cVar.f41293d;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        C0234b c0234b = new C0234b(this.f41288c, this.f41287b);
        this.f41289d.put(c0234b, Boolean.FALSE);
        return c0234b;
    }

    public d e() {
        d dVar = new d();
        this.f41289d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3250b)) {
            return false;
        }
        C3250b c3250b = (C3250b) obj;
        if (size() != c3250b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c3250b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry f() {
        return this.f41288c;
    }

    c g(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f41290e++;
        c cVar2 = this.f41288c;
        if (cVar2 == null) {
            this.f41287b = cVar;
            this.f41288c = cVar;
            return cVar;
        }
        cVar2.f41293d = cVar;
        cVar.f41294e = cVar2;
        this.f41288c = cVar;
        return cVar;
    }

    public Object h(Object obj, Object obj2) {
        c d4 = d(obj);
        if (d4 != null) {
            return d4.f41292c;
        }
        g(obj, obj2);
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Map.Entry) it.next()).hashCode();
        }
        return i4;
    }

    public Object i(Object obj) {
        c d4 = d(obj);
        if (d4 == null) {
            return null;
        }
        this.f41290e--;
        if (!this.f41289d.isEmpty()) {
            Iterator it = this.f41289d.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(d4);
            }
        }
        c cVar = d4.f41294e;
        if (cVar != null) {
            cVar.f41293d = d4.f41293d;
        } else {
            this.f41287b = d4.f41293d;
        }
        c cVar2 = d4.f41293d;
        if (cVar2 != null) {
            cVar2.f41294e = cVar;
        } else {
            this.f41288c = cVar;
        }
        d4.f41293d = null;
        d4.f41294e = null;
        return d4.f41292c;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f41287b, this.f41288c);
        this.f41289d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f41290e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b9.i.f15550d);
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(b9.i.f15552e);
        return sb.toString();
    }
}
