package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnv extends gbg {
    public cnv(Looper looper) {
        super(looper, (byte[]) null);
    }

    public final void a(cnd cndVar, cnc cncVar) {
        ThreadLocal threadLocal = BasePendingResult.b;
        sendMessage(obtainMessage(1, new Pair(cndVar, cncVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).j(Status.d);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        cnd cndVar = (cnd) pair.first;
        cnc cncVar = (cnc) pair.second;
        try {
            cndVar.a(cncVar);
        } catch (RuntimeException e) {
            BasePendingResult.k(cncVar);
            throw e;
        }
    }
}
