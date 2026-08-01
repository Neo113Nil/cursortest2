package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC0252z0;
import m.C0213g;
import m.C0215h;
import m.C0219j;
import m.C0221k;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158b extends AbstractViewOnTouchListenerC0252z0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2769j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2770k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2770k = actionMenuItemView;
    }

    @Override // m.AbstractViewOnTouchListenerC0252z0
    public final InterfaceC0154C b() {
        C0213g c0213g;
        switch (this.f2769j) {
            case 0:
                AbstractC0159c abstractC0159c = ((ActionMenuItemView) this.f2770k).f1311m;
                if (abstractC0159c == null || (c0213g = ((C0215h) abstractC0159c).f3090a.f3140t) == null) {
                    return null;
                }
                return c0213g.a();
            default:
                C0213g c0213g2 = ((C0219j) this.f2770k).d.f3139s;
                if (c0213g2 == null) {
                    return null;
                }
                return c0213g2.a();
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0252z0
    public final boolean c() {
        InterfaceC0154C b2;
        switch (this.f2769j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2770k;
                InterfaceC0168l interfaceC0168l = actionMenuItemView.f1309k;
                return interfaceC0168l != null && interfaceC0168l.b(actionMenuItemView.f1307h) && (b2 = b()) != null && b2.a();
            default:
                ((C0219j) this.f2770k).d.l();
                return true;
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0252z0
    public boolean d() {
        switch (this.f2769j) {
            case 1:
                C0221k c0221k = ((C0219j) this.f2770k).d;
                if (c0221k.f3141u != null) {
                    return false;
                }
                c0221k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158b(C0219j c0219j, C0219j c0219j2) {
        super(c0219j2);
        this.f2770k = c0219j;
    }
}
