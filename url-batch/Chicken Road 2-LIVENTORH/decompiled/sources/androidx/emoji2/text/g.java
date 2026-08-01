package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import f1.m0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f325a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f326b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f327c;

    public g(m0 m0Var) {
        this.f325a = Integer.MIN_VALUE;
        this.f327c = new Rect();
        this.f326b = m0Var;
    }

    public static g a(m0 m0Var, int i) {
        if (i == 0) {
            return new f1.x(m0Var, 0);
        }
        if (i == 1) {
            return new f1.x(m0Var, 1);
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
        this.f325a = 0;
        this.f327c = new d();
        this.f326b = kVar;
    }
}
