package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ac {
    public int a;
    public int b;
    public int c;
    public Object d;

    public void a(pe peVar) {
        Object[] objArr = (Object[]) this.d;
        int i = this.b;
        objArr[i] = peVar;
        int i2 = this.c & (i + 1);
        this.b = i2;
        int i3 = this.a;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i5];
            j7.Y(objArr, objArr2, 0, i3, length);
            j7.Y((Object[]) this.d, objArr2, i4, 0, this.a);
            this.d = objArr2;
            this.a = 0;
            this.b = length;
            this.c = i5 - 1;
        }
    }

    public void b(int i, int i2) {
        if (i < 0) {
            s9.k("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            s9.k("Pixel distance must be non-negative");
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

    public void c() {
        View view = (View) this.d;
        int top = this.c - (view.getTop() - this.a);
        WeakHashMap weakHashMap = hm0.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.b));
    }

    public void d(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        h80 h80Var = recyclerView.r;
        if (recyclerView.q == null || h80Var == null || !h80Var.i) {
            return;
        }
        if (z) {
            if (!recyclerView.i.k()) {
                h80Var.i(recyclerView.q.a(), this);
            }
        } else if (!recyclerView.L()) {
            h80Var.h(this.a, this.b, recyclerView.l0, this);
        }
        int i = this.c;
        if (i > h80Var.j) {
            h80Var.j = i;
            h80Var.k = z;
            recyclerView.g.l();
        }
    }
}
