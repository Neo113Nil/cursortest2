package m4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f6412a;

    public /* synthetic */ x(y yVar) {
        this.f6412a = yVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            synchronized (this.f6412a.f6416a) {
                try {
                    v vVar = (v) message.obj;
                    w wVar = (w) this.f6412a.f6416a.get(vVar);
                    if (wVar != null && wVar.f6405a.isEmpty()) {
                        if (wVar.f6407c) {
                            wVar.f6411g.f6418c.removeMessages(1, wVar.f6409e);
                            y yVar = wVar.f6411g;
                            yVar.f6419d.b(yVar.f6417b, wVar);
                            wVar.f6407c = false;
                            wVar.f6406b = 2;
                        }
                        this.f6412a.f6416a.remove(vVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        synchronized (this.f6412a.f6416a) {
            try {
                v vVar2 = (v) message.obj;
                w wVar2 = (w) this.f6412a.f6416a.get(vVar2);
                if (wVar2 != null && wVar2.f6406b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(vVar2)), new Exception());
                    ComponentName componentName = wVar2.f6410f;
                    if (componentName == null) {
                        vVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = vVar2.f6403b;
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
