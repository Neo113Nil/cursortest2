package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class cn3 implements Handler.Callback {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ cn3(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.m) {
            case 0:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                gq3 gq3Var = (gq3) this.n;
                synchronized (gq3Var) {
                    try {
                        ds3 ds3Var = (ds3) gq3Var.q.get(i);
                        if (ds3Var != null) {
                            gq3Var.q.remove(i);
                            gq3Var.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (ds3Var.e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            ds3Var.b(new ne("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            ds3Var.c(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        ds3Var.c(bundle);
                                        break;
                                }
                            } else {
                                ds3Var.b(new ne("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((rs3) this.n).a) {
                        try {
                            bp3 bp3Var = (bp3) message.obj;
                            eq3 eq3Var = (eq3) ((rs3) this.n).a.get(bp3Var);
                            if (eq3Var != null && eq3Var.m.isEmpty()) {
                                if (eq3Var.o) {
                                    eq3Var.s.c.removeMessages(1, eq3Var.q);
                                    rs3 rs3Var = eq3Var.s;
                                    rs3Var.d.c(rs3Var.b, eq3Var);
                                    eq3Var.o = false;
                                    eq3Var.n = 2;
                                }
                                ((rs3) this.n).a.remove(bp3Var);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                synchronized (((rs3) this.n).a) {
                    try {
                        bp3 bp3Var2 = (bp3) message.obj;
                        eq3 eq3Var2 = (eq3) ((rs3) this.n).a.get(bp3Var2);
                        if (eq3Var2 != null && eq3Var2.n == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(bp3Var2)), new Exception());
                            ComponentName componentName2 = eq3Var2.r;
                            if (componentName2 == null) {
                                bp3Var2.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = bp3Var2.b;
                                ll3.v(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            eq3Var2.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}
