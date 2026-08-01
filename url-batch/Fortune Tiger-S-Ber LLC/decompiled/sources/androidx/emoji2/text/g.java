package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import b1.n0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f336a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f337b;
    public final Object c;

    public g(n0 n0Var) {
        this.f336a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.f337b = n0Var;
    }

    public static g a(n0 n0Var, int i4) {
        if (i4 == 0) {
            return new b1.y(n0Var, 0);
        }
        if (i4 == 1) {
            return new b1.y(n0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i4);

    public g(k kVar) {
        this.f336a = 0;
        this.c = new d();
        this.f337b = kVar;
    }
}
