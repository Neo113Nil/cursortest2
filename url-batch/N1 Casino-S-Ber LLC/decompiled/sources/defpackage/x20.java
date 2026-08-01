package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x20 implements Handler.Callback {
    public final /* synthetic */ we a;

    public x20(we weVar) {
        this.a = weVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        we weVar = this.a;
        y20 y20Var = (y20) message.obj;
        synchronized (weVar.f) {
            if (((y20) weVar.h) == y20Var || ((y20) weVar.i) == y20Var) {
                weVar.e(y20Var, 2);
            }
        }
        return true;
    }
}
