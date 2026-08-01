package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z2 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2699a;

    /* renamed from: b, reason: collision with root package name */
    public int f2700b;
    public View c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2701d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2702e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2703f;
    public boolean g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2704i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2705j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2706k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2707l;

    /* renamed from: m, reason: collision with root package name */
    public k f2708m;

    /* renamed from: n, reason: collision with root package name */
    public int f2709n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2710o;

    public final void a(int i4) {
        View view;
        Toolbar toolbar = this.f2699a;
        int i5 = this.f2700b ^ i4;
        this.f2700b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    b();
                }
                if ((this.f2700b & 4) != 0) {
                    Drawable drawable = this.f2703f;
                    if (drawable == null) {
                        drawable = this.f2710o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f2704i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f2699a;
        if ((this.f2700b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2705j)) {
                toolbar.setNavigationContentDescription(this.f2709n);
            } else {
                toolbar.setNavigationContentDescription(this.f2705j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i4 = this.f2700b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f2702e;
            if (drawable == null) {
                drawable = this.f2701d;
            }
        } else {
            drawable = this.f2701d;
        }
        this.f2699a.setLogo(drawable);
    }
}
