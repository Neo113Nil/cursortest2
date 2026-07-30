package n;

import android.content.Context;
import android.view.View;
import com.icefishing.icefish.ice.fishing.s294s.R;
import i.C0511M;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708f extends m.x {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6763l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0716j f6764m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708f(C0716j c0716j, Context context, m.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f6764m = c0716j;
        this.f6481f = 8388613;
        C0511M c0511m = c0716j.f6797E;
        this.f6483h = c0511m;
        m.u uVar = this.f6484i;
        if (uVar != null) {
            uVar.j(c0511m);
        }
    }

    @Override // m.x
    public final void c() {
        switch (this.f6763l) {
            case 0:
                C0716j c0716j = this.f6764m;
                c0716j.f6794B = null;
                c0716j.getClass();
                super.c();
                break;
            default:
                C0716j c0716j2 = this.f6764m;
                m.m mVar = c0716j2.f6800i;
                if (mVar != null) {
                    mVar.c(true);
                }
                c0716j2.f6793A = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708f(C0716j c0716j, Context context, m.F f7, View view) {
        super(context, f7, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f6764m = c0716j;
        if ((f7.f6345B.f6462x & 32) != 32) {
            View view2 = c0716j.f6806q;
            this.f6480e = view2 == null ? (View) c0716j.f6805p : view2;
        }
        C0511M c0511m = c0716j.f6797E;
        this.f6483h = c0511m;
        m.u uVar = this.f6484i;
        if (uVar != null) {
            uVar.j(c0511m);
        }
    }
}
