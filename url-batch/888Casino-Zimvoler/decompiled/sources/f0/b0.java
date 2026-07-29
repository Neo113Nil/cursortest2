package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2032a;

    /* renamed from: b, reason: collision with root package name */
    public int f2033b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2034c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2035e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2037g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2037g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2032a = -1;
        this.f2033b = Integer.MIN_VALUE;
        this.f2034c = false;
        this.d = false;
        this.f2035e = false;
        int[] iArr = this.f2036f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
