package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2101a;

    /* renamed from: b, reason: collision with root package name */
    public int f2102b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2103c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2104e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2106g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2106g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2101a = -1;
        this.f2102b = Integer.MIN_VALUE;
        this.f2103c = false;
        this.d = false;
        this.f2104e = false;
        int[] iArr = this.f2105f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
