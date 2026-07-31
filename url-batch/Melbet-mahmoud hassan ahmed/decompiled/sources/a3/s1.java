package a3;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.s33;

/* loaded from: classes.dex */
public final class s1 extends s33 {
    public s1(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.s33
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            y2.t.q();
            g2.p(y2.t.p().c(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e7) {
            y2.t.p().s(e7, "AdMobHandler.handleMessage");
        }
    }
}
