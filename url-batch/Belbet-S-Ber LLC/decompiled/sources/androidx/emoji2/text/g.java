package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import g1.a1;
import g1.k0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f448a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f449b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f450c;

    public g(a1 a1Var) {
        this.f448a = Integer.MIN_VALUE;
        this.f450c = new Rect();
        this.f449b = a1Var;
    }

    public static g a(a1 a1Var, int i) {
        if (i == 0) {
            return new k0(a1Var, 0);
        }
        if (i == 1) {
            return new k0(a1Var, 1);
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

    public abstract void o(int i);

    public g(k kVar) {
        this.f448a = 0;
        this.f450c = new d();
        this.f449b = kVar;
    }
}
