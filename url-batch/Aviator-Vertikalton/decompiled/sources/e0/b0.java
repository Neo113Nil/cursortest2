package e0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2196a;

    /* renamed from: b, reason: collision with root package name */
    public int f2197b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2198c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2199d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2200e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2202g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2202g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2196a = -1;
        this.f2197b = Integer.MIN_VALUE;
        this.f2198c = false;
        this.f2199d = false;
        this.f2200e = false;
        int[] iArr = this.f2201f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
