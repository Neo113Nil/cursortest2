package N0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends E0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f671a;

    public m(q qVar) {
        this.f671a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f671a.b().a();
    }

    @Override // E0.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f671a.b().b();
    }
}
