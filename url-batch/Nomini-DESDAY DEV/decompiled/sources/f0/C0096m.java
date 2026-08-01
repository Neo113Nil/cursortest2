package f0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: f0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096m {

    /* renamed from: a, reason: collision with root package name */
    public int f2126a;

    /* renamed from: b, reason: collision with root package name */
    public int f2127b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2128c;
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
        int[] iArr = this.f2128c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2128c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2128c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2128c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2128c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        I i = recyclerView.f1448l;
        if (recyclerView.f1446k == null || i == null || !i.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.d.f()) {
                i.i(recyclerView.f1446k.a(), this);
            }
        } else if (!recyclerView.K()) {
            i.h(this.f2126a, this.f2127b, recyclerView.f1435c0, this);
        }
        int i2 = this.d;
        if (i2 > i.f1961j) {
            i.f1961j = i2;
            i.f1962k = z2;
            recyclerView.f1432b.k();
        }
    }
}
