package e0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: e0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125m {

    /* renamed from: a, reason: collision with root package name */
    public int f2303a;

    /* renamed from: b, reason: collision with root package name */
    public int f2304b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2305c;

    /* renamed from: d, reason: collision with root package name */
    public int f2306d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f2306d;
        int i4 = i3 * 2;
        int[] iArr = this.f2305c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2305c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2305c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2305c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f2306d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f2306d = 0;
        int[] iArr = this.f2305c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        I i = recyclerView.f1584l;
        if (recyclerView.f1582k == null || i == null || !i.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1571d.f()) {
                i.i(recyclerView.f1582k.a(), this);
            }
        } else if (!recyclerView.K()) {
            i.h(this.f2303a, this.f2304b, recyclerView.f1570c0, this);
        }
        int i2 = this.f2306d;
        if (i2 > i.f2117j) {
            i.f2117j = i2;
            i.f2118k = z2;
            recyclerView.f1567b.k();
        }
    }
}
