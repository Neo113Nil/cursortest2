package h0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: h0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132n {

    /* renamed from: a, reason: collision with root package name */
    public int f2584a;

    /* renamed from: b, reason: collision with root package name */
    public int f2585b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2586c;
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
        int[] iArr = this.f2586c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2586c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2586c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2586c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2586c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        J j2 = recyclerView.f1672m;
        if (recyclerView.f1671l == null || j2 == null || !j2.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1658e.f()) {
                j2.i(recyclerView.f1671l.a(), this);
            }
        } else if (!recyclerView.N()) {
            j2.h(this.f2584a, this.f2585b, recyclerView.f1659e0, this);
        }
        int i = this.d;
        if (i > j2.f2403j) {
            j2.f2403j = i;
            j2.f2404k = z2;
            recyclerView.f1655c.m();
        }
    }
}
