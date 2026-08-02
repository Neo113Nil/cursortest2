package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class clk extends gbg {
    final /* synthetic */ cll a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clk(cll cllVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte[]) null);
        this.a = cllVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        cll cllVar = this.a;
        Context context = this.b;
        int l = cllVar.l(context, 17895000);
        if (cmd.f(l)) {
            cllVar.i(context, l);
        }
    }
}
