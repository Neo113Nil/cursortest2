package androidx.window.layout.adapter.sidecar;

import B1.b;
import B1.g;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f5200b;

    /* renamed from: d, reason: collision with root package name */
    public final g f5202d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f5203e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5199a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f5201c = new WeakHashMap();

    public DistinctElementSidecarCallback(g gVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f5202d = gVar;
        this.f5203e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (B1.b.b(r2) == B1.b.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f5199a) {
            try {
                g gVar = this.f5202d;
                SidecarDeviceState sidecarDeviceState2 = this.f5200b;
                gVar.getClass();
                if (!i.a(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f5200b = sidecarDeviceState;
                    this.f5203e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b4;
        synchronized (this.f5199a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f5201c.get(iBinder);
                this.f5202d.getClass();
                if (i.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b4 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b4 = g.b(b.c(sidecarWindowLayoutInfo2), b.c(sidecarWindowLayoutInfo));
                    }
                    b4 = false;
                }
                if (b4) {
                    return;
                }
                this.f5201c.put(iBinder, sidecarWindowLayoutInfo);
                this.f5203e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
