package defpackage;

import com.feathherdashh.dashgame.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zk extends o {
    public final av0 m;
    public boolean n;

    public zk(MainActivity mainActivity) {
        super(mainActivity, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        r5 r5Var = new r5(1, this);
        addOnAttachStateChangeListener(r5Var);
        dd0 dd0Var = new dd0(17);
        t80.u(this).a.add(dd0Var);
        this.i = new mn1(this, r5Var, dd0Var);
        this.m = gb0.F(null);
    }

    @Override // defpackage.o
    public final void a(int i, hl hlVar) {
        hlVar.Y(420213850);
        int i2 = (hlVar.h(this) ? 4 : 2) | i;
        if (hlVar.O(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) this.m.getValue();
            if (function2 == null) {
                hlVar.W(-1238823553);
            } else {
                hlVar.W(98585282);
                function2.b(hlVar, 0);
            }
            hlVar.p(false);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new n(this, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return zk.class.getName();
    }

    @Override // defpackage.o
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.n;
    }

    public final void setContent(Function2<? super hl, ? super Integer, Unit> function2) {
        this.n = true;
        this.m.setValue(function2);
        if (isAttachedToWindow()) {
            if (this.h != null || isAttachedToWindow()) {
                c();
            } else {
                dd0.j("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
