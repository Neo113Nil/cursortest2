package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fi implements ff {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final qy d = new qy(0);

    public fi(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.ff
    public final void a(fg fgVar) {
        throw null;
    }

    @Override // defpackage.ff
    public final boolean b(fg fgVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.ff
    public final boolean c(fg fgVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.ff
    public final void d(fg fgVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(fg fgVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fj fjVar = (fj) arrayList.get(i);
            if (fjVar != null && fjVar.b == fgVar) {
                return fjVar;
            }
        }
        fj fjVar2 = new fj(this.b, fgVar);
        arrayList.add(fjVar2);
        return fjVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        qy qyVar = this.d;
        Menu menu2 = (Menu) qyVar.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        gs gsVar = new gs(this.b, menu);
        qyVar.put(menu, gsVar);
        return gsVar;
    }
}
