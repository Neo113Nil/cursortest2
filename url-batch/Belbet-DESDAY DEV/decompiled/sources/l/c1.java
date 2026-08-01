package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0145a;

/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0145a f2966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f2967b;

    public c1(d1 d1Var) {
        this.f2967b = d1Var;
        Context context = d1Var.f2974a.getContext();
        CharSequence charSequence = d1Var.h;
        C0145a c0145a = new C0145a();
        c0145a.f2631e = 4096;
        c0145a.f2633g = 4096;
        c0145a.f2636l = null;
        c0145a.f2637m = null;
        c0145a.f2638n = false;
        c0145a.f2639o = false;
        c0145a.f2640p = 16;
        c0145a.i = context;
        c0145a.f2628a = charSequence;
        this.f2966a = c0145a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d1 d1Var = this.f2967b;
        Window.Callback callback = d1Var.f2981k;
        if (callback == null || !d1Var.f2982l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2966a);
    }
}
