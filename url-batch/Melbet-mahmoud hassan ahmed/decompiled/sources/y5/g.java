package y5;

import f6.p;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import y5.e;

/* loaded from: classes.dex */
public interface g {

    public static final class a {

        /* renamed from: y5.g$a$a, reason: collision with other inner class name */
        static final class C0156a extends j implements p<g, b, g> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0156a f23480f = new C0156a();

            C0156a() {
                super(2);
            }

            @Override // f6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g gVar, b bVar) {
                y5.c cVar;
                i.d(gVar, "acc");
                i.d(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f23481f;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f23478e;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new y5.c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new y5.c(bVar, eVar);
                    }
                    cVar = new y5.c(new y5.c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            i.d(gVar2, "context");
            return gVar2 == h.f23481f ? gVar : (g) gVar2.fold(gVar, C0156a.f23480f);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r7, p<? super R, ? super b, ? extends R> pVar) {
                i.d(pVar, "operation");
                return pVar.invoke(r7, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                i.d(cVar, "key");
                if (i.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                i.d(cVar, "key");
                return i.a(bVar.getKey(), cVar) ? h.f23481f : bVar;
            }

            public static g d(b bVar, g gVar) {
                i.d(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // y5.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r7, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
