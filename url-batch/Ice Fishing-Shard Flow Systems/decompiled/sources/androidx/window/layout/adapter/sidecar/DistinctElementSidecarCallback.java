package androidx.window.layout.adapter.sidecar;

import D0.b;
import D0.g;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f4075b;

    /* renamed from: d, reason: collision with root package name */
    public final g f4077d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f4078e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4074a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f4076c = new WeakHashMap();

    public DistinctElementSidecarCallback(g gVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f4077d = gVar;
        this.f4078e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (D0.b.b(r2) == D0.b.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f4074a) {
            try {
                g gVar = this.f4077d;
                SidecarDeviceState sidecarDeviceState2 = this.f4075b;
                gVar.getClass();
                if (!Intrinsics.a(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f4075b = sidecarDeviceState;
                    this.f4078e.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b7;
        synchronized (this.f4074a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f4076c.get(iBinder);
                this.f4077d.getClass();
                if (Intrinsics.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b7 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b7 = g.b(b.c(sidecarWindowLayoutInfo2), b.c(sidecarWindowLayoutInfo));
                    }
                    b7 = false;
                }
                if (b7) {
                    return;
                }
                this.f4076c.put(iBinder, sidecarWindowLayoutInfo);
                this.f4078e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
