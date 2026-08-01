package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0242u0;
import l.C0213g;
import l.C0215h;
import l.C0219j;
import l.C0221k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156b extends AbstractViewOnTouchListenerC0242u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2701j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2702k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2702k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0242u0
    public final InterfaceC0152C b() {
        C0213g c0213g;
        switch (this.f2701j) {
            case 0:
                AbstractC0157c abstractC0157c = ((ActionMenuItemView) this.f2702k).f1250m;
                if (abstractC0157c == null || (c0213g = ((C0215h) abstractC0157c).f2978a.f3003t) == null) {
                    return null;
                }
                return c0213g.a();
            default:
                C0213g c0213g2 = ((C0219j) this.f2702k).d.f3002s;
                if (c0213g2 == null) {
                    return null;
                }
                return c0213g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0242u0
    public final boolean c() {
        InterfaceC0152C b2;
        switch (this.f2701j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2702k;
                InterfaceC0166l interfaceC0166l = actionMenuItemView.f1248k;
                return interfaceC0166l != null && interfaceC0166l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0219j) this.f2702k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0242u0
    public boolean d() {
        switch (this.f2701j) {
            case 1:
                C0221k c0221k = ((C0219j) this.f2702k).d;
                if (c0221k.f3004u != null) {
                    return false;
                }
                c0221k.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156b(C0219j c0219j, C0219j c0219j2) {
        super(c0219j2);
        this.f2702k = c0219j;
    }
}
