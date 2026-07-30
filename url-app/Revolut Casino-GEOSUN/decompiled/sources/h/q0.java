package h;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class q0 implements InterfaceC0170x {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2256a;

    /* renamed from: b, reason: collision with root package name */
    public int f2257b;

    /* renamed from: c, reason: collision with root package name */
    public View f2258c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2259d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2260e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2261f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2262g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2263h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2264i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2265j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2266k;

    /* renamed from: l, reason: collision with root package name */
    public int f2267l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f2268m;

    public final void a(int i2) {
        View view;
        int i3 = this.f2257b ^ i2;
        this.f2257b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f2257b & 4;
                Toolbar toolbar = this.f2256a;
                if (i4 != 0) {
                    Drawable drawable = this.f2261f;
                    if (drawable == null) {
                        drawable = this.f2268m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f2256a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f2263h);
                    toolbar2.setSubtitle(this.f2264i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f2258c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2257b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2265j);
            Toolbar toolbar = this.f2256a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2267l);
            } else {
                toolbar.setNavigationContentDescription(this.f2265j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f2257b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f2260e;
            if (drawable == null) {
                drawable = this.f2259d;
            }
        } else {
            drawable = this.f2259d;
        }
        this.f2256a.setLogo(drawable);
    }
}
