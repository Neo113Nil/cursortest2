package n;

import android.content.Context;
import android.view.View;
import android.view.Window;
import m.C0676a;

/* loaded from: classes.dex */
public final class r1 implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final C0676a f6877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f6878e;

    public r1(s1 s1Var) {
        this.f6878e = s1Var;
        Context context = s1Var.f6886a.getContext();
        CharSequence charSequence = s1Var.f6893h;
        C0676a c0676a = new C0676a();
        c0676a.f6350e = 4096;
        c0676a.f6352g = 4096;
        c0676a.f6356l = null;
        c0676a.f6357m = null;
        c0676a.f6358n = false;
        c0676a.f6359o = false;
        c0676a.f6360p = 16;
        c0676a.f6354i = context;
        c0676a.f6346a = charSequence;
        this.f6877d = c0676a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s1 s1Var = this.f6878e;
        Window.Callback callback = s1Var.f6895k;
        if (callback == null || !s1Var.f6896l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f6877d);
    }
}
