package f1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1348a;

    /* renamed from: b, reason: collision with root package name */
    public int f1349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1350c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1351e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1353g;

    public f1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f1353g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f1348a = -1;
        this.f1349b = Integer.MIN_VALUE;
        this.f1350c = false;
        this.d = false;
        this.f1351e = false;
        int[] iArr = this.f1352f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
