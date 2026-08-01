package M0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends D0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f614a;

    public m(q qVar) {
        this.f614a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f614a.b().a();
    }

    @Override // D0.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f614a.b().b();
    }
}
