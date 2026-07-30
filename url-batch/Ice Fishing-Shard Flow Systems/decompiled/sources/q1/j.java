package q1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p3.C0827a;

/* loaded from: classes.dex */
public final class j extends C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f7339b = eVar;
        this.f7338a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i2);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i5 = f.f7325a;
        e eVar = this.f7339b;
        Context context = this.f7338a;
        int b7 = eVar.b(context, i5);
        int i7 = g.f7329c;
        if (b7 == 1 || b7 == 2 || b7 == 3 || b7 == 9) {
            Intent a7 = eVar.a(b7, context, C0827a.PUSH_MINIFIED_BUTTON_TEXT);
            eVar.d(context, b7, a7 == null ? null : PendingIntent.getActivity(context, 0, a7, 201326592));
        }
    }
}
