package g0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2807a;

    /* renamed from: b, reason: collision with root package name */
    public int f2808b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2809c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2810e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2812g;

    public c0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2812g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2807a = -1;
        this.f2808b = Integer.MIN_VALUE;
        this.f2809c = false;
        this.d = false;
        this.f2810e = false;
        int[] iArr = this.f2811f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
