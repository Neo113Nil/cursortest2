package Y1;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Y1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118o implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1874a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f1875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1876c;

    public /* synthetic */ C0118o(Object obj, DisplayManager displayManager, int i3) {
        this.f1874a = i3;
        this.f1876c = obj;
        this.f1875b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i3) {
        switch (this.f1874a) {
            case 0:
                Iterator it = ((ArrayList) this.f1876c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i3);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        switch (this.f1874a) {
            case 0:
                if (this.f1875b.getDisplay(i3) != null) {
                    Iterator it = ((ArrayList) this.f1876c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i3);
                    }
                    break;
                }
                break;
            default:
                if (i3 == 0) {
                    float refreshRate = this.f1875b.getDisplay(0).getRefreshRate();
                    io.flutter.view.s sVar = (io.flutter.view.s) this.f1876c;
                    sVar.f9457a = (long) (1.0E9d / refreshRate);
                    sVar.f9458b.setRefreshRateFPS(refreshRate);
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i3) {
        switch (this.f1874a) {
            case 0:
                Iterator it = ((ArrayList) this.f1876c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i3);
                }
                break;
        }
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }
}
