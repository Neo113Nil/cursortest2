package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class d1 implements InterfaceC0247m0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2974a;

    /* renamed from: b, reason: collision with root package name */
    public int f2975b;

    /* renamed from: c, reason: collision with root package name */
    public View f2976c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2977e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2978f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2979g;
    public CharSequence h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2980j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2981k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2982l;

    /* renamed from: m, reason: collision with root package name */
    public C0244l f2983m;

    /* renamed from: n, reason: collision with root package name */
    public int f2984n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2985o;

    public final void a(int i) {
        View view;
        int i2 = this.f2975b ^ i;
        this.f2975b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f2975b & 4;
                Toolbar toolbar = this.f2974a;
                if (i3 != 0) {
                    Drawable drawable = this.f2978f;
                    if (drawable == null) {
                        drawable = this.f2985o;
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
            Toolbar toolbar2 = this.f2974a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f2976c) == null) {
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
        if ((this.f2975b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2980j);
            Toolbar toolbar = this.f2974a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2984n);
            } else {
                toolbar.setNavigationContentDescription(this.f2980j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f2975b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2977e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.f2974a.setLogo(drawable);
    }
}
