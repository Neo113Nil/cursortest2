package Q0;

import H1.z;
import U0.A;
import U0.B;
import U0.C;
import U0.t;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1991b;

    public /* synthetic */ l(int i7, Object obj) {
        this.f1990a = i7;
        this.f1991b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1990a) {
            case 0:
                int i7 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i7);
                }
                m mVar = (m) this.f1991b;
                synchronized (mVar) {
                    try {
                        n nVar = (n) mVar.f1996e.get(i7);
                        if (nVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i7);
                            return true;
                        }
                        mVar.f1996e.remove(i7);
                        mVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            nVar.b(new z("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (nVar.f2002e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    nVar.c(null);
                                    return true;
                                }
                                nVar.b(new z("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                nVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                int i8 = message.what;
                if (i8 == 0) {
                    synchronized (((C) this.f1991b).f2500a) {
                        try {
                            A a7 = (A) message.obj;
                            B b7 = (B) ((C) this.f1991b).f2500a.get(a7);
                            if (b7 != null && b7.f2490a.isEmpty()) {
                                if (b7.f2492c) {
                                    b7.f2496g.f2502c.removeMessages(1, b7.f2494e);
                                    C c7 = b7.f2496g;
                                    c7.f2503d.b(c7.f2501b, b7);
                                    b7.f2492c = false;
                                    b7.f2491b = 2;
                                }
                                ((C) this.f1991b).f2500a.remove(a7);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        return false;
                    }
                    synchronized (((C) this.f1991b).f2500a) {
                        try {
                            A a8 = (A) message.obj;
                            B b8 = (B) ((C) this.f1991b).f2500a.get(a8);
                            if (b8 != null && b8.f2491b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(a8)), new Exception());
                                ComponentName componentName = b8.f2495f;
                                if (componentName == null) {
                                    a8.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = a8.f2488b;
                                    t.f(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                b8.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
