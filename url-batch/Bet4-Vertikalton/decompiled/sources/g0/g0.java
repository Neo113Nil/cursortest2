package g0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2375a;

    /* renamed from: b, reason: collision with root package name */
    public int f2376b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2377c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2378e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2380g;

    public g0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2380g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2375a = -1;
        this.f2376b = Integer.MIN_VALUE;
        this.f2377c = false;
        this.d = false;
        this.f2378e = false;
        int[] iArr = this.f2379f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
