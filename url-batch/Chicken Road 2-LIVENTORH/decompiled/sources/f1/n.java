package f1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f1457a;

    /* renamed from: b, reason: collision with root package name */
    public int f1458b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1459c;
    public int d;

    public final void a(int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i5 = this.d;
        int i6 = i5 * 2;
        int[] iArr = this.f1459c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1459c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i6 >= iArr.length) {
            int[] iArr3 = new int[i5 * 4];
            this.f1459c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f1459c;
        iArr4[i6] = i;
        iArr4[i6 + 1] = i4;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z3) {
        this.d = 0;
        int[] iArr = this.f1459c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        m0 m0Var = recyclerView.f685r;
        if (recyclerView.f683q == null || m0Var == null || !m0Var.i) {
            return;
        }
        if (z3) {
            if (!recyclerView.i.j()) {
                m0Var.i(recyclerView.f683q.a(), this);
            }
        } else if (!recyclerView.K()) {
            m0Var.h(this.f1457a, this.f1458b, recyclerView.f672k0, this);
        }
        int i = this.d;
        if (i > m0Var.f1451j) {
            m0Var.f1451j = i;
            m0Var.f1452k = z3;
            recyclerView.f665g.l();
        }
    }
}
