package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class q0 implements InterfaceC1101x {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f9870a;

    /* renamed from: b, reason: collision with root package name */
    public int f9871b;

    /* renamed from: c, reason: collision with root package name */
    public View f9872c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f9873d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f9874e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9875g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f9876h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f9877i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f9878j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f9879k;

    /* renamed from: l, reason: collision with root package name */
    public int f9880l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f9881m;

    public final void a(int i3) {
        View view;
        int i4 = this.f9871b ^ i3;
        this.f9871b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i5 = this.f9871b & 4;
                Toolbar toolbar = this.f9870a;
                if (i5 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f9881m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f9870a;
            if (i6 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f9876h);
                    toolbar2.setSubtitle(this.f9877i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f9872c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f9871b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f9878j);
            Toolbar toolbar = this.f9870a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f9880l);
            } else {
                toolbar.setNavigationContentDescription(this.f9878j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f9871b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f9874e;
            if (drawable == null) {
                drawable = this.f9873d;
            }
        } else {
            drawable = this.f9873d;
        }
        this.f9870a.setLogo(drawable);
    }
}
