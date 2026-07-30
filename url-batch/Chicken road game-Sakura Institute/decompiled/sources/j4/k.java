package j4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends u4.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f5022b = eVar;
        this.f5021a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        int i8 = f.f5014a;
        e eVar = this.f5022b;
        Context context = this.f5021a;
        int b9 = eVar.b(context, i8);
        AtomicBoolean atomicBoolean = h.f5016a;
        if (b9 == 1 || b9 == 2 || b9 == 3 || b9 == 9) {
            Intent a3 = eVar.a(context, b9, "n");
            eVar.f(context, b9, a3 == null ? null : PendingIntent.getActivity(context, 0, a3, 201326592));
        }
    }
}
