package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiw extends kgw {
    private static final ReferenceQueue b = new ReferenceQueue();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    public static final Logger a = Logger.getLogger(kiw.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiw(jzo jzoVar) {
        super(jzoVar);
        ReferenceQueue referenceQueue = b;
        ConcurrentMap concurrentMap = c;
        new kiv(this, jzoVar, referenceQueue, concurrentMap);
    }
}
