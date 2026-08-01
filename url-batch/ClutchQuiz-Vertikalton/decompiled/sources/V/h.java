package V;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends T.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f880a;

    public h(EditText editText) {
        this.f880a = new WeakReference(editText);
    }

    @Override // T.i
    public final void a() {
        i.a((EditText) this.f880a.get(), 1);
    }
}
