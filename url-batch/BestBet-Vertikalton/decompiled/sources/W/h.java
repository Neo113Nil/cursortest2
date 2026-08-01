package W;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends U.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1261a;

    public h(EditText editText) {
        this.f1261a = new WeakReference(editText);
    }

    @Override // U.h
    public final void a() {
        i.a((EditText) this.f1261a.get(), 1);
    }
}
