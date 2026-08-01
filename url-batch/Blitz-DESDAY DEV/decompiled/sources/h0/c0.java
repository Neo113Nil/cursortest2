package h0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2462a;

    /* renamed from: b, reason: collision with root package name */
    public int f2463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2464c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2465e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2467g;

    public c0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2467g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2462a = -1;
        this.f2463b = Integer.MIN_VALUE;
        this.f2464c = false;
        this.d = false;
        this.f2465e = false;
        int[] iArr = this.f2466f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
