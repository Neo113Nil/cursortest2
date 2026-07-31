package x1;

import com.snovikpovik.vuevnxsj.MainActivity;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a1 extends a {

    /* renamed from: l, reason: collision with root package name */
    public final m0.h1 f8352l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8353m;

    public a1(MainActivity mainActivity) {
        super(mainActivity);
        this.f8352l = m0.b.q(null);
    }

    @Override // x1.a
    public final void a(m0.s sVar, int i) {
        sVar.W(420213850);
        int i8 = (sVar.h(this) ? 4 : 2) | i;
        if (sVar.N(i8 & 1, (i8 & 3) != 2)) {
            p6.e eVar = (p6.e) this.f8352l.getValue();
            if (eVar == null) {
                sVar.V(-1238798753);
            } else {
                sVar.V(98586082);
                eVar.g(sVar, 0);
            }
            sVar.p(false);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new q.d(this, i, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return a1.class.getName();
    }

    @Override // x1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f8353m;
    }

    public final void setContent(p6.e eVar) {
        this.f8353m = true;
        this.f8352l.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f8326g == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
