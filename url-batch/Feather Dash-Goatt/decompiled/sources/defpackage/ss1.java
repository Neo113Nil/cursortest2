package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ss1 extends gt1 {
    public final Context a;
    public final /* synthetic */ c50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss1(c50 c50Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = c50Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = d50.a;
        c50 c50Var = this.b;
        Context context = this.a;
        int b = c50Var.b(context, i2);
        int i3 = i50.c;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = c50Var.a(b, context, "n");
            c50Var.f(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
