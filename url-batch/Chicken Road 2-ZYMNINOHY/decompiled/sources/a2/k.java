package a2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.HandlerC1312d;

/* loaded from: classes.dex */
public final class k extends HandlerC1312d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0165e f4286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0165e c0165e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f4286b = c0165e;
        this.f4285a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i4);
            return;
        }
        int i5 = C0166f.f4276a;
        C0165e c0165e = this.f4286b;
        Context context = this.f4285a;
        int b4 = c0165e.b(context, i5);
        AtomicBoolean atomicBoolean = h.f4278a;
        if (b4 == 1 || b4 == 2 || b4 == 3 || b4 == 9) {
            Intent a3 = c0165e.a(b4, context, "n");
            c0165e.f(context, b4, a3 == null ? null : PendingIntent.getActivity(context, 0, a3, 201326592));
        }
    }
}
