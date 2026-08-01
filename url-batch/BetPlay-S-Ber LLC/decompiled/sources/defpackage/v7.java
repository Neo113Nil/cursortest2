package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class v7 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            message.obj.getClass();
            o8.c();
            return false;
        }
        if (i != 1) {
            return false;
        }
        message.obj.getClass();
        o8.c();
        return false;
    }
}
