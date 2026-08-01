package l;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class z2 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final k.a f2617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a3 f2618g;

    public z2(a3 a3Var) {
        this.f2618g = a3Var;
        Context context = a3Var.f2391a.getContext();
        CharSequence charSequence = a3Var.h;
        k.a aVar = new k.a();
        aVar.f2141e = 4096;
        aVar.f2143g = 4096;
        aVar.f2146l = null;
        aVar.f2147m = null;
        aVar.f2148n = false;
        aVar.f2149o = false;
        aVar.f2150p = 16;
        aVar.i = context;
        aVar.f2138a = charSequence;
        this.f2617f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a3 a3Var = this.f2618g;
        Window.Callback callback = a3Var.f2398k;
        if (callback == null || !a3Var.f2399l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2617f);
    }
}
