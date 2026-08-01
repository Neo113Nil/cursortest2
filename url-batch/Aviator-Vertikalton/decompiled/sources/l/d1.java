package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0188a;

/* loaded from: classes.dex */
public final class d1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0188a f3343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f3344b;

    public d1(e1 e1Var) {
        this.f3344b = e1Var;
        Context context = e1Var.f3352a.getContext();
        CharSequence charSequence = e1Var.h;
        C0188a c0188a = new C0188a();
        c0188a.f2998e = 4096;
        c0188a.f3000g = 4096;
        c0188a.f3003l = null;
        c0188a.f3004m = null;
        c0188a.f3005n = false;
        c0188a.f3006o = false;
        c0188a.f3007p = 16;
        c0188a.i = context;
        c0188a.f2994a = charSequence;
        this.f3343a = c0188a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e1 e1Var = this.f3344b;
        Window.Callback callback = e1Var.f3360k;
        if (callback == null || !e1Var.f3361l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3343a);
    }
}
