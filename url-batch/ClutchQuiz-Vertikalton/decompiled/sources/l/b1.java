package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0155a;

/* loaded from: classes.dex */
public final class b1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0155a f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f2950b;

    public b1(c1 c1Var) {
        this.f2950b = c1Var;
        Context context = c1Var.f2953a.getContext();
        CharSequence charSequence = c1Var.h;
        C0155a c0155a = new C0155a();
        c0155a.f2691e = 4096;
        c0155a.f2693g = 4096;
        c0155a.f2696l = null;
        c0155a.f2697m = null;
        c0155a.f2698n = false;
        c0155a.f2699o = false;
        c0155a.f2700p = 16;
        c0155a.i = context;
        c0155a.f2688a = charSequence;
        this.f2949a = c0155a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c1 c1Var = this.f2950b;
        Window.Callback callback = c1Var.f2960k;
        if (callback == null || !c1Var.f2961l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2949a);
    }
}
