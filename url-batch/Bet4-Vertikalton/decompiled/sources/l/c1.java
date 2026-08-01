package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0152a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0152a f2896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2897b;

    public c1(d1 d1Var) {
        this.f2897b = d1Var;
        Context context = d1Var.f2898a.getContext();
        CharSequence charSequence = d1Var.h;
        C0152a c0152a = new C0152a();
        c0152a.f2630e = 4096;
        c0152a.f2632g = 4096;
        c0152a.f2635l = null;
        c0152a.f2636m = null;
        c0152a.f2637n = false;
        c0152a.f2638o = false;
        c0152a.f2639p = 16;
        c0152a.i = context;
        c0152a.f2627a = charSequence;
        this.f2896a = c0152a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2897b;
        Window.Callback callback = d1Var.f2905k;
        if (callback == null || !d1Var.f2906l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2896a);
    }
}
