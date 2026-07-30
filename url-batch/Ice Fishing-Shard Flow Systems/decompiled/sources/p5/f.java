package p5;

import D6.z;
import S1.r;
import java.util.Set;
import l2.C0660a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements S1.e {
    @Override // S1.e
    public Object c(z zVar) {
        Set b7 = zVar.b(r.a(C0660a.class));
        l2.c cVar = l2.c.f6268e;
        if (cVar == null) {
            synchronized (l2.c.class) {
                try {
                    cVar = l2.c.f6268e;
                    if (cVar == null) {
                        cVar = new l2.c(0);
                        l2.c.f6268e = cVar;
                    }
                } finally {
                }
            }
        }
        return new l2.b(b7, cVar);
    }
}
