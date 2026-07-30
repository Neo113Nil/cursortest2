package I;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Rect[][] f1192a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect[][] f1193b;

    public h0() {
        this(new v0());
    }

    public abstract v0 b();

    public void c(v0 v0Var) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            List<Rect> e7 = v0Var.f1239a.e(i2);
            int P7 = O6.g.P(i2);
            this.f1192a[P7] = (Rect[]) e7.toArray(new Rect[e7.size()]);
            if (i2 != 8) {
                List<Rect> f7 = v0Var.f1239a.f(i2);
                this.f1193b[P7] = (Rect[]) f7.toArray(new Rect[f7.size()]);
            }
        }
    }

    public abstract void d(B.c cVar);

    public abstract void e(B.c cVar);

    public h0(v0 v0Var) {
        this.f1192a = new Rect[10][];
        this.f1193b = new Rect[10][];
        c(v0Var);
    }

    public final void a() {
    }
}
