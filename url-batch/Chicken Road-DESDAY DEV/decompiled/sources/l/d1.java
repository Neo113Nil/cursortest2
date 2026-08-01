package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C0149a;

/* loaded from: classes.dex */
public final class d1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0149a f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f2905b;

    public d1(e1 e1Var) {
        this.f2905b = e1Var;
        Context context = e1Var.f2906a.getContext();
        CharSequence charSequence = e1Var.h;
        C0149a c0149a = new C0149a();
        c0149a.f2557e = 4096;
        c0149a.f2559g = 4096;
        c0149a.f2562l = null;
        c0149a.f2563m = null;
        c0149a.f2564n = false;
        c0149a.f2565o = false;
        c0149a.f2566p = 16;
        c0149a.i = context;
        c0149a.f2554a = charSequence;
        this.f2904a = c0149a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e1 e1Var = this.f2905b;
        Window.Callback callback = e1Var.f2913k;
        if (callback == null || !e1Var.f2914l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2904a);
    }
}
