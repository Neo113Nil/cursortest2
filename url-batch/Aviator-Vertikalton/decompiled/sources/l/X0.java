package l;

import K.InterfaceC0021q;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import g.C0147I;
import java.util.Iterator;
import k.InterfaceC0198k;
import k.MenuC0200m;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC0276o, InterfaceC0198k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3316a;

    public /* synthetic */ X0(Toolbar toolbar) {
        this.f3316a = toolbar;
    }

    @Override // k.InterfaceC0198k
    public void e(MenuC0200m menuC0200m) {
        Toolbar toolbar = this.f3316a;
        C0268k c0268k = toolbar.f1080a.f1040t;
        if (c0268k == null || !c0268k.i()) {
            Iterator it = toolbar.f1066G.f480b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.D) ((InterfaceC0021q) it.next())).f1198a.s();
            }
        }
        C0147I c0147i = toolbar.f1074O;
        if (c0147i != null) {
            c0147i.e(menuC0200m);
        }
    }

    @Override // k.InterfaceC0198k
    public boolean f(MenuC0200m menuC0200m, MenuItem menuItem) {
        C0147I c0147i = this.f3316a.f1074O;
        return false;
    }
}
