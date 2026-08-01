package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class sm {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            o8.j("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            o8.j("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        nz nzVar = recyclerView.r;
        if (recyclerView.q == null || nzVar == null || !nzVar.i) {
            return;
        }
        if (z) {
            if (!recyclerView.i.h()) {
                nzVar.i(recyclerView.q.a(), this);
            }
        } else if (!recyclerView.K()) {
            nzVar.h(this.a, this.b, recyclerView.k0, this);
        }
        int i = this.d;
        if (i > nzVar.j) {
            nzVar.j = i;
            nzVar.k = z;
            recyclerView.g.l();
        }
    }
}
