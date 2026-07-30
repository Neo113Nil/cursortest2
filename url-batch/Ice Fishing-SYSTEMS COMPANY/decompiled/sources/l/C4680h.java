package l;

import N2.C0324j;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.DialogInterfaceC4550i;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4680h implements x, AdapterView.OnItemClickListener {

    /* renamed from: n, reason: collision with root package name */
    public Context f38933n;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f38934u;

    /* renamed from: v, reason: collision with root package name */
    public l f38935v;

    /* renamed from: w, reason: collision with root package name */
    public ExpandedMenuView f38936w;

    /* renamed from: x, reason: collision with root package name */
    public w f38937x;

    /* renamed from: y, reason: collision with root package name */
    public C4679g f38938y;

    public C4680h(ContextWrapper contextWrapper) {
        this.f38933n = contextWrapper;
        this.f38934u = LayoutInflater.from(contextWrapper);
    }

    @Override // l.x
    public final boolean b(n nVar) {
        return false;
    }

    @Override // l.x
    public final boolean c() {
        return false;
    }

    @Override // l.x
    public final void d() {
        C4679g c4679g = this.f38938y;
        if (c4679g != null) {
            c4679g.notifyDataSetChanged();
        }
    }

    @Override // l.x
    public final void e(l lVar, boolean z8) {
        w wVar = this.f38937x;
        if (wVar != null) {
            wVar.e(lVar, z8);
        }
    }

    @Override // l.x
    public final void g(w wVar) {
        throw null;
    }

    @Override // l.x
    public final void h(Context context, l lVar) {
        if (this.f38933n != null) {
            this.f38933n = context;
            if (this.f38934u == null) {
                this.f38934u = LayoutInflater.from(context);
            }
        }
        this.f38935v = lVar;
        C4679g c4679g = this.f38938y;
        if (c4679g != null) {
            c4679g.notifyDataSetChanged();
        }
    }

    @Override // l.x
    public final boolean i(SubMenuC4672D subMenuC4672D) {
        if (!subMenuC4672D.hasVisibleItems()) {
            return false;
        }
        m mVar = new m();
        mVar.f38969n = subMenuC4672D;
        Context context = subMenuC4672D.f38962n;
        G1.a aVar = new G1.a(context);
        C0324j c0324j = (C0324j) aVar.f1195v;
        C4680h c4680h = new C4680h((ContextThemeWrapper) c0324j.f2067v);
        mVar.f38971v = c4680h;
        c4680h.f38937x = mVar;
        subMenuC4672D.b(c4680h, context);
        C4680h c4680h2 = mVar.f38971v;
        if (c4680h2.f38938y == null) {
            c4680h2.f38938y = new C4679g(c4680h2);
        }
        c0324j.f2063B = c4680h2.f38938y;
        c0324j.f2064C = mVar;
        View view = subMenuC4672D.f38953H;
        if (view != null) {
            c0324j.f2071z = view;
        } else {
            c0324j.f2069x = subMenuC4672D.f38952G;
            c0324j.f2070y = subMenuC4672D.f38951F;
        }
        c0324j.f2062A = mVar;
        DialogInterfaceC4550i b9 = aVar.b();
        mVar.f38970u = b9;
        b9.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f38970u.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f38970u.show();
        w wVar = this.f38937x;
        if (wVar == null) {
            return true;
        }
        wVar.g(subMenuC4672D);
        return true;
    }

    @Override // l.x
    public final boolean j(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j9) {
        this.f38935v.q(this.f38938y.getItem(i), this, 0);
    }
}
