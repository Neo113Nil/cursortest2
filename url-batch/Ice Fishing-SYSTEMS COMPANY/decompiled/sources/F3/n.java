package F3;

import android.text.Editable;

/* loaded from: classes2.dex */
public final class n extends w3.j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f1055n;

    public n(r rVar) {
        this.f1055n = rVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1055n.b().a();
    }

    @Override // w3.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i9) {
        this.f1055n.b().b();
    }
}
