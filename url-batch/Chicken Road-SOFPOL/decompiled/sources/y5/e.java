package y5;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.e f8985a;

    public e(q0.e eVar) {
        this.f8985a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        q0.e eVar = this.f8985a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (eVar.f5938a) {
            throw null;
        }
    }
}
