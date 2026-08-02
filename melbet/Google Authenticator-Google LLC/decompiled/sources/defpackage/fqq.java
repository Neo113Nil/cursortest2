package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fqq extends fjv {
    final /* synthetic */ fqs a;

    public fqq(fqs fqsVar) {
        this.a = fqsVar;
    }

    @Override // defpackage.fjv, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.fjv, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
