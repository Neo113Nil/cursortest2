package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0103b;
import g.DialogInterfaceC0107f;

/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2754a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2755b;

    /* renamed from: c, reason: collision with root package name */
    public m f2756c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public x f2757e;

    /* renamed from: f, reason: collision with root package name */
    public C0170h f2758f;

    public i(ContextWrapper contextWrapper) {
        this.f2754a = contextWrapper;
        this.f2755b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.y
    public final void b(m mVar, boolean z2) {
        x xVar = this.f2757e;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    @Override // k.y
    public final void c() {
        C0170h c0170h = this.f2758f;
        if (c0170h != null) {
            c0170h.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // k.y
    public final boolean e(SubMenuC0162E subMenuC0162E) {
        if (!subMenuC0162E.hasVisibleItems()) {
            return false;
        }
        n nVar = new n();
        nVar.f2786a = subMenuC0162E;
        Context context = subMenuC0162E.f2765a;
        J.i iVar = new J.i(context);
        C0103b c0103b = (C0103b) iVar.f374b;
        i iVar2 = new i(c0103b.f2284a);
        nVar.f2788c = iVar2;
        iVar2.f2757e = nVar;
        subMenuC0162E.b(iVar2, context);
        i iVar3 = nVar.f2788c;
        if (iVar3.f2758f == null) {
            iVar3.f2758f = new C0170h(iVar3);
        }
        c0103b.f2289g = iVar3.f2758f;
        c0103b.h = nVar;
        View view = subMenuC0162E.f2776o;
        if (view != null) {
            c0103b.f2287e = view;
        } else {
            c0103b.f2286c = subMenuC0162E.f2775n;
            c0103b.d = subMenuC0162E.f2774m;
        }
        c0103b.f2288f = nVar;
        DialogInterfaceC0107f d = iVar.d();
        nVar.f2787b = d;
        d.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f2787b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f2787b.show();
        x xVar = this.f2757e;
        if (xVar == null) {
            return true;
        }
        xVar.f(subMenuC0162E);
        return true;
    }

    @Override // k.y
    public final void g(x xVar) {
        throw null;
    }

    @Override // k.y
    public final boolean h(o oVar) {
        return false;
    }

    @Override // k.y
    public final void j(Context context, m mVar) {
        if (this.f2754a != null) {
            this.f2754a = context;
            if (this.f2755b == null) {
                this.f2755b = LayoutInflater.from(context);
            }
        }
        this.f2756c = mVar;
        C0170h c0170h = this.f2758f;
        if (c0170h != null) {
            c0170h.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2756c.q(this.f2758f.getItem(i), this, 0);
    }
}
