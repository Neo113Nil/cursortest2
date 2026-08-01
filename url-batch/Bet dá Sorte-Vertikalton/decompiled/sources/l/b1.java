package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0145a;

/* loaded from: classes.dex */
public final class b1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0145a f2934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f2935b;

    public b1(c1 c1Var) {
        this.f2935b = c1Var;
        Context context = c1Var.f2938a.getContext();
        CharSequence charSequence = c1Var.h;
        C0145a c0145a = new C0145a();
        c0145a.f2593e = 4096;
        c0145a.f2595g = 4096;
        c0145a.f2598l = null;
        c0145a.f2599m = null;
        c0145a.f2600n = false;
        c0145a.f2601o = false;
        c0145a.f2602p = 16;
        c0145a.i = context;
        c0145a.f2590a = charSequence;
        this.f2934a = c0145a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c1 c1Var = this.f2935b;
        Window.Callback callback = c1Var.f2945k;
        if (callback == null || !c1Var.f2946l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2934a);
    }
}
