package i2;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.e f2105a;

    public e(a2.e eVar) {
        this.f2105a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        a2.e eVar = this.f2105a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (eVar.g) {
            throw null;
        }
    }
}
