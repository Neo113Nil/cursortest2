package W2;

import java.time.Instant;

/* loaded from: classes.dex */
public interface e {
    default e a(Q2.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new D3.a(4, this));
        }
        return this;
    }

    e b(String str);

    void c();

    e d(Instant instant);

    e e(i iVar);

    e f(V2.e eVar, Object obj);
}
