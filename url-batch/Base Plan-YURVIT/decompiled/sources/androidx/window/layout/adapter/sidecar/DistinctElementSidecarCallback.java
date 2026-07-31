package androidx.window.layout.adapter.sidecar;

import P0.h;
import Z.b;
import Z.g;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f1724b;

    /* renamed from: d, reason: collision with root package name */
    public final g f1726d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f1727e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1723a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f1725c = new WeakHashMap();

    public DistinctElementSidecarCallback(g gVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f1726d = gVar;
        this.f1727e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (Z.b.b(r2) == Z.b.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f1723a) {
            try {
                g gVar = this.f1726d;
                SidecarDeviceState sidecarDeviceState2 = this.f1724b;
                gVar.getClass();
                if (!h.a(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f1724b = sidecarDeviceState;
                    this.f1727e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b2;
        synchronized (this.f1723a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f1725c.get(iBinder);
                this.f1726d.getClass();
                if (h.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b2 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b2 = g.b(b.c(sidecarWindowLayoutInfo2), b.c(sidecarWindowLayoutInfo));
                    }
                    b2 = false;
                }
                if (b2) {
                    return;
                }
                this.f1725c.put(iBinder, sidecarWindowLayoutInfo);
                this.f1727e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
