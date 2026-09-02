package u1;

import android.view.View;
import androidx.emoji2.text.q;
import java.util.Iterator;
import java.util.List;
import n0.q1;
import n0.y0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends a1.b {

    /* renamed from: b, reason: collision with root package name */
    public final View f3352b;

    /* renamed from: c, reason: collision with root package name */
    public int f3353c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3354e = new int[2];

    public b(View view) {
        this.f3352b = view;
    }

    @Override // a1.b
    public final void a(y0 y0Var) {
        this.f3352b.setTranslationY(0.0f);
    }

    @Override // a1.b
    public final void b(y0 y0Var) {
        View view = this.f3352b;
        int[] iArr = this.f3354e;
        view.getLocationOnScreen(iArr);
        this.f3353c = iArr[1];
    }

    @Override // a1.b
    public final q1 c(q1 q1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((y0) it.next()).f2803a.d() & 8) != 0) {
                this.f3352b.setTranslationY(o1.a.c(this.d, 0, r0.f2803a.c()));
                break;
            }
        }
        return q1Var;
    }

    @Override // a1.b
    public final q d(y0 y0Var, q qVar) {
        View view = this.f3352b;
        int[] iArr = this.f3354e;
        view.getLocationOnScreen(iArr);
        int i = this.f3353c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
        return qVar;
    }
}
