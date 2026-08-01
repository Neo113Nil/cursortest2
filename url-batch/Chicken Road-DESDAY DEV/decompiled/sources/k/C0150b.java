package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0251w0;
import l.C0218g;
import l.C0220h;
import l.C0224j;
import l.C0226k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150b extends AbstractViewOnTouchListenerC0251w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2567j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2568k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2568k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0251w0
    public final InterfaceC0146C b() {
        C0218g c0218g;
        switch (this.f2567j) {
            case 0:
                AbstractC0151c abstractC0151c = ((ActionMenuItemView) this.f2568k).f1171m;
                if (abstractC0151c == null || (c0218g = ((C0220h) abstractC0151c).f2921a.f2956t) == null) {
                    return null;
                }
                return c0218g.a();
            default:
                C0218g c0218g2 = ((C0224j) this.f2568k).d.f2955s;
                if (c0218g2 == null) {
                    return null;
                }
                return c0218g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0251w0
    public final boolean c() {
        InterfaceC0146C b2;
        switch (this.f2567j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2568k;
                InterfaceC0160l interfaceC0160l = actionMenuItemView.f1169k;
                return interfaceC0160l != null && interfaceC0160l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0224j) this.f2568k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0251w0
    public boolean d() {
        switch (this.f2567j) {
            case 1:
                C0226k c0226k = ((C0224j) this.f2568k).d;
                if (c0226k.f2957u != null) {
                    return false;
                }
                c0226k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150b(C0224j c0224j, C0224j c0224j2) {
        super(c0224j2);
        this.f2568k = c0224j;
    }
}
