package K0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class l extends W0.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f857b = eVar;
        this.f856a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i4 = f.f847a;
        e eVar = this.f857b;
        Context context = this.f856a;
        int b3 = eVar.b(context, i4);
        int i5 = i.f851c;
        if (b3 == 1 || b3 == 2 || b3 == 3 || b3 == 9) {
            Intent a3 = eVar.a(b3, context, "n");
            eVar.f(context, b3, a3 == null ? null : PendingIntent.getActivity(context, 0, a3, 201326592));
        }
    }
}
