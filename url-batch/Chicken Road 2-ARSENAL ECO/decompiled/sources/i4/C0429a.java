package i4;

import G4.d;
import O4.c;
import U4.e;
import V5.g;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import q4.C0600a;
import u0.C0682l;
import u4.C0694b;
import v4.C0707a;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429a implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final Duration f4429g;

    /* renamed from: f, reason: collision with root package name */
    public final C0682l f4430f;

    static {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(10L);
        f4429g = ofSeconds;
    }

    public C0429a(C0682l c0682l) {
        this.f4430f = c0682l;
    }

    @Override // U4.e
    public final c r(Collection collection) {
        CompletableFuture completedFuture;
        long millis;
        C0682l c0682l = this.f4430f;
        C0600a c0600a = ((C0694b) c0682l.f5989f).f6039f;
        g gVar = c0600a.f5785g;
        Logger logger = c0600a.f5787i;
        logger.finer("Intercepting batch.");
        try {
            try {
                d dVar = (d) gVar.f2734g;
                d dVar2 = (d) gVar.f2734g;
                dVar.d(collection);
                if (c0600a.f5784f.d(gVar, 1)) {
                    completedFuture = CompletableFuture.completedFuture(new C0707a(true, null));
                } else {
                    logger.fine("Could not store batch in disk.");
                    completedFuture = CompletableFuture.completedFuture(new C0707a(false, new Exception("Could not store batch in disk for an unknown reason.")));
                }
                dVar2.e();
            } catch (IOException e4) {
                logger.log(Level.WARNING, "An unexpected error happened while attempting to write the data in disk.", (Throwable) e4);
                completedFuture = CompletableFuture.completedFuture(new C0707a(false, e4));
                ((d) gVar.f2734g).e();
            }
            try {
                millis = ((Duration) c0682l.f5990g).toMillis();
                C0707a c0707a = (C0707a) completedFuture.get(millis, TimeUnit.MILLISECONDS);
                if (c0707a.f6123a) {
                    return c.f1787e;
                }
                Throwable th = c0707a.f6124b;
                if (th == null) {
                    return c.f1788f;
                }
                c cVar = new c();
                cVar.a(th);
                return cVar;
            } catch (InterruptedException e7) {
                e = e7;
                c cVar2 = new c();
                cVar2.a(e);
                return cVar2;
            } catch (ExecutionException e8) {
                e = e8;
                c cVar22 = new c();
                cVar22.a(e);
                return cVar22;
            } catch (TimeoutException e9) {
                e = e9;
                c cVar222 = new c();
                cVar222.a(e);
                return cVar222;
            }
        } catch (Throwable th2) {
            ((d) gVar.f2734g).e();
            throw th2;
        }
    }

    @Override // U4.e
    public final c shutdown() {
        return c.f1787e;
    }
}
