package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2168a;

    /* renamed from: b, reason: collision with root package name */
    public int f2169b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2170c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2171e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2173g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2173g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2168a = -1;
        this.f2169b = Integer.MIN_VALUE;
        this.f2170c = false;
        this.d = false;
        this.f2171e = false;
        int[] iArr = this.f2172f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
