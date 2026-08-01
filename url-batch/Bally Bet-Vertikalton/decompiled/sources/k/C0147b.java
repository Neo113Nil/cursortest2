package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0268w0;
import l.C0235g;
import l.C0237h;
import l.C0241j;
import l.C0243k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147b extends AbstractViewOnTouchListenerC0268w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2624j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2625k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2625k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0268w0
    public final InterfaceC0143C b() {
        C0235g c0235g;
        switch (this.f2624j) {
            case 0:
                AbstractC0148c abstractC0148c = ((ActionMenuItemView) this.f2625k).f1113m;
                if (abstractC0148c == null || (c0235g = ((C0237h) abstractC0148c).f2972a.f3007t) == null) {
                    return null;
                }
                return c0235g.a();
            default:
                C0235g c0235g2 = ((C0241j) this.f2625k).d.f3006s;
                if (c0235g2 == null) {
                    return null;
                }
                return c0235g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0268w0
    public final boolean c() {
        InterfaceC0143C b2;
        switch (this.f2624j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2625k;
                InterfaceC0157l interfaceC0157l = actionMenuItemView.f1111k;
                return interfaceC0157l != null && interfaceC0157l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0241j) this.f2625k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0268w0
    public boolean d() {
        switch (this.f2624j) {
            case 1:
                C0243k c0243k = ((C0241j) this.f2625k).d;
                if (c0243k.f3008u != null) {
                    return false;
                }
                c0243k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147b(C0241j c0241j, C0241j c0241j2) {
        super(c0241j2);
        this.f2625k = c0241j;
    }
}
