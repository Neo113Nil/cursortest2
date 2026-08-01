package g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: g0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129o {

    /* renamed from: a, reason: collision with root package name */
    public int f2458a;

    /* renamed from: b, reason: collision with root package name */
    public int f2459b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2460c;
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
        int[] iArr = this.f2460c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2460c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2460c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2460c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2460c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        L l2 = recyclerView.f1580n;
        if (recyclerView.f1578m == null || l2 == null || !l2.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1565e.j()) {
                l2.i(recyclerView.f1578m.a(), this);
            }
        } else if (!recyclerView.N()) {
            l2.h(this.f2458a, this.f2459b, recyclerView.f1570g0, this);
        }
        int i = this.d;
        if (i > l2.f2281j) {
            l2.f2281j = i;
            l2.f2282k = z2;
            recyclerView.f1562c.m();
        }
    }
}
