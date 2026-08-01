package n;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class i1 implements InterfaceC0285l0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3637a;

    /* renamed from: b, reason: collision with root package name */
    public int f3638b;

    /* renamed from: c, reason: collision with root package name */
    public View f3639c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3640d;
    public Drawable e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3641f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3642g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3643h;
    public CharSequence i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3644k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3645l;

    /* renamed from: m, reason: collision with root package name */
    public C0282k f3646m;

    /* renamed from: n, reason: collision with root package name */
    public int f3647n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3648o;

    public final void a(int i) {
        View view;
        int i2 = this.f3638b ^ i;
        this.f3638b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f3638b & 4;
                Toolbar toolbar = this.f3637a;
                if (i3 != 0) {
                    Drawable drawable = this.f3641f;
                    if (drawable == null) {
                        drawable = this.f3648o;
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
            Toolbar toolbar2 = this.f3637a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f3643h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3639c) == null) {
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
        if ((this.f3638b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f3637a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3647n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f3638b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.f3640d;
            }
        } else {
            drawable = this.f3640d;
        }
        this.f3637a.setLogo(drawable);
    }
}
