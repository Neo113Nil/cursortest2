package U;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1378a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f1379b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f1380c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f1381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1382e;

    public L(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f1382e = staggeredGridLayoutManager;
        this.f1381d = i3;
    }

    public final int a(int i3) {
        int i4 = this.f1380c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f1378a.size() == 0) {
            return i3;
        }
        View view = (View) this.f1378a.get(r3.size() - 1);
        I i5 = (I) view.getLayoutParams();
        this.f1380c = this.f1382e.f2500j.b(view);
        i5.getClass();
        return this.f1380c;
    }
}
