package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2215a;

    /* renamed from: b, reason: collision with root package name */
    public int f2216b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2217c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2218e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2220g;

    public a0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2220g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2215a = -1;
        this.f2216b = Integer.MIN_VALUE;
        this.f2217c = false;
        this.d = false;
        this.f2218e = false;
        int[] iArr = this.f2219f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
