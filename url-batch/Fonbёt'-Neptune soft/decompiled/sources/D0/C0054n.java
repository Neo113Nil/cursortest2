package D0;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: D0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054n implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f389a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f391c;

    public /* synthetic */ C0054n(Object obj, DisplayManager displayManager, int i2) {
        this.f389a = i2;
        this.f391c = obj;
        this.f390b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
        switch (this.f389a) {
            case 0:
                Iterator it = ((ArrayList) this.f391c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i2);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        switch (this.f389a) {
            case 0:
                if (this.f390b.getDisplay(i2) != null) {
                    Iterator it = ((ArrayList) this.f391c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i2);
                    }
                    break;
                }
                break;
            default:
                if (i2 == 0) {
                    float refreshRate = this.f390b.getDisplay(0).getRefreshRate();
                    io.flutter.view.s sVar = (io.flutter.view.s) this.f391c;
                    sVar.f2825a = (long) (1.0E9d / refreshRate);
                    sVar.f2826b.setRefreshRateFPS(refreshRate);
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
        switch (this.f389a) {
            case 0:
                Iterator it = ((ArrayList) this.f391c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i2);
                }
                break;
        }
    }

    private final void a(int i2) {
    }

    private final void b(int i2) {
    }
}
