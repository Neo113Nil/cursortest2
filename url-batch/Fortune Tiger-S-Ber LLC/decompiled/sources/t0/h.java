package t0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h extends androidx.emoji2.text.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3374a;

    public h(EditText editText) {
        this.f3374a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        i.a((EditText) this.f3374a.get(), 1);
    }
}
