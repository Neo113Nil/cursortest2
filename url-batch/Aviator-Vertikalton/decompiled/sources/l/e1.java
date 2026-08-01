package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.fortuneink.neonpad.R;

/* loaded from: classes.dex */
public final class e1 implements InterfaceC0275n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f3352a;

    /* renamed from: b, reason: collision with root package name */
    public int f3353b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3354c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3355d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3356e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f3357f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3358g;
    public CharSequence h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f3359j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3360k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3361l;

    /* renamed from: m, reason: collision with root package name */
    public C0268k f3362m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3363n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f3364o;

    public e1(Toolbar toolbar, boolean z2) {
        Drawable drawable;
        this.f3363n = 0;
        this.f3352a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f3358g = this.h != null;
        this.f3357f = toolbar.getNavigationIcon();
        T.r r2 = T.r.r(toolbar.getContext(), null, f.a.f2387a, R.attr.actionBarStyle);
        int i = 15;
        this.f3364o = r2.h(15);
        if (z2) {
            TypedArray typedArray = (TypedArray) r2.f811c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f3358g = true;
                this.h = text;
                if ((this.f3353b & 8) != 0) {
                    Toolbar toolbar2 = this.f3352a;
                    toolbar2.setTitle(text);
                    if (this.f3358g) {
                        K.X.m(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f3353b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable h = r2.h(20);
            if (h != null) {
                this.f3356e = h;
                c();
            }
            Drawable h2 = r2.h(17);
            if (h2 != null) {
                this.f3355d = h2;
                c();
            }
            if (this.f3357f == null && (drawable = this.f3364o) != null) {
                this.f3357f = drawable;
                int i2 = this.f3353b & 4;
                Toolbar toolbar3 = this.f3352a;
                if (i2 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f3354c;
                if (view != null && (this.f3353b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f3354c = inflate;
                if (inflate != null && (this.f3353b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f3353b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f1097t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f1089l = resourceId2;
                C0257e0 c0257e0 = toolbar.f1081b;
                if (c0257e0 != null) {
                    c0257e0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f1090m = resourceId3;
                C0257e0 c0257e02 = toolbar.f1082c;
                if (c0257e02 != null) {
                    c0257e02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f3364o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f3353b = i;
        }
        r2.t();
        if (R.string.abc_action_bar_up_description != this.f3363n) {
            this.f3363n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.f3363n;
                this.f3359j = i3 != 0 ? toolbar.getContext().getString(i3) : null;
                b();
            }
        }
        this.f3359j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new d1(this));
    }

    public final void a(int i) {
        View view;
        int i2 = this.f3353b ^ i;
        this.f3353b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i3 = this.f3353b & 4;
                Toolbar toolbar = this.f3352a;
                if (i3 != 0) {
                    Drawable drawable = this.f3357f;
                    if (drawable == null) {
                        drawable = this.f3364o;
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
            Toolbar toolbar2 = this.f3352a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3354c) == null) {
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
        if ((this.f3353b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3359j);
            Toolbar toolbar = this.f3352a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3363n);
            } else {
                toolbar.setNavigationContentDescription(this.f3359j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f3353b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f3356e;
            if (drawable == null) {
                drawable = this.f3355d;
            }
        } else {
            drawable = this.f3355d;
        }
        this.f3352a.setLogo(drawable);
    }
}
