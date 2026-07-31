package u0;

import I.C0089d;
import I.C0102j0;
import I.C0113p;
import I.C0119s0;
import com.gates.olympus.miruv.WorkbenchActivity;

/* renamed from: u0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961a0 extends AbstractC0960a {

    /* renamed from: l, reason: collision with root package name */
    public final C0102j0 f8286l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8287m;

    public C0961a0(WorkbenchActivity workbenchActivity) {
        super(workbenchActivity, null, 0);
        this.f8286l = C0089d.J(null, I.X.f2228i);
    }

    @Override // u0.AbstractC0960a
    public final void a(int i3, C0113p c0113p) {
        int i4;
        c0113p.S(420213850);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(this) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            Y1.e eVar = (Y1.e) this.f8286l.getValue();
            if (eVar == null) {
                c0113p.Q(358373017);
            } else {
                c0113p.Q(150107752);
                eVar.g(c0113p, 0);
            }
            c0113p.p(false);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.m(this, i3, 7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0961a0.class.getName();
    }

    @Override // u0.AbstractC0960a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f8287m;
    }

    public final void setContent(Y1.e eVar) {
        this.f8287m = true;
        this.f8286l.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f8281g == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
