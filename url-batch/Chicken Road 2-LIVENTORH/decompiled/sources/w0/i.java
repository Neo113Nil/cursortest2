package w0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends androidx.emoji2.text.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3572a;

    public i(EditText editText) {
        this.f3572a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        j.a((EditText) this.f3572a.get(), 1);
    }
}
