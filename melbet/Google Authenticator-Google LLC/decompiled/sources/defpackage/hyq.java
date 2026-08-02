package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyq {
    public static final hyq a = new hyq();
    private final ConcurrentMap b = new ConcurrentHashMap();

    public final void a(hyp hypVar, Class cls) {
        hyp hypVar2 = (hyp) this.b.putIfAbsent(cls, hypVar);
        if (hypVar2 != null && !hypVar2.equals(hypVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
