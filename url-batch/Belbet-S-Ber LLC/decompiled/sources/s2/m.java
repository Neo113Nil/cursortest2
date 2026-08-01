package s2;

import android.text.Editable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m extends i2.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f3268f;

    public m(p pVar) {
        this.f3268f = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f3268f.b().a();
    }

    @Override // i2.n, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        this.f3268f.b().b();
    }
}
