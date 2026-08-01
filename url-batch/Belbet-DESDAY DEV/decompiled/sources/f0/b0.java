package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2035a;

    /* renamed from: b, reason: collision with root package name */
    public int f2036b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2037c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2038e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2040g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2040g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2035a = -1;
        this.f2036b = Integer.MIN_VALUE;
        this.f2037c = false;
        this.d = false;
        this.f2038e = false;
        int[] iArr = this.f2039f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
