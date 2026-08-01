package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class d1 implements InterfaceC0228m0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3052a;

    /* renamed from: b, reason: collision with root package name */
    public int f3053b;

    /* renamed from: c, reason: collision with root package name */
    public View f3054c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3055e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3056f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3057g;
    public CharSequence h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3058j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3059k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3060l;

    /* renamed from: m, reason: collision with root package name */
    public C0223k f3061m;

    /* renamed from: n, reason: collision with root package name */
    public int f3062n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3063o;

    public final void a(int i) {
        View view;
        int i2 = this.f3053b ^ i;
        this.f3053b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f3053b & 4;
                Toolbar toolbar = this.f3052a;
                if (i3 != 0) {
                    Drawable drawable = this.f3056f;
                    if (drawable == null) {
                        drawable = this.f3063o;
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
            Toolbar toolbar2 = this.f3052a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3054c) == null) {
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
        if ((this.f3053b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3058j);
            Toolbar toolbar = this.f3052a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3062n);
            } else {
                toolbar.setNavigationContentDescription(this.f3058j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f3053b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f3055e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f3052a.setLogo(drawable);
    }
}
