package E3;

import D.y;
import android.os.Handler;
import android.os.Message;
import u1.x;

/* loaded from: classes2.dex */
public final class a implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f811n;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f811n) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    throw y.g(message.obj);
                }
                if (i != 1) {
                    return false;
                }
                throw y.g(message.obj);
            default:
                if (message.what != 1) {
                    return false;
                }
                ((x) message.obj).a();
                return true;
        }
    }
}
