package n;

import android.content.Context;
import android.view.View;
import android.view.Window;
import m.C0217a;

/* loaded from: classes.dex */
public final class h1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0217a f3630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f3631b;

    public h1(i1 i1Var) {
        this.f3631b = i1Var;
        Context context = i1Var.f3637a.getContext();
        CharSequence charSequence = i1Var.f3643h;
        C0217a c0217a = new C0217a();
        c0217a.e = 4096;
        c0217a.f3295g = 4096;
        c0217a.f3298l = null;
        c0217a.f3299m = null;
        c0217a.f3300n = false;
        c0217a.f3301o = false;
        c0217a.f3302p = 16;
        c0217a.i = context;
        c0217a.f3290a = charSequence;
        this.f3630a = c0217a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i1 i1Var = this.f3631b;
        Window.Callback callback = i1Var.f3644k;
        if (callback == null || !i1Var.f3645l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3630a);
    }
}
