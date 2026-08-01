package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class d1 implements InterfaceC0247m0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2951a;

    /* renamed from: b, reason: collision with root package name */
    public int f2952b;

    /* renamed from: c, reason: collision with root package name */
    public View f2953c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2954e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2955f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2956g;
    public CharSequence h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2957j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2958k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2959l;

    /* renamed from: m, reason: collision with root package name */
    public C0244l f2960m;

    /* renamed from: n, reason: collision with root package name */
    public int f2961n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2962o;

    public final void a(int i) {
        View view;
        int i2 = this.f2952b ^ i;
        this.f2952b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f2952b & 4;
                Toolbar toolbar = this.f2951a;
                if (i3 != 0) {
                    Drawable drawable = this.f2955f;
                    if (drawable == null) {
                        drawable = this.f2962o;
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
            Toolbar toolbar2 = this.f2951a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f2953c) == null) {
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
        if ((this.f2952b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2957j);
            Toolbar toolbar = this.f2951a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2961n);
            } else {
                toolbar.setNavigationContentDescription(this.f2957j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f2952b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2954e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f2951a.setLogo(drawable);
    }
}
