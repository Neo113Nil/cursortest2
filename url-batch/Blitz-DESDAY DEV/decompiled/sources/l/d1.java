package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0163a;

/* loaded from: classes.dex */
public final class d1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0163a f2977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f2978b;

    public d1(e1 e1Var) {
        this.f2978b = e1Var;
        Context context = e1Var.f2979a.getContext();
        CharSequence charSequence = e1Var.h;
        C0163a c0163a = new C0163a();
        c0163a.f2710e = 4096;
        c0163a.f2712g = 4096;
        c0163a.f2715l = null;
        c0163a.f2716m = null;
        c0163a.f2717n = false;
        c0163a.f2718o = false;
        c0163a.f2719p = 16;
        c0163a.i = context;
        c0163a.f2707a = charSequence;
        this.f2977a = c0163a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e1 e1Var = this.f2978b;
        Window.Callback callback = e1Var.f2986k;
        if (callback == null || !e1Var.f2987l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2977a);
    }
}
