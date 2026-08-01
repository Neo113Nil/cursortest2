package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d3 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2269a;

    /* renamed from: b, reason: collision with root package name */
    public int f2270b;

    /* renamed from: c, reason: collision with root package name */
    public View f2271c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2272e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2273f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2274g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2275h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2276j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2277k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2278l;

    /* renamed from: m, reason: collision with root package name */
    public l f2279m;

    /* renamed from: n, reason: collision with root package name */
    public int f2280n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2281o;

    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f2269a;
        int i4 = this.f2270b ^ i;
        this.f2270b = i;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.f2270b & 4) != 0) {
                    Drawable drawable = this.f2273f;
                    if (drawable == null) {
                        drawable = this.f2281o;
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
                    toolbar.setTitle(this.f2275h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f2271c) == null) {
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
        Toolbar toolbar = this.f2269a;
        if ((this.f2270b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2276j)) {
                toolbar.setNavigationContentDescription(this.f2280n);
            } else {
                toolbar.setNavigationContentDescription(this.f2276j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f2270b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2272e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f2269a.setLogo(drawable);
    }
}
