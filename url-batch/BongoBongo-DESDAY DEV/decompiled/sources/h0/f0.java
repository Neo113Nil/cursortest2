package h0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2498a;

    /* renamed from: b, reason: collision with root package name */
    public int f2499b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2500c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2501e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2503g;

    public f0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2503g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2498a = -1;
        this.f2499b = Integer.MIN_VALUE;
        this.f2500c = false;
        this.d = false;
        this.f2501e = false;
        int[] iArr = this.f2502f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
