package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyr {
    public static final hyr a = new hyr();
    private final Map b = new HashMap();

    public final synchronized void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (hnu) entry.getValue());
        }
    }

    public final synchronized void b(String str, hnu hnuVar) {
        Map map = this.b;
        if (!map.containsKey(str)) {
            map.put(str, hnuVar);
            return;
        }
        if (((hnu) map.get(str)).equals(hnuVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(map.get(str)) + "), cannot insert " + String.valueOf(hnuVar));
    }
}
