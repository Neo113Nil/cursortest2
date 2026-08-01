package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.s1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends s1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2151o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f2152p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2152p = actionMenuItemView;
    }

    @Override // l.s1
    public final c0 b() {
        l.f fVar;
        switch (this.f2151o) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f2152p).f260r;
                if (cVar == null || (fVar = ((l.g) cVar).f2451a.f2479y) == null) {
                    return null;
                }
                return fVar.a();
            default:
                l.f fVar2 = ((l.i) this.f2152p).i.f2478x;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    @Override // l.s1
    public final boolean c() {
        c0 b2;
        switch (this.f2151o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2152p;
                l lVar = actionMenuItemView.f258p;
                return lVar != null && lVar.a(actionMenuItemView.f255m) && (b2 = b()) != null && b2.b();
            default:
                ((l.i) this.f2152p).i.l();
                return true;
        }
    }

    @Override // l.s1
    public boolean d() {
        switch (this.f2151o) {
            case 1:
                l.j jVar = ((l.i) this.f2152p).i;
                if (jVar.f2480z != null) {
                    return false;
                }
                jVar.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l.i iVar, l.i iVar2) {
        super(iVar2);
        this.f2152p = iVar;
    }
}
