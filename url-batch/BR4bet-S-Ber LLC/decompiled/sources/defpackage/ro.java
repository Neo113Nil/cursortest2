package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ro {
    public int a;
    public int b;
    public int c;
    public Object d;

    public void a(int i, int i2) {
        if (i < 0) {
            g9.i("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            g9.i("Pixel distance must be non-negative");
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
        WeakHashMap weakHashMap = ic0.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.b));
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        b20 b20Var = recyclerView.r;
        if (recyclerView.q == null || b20Var == null || !b20Var.i) {
            return;
        }
        if (z) {
            if (!recyclerView.i.k()) {
                b20Var.i(recyclerView.q.a(), this);
            }
        } else if (!recyclerView.K()) {
            b20Var.h(this.a, this.b, recyclerView.k0, this);
        }
        int i = this.c;
        if (i > b20Var.j) {
            b20Var.j = i;
            b20Var.k = z;
            recyclerView.g.l();
        }
    }
}
