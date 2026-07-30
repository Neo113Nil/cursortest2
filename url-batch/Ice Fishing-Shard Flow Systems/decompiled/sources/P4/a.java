package P4;

import B5.f;
import P0.s;
import b5.C0279b;
import c5.C0309a;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import n5.C0761c;
import v5.C0977c;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final Duration f2287e;

    /* renamed from: d, reason: collision with root package name */
    public final s f2288d;

    static {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(10L);
        f2287e = ofSeconds;
    }

    public a(s sVar) {
        this.f2288d = sVar;
    }

    @Override // B5.f
    public final C0977c p(Collection collection) {
        CompletableFuture completedFuture;
        long millis;
        s sVar = this.f2288d;
        X4.a aVar = ((C0279b) sVar.f2251d).f4160d;
        B.f fVar = aVar.f2858e;
        Logger logger = aVar.f2860l;
        logger.finer("Intercepting batch.");
        try {
            try {
                C0761c c0761c = (C0761c) fVar.f152e;
                C0761c c0761c2 = (C0761c) fVar.f152e;
                c0761c.d(collection);
                if (aVar.f2857d.d(fVar, 1)) {
                    completedFuture = CompletableFuture.completedFuture(new C0309a(true, null));
                } else {
                    logger.fine("Could not store batch in disk.");
                    completedFuture = CompletableFuture.completedFuture(new C0309a(false, new Exception("Could not store batch in disk for an unknown reason.")));
                }
                c0761c2.e();
            } catch (IOException e7) {
                logger.log(Level.WARNING, "An unexpected error happened while attempting to write the data in disk.", (Throwable) e7);
                completedFuture = CompletableFuture.completedFuture(new C0309a(false, e7));
                ((C0761c) fVar.f152e).e();
            }
            try {
                millis = ((Duration) sVar.f2252e).toMillis();
                C0309a c0309a = (C0309a) completedFuture.get(millis, TimeUnit.MILLISECONDS);
                if (c0309a.f4255a) {
                    return C0977c.f8229e;
                }
                Throwable th = c0309a.f4256b;
                if (th == null) {
                    return C0977c.f8230f;
                }
                C0977c c0977c = new C0977c();
                c0977c.a(th);
                return c0977c;
            } catch (InterruptedException e8) {
                e = e8;
                C0977c c0977c2 = new C0977c();
                c0977c2.a(e);
                return c0977c2;
            } catch (ExecutionException e9) {
                e = e9;
                C0977c c0977c22 = new C0977c();
                c0977c22.a(e);
                return c0977c22;
            } catch (TimeoutException e10) {
                e = e10;
                C0977c c0977c222 = new C0977c();
                c0977c222.a(e);
                return c0977c222;
            }
        } catch (Throwable th2) {
            ((C0761c) fVar.f152e).e();
            throw th2;
        }
    }

    @Override // B5.f
    public final C0977c shutdown() {
        return C0977c.f8229e;
    }
}
