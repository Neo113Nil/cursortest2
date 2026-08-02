package P;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f862a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f863b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f864c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f866e;

    public M(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f866e = staggeredGridLayoutManager;
        this.f865d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f864c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f862a.size() == 0) {
            return i2;
        }
        View view = (View) this.f862a.get(r3.size() - 1);
        J j2 = (J) view.getLayoutParams();
        this.f864c = this.f866e.f1881j.b(view);
        j2.getClass();
        return this.f864c;
    }
}
