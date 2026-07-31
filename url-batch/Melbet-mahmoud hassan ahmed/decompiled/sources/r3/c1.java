package r3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
final class c1 implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d1 f21230f;

    /* synthetic */ c1(d1 d1Var, a1 a1Var) {
        this.f21230f = d1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i7 = message.what;
        if (i7 == 0) {
            hashMap = this.f21230f.f21248d;
            synchronized (hashMap) {
                z0 z0Var = (z0) message.obj;
                hashMap2 = this.f21230f.f21248d;
                b1 b1Var = (b1) hashMap2.get(z0Var);
                if (b1Var != null && b1Var.h()) {
                    if (b1Var.e()) {
                        b1Var.b("GmsClientSupervisor");
                    }
                    hashMap3 = this.f21230f.f21248d;
                    hashMap3.remove(z0Var);
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        hashMap4 = this.f21230f.f21248d;
        synchronized (hashMap4) {
            z0 z0Var2 = (z0) message.obj;
            hashMap5 = this.f21230f.f21248d;
            b1 b1Var2 = (b1) hashMap5.get(z0Var2);
            if (b1Var2 != null && b1Var2.f() == 3) {
                String valueOf = String.valueOf(z0Var2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName j7 = b1Var2.j();
                if (j7 == null) {
                    j7 = z0Var2.b();
                }
                if (j7 == null) {
                    String a7 = z0Var2.a();
                    o.i(a7);
                    j7 = new ComponentName(a7, "unknown");
                }
                b1Var2.onServiceDisconnected(j7);
            }
        }
        return true;
    }
}
