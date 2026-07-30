package m;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import n.AbstractViewOnTouchListenerC0748z0;
import n.C0708f;
import n.C0710g;
import n.C0714i;
import n.C0716j;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677b extends AbstractViewOnTouchListenerC0748z0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6361r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f6362s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f6362s = actionMenuItemView;
    }

    @Override // n.AbstractViewOnTouchListenerC0748z0
    public final InterfaceC0675D b() {
        C0708f c0708f;
        switch (this.f6361r) {
            case 0:
                AbstractC0678c abstractC0678c = ((ActionMenuItemView) this.f6362s).f3113u;
                if (abstractC0678c == null || (c0708f = ((C0710g) abstractC0678c).f6782a.f6794B) == null) {
                    return null;
                }
                return c0708f.a();
            default:
                C0708f c0708f2 = ((C0714i) this.f6362s).f6785l.f6793A;
                if (c0708f2 == null) {
                    return null;
                }
                return c0708f2.a();
        }
    }

    @Override // n.AbstractViewOnTouchListenerC0748z0
    public final boolean c() {
        InterfaceC0675D b7;
        switch (this.f6361r) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f6362s;
                l lVar = actionMenuItemView.f3111s;
                return lVar != null && lVar.b(actionMenuItemView.f3108p) && (b7 = b()) != null && b7.b();
            default:
                ((C0714i) this.f6362s).f6785l.l();
                return true;
        }
    }

    @Override // n.AbstractViewOnTouchListenerC0748z0
    public boolean d() {
        switch (this.f6361r) {
            case 1:
                C0716j c0716j = ((C0714i) this.f6362s).f6785l;
                if (c0716j.f6795C != null) {
                    return false;
                }
                c0716j.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677b(C0714i c0714i, C0714i c0714i2) {
        super(c0714i2);
        this.f6362s = c0714i;
    }
}
