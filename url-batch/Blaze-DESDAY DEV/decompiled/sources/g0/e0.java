package g0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2400a;

    /* renamed from: b, reason: collision with root package name */
    public int f2401b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2402c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2403e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2405g;

    public e0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2405g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2400a = -1;
        this.f2401b = Integer.MIN_VALUE;
        this.f2402c = false;
        this.d = false;
        this.f2403e = false;
        int[] iArr = this.f2404f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
