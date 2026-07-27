package E1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class k extends P1.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f2298b = eVar;
        this.f2297a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        int i4 = f.f2289a;
        e eVar = this.f2298b;
        Context context = this.f2297a;
        int b4 = eVar.b(context, i4);
        int i5 = h.f2293c;
        if (b4 == 1 || b4 == 2 || b4 == 3 || b4 == 9) {
            Intent a4 = eVar.a(context, b4, "n");
            eVar.f(context, b4, a4 == null ? null : PendingIntent.getActivity(context, 0, a4, 201326592));
        }
    }
}
