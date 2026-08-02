package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dp implements ff {
    final /* synthetic */ dy a;
    private final ff b;

    public dp(dy dyVar, ff ffVar) {
        this.a = dyVar;
        this.b = ffVar;
    }

    @Override // defpackage.ff
    public final void a(fg fgVar) {
        fi fiVar = (fi) this.b;
        fiVar.a.onDestroyActionMode(fiVar.e(fgVar));
        dy dyVar = this.a;
        if (dyVar.t != null) {
            dyVar.l.getDecorView().removeCallbacks(dyVar.u);
        }
        if (dyVar.s != null) {
            dyVar.C();
            brn s = yq.s(dyVar.s);
            s.N(0.0f);
            dyVar.M = s;
            dyVar.M.P(new C0000do(this));
        }
        dj djVar = dyVar.n;
        if (djVar != null) {
            djVar.j(dyVar.r);
        }
        dyVar.r = null;
        ViewGroup viewGroup = dyVar.x;
        int i = yq.a;
        viewGroup.requestApplyInsets();
        dyVar.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff
    public final boolean b(fg fgVar, MenuItem menuItem) {
        fi fiVar = (fi) this.b;
        return fiVar.a.onActionItemClicked(fiVar.e(fgVar), new gk(fiVar.b, menuItem));
    }

    @Override // defpackage.ff
    public final boolean c(fg fgVar, Menu menu) {
        fi fiVar = (fi) this.b;
        return fiVar.a.onCreateActionMode(fiVar.e(fgVar), fiVar.f(menu));
    }

    @Override // defpackage.ff
    public final void d(fg fgVar, Menu menu) {
        ViewGroup viewGroup = this.a.x;
        int i = yq.a;
        viewGroup.requestApplyInsets();
        fi fiVar = (fi) this.b;
        fiVar.a.onPrepareActionMode(fiVar.e(fgVar), fiVar.f(menu));
    }
}
