package I4;

import java.time.Instant;

/* loaded from: classes.dex */
public interface e {
    e a(String str);

    void b();

    default e c(C4.f fVar) {
        if (fVar != null && !fVar.isEmpty()) {
            fVar.forEach(new C4.c(3, this));
        }
        return this;
    }

    e d(i iVar);

    e e(Instant instant);

    e f(H4.e eVar, Object obj);
}
