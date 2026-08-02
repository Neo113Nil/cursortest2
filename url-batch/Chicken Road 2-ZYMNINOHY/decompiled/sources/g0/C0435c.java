package g0;

import T.C0096n;
import T.C0097o;
import T.F;
import java.util.ArrayList;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435c {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8829c = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a, reason: collision with root package name */
    public a2.i f8830a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8831b;

    public static void a(int i4, ArrayList arrayList) {
        if (O3.d.r(i4, 0, 7, f8829c) == -1 || arrayList.contains(Integer.valueOf(i4))) {
            return;
        }
        arrayList.add(Integer.valueOf(i4));
    }

    public final C0097o b(C0097o c0097o) {
        if (!this.f8831b || !this.f8830a.f(c0097o)) {
            return c0097o;
        }
        C0096n a3 = c0097o.a();
        String str = c0097o.f2866k;
        a3.f2831m = F.n("application/x-media3-cues");
        a3.f2816K = this.f8830a.c(c0097o);
        StringBuilder sb = new StringBuilder();
        sb.append(c0097o.n);
        sb.append(str != null ? " ".concat(str) : "");
        a3.f2828j = sb.toString();
        a3.f2834r = Long.MAX_VALUE;
        return new C0097o(a3);
    }
}
