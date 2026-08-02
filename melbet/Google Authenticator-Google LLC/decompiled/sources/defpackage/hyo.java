package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyo {
    private final Map c = new HashMap();
    private static final hyk b = new hwr();
    public static final hyo a = b();

    private static hyo b() {
        hyo hyoVar = new hyo();
        try {
            hyoVar.a(b, hyn.class);
            return hyoVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(hyk hykVar, Class cls) {
        Map map = this.c;
        hyk hykVar2 = (hyk) map.get(cls);
        if (hykVar2 != null && !hykVar2.equals(hykVar)) {
            throw new GeneralSecurityException(a.aa(cls, "Different key creator for parameters class ", " already inserted"));
        }
        map.put(cls, hykVar);
    }
}
