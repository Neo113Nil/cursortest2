package e0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: e0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126m {

    /* renamed from: a, reason: collision with root package name */
    public int f2307a;

    /* renamed from: b, reason: collision with root package name */
    public int f2308b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2309c;

    /* renamed from: d, reason: collision with root package name */
    public int f2310d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f2310d;
        int i4 = i3 * 2;
        int[] iArr = this.f2309c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2309c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2309c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2309c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f2310d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f2310d = 0;
        int[] iArr = this.f2309c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        I i = recyclerView.f1585l;
        if (recyclerView.f1583k == null || i == null || !i.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1572d.f()) {
                i.i(recyclerView.f1583k.a(), this);
            }
        } else if (!recyclerView.K()) {
            i.h(this.f2307a, this.f2308b, recyclerView.f1571c0, this);
        }
        int i2 = this.f2310d;
        if (i2 > i.f2121j) {
            i.f2121j = i2;
            i.f2122k = z2;
            recyclerView.f1568b.k();
        }
    }
}
