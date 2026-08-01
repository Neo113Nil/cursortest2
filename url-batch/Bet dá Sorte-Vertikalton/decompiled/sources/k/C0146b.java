package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0240u0;
import l.C0211g;
import l.C0213h;
import l.C0217j;
import l.C0219k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146b extends AbstractViewOnTouchListenerC0240u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2603j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2604k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2604k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0240u0
    public final InterfaceC0142C b() {
        C0211g c0211g;
        switch (this.f2603j) {
            case 0:
                AbstractC0147c abstractC0147c = ((ActionMenuItemView) this.f2604k).f1185m;
                if (abstractC0147c == null || (c0211g = ((C0213h) abstractC0147c).f2963a.f2988t) == null) {
                    return null;
                }
                return c0211g.a();
            default:
                C0211g c0211g2 = ((C0217j) this.f2604k).d.f2987s;
                if (c0211g2 == null) {
                    return null;
                }
                return c0211g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0240u0
    public final boolean c() {
        InterfaceC0142C b2;
        switch (this.f2603j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2604k;
                InterfaceC0156l interfaceC0156l = actionMenuItemView.f1183k;
                return interfaceC0156l != null && interfaceC0156l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0217j) this.f2604k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0240u0
    public boolean d() {
        switch (this.f2603j) {
            case 1:
                C0219k c0219k = ((C0217j) this.f2604k).d;
                if (c0219k.f2989u != null) {
                    return false;
                }
                c0219k.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146b(C0217j c0217j, C0217j c0217j2) {
        super(c0217j2);
        this.f2604k = c0217j;
    }
}
