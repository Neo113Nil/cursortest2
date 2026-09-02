package l;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c3 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final k.a f2263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d3 f2264g;

    public c3(d3 d3Var) {
        this.f2264g = d3Var;
        Context context = d3Var.f2269a.getContext();
        CharSequence charSequence = d3Var.f2275h;
        k.a aVar = new k.a();
        aVar.f1986e = 4096;
        aVar.f1988g = 4096;
        aVar.f1992l = null;
        aVar.f1993m = null;
        aVar.f1994n = false;
        aVar.f1995o = false;
        aVar.f1996p = 16;
        aVar.i = context;
        aVar.f1983a = charSequence;
        this.f2263f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d3 d3Var = this.f2264g;
        Window.Callback callback = d3Var.f2277k;
        if (callback == null || !d3Var.f2278l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2263f);
    }
}
