package g1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1799a;

    /* renamed from: b, reason: collision with root package name */
    public int f1800b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1801c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1802e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1804g;

    public u1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f1804g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f1799a = -1;
        this.f1800b = Integer.MIN_VALUE;
        this.f1801c = false;
        this.d = false;
        this.f1802e = false;
        int[] iArr = this.f1803f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
