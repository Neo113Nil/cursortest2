package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC1236w {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f14052a;

    /* renamed from: b, reason: collision with root package name */
    public int f14053b;

    /* renamed from: c, reason: collision with root package name */
    public View f14054c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f14055d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f14056e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f14057f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14058g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f14059h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f14060i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f14061j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f14062k;

    /* renamed from: l, reason: collision with root package name */
    public int f14063l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f14064m;

    public final void a(int i4) {
        View view;
        Toolbar toolbar = this.f14052a;
        int i5 = this.f14053b ^ i4;
        this.f14053b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    b();
                }
                Toolbar toolbar2 = this.f14052a;
                if ((this.f14053b & 4) != 0) {
                    Drawable drawable = this.f14057f;
                    if (drawable == null) {
                        drawable = this.f14064m;
                    }
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    toolbar.setTitle(this.f14059h);
                    toolbar.setSubtitle(this.f14060i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f14054c) == null) {
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
        Toolbar toolbar = this.f14052a;
        if ((this.f14053b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14061j)) {
                toolbar.setNavigationContentDescription(this.f14063l);
            } else {
                toolbar.setNavigationContentDescription(this.f14061j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i4 = this.f14053b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f14056e;
            if (drawable == null) {
                drawable = this.f14055d;
            }
        } else {
            drawable = this.f14055d;
        }
        this.f14052a.setLogo(drawable);
    }
}
