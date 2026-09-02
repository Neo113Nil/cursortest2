package o2;

import android.text.Editable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l extends e2.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f2906f;

    public l(o oVar) {
        this.f2906f = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2906f.b().a();
    }

    @Override // e2.n, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        this.f2906f.b().b();
    }
}
