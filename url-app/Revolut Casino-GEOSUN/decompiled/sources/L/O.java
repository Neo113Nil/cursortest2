package L;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f502a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f503b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f504c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f506e;

    public O(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f506e = staggeredGridLayoutManager;
        this.f505d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f504c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f502a.size() == 0) {
            return i2;
        }
        View view = (View) this.f502a.get(r3.size() - 1);
        L l2 = (L) view.getLayoutParams();
        this.f504c = this.f506e.f1623j.b(view);
        l2.getClass();
        return this.f504c;
    }
}
