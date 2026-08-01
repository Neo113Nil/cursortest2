package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0248v0;
import l.C0217g;
import l.C0219h;
import l.C0223j;
import l.C0225k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149b extends AbstractViewOnTouchListenerC0248v0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2616j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2617k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2617k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0248v0
    public final InterfaceC0145C b() {
        C0217g c0217g;
        switch (this.f2616j) {
            case 0:
                AbstractC0150c abstractC0150c = ((ActionMenuItemView) this.f2617k).f1216m;
                if (abstractC0150c == null || (c0217g = ((C0219h) abstractC0150c).f2974a.f3009t) == null) {
                    return null;
                }
                return c0217g.a();
            default:
                C0217g c0217g2 = ((C0223j) this.f2617k).d.f3008s;
                if (c0217g2 == null) {
                    return null;
                }
                return c0217g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0248v0
    public final boolean c() {
        InterfaceC0145C b2;
        switch (this.f2616j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2617k;
                InterfaceC0159l interfaceC0159l = actionMenuItemView.f1214k;
                return interfaceC0159l != null && interfaceC0159l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0223j) this.f2617k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0248v0
    public boolean d() {
        switch (this.f2616j) {
            case 1:
                C0225k c0225k = ((C0223j) this.f2617k).d;
                if (c0225k.f3010u != null) {
                    return false;
                }
                c0225k.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149b(C0223j c0223j, C0223j c0223j2) {
        super(c0223j2);
        this.f2617k = c0223j;
    }
}
