package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyl {
    private final ConcurrentMap c = new ConcurrentHashMap();
    private final ConcurrentMap d = new ConcurrentHashMap();
    private static final Logger b = Logger.getLogger(hyl.class.getName());
    public static final hyl a = new hyl();

    private final synchronized void c(bry bryVar) {
        ConcurrentMap concurrentMap = this.d;
        Object obj = bryVar.a;
        if (concurrentMap.containsKey(obj) && !((Boolean) concurrentMap.get(obj)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat((String) obj));
        }
        ConcurrentMap concurrentMap2 = this.c;
        bry bryVar2 = (bry) concurrentMap2.get(obj);
        if (bryVar2 != null && !bryVar2.getClass().equals(bryVar.getClass())) {
            b.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat((String) obj));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", obj, bryVar2.getClass().getName(), bryVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(obj, bryVar);
        concurrentMap.put(obj, true);
    }

    public final synchronized void a(bry bryVar) {
        b(bryVar, 1);
    }

    public final synchronized void b(bry bryVar, int i) {
        if (!hnu.ax(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        c(bryVar);
    }
}
