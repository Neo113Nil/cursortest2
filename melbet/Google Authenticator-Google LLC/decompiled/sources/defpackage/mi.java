package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mi implements View.OnClickListener {
    final fq a;
    final /* synthetic */ mk b;

    public mi(mk mkVar) {
        this.b = mkVar;
        this.a = new fq(mkVar.a.getContext(), mkVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mk mkVar = this.b;
        Window.Callback callback = mkVar.d;
        if (callback == null || !mkVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
