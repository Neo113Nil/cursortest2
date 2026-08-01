package z6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.z5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends z5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f10892b = fVar;
        this.f10891a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i3);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = g.f10881a;
        f fVar = this.f10892b;
        Context context = this.f10891a;
        int b10 = fVar.b(context, i10);
        int i11 = i.f10887e;
        if (b10 == 1 || b10 == 2 || b10 == 3 || b10 == 9) {
            Intent a9 = fVar.a(b10, context, yb.a.PUSH_MINIFIED_BUTTON_TEXT);
            fVar.d(context, b10, a9 == null ? null : PendingIntent.getActivity(context, 0, a9, 201326592));
        }
    }
}
