package K0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends B0.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f514a;

    public m(q qVar) {
        this.f514a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f514a.b().a();
    }

    @Override // B0.n, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f514a.b().b();
    }
}
