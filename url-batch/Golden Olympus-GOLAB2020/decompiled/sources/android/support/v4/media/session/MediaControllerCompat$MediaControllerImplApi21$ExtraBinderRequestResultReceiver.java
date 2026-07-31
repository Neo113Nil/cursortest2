package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f9800b;

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i4, Bundle bundle) {
        b.a(this.f9800b.get());
    }
}
