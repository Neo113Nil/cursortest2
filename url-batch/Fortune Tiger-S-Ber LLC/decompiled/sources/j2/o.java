package j2;

import android.text.Editable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o extends a2.o {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f2331f;

    public o(r rVar) {
        this.f2331f = rVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2331f.b().a();
    }

    @Override // a2.o, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        this.f2331f.b().b();
    }
}
