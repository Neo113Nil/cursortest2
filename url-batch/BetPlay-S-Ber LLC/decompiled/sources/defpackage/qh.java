package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qh extends ah {
    public final WeakReference a;

    public qh(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.ah
    public final void a() {
        rh.a((EditText) this.a.get(), 1);
    }
}
