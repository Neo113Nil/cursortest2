package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0145a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0145a f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2962b;

    public c1(d1 d1Var) {
        this.f2962b = d1Var;
        Context context = d1Var.f2969a.getContext();
        CharSequence charSequence = d1Var.h;
        C0145a c0145a = new C0145a();
        c0145a.f2626e = 4096;
        c0145a.f2628g = 4096;
        c0145a.f2631l = null;
        c0145a.f2632m = null;
        c0145a.f2633n = false;
        c0145a.f2634o = false;
        c0145a.f2635p = 16;
        c0145a.i = context;
        c0145a.f2623a = charSequence;
        this.f2961a = c0145a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2962b;
        Window.Callback callback = d1Var.f2976k;
        if (callback == null || !d1Var.f2977l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2961a);
    }
}
