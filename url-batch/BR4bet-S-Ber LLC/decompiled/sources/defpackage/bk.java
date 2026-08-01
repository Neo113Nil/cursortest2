package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class bk extends jj {
    public final WeakReference a;

    public bk(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.jj
    public final void a() {
        ck.a((EditText) this.a.get(), 1);
    }
}
