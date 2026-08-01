package h0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162l {

    /* renamed from: a, reason: collision with root package name */
    public int f3076a;

    /* renamed from: b, reason: collision with root package name */
    public int f3077b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3078c;

    /* renamed from: d, reason: collision with root package name */
    public int f3079d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f3079d;
        int i4 = i3 * 2;
        int[] iArr = this.f3078c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3078c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f3078c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3078c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f3079d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f3079d = 0;
        int[] iArr = this.f3078c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0141G abstractC0141G = recyclerView.f2031l;
        if (recyclerView.f2029k == null || abstractC0141G == null || !abstractC0141G.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f2018d.f()) {
                abstractC0141G.i(recyclerView.f2029k.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC0141G.h(this.f3076a, this.f3077b, recyclerView.f2017c0, this);
        }
        int i = this.f3079d;
        if (i > abstractC0141G.j) {
            abstractC0141G.j = i;
            abstractC0141G.f2911k = z2;
            recyclerView.f2014b.k();
        }
    }
}
