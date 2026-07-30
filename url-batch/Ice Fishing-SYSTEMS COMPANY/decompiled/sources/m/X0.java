package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import l.C4673a;

/* loaded from: classes.dex */
public final class X0 implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final C4673a f39350n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y0 f39351u;

    public X0(Y0 y02) {
        this.f39351u = y02;
        Context context = y02.f39353a.getContext();
        CharSequence charSequence = y02.f39360h;
        C4673a c4673a = new C4673a();
        c4673a.f38897x = 4096;
        c4673a.f38899z = 4096;
        c4673a.f38888E = null;
        c4673a.f38889F = null;
        c4673a.f38890G = false;
        c4673a.f38891H = false;
        c4673a.f38892I = 16;
        c4673a.f38885B = context;
        c4673a.f38893n = charSequence;
        this.f39350n = c4673a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y0 y02 = this.f39351u;
        Window.Callback callback = y02.f39362k;
        if (callback == null || !y02.f39363l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f39350n);
    }
}
