package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.v1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends v1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1997o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f1998p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1998p = actionMenuItemView;
    }

    @Override // l.v1
    public final c0 b() {
        l.g gVar;
        switch (this.f1997o) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f1998p).f127r;
                if (cVar == null || (gVar = ((l.h) cVar).f2320a.f2378z) == null) {
                    return null;
                }
                return gVar.a();
            default:
                l.g gVar2 = ((l.j) this.f1998p).i.f2377y;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    @Override // l.v1
    public final boolean c() {
        c0 b4;
        switch (this.f1997o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1998p;
                l lVar = actionMenuItemView.f125p;
                return lVar != null && lVar.a(actionMenuItemView.f122m) && (b4 = b()) != null && b4.b();
            default:
                ((l.j) this.f1998p).i.n();
                return true;
        }
    }

    @Override // l.v1
    public boolean d() {
        switch (this.f1997o) {
            case 1:
                l.l lVar = ((l.j) this.f1998p).i;
                if (lVar.A != null) {
                    return false;
                }
                lVar.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l.j jVar, l.j jVar2) {
        super(jVar2);
        this.f1998p = jVar;
    }
}
