package f0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: f0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107m {

    /* renamed from: a, reason: collision with root package name */
    public int f2312a;

    /* renamed from: b, reason: collision with root package name */
    public int f2313b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2314c;
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
        int[] iArr = this.f2314c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2314c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2314c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2314c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2314c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        H h = recyclerView.f1600l;
        if (recyclerView.f1598k == null || h == null || !h.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.d.f()) {
                h.i(recyclerView.f1598k.a(), this);
            }
        } else if (!recyclerView.K()) {
            h.h(this.f2312a, this.f2313b, recyclerView.f1586c0, this);
        }
        int i = this.d;
        if (i > h.f2148j) {
            h.f2148j = i;
            h.f2149k = z2;
            recyclerView.f1583b.k();
        }
    }
}
