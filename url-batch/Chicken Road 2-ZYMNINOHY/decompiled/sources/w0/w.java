package w0;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class w implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f15913a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f15914b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f15915c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f15916d = -9223372036854775807L;

    public w(Choreographer choreographer, DisplayManager displayManager) {
        this.f15913a = choreographer;
        this.f15914b = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i4) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i4) {
    }
}
