package t2;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.AbstractC2802Ua;

/* loaded from: classes.dex */
public final class D extends Z2.e {
    @Override // Z2.e
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            p2.j jVar = p2.j.f39798C;
            G g9 = jVar.f39803c;
            Context context = jVar.f39808h.f29016e;
            if (context != null) {
                try {
                    if (((Boolean) AbstractC2802Ua.f28036b.r()).booleanValue()) {
                        S2.b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e6) {
            p2.j.f39798C.f39808h.d("AdMobHandler.handleMessage", e6);
        }
    }
}
