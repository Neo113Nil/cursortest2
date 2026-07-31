package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i2 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f4278a;

    /* renamed from: b, reason: collision with root package name */
    public int f4279b;

    /* renamed from: c, reason: collision with root package name */
    public View f4280c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4281d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4282e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4283f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4284g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f4285h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4286j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f4287k;

    /* renamed from: l, reason: collision with root package name */
    public int f4288l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4289m;

    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f4278a;
        int i8 = this.f4279b ^ i;
        this.f4279b = i;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.f4279b & 4) != 0) {
                    Drawable drawable = this.f4283f;
                    if (drawable == null) {
                        drawable = this.f4289m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i8 & 3) != 0) {
                c();
            }
            if ((i8 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f4285h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f4280c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f4278a;
        if ((this.f4279b & 4) != 0) {
            if (TextUtils.isEmpty(this.f4286j)) {
                toolbar.setNavigationContentDescription(this.f4288l);
            } else {
                toolbar.setNavigationContentDescription(this.f4286j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f4279b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f4282e;
            if (drawable == null) {
                drawable = this.f4281d;
            }
        } else {
            drawable = this.f4281d;
        }
        this.f4278a.setLogo(drawable);
    }
}
