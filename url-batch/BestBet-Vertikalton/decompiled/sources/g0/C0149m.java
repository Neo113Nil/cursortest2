package g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149m {

    /* renamed from: a, reason: collision with root package name */
    public int f2899a;

    /* renamed from: b, reason: collision with root package name */
    public int f2900b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2901c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.f2901c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2901c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2901c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2901c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2901c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        H h = recyclerView.f1989m;
        if (recyclerView.f1987l == null || h == null || !h.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1975e.f()) {
                h.i(recyclerView.f1987l.a(), this);
            }
        } else if (!recyclerView.N()) {
            h.h(this.f2899a, this.f2900b, recyclerView.f1976e0, this);
        }
        int i = this.d;
        if (i > h.f2730j) {
            h.f2730j = i;
            h.f2731k = z2;
            recyclerView.f1972c.m();
        }
    }
}
