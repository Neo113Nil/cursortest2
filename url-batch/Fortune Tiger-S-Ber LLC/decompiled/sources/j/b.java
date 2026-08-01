package j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.s1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends s1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2132o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f2133p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2133p = actionMenuItemView;
    }

    @Override // k.s1
    public final c0 b() {
        k.g gVar;
        switch (this.f2132o) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f2133p).f153r;
                if (cVar == null || (gVar = ((k.h) cVar).f2553a.f2584y) == null) {
                    return null;
                }
                return gVar.a();
            default:
                k.g gVar2 = ((k.j) this.f2133p).f2557i.f2583x;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    @Override // k.s1
    public final boolean c() {
        c0 b2;
        switch (this.f2132o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2133p;
                l lVar = actionMenuItemView.f151p;
                return lVar != null && lVar.c(actionMenuItemView.f148m) && (b2 = b()) != null && b2.b();
            default:
                ((k.j) this.f2133p).f2557i.l();
                return true;
        }
    }

    @Override // k.s1
    public boolean d() {
        switch (this.f2132o) {
            case 1:
                k.k kVar = ((k.j) this.f2133p).f2557i;
                if (kVar.f2585z != null) {
                    return false;
                }
                kVar.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k.j jVar, k.j jVar2) {
        super(jVar2);
        this.f2133p = jVar;
    }
}
