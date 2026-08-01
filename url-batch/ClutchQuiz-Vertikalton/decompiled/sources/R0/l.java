package R0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class l extends I0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f683a;

    public l(p pVar) {
        this.f683a = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f683a.b().a();
    }

    @Override // I0.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f683a.b().b();
    }
}
