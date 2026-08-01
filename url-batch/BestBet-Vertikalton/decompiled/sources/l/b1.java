package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0177a;

/* loaded from: classes.dex */
public final class b1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0177a f3370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f3371b;

    public b1(c1 c1Var) {
        this.f3371b = c1Var;
        Context context = c1Var.f3374a.getContext();
        CharSequence charSequence = c1Var.h;
        C0177a c0177a = new C0177a();
        c0177a.f3108e = 4096;
        c0177a.f3110g = 4096;
        c0177a.f3113l = null;
        c0177a.f3114m = null;
        c0177a.f3115n = false;
        c0177a.f3116o = false;
        c0177a.f3117p = 16;
        c0177a.i = context;
        c0177a.f3105a = charSequence;
        this.f3370a = c0177a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c1 c1Var = this.f3371b;
        Window.Callback callback = c1Var.f3381k;
        if (callback == null || !c1Var.f3382l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3370a);
    }
}
