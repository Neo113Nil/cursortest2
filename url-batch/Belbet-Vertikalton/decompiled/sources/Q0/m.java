package Q0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends H0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1035a;

    public m(q qVar) {
        this.f1035a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1035a.b().a();
    }

    @Override // H0.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1035a.b().b();
    }
}
