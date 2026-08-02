package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.C0178f;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f1894b;

    /* renamed from: d, reason: collision with root package name */
    public final C0178f f1896d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f1897e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1893a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f1895c = new WeakHashMap();

    public DistinctElementSidecarCallback(C0178f c0178f, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f1896d = c0178f;
        this.f1897e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f1893a) {
            try {
                C0178f c0178f = this.f1896d;
                SidecarDeviceState sidecarDeviceState2 = this.f1894b;
                c0178f.getClass();
                if (C0178f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f1894b = sidecarDeviceState;
                this.f1897e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f1893a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f1895c.get(iBinder);
                this.f1896d.getClass();
                if (C0178f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f1895c.put(iBinder, sidecarWindowLayoutInfo);
                this.f1897e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
