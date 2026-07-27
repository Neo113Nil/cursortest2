package n1;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import b2.AbstractC0279e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1317d extends A1.c {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("BasePendingResult", AbstractC0279e.d(i2, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).F(Status.f4975f);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        AbstractC0279e.o(pair.first);
        try {
            throw null;
        } catch (RuntimeException e3) {
            Y4.d dVar = BasePendingResult.f4981k;
            throw e3;
        }
    }
}
