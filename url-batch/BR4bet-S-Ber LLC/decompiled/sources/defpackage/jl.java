package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.moontiko.really.admiralcasino.MainActivity2;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jl extends e20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e20
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ll llVar = (ll) obj;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = llVar.a;
                int computeVerticalScrollRange = llVar.s.computeVerticalScrollRange();
                int i5 = llVar.r;
                llVar.t = computeVerticalScrollRange - i5 > 0 && i5 >= i4;
                int computeHorizontalScrollRange = llVar.s.computeHorizontalScrollRange();
                int i6 = llVar.q;
                boolean z = computeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                llVar.u = z;
                boolean z2 = llVar.t;
                if (!z2 && !z) {
                    if (llVar.v != 0) {
                        llVar.f(0);
                        return;
                    }
                    return;
                }
                if (z2) {
                    float f = i5;
                    llVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                    llVar.k = Math.min(i5, (i5 * i5) / computeVerticalScrollRange);
                }
                if (llVar.u) {
                    float f2 = computeHorizontalScrollOffset;
                    float f3 = i6;
                    llVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                    llVar.n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
                }
                int i7 = llVar.v;
                if (i7 == 0 || i7 == 1) {
                    llVar.f(1);
                    return;
                }
                return;
            default:
                MainActivity2 mainActivity2 = (MainActivity2) obj;
                if (i2 > 10) {
                    o1 o1Var = mainActivity2.E;
                    if (o1Var != null) {
                        ((ExtendedFloatingActionButton) o1Var.c).y(2);
                        return;
                    } else {
                        kr.g0("binding");
                        throw null;
                    }
                }
                if (i2 < -10) {
                    o1 o1Var2 = mainActivity2.E;
                    if (o1Var2 != null) {
                        ((ExtendedFloatingActionButton) o1Var2.c).y(3);
                        return;
                    } else {
                        kr.g0("binding");
                        throw null;
                    }
                }
                return;
        }
    }
}
