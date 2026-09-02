package R0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class i extends c1.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f2070b = dVar;
        this.f2069a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i7);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i8 = e.f2064a;
        d dVar = this.f2070b;
        Context context = this.f2069a;
        int b7 = dVar.b(context, i8);
        int i9 = f.f2067c;
        if (b7 == 1 || b7 == 2 || b7 == 3 || b7 == 9) {
            Intent a7 = dVar.a(b7, context, N2.a.PUSH_MINIFIED_BUTTON_TEXT);
            dVar.f(context, b7, a7 == null ? null : PendingIntent.getActivity(context, 0, a7, 201326592));
        }
    }
}
