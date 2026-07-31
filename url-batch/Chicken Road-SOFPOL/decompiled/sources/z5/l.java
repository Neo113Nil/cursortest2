package z5;

import android.text.Editable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends r5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f9211d;

    public l(o oVar) {
        this.f9211d = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f9211d.b().a();
    }

    @Override // r5.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        this.f9211d.b().b();
    }
}
