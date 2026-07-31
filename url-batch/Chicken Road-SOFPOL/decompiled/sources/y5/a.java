package y5;

import a0.q;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw q.g(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw q.g(message.obj);
    }
}
