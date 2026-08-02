package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class iaq implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iaq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v24, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object, kja] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, kja] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ica) this.a.getKey()).a();
                return;
            case 1:
                this.a.cancel(false);
                return;
            case 2:
                ((ier) this.a).f().c();
                return;
            case 3:
                ((iey) this.a).f().c();
                return;
            case 4:
                ((ifb) this.a).c.c();
                return;
            case 5:
                ifm ifmVar = (ifm) this.a;
                if (ifmVar.h) {
                    return;
                }
                ifmVar.f = true;
                ifmVar.f();
                return;
            case 6:
                ifi ifiVar = (ifi) this.a;
                if (ifiVar.a) {
                    return;
                }
                ifiVar.c.d();
                return;
            case 7:
                ((iwr) this.a).d();
                return;
            case 8:
                this.a.isCancelled();
                return;
            case 9:
                ikt.a((Deque) ikt.a.get(), this.a);
                return;
            case 10:
                ikt.a.set(new ArrayDeque());
                this.a.run();
                return;
            case 11:
                try {
                    ((jxk) this.a).j(new TimeoutException("context timed out"));
                    return;
                } catch (Throwable th) {
                    jxr.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
                    return;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((kcp) this.a).b();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj = this.a;
                synchronized (obj) {
                    if (((kcs) obj).o(4)) {
                        ((kcs) obj).j(((kcs) obj).l, true);
                    }
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                keh kehVar = (keh) this.a;
                List list = ((khs) kehVar.b).c.f;
                jwt jwtVar = kehVar.h;
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                kehVar.h = jwtVar;
                kja kjaVar = kehVar.b;
                khu khuVar = ((khs) kjaVar).c;
                khuVar.d.a(2, "READY");
                khuVar.g.execute(new kgf(kjaVar, 10));
                return;
            case 15:
                ker kerVar = (ker) this.a;
                kuq kuqVar = kerVar.e;
                if (kuqVar != null && kuqVar.d()) {
                    kuqVar.c();
                }
                kerVar.d = null;
                return;
            case 16:
                ((kgc) this.a).g.c();
                return;
            case 17:
                ((kgb) this.a).g();
                return;
            case 18:
                this.a.a(true);
                return;
            case 19:
                this.a.a(false);
                return;
            default:
                kiq kiqVar = ((kif) this.a).a;
                hoq.I(kiqVar.A.get(), "Channel must have been shut down");
                kiqVar.B = true;
                kiqVar.i(false);
                kiqVar.g();
                return;
        }
    }

    public iaq(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
