package k0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3203k {

    /* renamed from: a, reason: collision with root package name */
    private Context f40947a;

    /* renamed from: b, reason: collision with root package name */
    private int f40948b = -1;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f40949c;

    /* renamed from: d, reason: collision with root package name */
    private View f40950d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f40951e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f40952f;

    public C3203k(ViewGroup viewGroup, View view) {
        this.f40949c = viewGroup;
        this.f40950d = view;
    }

    public static C3203k c(ViewGroup viewGroup) {
        return (C3203k) viewGroup.getTag(AbstractC3201i.f40945b);
    }

    static void f(ViewGroup viewGroup, C3203k c3203k) {
        viewGroup.setTag(AbstractC3201i.f40945b, c3203k);
    }

    public void a() {
        if (this.f40948b > 0 || this.f40950d != null) {
            d().removeAllViews();
            if (this.f40948b > 0) {
                LayoutInflater.from(this.f40947a).inflate(this.f40948b, this.f40949c);
            } else {
                this.f40949c.addView(this.f40950d);
            }
        }
        Runnable runnable = this.f40951e;
        if (runnable != null) {
            runnable.run();
        }
        f(this.f40949c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f40949c) != this || (runnable = this.f40952f) == null) {
            return;
        }
        runnable.run();
    }

    public ViewGroup d() {
        return this.f40949c;
    }

    boolean e() {
        return this.f40948b > 0;
    }

    public void g(Runnable runnable) {
        this.f40952f = runnable;
    }
}
