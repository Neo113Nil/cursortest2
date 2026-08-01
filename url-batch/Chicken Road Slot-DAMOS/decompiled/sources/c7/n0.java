package c7;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f1958a;

    public /* synthetic */ n0(o0 o0Var) {
        this.f1958a = o0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            o0 o0Var = this.f1958a;
            synchronized (o0Var.f1963a) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) o0Var.f1963a.get(l0Var);
                    if (m0Var != null && m0Var.f1950a.isEmpty()) {
                        if (m0Var.f1952c) {
                            l0 l0Var2 = m0Var.f1954e;
                            o0 o0Var2 = m0Var.g;
                            o0Var2.f1965c.removeMessages(1, l0Var2);
                            o0Var2.f1966d.c(o0Var2.f1964b, m0Var);
                            m0Var.f1952c = false;
                            m0Var.f1951b = 2;
                        }
                        o0Var.f1963a.remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        o0 o0Var3 = this.f1958a;
        synchronized (o0Var3.f1963a) {
            try {
                l0 l0Var3 = (l0) message.obj;
                m0 m0Var2 = (m0) o0Var3.f1963a.get(l0Var3);
                if (m0Var2 != null && m0Var2.f1951b == 3) {
                    String valueOf = String.valueOf(l0Var3);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName componentName = m0Var2.f1955f;
                    if (componentName == null) {
                        l0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = l0Var3.f1943b;
                        c0.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    m0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
