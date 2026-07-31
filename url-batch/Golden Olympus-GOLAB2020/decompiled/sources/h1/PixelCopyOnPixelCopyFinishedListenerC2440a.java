package h1;

import android.app.Activity;
import android.content.Context;
import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class PixelCopyOnPixelCopyFinishedListenerC2440a implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Semaphore f36728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2441b f36729b;

    public PixelCopyOnPixelCopyFinishedListenerC2440a(C2441b c2441b, Semaphore semaphore) {
        this.f36729b = c2441b;
        this.f36728a = semaphore;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i4) {
        this.f36728a.release();
        if (i4 == 0) {
            Context context = this.f36729b.f36731b.f36732a;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Z(this));
            }
        }
    }
}
