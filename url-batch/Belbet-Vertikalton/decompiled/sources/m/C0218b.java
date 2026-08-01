package m;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import n.AbstractViewOnTouchListenerC0311y0;
import n.C0274g;
import n.C0276h;
import n.C0280j;
import n.C0282k;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218b extends AbstractViewOnTouchListenerC0311y0 {
    public final /* synthetic */ int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3303k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3303k = actionMenuItemView;
    }

    @Override // n.AbstractViewOnTouchListenerC0311y0
    public final InterfaceC0214C b() {
        C0274g c0274g;
        switch (this.j) {
            case 0:
                AbstractC0219c abstractC0219c = ((ActionMenuItemView) this.f3303k).f1679m;
                if (abstractC0219c == null || (c0274g = ((C0276h) abstractC0219c).f3619a.f3666t) == null) {
                    return null;
                }
                return c0274g.a();
            default:
                C0274g c0274g2 = ((C0280j) this.f3303k).f3649d.f3665s;
                if (c0274g2 == null) {
                    return null;
                }
                return c0274g2.a();
        }
    }

    @Override // n.AbstractViewOnTouchListenerC0311y0
    public final boolean c() {
        InterfaceC0214C b2;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3303k;
                InterfaceC0228l interfaceC0228l = actionMenuItemView.f1677k;
                return interfaceC0228l != null && interfaceC0228l.c(actionMenuItemView.f1676h) && (b2 = b()) != null && b2.a();
            default:
                ((C0280j) this.f3303k).f3649d.l();
                return true;
        }
    }

    @Override // n.AbstractViewOnTouchListenerC0311y0
    public boolean d() {
        switch (this.j) {
            case 1:
                C0282k c0282k = ((C0280j) this.f3303k).f3649d;
                if (c0282k.f3667u != null) {
                    return false;
                }
                c0282k.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218b(C0280j c0280j, C0280j c0280j2) {
        super(c0280j2);
        this.f3303k = c0280j;
    }
}
