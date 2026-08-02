package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ghb implements ggs {
    private final etd a;
    private final Map b;
    private final String c;
    private final fym d;

    public ghb(fym fymVar, etd etdVar, Map map, String str) {
        fymVar.getClass();
        etdVar.getClass();
        map.getClass();
        this.d = fymVar;
        this.a = etdVar;
        this.b = map;
        this.c = str;
    }

    private final hvi c(etm etmVar) {
        return this.d.b(this.c, etmVar);
    }

    private final void d(jjq jjqVar) {
        if (jjqVar != null) {
            etd etdVar = this.a;
            Map map = this.b;
            String str = this.c;
            Set set = (Set) map.get(etb.c(str));
            if (set == null) {
                set = kpm.a;
            }
            etdVar.i.k(jjqVar, set, "", str, false, true);
        }
    }

    @Override // defpackage.ggs
    public final hvi a(String str, jjq jjqVar, etm etmVar) {
        if (!ksp.b(str, "")) {
            throw new IllegalStateException("DEVICE tier packages may only commit with LOGGED_OUT_USER");
        }
        d(jjqVar);
        return c(etmVar);
    }

    @Override // defpackage.ggs
    public final hvi b(jjq jjqVar, etm etmVar) {
        d(jjqVar);
        return c(etmVar);
    }
}
