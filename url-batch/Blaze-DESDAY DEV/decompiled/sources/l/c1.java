package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0154a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0154a f2921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2922b;

    public c1(d1 d1Var) {
        this.f2922b = d1Var;
        Context context = d1Var.f2923a.getContext();
        CharSequence charSequence = d1Var.h;
        C0154a c0154a = new C0154a();
        c0154a.f2658e = 4096;
        c0154a.f2660g = 4096;
        c0154a.f2663l = null;
        c0154a.f2664m = null;
        c0154a.f2665n = false;
        c0154a.f2666o = false;
        c0154a.f2667p = 16;
        c0154a.i = context;
        c0154a.f2655a = charSequence;
        this.f2921a = c0154a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2922b;
        Window.Callback callback = d1Var.f2930k;
        if (callback == null || !d1Var.f2931l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2921a);
    }
}
