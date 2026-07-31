package a3;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.jp0;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    private final View f133a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f134b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f135c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f136d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f137e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f138f;

    public p1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f134b = activity;
        this.f133a = view;
        this.f138f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (this.f135c) {
            return;
        }
        Activity activity = this.f134b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f138f;
            ViewTreeObserver f7 = f(activity);
            if (f7 != null) {
                f7.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        y2.t.y();
        jp0.a(this.f133a, this.f138f);
        this.f135c = true;
    }

    private final void h() {
        Activity activity = this.f134b;
        if (activity != null && this.f135c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f138f;
            ViewTreeObserver f7 = f(activity);
            if (f7 != null) {
                y2.t.r();
                f7.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f135c = false;
        }
    }

    public final void a() {
        this.f137e = false;
        h();
    }

    public final void b() {
        this.f137e = true;
        if (this.f136d) {
            g();
        }
    }

    public final void c() {
        this.f136d = true;
        if (this.f137e) {
            g();
        }
    }

    public final void d() {
        this.f136d = false;
        h();
    }

    public final void e(Activity activity) {
        this.f134b = activity;
    }
}
