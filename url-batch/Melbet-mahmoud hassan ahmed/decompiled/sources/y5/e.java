package y5;

import kotlin.jvm.internal.i;
import y5.g;

/* loaded from: classes.dex */
public interface e extends g.b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f23478e = b.f23479f;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            i.d(cVar, "key");
            if (!(cVar instanceof y5.b)) {
                if (e.f23478e == cVar) {
                    return eVar;
                }
                return null;
            }
            y5.b bVar = (y5.b) cVar;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            E e7 = (E) bVar.b(eVar);
            if (e7 instanceof g.b) {
                return e7;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> cVar) {
            i.d(cVar, "key");
            if (!(cVar instanceof y5.b)) {
                return e.f23478e == cVar ? h.f23481f : eVar;
            }
            y5.b bVar = (y5.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f23481f;
        }
    }

    public static final class b implements g.c<e> {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ b f23479f = new b();

        private b() {
        }
    }

    <T> d<T> C(d<? super T> dVar);

    void y(d<?> dVar);
}
