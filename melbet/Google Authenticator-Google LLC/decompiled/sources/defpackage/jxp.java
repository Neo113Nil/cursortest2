package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxp {
    static final jxq a;

    static {
        jxq kbxVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            kbxVar = (jxq) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(jxq.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            kbxVar = new kbx();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = kbxVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            jxr.c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
