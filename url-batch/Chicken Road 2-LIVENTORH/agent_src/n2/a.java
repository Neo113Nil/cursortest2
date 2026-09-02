package n2;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            message.obj.getClass();
            throw new ClassCastException();
        }
        if (i != 1) {
            return false;
        }
        message.obj.getClass();
        throw new ClassCastException();
    }
}
