package h0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public int f2977a;

    /* renamed from: b, reason: collision with root package name */
    public int f2978b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2979c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2980d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2982g;

    public Z(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2982g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2977a = -1;
        this.f2978b = Integer.MIN_VALUE;
        this.f2979c = false;
        this.f2980d = false;
        this.e = false;
        int[] iArr = this.f2981f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
