package b1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f886a;

    /* renamed from: b, reason: collision with root package name */
    public int f887b;
    public int[] c;

    /* renamed from: d, reason: collision with root package name */
    public int f888d;

    public final void a(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i6 = this.f888d;
        int i7 = i6 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i7 >= iArr.length) {
            int[] iArr3 = new int[i6 * 4];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i7] = i4;
        iArr4[i7 + 1] = i5;
        this.f888d++;
    }

    public final void b(RecyclerView recyclerView, boolean z3) {
        this.f888d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        n0 n0Var = recyclerView.f653r;
        if (recyclerView.f651q == null || n0Var == null || !n0Var.f879i) {
            return;
        }
        if (z3) {
            if (!recyclerView.f635i.k()) {
                n0Var.i(recyclerView.f651q.a(), this);
            }
        } else if (!recyclerView.K()) {
            n0Var.h(this.f886a, this.f887b, recyclerView.f640k0, this);
        }
        int i4 = this.f888d;
        if (i4 > n0Var.f880j) {
            n0Var.f880j = i4;
            n0Var.f881k = z3;
            recyclerView.g.l();
        }
    }
}
