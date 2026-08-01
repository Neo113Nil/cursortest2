package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class mk extends y80 {
    public final /* synthetic */ pk f;

    public mk(pk pkVar) {
        this.f = pkVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f.b().a();
    }

    @Override // defpackage.y80, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f.b().b();
    }
}
