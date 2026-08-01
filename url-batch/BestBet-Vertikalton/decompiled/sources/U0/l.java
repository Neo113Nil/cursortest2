package U0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class l extends L0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1163a;

    public l(p pVar) {
        this.f1163a = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1163a.b().a();
    }

    @Override // L0.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1163a.b().b();
    }
}
