package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0239v0;
import l.C0208g;
import l.C0210h;
import l.C0214j;
import l.C0216k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153b extends AbstractViewOnTouchListenerC0239v0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2640j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2641k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2641k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0239v0
    public final InterfaceC0149C b() {
        C0208g c0208g;
        switch (this.f2640j) {
            case 0:
                AbstractC0154c abstractC0154c = ((ActionMenuItemView) this.f2641k).f1230m;
                if (abstractC0154c == null || (c0208g = ((C0210h) abstractC0154c).f2913a.f2948t) == null) {
                    return null;
                }
                return c0208g.a();
            default:
                C0208g c0208g2 = ((C0214j) this.f2641k).d.f2947s;
                if (c0208g2 == null) {
                    return null;
                }
                return c0208g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0239v0
    public final boolean c() {
        InterfaceC0149C b2;
        switch (this.f2640j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2641k;
                InterfaceC0163l interfaceC0163l = actionMenuItemView.f1228k;
                return interfaceC0163l != null && interfaceC0163l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0214j) this.f2641k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0239v0
    public boolean d() {
        switch (this.f2640j) {
            case 1:
                C0216k c0216k = ((C0214j) this.f2641k).d;
                if (c0216k.f2949u != null) {
                    return false;
                }
                c0216k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153b(C0214j c0214j, C0214j c0214j2) {
        super(c0214j2);
        this.f2641k = c0214j;
    }
}
