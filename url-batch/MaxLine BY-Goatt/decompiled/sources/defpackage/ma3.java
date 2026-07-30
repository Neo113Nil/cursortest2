package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ma3 extends bb3 {
    public final Context a;
    public final /* synthetic */ sv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma3(sv0 sv0Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = sv0Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = tv0.a;
        sv0 sv0Var = this.b;
        Context context = this.a;
        int b = sv0Var.b(context, i2);
        int i3 = xv0.e;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = sv0Var.a(context, "n", b);
            sv0Var.f(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
