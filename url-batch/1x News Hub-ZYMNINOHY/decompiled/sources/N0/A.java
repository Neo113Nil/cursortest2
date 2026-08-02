package N0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;

/* loaded from: classes.dex */
public final class A implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f986a;

    public /* synthetic */ A(B b3) {
        this.f986a = b3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            synchronized (this.f986a.f990a) {
                try {
                    y yVar = (y) message.obj;
                    z zVar = (z) this.f986a.f990a.get(yVar);
                    if (zVar != null && zVar.f1074a.isEmpty()) {
                        if (zVar.f1076c) {
                            zVar.f1079g.f992c.removeMessages(1, zVar.f1078e);
                            B b3 = zVar.f1079g;
                            b3.f993d.b(b3.f991b, zVar);
                            zVar.f1076c = false;
                            zVar.f1075b = 2;
                        }
                        this.f986a.f990a.remove(yVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        synchronized (this.f986a.f990a) {
            try {
                y yVar2 = (y) message.obj;
                z zVar2 = (z) this.f986a.f990a.get(yVar2);
                if (zVar2 != null && zVar2.f1075b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(yVar2)), new Exception());
                    ComponentName componentName = zVar2.f;
                    if (componentName == null) {
                        yVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = yVar2.f1072b;
                        r.c(str);
                        componentName = new ComponentName(str, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                    }
                    zVar2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
