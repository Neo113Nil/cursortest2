package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0145a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0145a f2965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2966b;

    public c1(d1 d1Var) {
        this.f2966b = d1Var;
        Context context = d1Var.f2973a.getContext();
        CharSequence charSequence = d1Var.h;
        C0145a c0145a = new C0145a();
        c0145a.f2630e = 4096;
        c0145a.f2632g = 4096;
        c0145a.f2635l = null;
        c0145a.f2636m = null;
        c0145a.f2637n = false;
        c0145a.f2638o = false;
        c0145a.f2639p = 16;
        c0145a.i = context;
        c0145a.f2627a = charSequence;
        this.f2965a = c0145a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2966b;
        Window.Callback callback = d1Var.f2980k;
        if (callback == null || !d1Var.f2981l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2965a);
    }
}
