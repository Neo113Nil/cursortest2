package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0248w0;
import l.C0215g;
import l.C0217h;
import l.C0221j;
import l.C0223k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147b extends AbstractViewOnTouchListenerC0248w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2557j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2558k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2558k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0248w0
    public final InterfaceC0143C b() {
        C0215g c0215g;
        switch (this.f2557j) {
            case 0:
                AbstractC0148c abstractC0148c = ((ActionMenuItemView) this.f2558k).f1146m;
                if (abstractC0148c == null || (c0215g = ((C0217h) abstractC0148c).f3067a.f3102t) == null) {
                    return null;
                }
                return c0215g.a();
            default:
                C0215g c0215g2 = ((C0221j) this.f2558k).d.f3101s;
                if (c0215g2 == null) {
                    return null;
                }
                return c0215g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0248w0
    public final boolean c() {
        InterfaceC0143C b2;
        switch (this.f2557j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2558k;
                InterfaceC0157l interfaceC0157l = actionMenuItemView.f1144k;
                return interfaceC0157l != null && interfaceC0157l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0221j) this.f2558k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0248w0
    public boolean d() {
        switch (this.f2557j) {
            case 1:
                C0223k c0223k = ((C0221j) this.f2558k).d;
                if (c0223k.f3103u != null) {
                    return false;
                }
                c0223k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147b(C0221j c0221j, C0221j c0221j2) {
        super(c0221j2);
        this.f2558k = c0221j;
    }
}
