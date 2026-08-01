package g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: g0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130n {

    /* renamed from: a, reason: collision with root package name */
    public int f2488a;

    /* renamed from: b, reason: collision with root package name */
    public int f2489b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2490c;
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
        int[] iArr = this.f2490c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2490c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2490c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2490c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2490c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        J j2 = recyclerView.f1609m;
        if (recyclerView.f1607l == null || j2 == null || !j2.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1595e.f()) {
                j2.i(recyclerView.f1607l.a(), this);
            }
        } else if (!recyclerView.N()) {
            j2.h(this.f2488a, this.f2489b, recyclerView.f1596e0, this);
        }
        int i = this.d;
        if (i > j2.f2316j) {
            j2.f2316j = i;
            j2.f2317k = z2;
            recyclerView.f1592c.m();
        }
    }
}
