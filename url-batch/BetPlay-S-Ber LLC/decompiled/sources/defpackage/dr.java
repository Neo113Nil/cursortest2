package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class dr implements ru, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public au h;
    public ExpandedMenuView i;
    public qu j;
    public cr k;

    public dr(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.ru
    public final void a(au auVar, boolean z) {
        qu quVar = this.j;
        if (quVar != null) {
            quVar.a(auVar, z);
        }
    }

    @Override // defpackage.ru
    public final boolean c(eu euVar) {
        return false;
    }

    @Override // defpackage.ru
    public final void e(qu quVar) {
        throw null;
    }

    @Override // defpackage.ru
    public final boolean f(eu euVar) {
        return false;
    }

    @Override // defpackage.ru
    public final void g() {
        cr crVar = this.k;
        if (crVar != null) {
            crVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ru
    public final void i(Context context, au auVar) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = auVar;
        cr crVar = this.k;
        if (crVar != null) {
            crVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ru
    public final boolean j(v40 v40Var) {
        boolean hasVisibleItems = v40Var.hasVisibleItems();
        Context context = v40Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        bu buVar = new bu();
        buVar.f = v40Var;
        v2 v2Var = new v2(context);
        r2 r2Var = (r2) v2Var.b;
        dr drVar = new dr(r2Var.a);
        buVar.h = drVar;
        drVar.j = buVar;
        v40Var.b(drVar, context);
        dr drVar2 = buVar.h;
        if (drVar2.k == null) {
            drVar2.k = new cr(drVar2);
        }
        r2Var.k = drVar2.k;
        r2Var.l = buVar;
        View view = v40Var.o;
        if (view != null) {
            r2Var.e = view;
        } else {
            r2Var.c = v40Var.n;
            r2Var.d = v40Var.m;
        }
        r2Var.j = buVar;
        w2 a = v2Var.a();
        buVar.g = a;
        a.setOnDismissListener(buVar);
        WindowManager.LayoutParams attributes = buVar.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        buVar.g.show();
        qu quVar = this.j;
        if (quVar == null) {
            return true;
        }
        quVar.s(v40Var);
        return true;
    }

    @Override // defpackage.ru
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
