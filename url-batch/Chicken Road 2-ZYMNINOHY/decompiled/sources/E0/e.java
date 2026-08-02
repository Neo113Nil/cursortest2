package E0;

import T.N;
import T.S;
import android.graphics.Rect;
import android.view.View;
import l1.C1266m;
import l1.t;
import y0.F;

/* loaded from: classes.dex */
public abstract class e implements N {

    /* renamed from: b, reason: collision with root package name */
    public final Object f471b;

    public e() {
        this.f471b = new S();
    }

    public static e a(t tVar, int i4) {
        if (i4 == 0) {
            return new C1266m(tVar, 0);
        }
        if (i4 == 1) {
            return new C1266m(tVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract void g(int i4, long j4);

    public e(F f4) {
        this.f471b = f4;
    }

    public e(t tVar) {
        new Rect();
        this.f471b = tVar;
    }
}
