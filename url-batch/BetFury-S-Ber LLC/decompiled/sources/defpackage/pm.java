package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pm extends xl {
    public final WeakReference a;

    public pm(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.xl
    public final void a() {
        qm.a((EditText) this.a.get(), 1);
    }
}
