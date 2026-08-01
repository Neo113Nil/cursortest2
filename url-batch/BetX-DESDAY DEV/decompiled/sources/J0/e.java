package J0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f390a;

    public e(f fVar) {
        this.f390a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        f fVar = this.f390a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (fVar.f392a) {
            throw null;
        }
    }
}
