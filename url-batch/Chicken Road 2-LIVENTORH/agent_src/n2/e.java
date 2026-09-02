package n2;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0.a f2843a;

    public e(a0.a aVar) {
        this.f2843a = aVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        a0.a aVar = this.f2843a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (aVar.f81g) {
            throw null;
        }
    }
}
