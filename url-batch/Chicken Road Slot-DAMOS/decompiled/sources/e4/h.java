package e4;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import m.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends c4.i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f3867d;

    public h(n nVar) {
        this.f3867d = new WeakReference(nVar);
    }

    @Override // c4.i
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f3867d.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f3867d.get(), 1);
    }
}
