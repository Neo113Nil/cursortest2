package defpackage;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lik implements UrlRequest$StatusListener {
    private final UrlRequest.StatusListener a;

    public lik(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
