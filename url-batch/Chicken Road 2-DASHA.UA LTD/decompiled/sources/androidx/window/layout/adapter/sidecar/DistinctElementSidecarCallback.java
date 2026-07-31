package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import y.C0119f;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f454b;

    /* renamed from: d, reason: collision with root package name */
    public final C0119f f456d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f457e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f453a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f455c = new WeakHashMap();

    public DistinctElementSidecarCallback(C0119f c0119f, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f456d = c0119f;
        this.f457e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f453a) {
            try {
                C0119f c0119f = this.f456d;
                SidecarDeviceState sidecarDeviceState2 = this.f454b;
                c0119f.getClass();
                if (C0119f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f454b = sidecarDeviceState;
                this.f457e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f453a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f455c.get(iBinder);
                this.f456d.getClass();
                if (C0119f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f455c.put(iBinder, sidecarWindowLayoutInfo);
                this.f457e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
