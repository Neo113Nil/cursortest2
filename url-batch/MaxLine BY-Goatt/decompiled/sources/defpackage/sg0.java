package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sg0 extends yf0 implements Runnable {
    public final WeakReference m;

    public sg0(EditText editText) {
        this.m = new WeakReference(editText);
    }

    @Override // defpackage.yf0
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.m.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        tg0.a((EditText) this.m.get(), 1);
    }
}
