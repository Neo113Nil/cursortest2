package O0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends F0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f684a;

    public m(q qVar) {
        this.f684a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f684a.b().a();
    }

    @Override // F0.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f684a.b().b();
    }
}
