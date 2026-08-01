package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class im {
    public int a;
    public int b;
    public int c;
    public Object d;

    public void a(int i, int i2) {
        if (i < 0) {
            t8.k("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            t8.k("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.c;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.c++;
    }

    public void b() {
        View view = (View) this.d;
        int top = this.c - (view.getTop() - this.a);
        WeakHashMap weakHashMap = x80.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.b));
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        xy xyVar = recyclerView.r;
        if (recyclerView.q == null || xyVar == null || !xyVar.i) {
            return;
        }
        if (z) {
            if (!recyclerView.i.k()) {
                xyVar.i(recyclerView.q.a(), this);
            }
        } else if (!recyclerView.L()) {
            xyVar.h(this.a, this.b, recyclerView.l0, this);
        }
        int i = this.c;
        if (i > xyVar.j) {
            xyVar.j = i;
            xyVar.k = z;
            recyclerView.g.l();
        }
    }
}
