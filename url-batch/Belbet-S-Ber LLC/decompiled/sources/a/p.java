package a;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f68f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f69g;
    public final /* synthetic */ l0 h;
    public final /* synthetic */ g.i i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f70j;

    public /* synthetic */ p(s sVar, l0 l0Var, l0 l0Var2, g.i iVar, View view) {
        this.f68f = sVar;
        this.f69g = l0Var;
        this.h = l0Var2;
        this.i = iVar;
        this.f70j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.i.getWindow();
        i3.d.d(window, "getWindow(...)");
        l0 l0Var = this.f69g;
        h3.l lVar = l0Var.f46c;
        View view = this.f70j;
        Resources resources = view.getResources();
        i3.d.d(resources, "getResources(...)");
        boolean booleanValue = ((Boolean) lVar.b(resources)).booleanValue();
        l0 l0Var2 = this.h;
        h3.l lVar2 = l0Var2.f46c;
        Resources resources2 = view.getResources();
        i3.d.d(resources2, "getResources(...)");
        this.f68f.b(l0Var, l0Var2, window, view, booleanValue, ((Boolean) lVar2.b(resources2)).booleanValue());
    }
}
