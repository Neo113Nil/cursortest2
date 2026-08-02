package d2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* renamed from: d2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380B implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0381C f8222a;

    public /* synthetic */ C0380B(C0381C c0381c) {
        this.f8222a = c0381c;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            synchronized (this.f8222a.f8226a) {
                try {
                    z zVar = (z) message.obj;
                    ServiceConnectionC0379A serviceConnectionC0379A = (ServiceConnectionC0379A) this.f8222a.f8226a.get(zVar);
                    if (serviceConnectionC0379A != null && serviceConnectionC0379A.f8215a.isEmpty()) {
                        if (serviceConnectionC0379A.f8217c) {
                            serviceConnectionC0379A.f8221g.f8228c.removeMessages(1, serviceConnectionC0379A.f8219e);
                            C0381C c0381c = serviceConnectionC0379A.f8221g;
                            c0381c.f8229d.b(c0381c.f8227b, serviceConnectionC0379A);
                            serviceConnectionC0379A.f8217c = false;
                            serviceConnectionC0379A.f8216b = 2;
                        }
                        this.f8222a.f8226a.remove(zVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        synchronized (this.f8222a.f8226a) {
            try {
                z zVar2 = (z) message.obj;
                ServiceConnectionC0379A serviceConnectionC0379A2 = (ServiceConnectionC0379A) this.f8222a.f8226a.get(zVar2);
                if (serviceConnectionC0379A2 != null && serviceConnectionC0379A2.f8216b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(zVar2)), new Exception());
                    ComponentName componentName = serviceConnectionC0379A2.f8220f;
                    if (componentName == null) {
                        zVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zVar2.f8315b;
                        s.c(str);
                        componentName = new ComponentName(str, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    serviceConnectionC0379A2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
