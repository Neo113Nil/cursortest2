package defpackage;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class yh extends ih {
    public final WeakReference a;

    public yh(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.ih
    public final void a() {
        zh.a((EditText) this.a.get(), 1);
    }
}
