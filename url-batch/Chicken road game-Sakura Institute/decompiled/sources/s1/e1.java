package s1;

import com.chicken.road.whale.RootActivity;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 extends a {

    /* renamed from: n, reason: collision with root package name */
    public final g0.g1 f8202n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8203o;

    public e1(RootActivity rootActivity) {
        super(rootActivity);
        this.f8202n = g0.d.J(null, g0.t0.f3903k);
    }

    @Override // s1.a
    public final void a(int i7, g0.p pVar) {
        pVar.S(420213850);
        if ((((pVar.h(this) ? 4 : 2) | i7) & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            q6.e eVar = (q6.e) this.f8202n.getValue();
            if (eVar == null) {
                pVar.Q(358373017);
            } else {
                pVar.Q(150107752);
                eVar.d(pVar, 0);
            }
            pVar.p(false);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a2.a(i7, 17, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return e1.class.getName();
    }

    @Override // s1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f8203o;
    }

    public final void setContent(q6.e eVar) {
        this.f8203o = true;
        this.f8202n.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f8122i == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
