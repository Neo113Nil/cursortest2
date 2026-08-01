package b1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public int f786a;

    /* renamed from: b, reason: collision with root package name */
    public int f787b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f788d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f789e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f790f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public g1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f786a = -1;
        this.f787b = Integer.MIN_VALUE;
        this.c = false;
        this.f788d = false;
        this.f789e = false;
        int[] iArr = this.f790f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
