package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0242v0;
import l.C0211g;
import l.C0213h;
import l.C0217j;
import l.C0219k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155b extends AbstractViewOnTouchListenerC0242v0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2668j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2669k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2669k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0242v0
    public final InterfaceC0151C b() {
        C0211g c0211g;
        switch (this.f2668j) {
            case 0:
                AbstractC0156c abstractC0156c = ((ActionMenuItemView) this.f2669k).f1261m;
                if (abstractC0156c == null || (c0211g = ((C0213h) abstractC0156c).f2938a.f2973t) == null) {
                    return null;
                }
                return c0211g.a();
            default:
                C0211g c0211g2 = ((C0217j) this.f2669k).d.f2972s;
                if (c0211g2 == null) {
                    return null;
                }
                return c0211g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0242v0
    public final boolean c() {
        InterfaceC0151C b2;
        switch (this.f2668j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2669k;
                InterfaceC0165l interfaceC0165l = actionMenuItemView.f1259k;
                return interfaceC0165l != null && interfaceC0165l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0217j) this.f2669k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0242v0
    public boolean d() {
        switch (this.f2668j) {
            case 1:
                C0219k c0219k = ((C0217j) this.f2669k).d;
                if (c0219k.f2974u != null) {
                    return false;
                }
                c0219k.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155b(C0217j c0217j, C0217j c0217j2) {
        super(c0217j2);
        this.f2669k = c0217j;
    }
}
