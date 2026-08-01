package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d5 {
    public final ImageView a;
    public gc b;
    public int c = 0;

    public d5(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        gc gcVar;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            xf.a(drawable);
        }
        if (drawable == null || (gcVar = this.b) == null) {
            return;
        }
        y4.e(drawable, gcVar, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = my.f;
        r6 u = r6.u(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) u.b;
        e90.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) u.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = l70.p(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                xf.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(u.j(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(xf.b(typedArray.getInt(3, -1), null));
            }
            u.w();
        } catch (Throwable th) {
            u.w();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable p = l70.p(imageView.getContext(), i);
            if (p != null) {
                xf.a(p);
            }
            imageView.setImageDrawable(p);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
