package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fpn implements Handler.Callback {
    final /* synthetic */ fpp a;

    public fpn(fpp fppVar) {
        this.a = fppVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        fpp fppVar = this.a;
        fpo fpoVar = (fpo) message.obj;
        synchronized (fppVar.a) {
            if (fppVar.c == fpoVar || fppVar.d == fpoVar) {
                fppVar.d(fpoVar, 2);
            }
        }
        return true;
    }
}
