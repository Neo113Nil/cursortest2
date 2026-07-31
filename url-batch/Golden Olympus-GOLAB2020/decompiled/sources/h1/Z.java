package h1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes2.dex */
public final class Z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PixelCopyOnPixelCopyFinishedListenerC2440a f36727b;

    public Z(PixelCopyOnPixelCopyFinishedListenerC2440a pixelCopyOnPixelCopyFinishedListenerC2440a) {
        this.f36727b = pixelCopyOnPixelCopyFinishedListenerC2440a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36727b.f36729b.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(-16777216), new BitmapDrawable(this.f36727b.f36729b.getResources(), this.f36727b.f36729b.f36730a)}));
    }
}
