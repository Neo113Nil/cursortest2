package t1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: t1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910G implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0911H f7912a;

    public /* synthetic */ C0910G(C0911H c0911h) {
        this.f7912a = c0911h;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            C0911H c0911h = this.f7912a;
            synchronized (c0911h.f7916a) {
                try {
                    C0908E c0908e = (C0908E) message.obj;
                    ServiceConnectionC0909F serviceConnectionC0909F = (ServiceConnectionC0909F) c0911h.f7916a.get(c0908e);
                    if (serviceConnectionC0909F != null && serviceConnectionC0909F.f7905a.isEmpty()) {
                        if (serviceConnectionC0909F.f7907c) {
                            C0908E c0908e2 = serviceConnectionC0909F.f7909e;
                            C0911H c0911h2 = serviceConnectionC0909F.f7911g;
                            c0911h2.f7918c.removeMessages(1, c0908e2);
                            c0911h2.f7919d.b(c0911h2.f7917b, serviceConnectionC0909F);
                            serviceConnectionC0909F.f7907c = false;
                            serviceConnectionC0909F.f7906b = 2;
                        }
                        c0911h.f7916a.remove(c0908e);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        C0911H c0911h3 = this.f7912a;
        synchronized (c0911h3.f7916a) {
            try {
                C0908E c0908e3 = (C0908E) message.obj;
                ServiceConnectionC0909F serviceConnectionC0909F2 = (ServiceConnectionC0909F) c0911h3.f7916a.get(c0908e3);
                if (serviceConnectionC0909F2 != null && serviceConnectionC0909F2.f7906b == 3) {
                    String valueOf = String.valueOf(c0908e3);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = serviceConnectionC0909F2.f7910f;
                    if (componentName == null) {
                        c0908e3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = c0908e3.f7903b;
                        u.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    serviceConnectionC0909F2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
