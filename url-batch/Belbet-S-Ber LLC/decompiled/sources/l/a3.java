package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a3 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2391a;

    /* renamed from: b, reason: collision with root package name */
    public int f2392b;

    /* renamed from: c, reason: collision with root package name */
    public View f2393c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2394e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2395f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2396g;
    public CharSequence h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2397j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2398k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2399l;

    /* renamed from: m, reason: collision with root package name */
    public j f2400m;

    /* renamed from: n, reason: collision with root package name */
    public int f2401n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2402o;

    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f2391a;
        int i4 = this.f2392b ^ i;
        this.f2392b = i;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.f2392b & 4) != 0) {
                    Drawable drawable = this.f2395f;
                    if (drawable == null) {
                        drawable = this.f2402o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            if ((i4 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f2393c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f2391a;
        if ((this.f2392b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2397j)) {
                toolbar.setNavigationContentDescription(this.f2401n);
            } else {
                toolbar.setNavigationContentDescription(this.f2397j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f2392b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2394e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f2391a.setLogo(drawable);
    }
}
