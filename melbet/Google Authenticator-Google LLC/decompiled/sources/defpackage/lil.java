package defpackage;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lil extends ExperimentalUrlRequest {
    private final UrlRequest a;
    private final lia b;
    private final String c;
    private final Collection d;
    private final lka e;

    public lil(UrlRequest urlRequest, lia liaVar, String str, Collection collection, RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = liaVar;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new lka(listener);
    }

    final void a(int i, lim limVar, CronetException cronetException) {
        lie.a(this.b, this.c, this.d, this.e, i, limVar, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new lik(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean isDone;
        isDone = this.a.isDone();
        return isDone;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
