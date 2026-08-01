package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2031a;

    /* renamed from: b, reason: collision with root package name */
    public int f2032b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2033c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2034e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2036g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2036g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2031a = -1;
        this.f2032b = Integer.MIN_VALUE;
        this.f2033c = false;
        this.d = false;
        this.f2034e = false;
        int[] iArr = this.f2035f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
