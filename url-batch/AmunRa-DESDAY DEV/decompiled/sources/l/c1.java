package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0146a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0146a f3044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f3045b;

    public c1(d1 d1Var) {
        this.f3045b = d1Var;
        Context context = d1Var.f3052a.getContext();
        CharSequence charSequence = d1Var.h;
        C0146a c0146a = new C0146a();
        c0146a.f2547e = 4096;
        c0146a.f2549g = 4096;
        c0146a.f2552l = null;
        c0146a.f2553m = null;
        c0146a.f2554n = false;
        c0146a.f2555o = false;
        c0146a.f2556p = 16;
        c0146a.i = context;
        c0146a.f2544a = charSequence;
        this.f3044a = c0146a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f3045b;
        Window.Callback callback = d1Var.f3059k;
        if (callback == null || !d1Var.f3060l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3044a);
    }
}
