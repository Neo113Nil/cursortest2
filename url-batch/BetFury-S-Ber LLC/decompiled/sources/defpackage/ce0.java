package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ce0 implements Handler.Callback {
    public final /* synthetic */ wi a;

    public ce0(wi wiVar) {
        this.a = wiVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        wi wiVar = this.a;
        de0 de0Var = (de0) message.obj;
        synchronized (wiVar.f) {
            if (((de0) wiVar.h) == de0Var || ((de0) wiVar.i) == de0Var) {
                wiVar.d(de0Var, 2);
            }
        }
        return true;
    }
}
