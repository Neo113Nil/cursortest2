package E3;

import F1.f;
import K2.k;
import K2.l;
import K2.m;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
public final class e implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f823n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f824u;

    public /* synthetic */ e(int i, Object obj) {
        this.f823n = i;
        this.f824u = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f823n) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                h4.c cVar = (h4.c) this.f824u;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (cVar.f38233u) {
                    throw null;
                }
            case 1:
                int i = message.what;
                f fVar = (f) this.f824u;
                if (i == 1) {
                    fVar.b((F1.d) message.obj);
                    return true;
                }
                if (i == 2) {
                    fVar.f979d.i((F1.d) message.obj);
                }
                return false;
            default:
                int i4 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i4);
                }
                k kVar = (k) this.f824u;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.f1596x.get(i4);
                        if (lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i4);
                            return true;
                        }
                        kVar.f1596x.remove(i4);
                        kVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.b(new m("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.f1602e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.c(null);
                                    return true;
                                }
                                lVar.b(new m("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
