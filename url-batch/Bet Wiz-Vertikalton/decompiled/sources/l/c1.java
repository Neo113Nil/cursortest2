package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0148a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0148a f2957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2958b;

    public c1(d1 d1Var) {
        this.f2958b = d1Var;
        Context context = d1Var.f2959a.getContext();
        CharSequence charSequence = d1Var.h;
        C0148a c0148a = new C0148a();
        c0148a.f2606e = 4096;
        c0148a.f2608g = 4096;
        c0148a.f2611l = null;
        c0148a.f2612m = null;
        c0148a.f2613n = false;
        c0148a.f2614o = false;
        c0148a.f2615p = 16;
        c0148a.i = context;
        c0148a.f2603a = charSequence;
        this.f2957a = c0148a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2958b;
        Window.Callback callback = d1Var.f2966k;
        if (callback == null || !d1Var.f2967l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2957a);
    }
}
