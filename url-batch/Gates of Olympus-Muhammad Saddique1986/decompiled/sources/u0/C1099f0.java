package u0;

import I.C0143d;
import I.C0156j0;
import I.C0167p;
import I.C0173s0;
import com.gatesof.olympus.martu.marku.ChairActivity;
import e2.InterfaceC0426e;

/* renamed from: u0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099f0 extends AbstractC1088a {

    /* renamed from: l, reason: collision with root package name */
    public final C0156j0 f9346l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9347m;

    public C1099f0(ChairActivity chairActivity) {
        super(chairActivity, null, 0);
        this.f9346l = C0143d.K(null, I.W.f2783i);
    }

    @Override // u0.AbstractC1088a
    public final void a(int i3, C0167p c0167p) {
        int i4;
        c0167p.S(420213850);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(this) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            InterfaceC0426e interfaceC0426e = (InterfaceC0426e) this.f9346l.getValue();
            if (interfaceC0426e == null) {
                c0167p.Q(358373017);
            } else {
                c0167p.Q(150107752);
                interfaceC0426e.h(c0167p, 0);
            }
            c0167p.p(false);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new R0.t(i3, 4, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1099f0.class.getName();
    }

    @Override // u0.AbstractC1088a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f9347m;
    }

    public final void setContent(InterfaceC0426e interfaceC0426e) {
        this.f9347m = true;
        this.f9346l.setValue(interfaceC0426e);
        if (isAttachedToWindow()) {
            if (this.f9301g == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
