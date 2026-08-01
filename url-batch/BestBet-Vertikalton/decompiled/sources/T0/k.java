package T0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1068a;

    public k(m mVar) {
        this.f1068a = mVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        m mVar = this.f1068a;
        l lVar = (l) message.obj;
        synchronized (mVar.f1073a) {
            if (((l) mVar.f1075c) == lVar || ((l) mVar.d) == lVar) {
                mVar.c(lVar, 2);
            }
        }
        return true;
    }
}
