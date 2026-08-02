package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aie extends Handler {
    final /* synthetic */ aij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aie(aij aijVar, Looper looper) {
        super(looper);
        this.a = aijVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.n();
    }
}
