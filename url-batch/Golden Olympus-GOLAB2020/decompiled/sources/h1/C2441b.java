package h1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2441b extends View {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f36730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2442c f36731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441b(C2442c c2442c, Context context) {
        super(context);
        this.f36731b = c2442c;
    }

    public final void a(SurfaceView surfaceView) {
        this.f36730a = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("PlaceHolderView");
        handlerThread.start();
        Semaphore semaphore = new Semaphore(0);
        PixelCopy.request(surfaceView, this.f36730a, new PixelCopyOnPixelCopyFinishedListenerC2440a(this, semaphore), new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                T.a(5, "Timeout while copying surface view.");
            }
        } catch (InterruptedException e4) {
            T.a(6, e4.getMessage());
        }
        handlerThread.quitSafely();
    }
}
