package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0146a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0146a f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2950b;

    public c1(d1 d1Var) {
        this.f2950b = d1Var;
        Context context = d1Var.f2957a.getContext();
        CharSequence charSequence = d1Var.h;
        C0146a c0146a = new C0146a();
        c0146a.f2614e = 4096;
        c0146a.f2616g = 4096;
        c0146a.f2619l = null;
        c0146a.f2620m = null;
        c0146a.f2621n = false;
        c0146a.f2622o = false;
        c0146a.f2623p = 16;
        c0146a.i = context;
        c0146a.f2611a = charSequence;
        this.f2949a = c0146a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2950b;
        Window.Callback callback = d1Var.f2964k;
        if (callback == null || !d1Var.f2965l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2949a);
    }
}
