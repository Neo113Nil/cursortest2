package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fql implements View.OnFocusChangeListener {
    public final /* synthetic */ fqt a;
    private final /* synthetic */ int b;

    public /* synthetic */ fql(fqt fqtVar, int i) {
        this.b = i;
        this.a = fqtVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.b;
        fqt fqtVar = this.a;
        if (i != 0) {
            fqe fqeVar = (fqe) fqtVar;
            fqeVar.f(fqeVar.k());
            return;
        }
        fqo fqoVar = (fqo) fqtVar;
        fqoVar.b = z;
        fqtVar.x();
        if (z) {
            return;
        }
        fqoVar.k(false);
        fqoVar.c = false;
    }
}
