package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hw2 extends sw2 {
    public final Context PxuCJdSBwIXG;
    public final /* synthetic */ bh0 lS5Rgt96tfkO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw2(bh0 bh0Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.lS5Rgt96tfkO = bh0Var;
        this.PxuCJdSBwIXG = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = ch0.PxuCJdSBwIXG;
        bh0 bh0Var = this.lS5Rgt96tfkO;
        Context context = this.PxuCJdSBwIXG;
        int lS5Rgt96tfkO = bh0Var.lS5Rgt96tfkO(context, i2);
        int i3 = hh0.TSizfFm2Yiuu;
        if (lS5Rgt96tfkO == 1 || lS5Rgt96tfkO == 2 || lS5Rgt96tfkO == 3 || lS5Rgt96tfkO == 9) {
            Intent PxuCJdSBwIXG = bh0Var.PxuCJdSBwIXG(context, lS5Rgt96tfkO, "n");
            bh0Var.a92UlCVFR9N8(context, lS5Rgt96tfkO, PxuCJdSBwIXG == null ? null : PendingIntent.getActivity(context, 0, PxuCJdSBwIXG, 201326592));
        }
    }
}
