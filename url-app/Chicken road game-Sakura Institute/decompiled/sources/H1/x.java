package H1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class x implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f3310a;

    public /* synthetic */ x(y yVar) {
        this.f3310a = yVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f3310a.f3314a) {
                try {
                    v vVar = (v) message.obj;
                    w wVar = (w) this.f3310a.f3314a.get(vVar);
                    if (wVar != null && wVar.f3303a.isEmpty()) {
                        if (wVar.f3305c) {
                            wVar.f3309g.f3316c.removeMessages(1, wVar.f3307e);
                            y yVar = wVar.f3309g;
                            yVar.f3317d.b(yVar.f3315b, wVar);
                            wVar.f3305c = false;
                            wVar.f3304b = 2;
                        }
                        this.f3310a.f3314a.remove(vVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f3310a.f3314a) {
            try {
                v vVar2 = (v) message.obj;
                w wVar2 = (w) this.f3310a.f3314a.get(vVar2);
                if (wVar2 != null && wVar2.f3304b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(vVar2)), new Exception());
                    ComponentName componentName = wVar2.f3308f;
                    if (componentName == null) {
                        vVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = vVar2.f3301b;
                        o.d(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    wVar2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
