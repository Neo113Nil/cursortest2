package q2;

import android.os.Handler;
import android.os.Message;
import o0.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3171a;

    public e(f fVar) {
        this.f3171a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        f fVar = this.f3171a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (fVar.f2881a) {
            throw null;
        }
    }
}
