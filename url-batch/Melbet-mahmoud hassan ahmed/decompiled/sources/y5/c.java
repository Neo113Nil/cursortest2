package y5;

import f6.p;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import y5.g;

/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private final g f23475f;

    /* renamed from: g, reason: collision with root package name */
    private final g.b f23476g;

    static final class a extends j implements p<String, g.b, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f23477f = new a();

        a() {
            super(2);
        }

        @Override // f6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, g.b bVar) {
            i.d(str, "acc");
            i.d(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        i.d(gVar, "left");
        i.d(bVar, "element");
        this.f23475f = gVar;
        this.f23476g = bVar;
    }

    private final boolean a(g.b bVar) {
        return i.a(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (a(cVar.f23476g)) {
            g gVar = cVar.f23475f;
            if (!(gVar instanceof c)) {
                return a((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int d() {
        int i7 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f23475f;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i7;
            }
            i7++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.d() != d() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // y5.g
    public <R> R fold(R r7, p<? super R, ? super g.b, ? extends R> pVar) {
        i.d(pVar, "operation");
        return pVar.invoke((Object) this.f23475f.fold(r7, pVar), this.f23476g);
    }

    @Override // y5.g
    public <E extends g.b> E get(g.c<E> cVar) {
        i.d(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e7 = (E) cVar2.f23476g.get(cVar);
            if (e7 != null) {
                return e7;
            }
            g gVar = cVar2.f23475f;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f23475f.hashCode() + this.f23476g.hashCode();
    }

    @Override // y5.g
    public g minusKey(g.c<?> cVar) {
        i.d(cVar, "key");
        if (this.f23476g.get(cVar) != null) {
            return this.f23475f;
        }
        g minusKey = this.f23475f.minusKey(cVar);
        return minusKey == this.f23475f ? this : minusKey == h.f23481f ? this.f23476g : new c(minusKey, this.f23476g);
    }

    @Override // y5.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f23477f)) + ']';
    }
}
