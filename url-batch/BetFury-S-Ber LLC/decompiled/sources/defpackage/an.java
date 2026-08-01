package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class an extends xh0 {
    public final /* synthetic */ dn f;

    public an(dn dnVar) {
        this.f = dnVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f.b().a();
    }

    @Override // defpackage.xh0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f.b().b();
    }
}
