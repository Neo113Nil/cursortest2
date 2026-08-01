package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class z50 implements Handler.Callback {
    public final /* synthetic */ rg a;

    public z50(rg rgVar) {
        this.a = rgVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        rg rgVar = this.a;
        a60 a60Var = (a60) message.obj;
        synchronized (rgVar.f) {
            if (((a60) rgVar.h) == a60Var || ((a60) rgVar.i) == a60Var) {
                rgVar.e(a60Var, 2);
            }
        }
        return true;
    }
}
