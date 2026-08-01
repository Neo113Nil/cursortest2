package J0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0.d f362a;

    public e(B0.d dVar) {
        this.f362a = dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        B0.d dVar = this.f362a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (dVar.f59b) {
            throw null;
        }
    }
}
