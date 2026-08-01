package f;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f1567a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == -3 || i4 == -2 || i4 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1567a.get(), message.what);
        } else {
            if (i4 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
