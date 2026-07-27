package W;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3286a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f3287b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f3288c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f3289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3290e;

    public J(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f3290e = staggeredGridLayoutManager;
        this.f3289d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f3288c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f3286a.size() == 0) {
            return i2;
        }
        View view = (View) this.f3286a.get(r3.size() - 1);
        G g6 = (G) view.getLayoutParams();
        this.f3288c = this.f3290e.f4686j.b(view);
        g6.getClass();
        return this.f3288c;
    }
}
