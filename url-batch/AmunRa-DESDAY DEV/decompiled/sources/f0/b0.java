package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2100a;

    /* renamed from: b, reason: collision with root package name */
    public int f2101b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2102c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2103e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2105g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2105g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2100a = -1;
        this.f2101b = Integer.MIN_VALUE;
        this.f2102c = false;
        this.d = false;
        this.f2103e = false;
        int[] iArr = this.f2104f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
