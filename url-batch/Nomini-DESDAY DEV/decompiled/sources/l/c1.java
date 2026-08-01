package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0145a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0145a f2943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2944b;

    public c1(d1 d1Var) {
        this.f2944b = d1Var;
        Context context = d1Var.f2951a.getContext();
        CharSequence charSequence = d1Var.h;
        C0145a c0145a = new C0145a();
        c0145a.f2608e = 4096;
        c0145a.f2610g = 4096;
        c0145a.f2613l = null;
        c0145a.f2614m = null;
        c0145a.f2615n = false;
        c0145a.f2616o = false;
        c0145a.f2617p = 16;
        c0145a.i = context;
        c0145a.f2605a = charSequence;
        this.f2943a = c0145a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2944b;
        Window.Callback callback = d1Var.f2958k;
        if (callback == null || !d1Var.f2959l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2943a);
    }
}
