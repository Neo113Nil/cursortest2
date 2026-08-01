package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2036a;

    /* renamed from: b, reason: collision with root package name */
    public int f2037b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2038c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2039e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2041g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2041g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2036a = -1;
        this.f2037b = Integer.MIN_VALUE;
        this.f2038c = false;
        this.d = false;
        this.f2039e = false;
        int[] iArr = this.f2040f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
