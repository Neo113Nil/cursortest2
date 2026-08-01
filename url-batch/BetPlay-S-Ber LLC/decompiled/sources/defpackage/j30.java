package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class j30 implements Handler.Callback {
    public final /* synthetic */ y1 a;

    public j30(y1 y1Var) {
        this.a = y1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        y1 y1Var = this.a;
        if (message.obj != null) {
            o8.c();
            return false;
        }
        synchronized (y1Var.a) {
            throw null;
        }
    }
}
