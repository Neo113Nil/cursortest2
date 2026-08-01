package P0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1.d f995a;

    public e(C1.d dVar) {
        this.f995a = dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C1.d dVar = this.f995a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (dVar.f145b) {
            throw null;
        }
    }
}
