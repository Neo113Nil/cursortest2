package o3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class o extends a4.e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19870a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f19871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f19871b = eVar;
        this.f19870a = context.getApplicationContext();
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
        int g7 = this.f19871b.g(this.f19870a);
        if (this.f19871b.i(g7)) {
            this.f19871b.n(this.f19870a, g7);
        }
    }
}
