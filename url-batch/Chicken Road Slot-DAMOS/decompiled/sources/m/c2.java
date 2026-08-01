package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c2 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f6051a;

    /* renamed from: b, reason: collision with root package name */
    public int f6052b;

    /* renamed from: c, reason: collision with root package name */
    public View f6053c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f6054d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f6055e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f6056f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f6057h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f6058i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public int f6059k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f6060l;

    public final void a(int i3) {
        View view;
        Toolbar toolbar = this.f6051a;
        int i10 = this.f6052b ^ i3;
        this.f6052b = i3;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                if ((this.f6052b & 4) != 0) {
                    Drawable drawable = this.f6056f;
                    if (drawable == null) {
                        drawable = this.f6060l;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i3 & 8) != 0) {
                    toolbar.setTitle(this.f6057h);
                    toolbar.setSubtitle(this.f6058i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f6053c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f6052b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f6051a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f6059k);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f6052b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f6055e;
            if (drawable == null) {
                drawable = this.f6054d;
            }
        } else {
            drawable = this.f6054d;
        }
        this.f6051a.setLogo(drawable);
    }
}
