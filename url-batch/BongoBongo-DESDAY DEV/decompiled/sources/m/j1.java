package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class j1 implements InterfaceC0226m0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3110a;

    /* renamed from: b, reason: collision with root package name */
    public int f3111b;

    /* renamed from: c, reason: collision with root package name */
    public View f3112c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3113e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3115g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3116h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3117j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3118k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3119l;

    /* renamed from: m, reason: collision with root package name */
    public C0221k f3120m;

    /* renamed from: n, reason: collision with root package name */
    public int f3121n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3122o;

    public final void a(int i) {
        View view;
        int i2 = this.f3111b ^ i;
        this.f3111b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f3111b & 4;
                Toolbar toolbar = this.f3110a;
                if (i3 != 0) {
                    Drawable drawable = this.f3114f;
                    if (drawable == null) {
                        drawable = this.f3122o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                c();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f3110a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f3116h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3112c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f3111b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3117j);
            Toolbar toolbar = this.f3110a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3121n);
            } else {
                toolbar.setNavigationContentDescription(this.f3117j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f3111b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f3113e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f3110a.setLogo(drawable);
    }
}
