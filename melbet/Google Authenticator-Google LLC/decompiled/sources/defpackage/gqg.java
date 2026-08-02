package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gqg implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gqg(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.c != 0) {
            return hdb.c((Iterable) hnu.aR(this.b)).b(new bpo(this.a, 1)).e();
        }
        gsa gsaVar = gsa.a;
        Object obj = this.b;
        gqh gqhVar = (gqh) obj;
        gqhVar.b.writeLock().lock();
        long j = this.a;
        try {
            try {
                gsa a = ((gqh) obj).a();
                jkj C = a.C();
                if (!C.b.M()) {
                    C.t();
                }
                gsa gsaVar2 = (gsa) C.b;
                gsaVar2.b |= 2;
                gsaVar2.e = j;
                try {
                    ((gqh) obj).f((gsa) C.q());
                } catch (IOException e) {
                    ((hkf) ((hkf) ((hkf) gqh.a.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", 500, "SyncManagerDataStore.java")).s("Error writing sync data file. Cannot update last wakeup.");
                }
                gqhVar.b.writeLock().unlock();
                int i = a.b;
                if ((i & 2) != 0) {
                    return Long.valueOf(a.e);
                }
                if ((i & 1) != 0) {
                    return Long.valueOf(a.c);
                }
                return -1L;
            } catch (IOException e2) {
                hag.b(e2);
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            gqhVar.b.writeLock().unlock();
            throw th;
        }
    }
}
