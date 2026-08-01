package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2143a;

    /* renamed from: b, reason: collision with root package name */
    public int f2144b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2145c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2146e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2148g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2148g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2143a = -1;
        this.f2144b = Integer.MIN_VALUE;
        this.f2145c = false;
        this.d = false;
        this.f2146e = false;
        int[] iArr = this.f2147f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
