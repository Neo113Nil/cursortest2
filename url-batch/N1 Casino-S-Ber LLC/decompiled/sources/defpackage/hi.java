package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class hi extends r50 {
    public final /* synthetic */ ki f;

    public hi(ki kiVar) {
        this.f = kiVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f.b().a();
    }

    @Override // defpackage.r50, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f.b().b();
    }
}
