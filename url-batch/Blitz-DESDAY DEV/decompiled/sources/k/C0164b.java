package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0219w0;
import l.C0187g;
import l.C0189h;
import l.C0193j;
import l.C0195k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164b extends AbstractViewOnTouchListenerC0219w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2720j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2721k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2721k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0219w0
    public final InterfaceC0160C b() {
        C0187g c0187g;
        switch (this.f2720j) {
            case 0:
                AbstractC0165c abstractC0165c = ((ActionMenuItemView) this.f2721k).f1318m;
                if (abstractC0165c == null || (c0187g = ((C0189h) abstractC0165c).f2994a.f3029t) == null) {
                    return null;
                }
                return c0187g.a();
            default:
                C0187g c0187g2 = ((C0193j) this.f2721k).d.f3028s;
                if (c0187g2 == null) {
                    return null;
                }
                return c0187g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0219w0
    public final boolean c() {
        InterfaceC0160C b2;
        switch (this.f2720j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2721k;
                l lVar = actionMenuItemView.f1316k;
                return lVar != null && lVar.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0193j) this.f2721k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0219w0
    public boolean d() {
        switch (this.f2720j) {
            case 1:
                C0195k c0195k = ((C0193j) this.f2721k).d;
                if (c0195k.f3030u != null) {
                    return false;
                }
                c0195k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164b(C0193j c0193j, C0193j c0193j2) {
        super(c0193j2);
        this.f2721k = c0193j;
    }
}
