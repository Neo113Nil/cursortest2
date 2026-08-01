package V;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends T.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f867a;

    public h(EditText editText) {
        this.f867a = new WeakReference(editText);
    }

    @Override // T.h
    public final void a() {
        i.a((EditText) this.f867a.get(), 1);
    }
}
