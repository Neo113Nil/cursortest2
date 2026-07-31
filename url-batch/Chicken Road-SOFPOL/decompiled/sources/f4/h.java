package f4;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends d4.i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2731d;

    public h(EditText editText) {
        this.f2731d = new WeakReference(editText);
    }

    @Override // d4.i
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f2731d.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f2731d.get(), 1);
    }
}
