package k;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y2 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final j.a f2692f;
    public final /* synthetic */ z2 g;

    public y2(z2 z2Var) {
        this.g = z2Var;
        Context context = z2Var.f2699a.getContext();
        CharSequence charSequence = z2Var.h;
        j.a aVar = new j.a();
        aVar.f2122e = 4096;
        aVar.g = 4096;
        aVar.f2127l = null;
        aVar.f2128m = null;
        aVar.f2129n = false;
        aVar.f2130o = false;
        aVar.f2131p = 16;
        aVar.f2124i = context;
        aVar.f2119a = charSequence;
        this.f2692f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z2 z2Var = this.g;
        Window.Callback callback = z2Var.f2706k;
        if (callback == null || !z2Var.f2707l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2692f);
    }
}
