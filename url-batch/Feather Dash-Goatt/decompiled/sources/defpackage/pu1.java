package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pu1 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pu1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                tu1 tu1Var = (tu1) this.b;
                synchronized (tu1Var) {
                    try {
                        vu1 vu1Var = (vu1) tu1Var.e.get(i);
                        if (vu1Var != null) {
                            tu1Var.e.remove(i);
                            tu1Var.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (vu1Var.e) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        if (!data.getBoolean("ack", false)) {
                                            vu1Var.b(new d91("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            vu1Var.c(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        vu1Var.c(bundle);
                                        break;
                                }
                            } else {
                                vu1Var.b(new d91("Not supported by GmsCore", null));
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
                    synchronized (((wu1) this.b).a) {
                        try {
                            ru1 ru1Var = (ru1) message.obj;
                            su1 su1Var = (su1) ((wu1) this.b).a.get(ru1Var);
                            if (su1Var != null && su1Var.a.isEmpty()) {
                                if (su1Var.c) {
                                    su1Var.g.c.removeMessages(1, su1Var.e);
                                    wu1 wu1Var = su1Var.g;
                                    wu1Var.d.C(wu1Var.b, su1Var);
                                    su1Var.c = false;
                                    su1Var.b = 2;
                                }
                                ((wu1) this.b).a.remove(ru1Var);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                synchronized (((wu1) this.b).a) {
                    try {
                        ru1 ru1Var2 = (ru1) message.obj;
                        su1 su1Var2 = (su1) ((wu1) this.b).a.get(ru1Var2);
                        if (su1Var2 != null && su1Var2.b == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(ru1Var2)), new Exception());
                            ComponentName componentName2 = su1Var2.f;
                            if (componentName2 == null) {
                                ru1Var2.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = ru1Var2.b;
                                y90.i(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            su1Var2.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}
