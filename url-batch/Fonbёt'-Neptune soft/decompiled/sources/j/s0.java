package j;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class s0 implements InterfaceC0249z {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3035a;

    /* renamed from: b, reason: collision with root package name */
    public int f3036b;

    /* renamed from: c, reason: collision with root package name */
    public View f3037c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3038d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3039e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3040f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3041g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3042h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f3043i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3044j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3045k;

    /* renamed from: l, reason: collision with root package name */
    public int f3046l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3047m;

    public final void a(int i2) {
        View view;
        int i3 = this.f3036b ^ i2;
        this.f3036b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f3036b & 4;
                Toolbar toolbar = this.f3035a;
                if (i4 != 0) {
                    Drawable drawable = this.f3040f;
                    if (drawable == null) {
                        drawable = this.f3047m;
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
            Toolbar toolbar2 = this.f3035a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f3042h);
                    toolbar2.setSubtitle(this.f3043i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f3037c) == null) {
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
        if ((this.f3036b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3044j);
            Toolbar toolbar = this.f3035a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3046l);
            } else {
                toolbar.setNavigationContentDescription(this.f3044j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f3036b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f3039e;
            if (drawable == null) {
                drawable = this.f3038d;
            }
        } else {
            drawable = this.f3038d;
        }
        this.f3035a.setLogo(drawable);
    }
}
