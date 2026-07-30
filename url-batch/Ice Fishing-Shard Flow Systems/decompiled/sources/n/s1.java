package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;

/* loaded from: classes.dex */
public final class s1 implements InterfaceC0725n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f6886a;

    /* renamed from: b, reason: collision with root package name */
    public int f6887b;

    /* renamed from: c, reason: collision with root package name */
    public final View f6888c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f6889d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f6890e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f6891f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6892g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f6893h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f6894i;
    public final CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f6895k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6896l;

    /* renamed from: m, reason: collision with root package name */
    public C0716j f6897m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6898n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f6899o;

    public s1(Toolbar toolbar, boolean z7) {
        Drawable drawable;
        this.f6898n = 0;
        this.f6886a = toolbar;
        this.f6893h = toolbar.getTitle();
        this.f6894i = toolbar.getSubtitle();
        this.f6892g = this.f6893h != null;
        this.f6891f = toolbar.getNavigationIcon();
        D0.j R4 = D0.j.R(toolbar.getContext(), null, AbstractC0454a.f5037a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) R4.f331i;
        int i2 = 15;
        this.f6899o = R4.J(15);
        if (z7) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f6892g = true;
                Toolbar toolbar2 = this.f6886a;
                this.f6893h = text;
                if ((this.f6887b & 8) != 0) {
                    toolbar2.setTitle(text);
                    if (this.f6892g) {
                        I.T.j(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f6894i = text2;
                if ((this.f6887b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable J7 = R4.J(20);
            if (J7 != null) {
                this.f6890e = J7;
                c();
            }
            Drawable J8 = R4.J(17);
            if (J8 != null) {
                this.f6889d = J8;
                c();
            }
            if (this.f6891f == null && (drawable = this.f6899o) != null) {
                this.f6891f = drawable;
                Toolbar toolbar3 = this.f6886a;
                if ((this.f6887b & 4) != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f6888c;
                if (view != null && (this.f6887b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f6888c = inflate;
                if (inflate != null && (this.f6887b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f6887b | 16);
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
                toolbar.f3308B.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f3345t = resourceId2;
                C0703c0 c0703c0 = toolbar.f3334e;
                if (c0703c0 != null) {
                    c0703c0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f3346u = resourceId3;
                C0703c0 c0703c02 = toolbar.f3336i;
                if (c0703c02 != null) {
                    c0703c02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f6899o = toolbar.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f6887b = i2;
        }
        R4.W();
        if (R.string.abc_action_bar_up_description != this.f6898n) {
            this.f6898n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i5 = this.f6898n;
                this.j = i5 != 0 ? toolbar.getContext().getString(i5) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new r1(this));
    }

    public final void a(int i2) {
        View view;
        int i5 = this.f6887b ^ i2;
        this.f6887b = i2;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i7 = this.f6887b & 4;
                Toolbar toolbar = this.f6886a;
                if (i7 != 0) {
                    Drawable drawable = this.f6891f;
                    if (drawable == null) {
                        drawable = this.f6899o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            int i8 = i5 & 8;
            Toolbar toolbar2 = this.f6886a;
            if (i8 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f6893h);
                    toolbar2.setSubtitle(this.f6894i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f6888c) == null) {
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
        if ((this.f6887b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f6886a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f6898n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f6887b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f6890e;
            if (drawable == null) {
                drawable = this.f6889d;
            }
        } else {
            drawable = this.f6889d;
        }
        this.f6886a.setLogo(drawable);
    }
}
