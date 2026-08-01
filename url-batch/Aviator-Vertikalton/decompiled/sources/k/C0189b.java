package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0295x0;
import l.C0260g;
import l.C0262h;
import l.C0266j;
import l.C0268k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189b extends AbstractViewOnTouchListenerC0295x0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3008j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3009k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3009k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0295x0
    public final InterfaceC0185C b() {
        C0260g c0260g;
        switch (this.f3008j) {
            case 0:
                AbstractC0190c abstractC0190c = ((ActionMenuItemView) this.f3009k).f958m;
                if (abstractC0190c == null || (c0260g = ((C0262h) abstractC0190c).f3368a.f3403t) == null) {
                    return null;
                }
                return c0260g.a();
            default:
                C0260g c0260g2 = ((C0266j) this.f3009k).f3371d.f3402s;
                if (c0260g2 == null) {
                    return null;
                }
                return c0260g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0295x0
    public final boolean c() {
        InterfaceC0185C b2;
        switch (this.f3008j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3009k;
                InterfaceC0199l interfaceC0199l = actionMenuItemView.f956k;
                return interfaceC0199l != null && interfaceC0199l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0266j) this.f3009k).f3371d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0295x0
    public boolean d() {
        switch (this.f3008j) {
            case 1:
                C0268k c0268k = ((C0266j) this.f3009k).f3371d;
                if (c0268k.f3404u != null) {
                    return false;
                }
                c0268k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189b(C0266j c0266j, C0266j c0266j2) {
        super(c0266j2);
        this.f3009k = c0266j;
    }
}
