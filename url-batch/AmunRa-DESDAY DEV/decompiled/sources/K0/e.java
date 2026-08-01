package K0;

import C.g;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f462a;

    public e(g gVar) {
        this.f462a = gVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        g gVar = this.f462a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (gVar.f64b) {
            throw null;
        }
    }
}
