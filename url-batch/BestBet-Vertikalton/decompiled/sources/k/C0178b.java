package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0263u0;
import l.C0234g;
import l.C0236h;
import l.C0240j;
import l.C0242k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178b extends AbstractViewOnTouchListenerC0263u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3118j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3119k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3119k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0263u0
    public final InterfaceC0174D b() {
        C0234g c0234g;
        switch (this.f3118j) {
            case 0:
                AbstractC0179c abstractC0179c = ((ActionMenuItemView) this.f3119k).f1634m;
                if (abstractC0179c == null || (c0234g = ((C0236h) abstractC0179c).f3399a.f3424t) == null) {
                    return null;
                }
                return c0234g.a();
            default:
                C0234g c0234g2 = ((C0240j) this.f3119k).d.f3423s;
                if (c0234g2 == null) {
                    return null;
                }
                return c0234g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0263u0
    public final boolean c() {
        InterfaceC0174D b2;
        switch (this.f3118j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3119k;
                InterfaceC0188l interfaceC0188l = actionMenuItemView.f1632k;
                return interfaceC0188l != null && interfaceC0188l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0240j) this.f3119k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0263u0
    public boolean d() {
        switch (this.f3118j) {
            case 1:
                C0242k c0242k = ((C0240j) this.f3119k).d;
                if (c0242k.f3425u != null) {
                    return false;
                }
                c0242k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178b(C0240j c0240j, C0240j c0240j2) {
        super(c0240j2);
        this.f3119k = c0240j;
    }
}
