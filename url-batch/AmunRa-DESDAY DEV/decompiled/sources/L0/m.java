package L0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends C0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f522a;

    public m(q qVar) {
        this.f522a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f522a.b().a();
    }

    @Override // C0.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f522a.b().b();
    }
}
