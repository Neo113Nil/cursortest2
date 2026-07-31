package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class s0 implements InterfaceC0440B {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f5088a;

    /* renamed from: b, reason: collision with root package name */
    public int f5089b;

    /* renamed from: c, reason: collision with root package name */
    public View f5090c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f5091d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f5092e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f5093f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5094g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f5095h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f5096i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f5097j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f5098k;

    /* renamed from: l, reason: collision with root package name */
    public int f5099l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f5100m;

    public final void a(int i7) {
        View view;
        Toolbar toolbar = this.f5088a;
        int i8 = this.f5089b ^ i7;
        this.f5089b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                Toolbar toolbar2 = this.f5088a;
                if ((this.f5089b & 4) != 0) {
                    Drawable drawable = this.f5093f;
                    if (drawable == null) {
                        drawable = this.f5100m;
                    }
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            if ((i8 & 3) != 0) {
                c();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    toolbar.setTitle(this.f5095h);
                    toolbar.setSubtitle(this.f5096i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f5090c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f5088a;
        if ((this.f5089b & 4) != 0) {
            if (TextUtils.isEmpty(this.f5097j)) {
                toolbar.setNavigationContentDescription(this.f5099l);
            } else {
                toolbar.setNavigationContentDescription(this.f5097j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f5089b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) != 0) {
            drawable = this.f5092e;
            if (drawable == null) {
                drawable = this.f5091d;
            }
        } else {
            drawable = this.f5091d;
        }
        this.f5088a.setLogo(drawable);
    }
}
