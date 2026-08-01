package e0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2200a;

    /* renamed from: b, reason: collision with root package name */
    public int f2201b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2202c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2203d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2204e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2206g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2206g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2200a = -1;
        this.f2201b = Integer.MIN_VALUE;
        this.f2202c = false;
        this.f2203d = false;
        this.f2204e = false;
        int[] iArr = this.f2205f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
