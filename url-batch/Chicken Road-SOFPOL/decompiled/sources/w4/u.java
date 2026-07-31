package w4;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public Object f8038a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8039b;

    public u() {
        this.f8039b = new int[2];
    }

    public static u a(d0 d0Var, int i) {
        if (i == 0) {
            return new t(d0Var, 0);
        }
        if (i == 1) {
            return new t(d0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int[] b(int i);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public int[] l(int i, int i8) {
        if (i < 0 || i8 < 0 || i == i8) {
            return null;
        }
        int[] iArr = (int[]) this.f8039b;
        iArr[0] = i;
        iArr[1] = i8;
        return iArr;
    }

    public abstract int m();

    public String n() {
        String str = (String) this.f8038a;
        if (str != null) {
            return str;
        }
        q6.i.j("text");
        throw null;
    }

    public abstract int o();

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public abstract int[] s(int i);

    public u(d0 d0Var) {
        this.f8039b = new Rect();
        this.f8038a = d0Var;
    }
}
