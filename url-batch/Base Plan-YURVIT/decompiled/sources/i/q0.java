package i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class q0 implements InterfaceC0177y {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2284a;

    /* renamed from: b, reason: collision with root package name */
    public int f2285b;

    /* renamed from: c, reason: collision with root package name */
    public View f2286c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2287d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2288e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2289f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2290g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2291h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2292i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2293j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2294k;

    /* renamed from: l, reason: collision with root package name */
    public int f2295l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f2296m;

    public final void a(int i2) {
        View view;
        Toolbar toolbar = this.f2284a;
        int i3 = this.f2285b ^ i2;
        this.f2285b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                Toolbar toolbar2 = this.f2284a;
                if ((this.f2285b & 4) != 0) {
                    Drawable drawable = this.f2289f;
                    if (drawable == null) {
                        drawable = this.f2296m;
                    }
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    toolbar.setTitle(this.f2291h);
                    toolbar.setSubtitle(this.f2292i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f2286c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f2284a;
        if ((this.f2285b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2293j)) {
                toolbar.setNavigationContentDescription(this.f2295l);
            } else {
                toolbar.setNavigationContentDescription(this.f2293j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f2285b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f2288e;
            if (drawable == null) {
                drawable = this.f2287d;
            }
        } else {
            drawable = this.f2287d;
        }
        this.f2284a.setLogo(drawable);
    }
}
