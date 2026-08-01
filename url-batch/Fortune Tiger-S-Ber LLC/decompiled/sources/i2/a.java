package i2;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i4 != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
