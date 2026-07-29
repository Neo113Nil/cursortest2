package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0145a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0145a f2944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2945b;

    public c1(d1 d1Var) {
        this.f2945b = d1Var;
        Context context = d1Var.f2952a.getContext();
        CharSequence charSequence = d1Var.h;
        C0145a c0145a = new C0145a();
        c0145a.f2609e = 4096;
        c0145a.f2611g = 4096;
        c0145a.f2614l = null;
        c0145a.f2615m = null;
        c0145a.f2616n = false;
        c0145a.f2617o = false;
        c0145a.f2618p = 16;
        c0145a.i = context;
        c0145a.f2606a = charSequence;
        this.f2944a = c0145a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2945b;
        Window.Callback callback = d1Var.f2959k;
        if (callback == null || !d1Var.f2960l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2944a);
    }
}
