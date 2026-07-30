package kotlinx.coroutines.selects;

import f6.l;
import f6.p;

/* loaded from: classes5.dex */
public interface b {

    public static final class a {
        public static <R, P, Q> void invoke(b bVar, g gVar, p pVar) {
            bVar.invoke(gVar, null, pVar);
        }

        public static <R> void onTimeout(b bVar, long j8, l lVar) {
            kotlinx.coroutines.selects.a.onTimeout(bVar, j8, lVar);
        }
    }

    void invoke(c cVar, l lVar);

    <Q> void invoke(e eVar, p pVar);

    <P, Q> void invoke(g gVar, p pVar);

    <P, Q> void invoke(g gVar, P p8, p pVar);

    void onTimeout(long j8, l lVar);
}
