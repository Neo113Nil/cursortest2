package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o5 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(kf1 kf1Var, Looper looper) {
        super(looper);
        this.b = kf1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        t21[] t21VarArr;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                kf1 kf1Var = (kf1) this.b;
                while (true) {
                    synchronized (kf1Var.b) {
                        try {
                            size = kf1Var.d.size();
                            if (size <= 0) {
                                return;
                            }
                            t21VarArr = new t21[size];
                            kf1Var.d.toArray(t21VarArr);
                            kf1Var.d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        t21 t21Var = t21VarArr[i2];
                        int size2 = ((ArrayList) t21Var.o).size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            jf1 jf1Var = (jf1) ((ArrayList) t21Var.o).get(i3);
                            if (!jf1Var.d) {
                                jf1Var.b.onReceive(kf1Var.a, (Intent) t21Var.n);
                            }
                        }
                    }
                }
        }
    }

    public /* synthetic */ o5() {
    }
}
