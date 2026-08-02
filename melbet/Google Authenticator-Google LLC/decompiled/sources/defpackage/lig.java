package defpackage;

import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lig extends UploadDataSink {
    private final android.net.http.UploadDataSink a;

    public lig(android.net.http.UploadDataSink uploadDataSink) {
        this.a = uploadDataSink;
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        this.a.onReadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        this.a.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        this.a.onRewindError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        this.a.onRewindSucceeded();
    }
}
