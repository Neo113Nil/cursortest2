package g1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public int f1851a;

    /* renamed from: b, reason: collision with root package name */
    public int f1852b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1853c;
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
        int[] iArr = this.f1853c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1853c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i6 >= iArr.length) {
            int[] iArr3 = new int[i5 * 4];
            this.f1853c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f1853c;
        iArr4[i6] = i;
        iArr4[i6 + 1] = i4;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z4) {
        this.d = 0;
        int[] iArr = this.f1853c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        a1 a1Var = recyclerView.f788s;
        if (recyclerView.f786r == null || a1Var == null || !a1Var.i) {
            return;
        }
        if (z4) {
            if (!recyclerView.f770j.l()) {
                a1Var.i(recyclerView.f786r.a(), this);
            }
        } else if (!recyclerView.O()) {
            a1Var.h(this.f1851a, this.f1852b, recyclerView.f775l0, this);
        }
        int i = this.d;
        if (i > a1Var.f1603j) {
            a1Var.f1603j = i;
            a1Var.f1604k = z4;
            recyclerView.h.n();
        }
    }
}
