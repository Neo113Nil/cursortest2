package s0;

import G.C0192d;
import G.C0205j0;
import G.C0216p;
import G.C0222s0;
import com.chicken.road.kedro.laqer.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: s0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142f0 extends AbstractC1131a {

    /* renamed from: o, reason: collision with root package name */
    public final C0205j0 f10203o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10204p;

    public C1142f0(MainActivity mainActivity) {
        super(mainActivity, null, 0);
        this.f10203o = C0192d.K(null, G.W.f2779l);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // s0.AbstractC1131a
    public final void a(int i2, C0216p c0216p) {
        int i4;
        c0216p.U(420213850);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(this) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            Function2 function2 = (Function2) this.f10203o.getValue();
            if (function2 == null) {
                c0216p.S(358373017);
            } else {
                c0216p.S(150107752);
                function2.h(c0216p, 0);
            }
            c0216p.q(false);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new P0.u(i2, 4, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1142f0.class.getName();
    }

    @Override // s0.AbstractC1131a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f10204p;
    }

    public final void setContent(Function2<? super C0216p, ? super Integer, Unit> function2) {
        this.f10204p = true;
        this.f10203o.setValue(function2);
        if (isAttachedToWindow()) {
            if (this.f10164j == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }
}
