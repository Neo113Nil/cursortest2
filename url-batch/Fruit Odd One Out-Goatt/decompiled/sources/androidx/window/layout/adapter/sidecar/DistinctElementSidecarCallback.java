package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d1.h;
import java.util.WeakHashMap;
import z.b;
import z.g;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f54b;

    /* renamed from: d, reason: collision with root package name */
    public final g f56d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f57e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f53a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f55c = new WeakHashMap();

    public DistinctElementSidecarCallback(g gVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f56d = gVar;
        this.f57e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (z.b.b(r2) == z.b.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f53a) {
            try {
                g gVar = this.f56d;
                SidecarDeviceState sidecarDeviceState2 = this.f54b;
                gVar.getClass();
                if (!h.a(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f54b = sidecarDeviceState;
                    this.f57e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b2;
        synchronized (this.f53a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f55c.get(iBinder);
                this.f56d.getClass();
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
                this.f55c.put(iBinder, sidecarWindowLayoutInfo);
                this.f57e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
