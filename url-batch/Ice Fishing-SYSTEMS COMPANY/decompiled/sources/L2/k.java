package L2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class k extends Z2.e {

    /* renamed from: b, reason: collision with root package name */
    public final Context f1735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f1736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0, false);
        this.f1736c = eVar;
        this.f1735b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i4 = f.f1725a;
        e eVar = this.f1736c;
        Context context = this.f1735b;
        int c4 = eVar.c(context, i4);
        AtomicBoolean atomicBoolean = h.f1727a;
        if (c4 == 1 || c4 == 2 || c4 == 3 || c4 == 9) {
            Intent b9 = eVar.b(context, "n", c4);
            eVar.g(context, c4, b9 == null ? null : PendingIntent.getActivity(context, 0, b9, 201326592));
        }
    }
}
