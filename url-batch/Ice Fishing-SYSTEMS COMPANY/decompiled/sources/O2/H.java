package O2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f2368n;

    public /* synthetic */ H(I i) {
        Objects.requireNonNull(i);
        this.f2368n = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            I i4 = this.f2368n;
            synchronized (i4.f2371a) {
                try {
                    F f6 = (F) message.obj;
                    G g9 = (G) i4.f2371a.get(f6);
                    if (g9 != null && g9.f2361n.isEmpty()) {
                        if (g9.f2363v) {
                            F f9 = g9.f2365x;
                            I i9 = g9.f2367z;
                            i9.f2373c.removeMessages(1, f9);
                            i9.f2374d.b(i9.f2372b, g9);
                            g9.f2363v = false;
                            g9.f2362u = 2;
                        }
                        i4.f2371a.remove(f6);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        I i10 = this.f2368n;
        synchronized (i10.f2371a) {
            try {
                F f10 = (F) message.obj;
                G g10 = (G) i10.f2371a.get(f10);
                if (g10 != null && g10.f2362u == 3) {
                    String valueOf = String.valueOf(f10);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = g10.f2366y;
                    if (componentName == null) {
                        f10.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = f10.f2359b;
                        w.h(str);
                        componentName = new ComponentName(str, com.anythink.core.common.v.m.f16967e);
                    }
                    g10.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
