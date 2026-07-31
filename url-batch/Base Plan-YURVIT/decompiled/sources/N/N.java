package N;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f685a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f686b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f687c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f689e;

    public N(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f689e = staggeredGridLayoutManager;
        this.f688d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f687c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f685a.size() == 0) {
            return i2;
        }
        View view = (View) this.f685a.get(r3.size() - 1);
        K k2 = (K) view.getLayoutParams();
        this.f687c = this.f689e.f1712j.b(view);
        k2.getClass();
        return this.f687c;
    }
}
