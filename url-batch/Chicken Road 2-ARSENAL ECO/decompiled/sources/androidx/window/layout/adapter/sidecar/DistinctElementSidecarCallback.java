package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import i0.AbstractC0419b;
import i0.g;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f3544b;

    /* renamed from: d, reason: collision with root package name */
    public final g f3546d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f3547e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3543a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f3545c = new WeakHashMap();

    public DistinctElementSidecarCallback(g gVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f3546d = gVar;
        this.f3547e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (i0.AbstractC0419b.b(r2) == i0.AbstractC0419b.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f3543a) {
            try {
                g gVar = this.f3546d;
                SidecarDeviceState sidecarDeviceState2 = this.f3544b;
                gVar.getClass();
                if (!i.a(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f3544b = sidecarDeviceState;
                    this.f3547e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b7;
        synchronized (this.f3543a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f3545c.get(iBinder);
                this.f3546d.getClass();
                if (i.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b7 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b7 = g.b(AbstractC0419b.c(sidecarWindowLayoutInfo2), AbstractC0419b.c(sidecarWindowLayoutInfo));
                    }
                    b7 = false;
                }
                if (b7) {
                    return;
                }
                this.f3545c.put(iBinder, sidecarWindowLayoutInfo);
                this.f3547e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
