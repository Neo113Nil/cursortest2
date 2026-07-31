package b4;

import java.time.Instant;

/* loaded from: classes.dex */
public interface e {
    e a(String str);

    void b();

    e c(Instant instant);

    e d(a4.e eVar, Object obj);

    e e(i iVar);

    default e f(V3.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new I4.a(4, this));
        }
        return this;
    }
}
