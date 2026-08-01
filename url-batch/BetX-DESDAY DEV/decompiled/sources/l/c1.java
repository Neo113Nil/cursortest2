package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0190a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0190a f3343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f3344b;

    public c1(d1 d1Var) {
        this.f3344b = d1Var;
        Context context = d1Var.f3352a.getContext();
        CharSequence charSequence = d1Var.h;
        C0190a c0190a = new C0190a();
        c0190a.f3002e = 4096;
        c0190a.f3004g = 4096;
        c0190a.f3007l = null;
        c0190a.f3008m = null;
        c0190a.f3009n = false;
        c0190a.f3010o = false;
        c0190a.f3011p = 16;
        c0190a.i = context;
        c0190a.f2998a = charSequence;
        this.f3343a = c0190a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f3344b;
        Window.Callback callback = d1Var.f3360k;
        if (callback == null || !d1Var.f3361l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3343a);
    }
}
