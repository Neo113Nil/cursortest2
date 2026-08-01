package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import l.C0157a;

/* loaded from: classes.dex */
public final class i1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0157a f3105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f3106b;

    public i1(j1 j1Var) {
        this.f3106b = j1Var;
        Context context = j1Var.f3110a.getContext();
        CharSequence charSequence = j1Var.f3116h;
        C0157a c0157a = new C0157a();
        c0157a.f2758e = 4096;
        c0157a.f2760g = 4096;
        c0157a.f2764l = null;
        c0157a.f2765m = null;
        c0157a.f2766n = false;
        c0157a.f2767o = false;
        c0157a.f2768p = 16;
        c0157a.i = context;
        c0157a.f2755a = charSequence;
        this.f3105a = c0157a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j1 j1Var = this.f3106b;
        Window.Callback callback = j1Var.f3118k;
        if (callback == null || !j1Var.f3119l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3105a);
    }
}
