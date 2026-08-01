package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0295w0;
import l.C0262g;
import l.C0264h;
import l.C0268j;
import l.C0270k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191b extends AbstractViewOnTouchListenerC0295w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3012j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3013k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3013k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0295w0
    public final InterfaceC0187C b() {
        C0262g c0262g;
        switch (this.f3012j) {
            case 0:
                AbstractC0192c abstractC0192c = ((ActionMenuItemView) this.f3013k).f959m;
                if (abstractC0192c == null || (c0262g = ((C0264h) abstractC0192c).f3368a.f3406t) == null) {
                    return null;
                }
                return c0262g.a();
            default:
                C0262g c0262g2 = ((C0268j) this.f3013k).f3385d.f3405s;
                if (c0262g2 == null) {
                    return null;
                }
                return c0262g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0295w0
    public final boolean c() {
        InterfaceC0187C b2;
        switch (this.f3012j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3013k;
                InterfaceC0201l interfaceC0201l = actionMenuItemView.f957k;
                return interfaceC0201l != null && interfaceC0201l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0268j) this.f3013k).f3385d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0295w0
    public boolean d() {
        switch (this.f3012j) {
            case 1:
                C0270k c0270k = ((C0268j) this.f3013k).f3385d;
                if (c0270k.f3407u != null) {
                    return false;
                }
                c0270k.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191b(C0268j c0268j, C0268j c0268j2) {
        super(c0268j2);
        this.f3013k = c0268j;
    }
}
