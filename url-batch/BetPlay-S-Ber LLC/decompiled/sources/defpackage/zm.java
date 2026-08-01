package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class zm extends ay {
    public static final float[] k;
    public final GradientDrawable f;
    public final int[] g;
    public final boolean h;
    public int i;
    public final float j;

    static {
        float[] fArr = new float[100];
        k = fArr;
        PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        int length = fArr.length - 1;
        for (int i = length; i >= 0; i--) {
            k[i] = pathInterpolator.getInterpolation((length - i) / length);
        }
    }

    public zm(int i) {
        super(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f = gradientDrawable;
        this.g = new int[100];
        this.i = 0;
        this.j = 1.2f;
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        this.h = true;
        e(i);
    }

    @Override // defpackage.ay
    public final void a(int i) {
        if (this.h) {
            return;
        }
        e(i);
    }

    @Override // defpackage.ay
    public final int b(int i) {
        return (int) (this.j * i);
    }

    public final void e(int i) {
        if (this.i != i) {
            this.i = i;
            int[] iArr = this.g;
            for (int length = iArr.length - 1; length >= 0; length--) {
                iArr[length] = Color.argb((int) (k[length] * Color.alpha(i)), Color.red(i), Color.green(i), Color.blue(i));
            }
            GradientDrawable gradientDrawable = this.f;
            gradientDrawable.setColors(iArr);
            zx zxVar = this.b;
            zxVar.e = gradientDrawable;
            h5 h5Var = zxVar.i;
            if (h5Var != null) {
                ((View) h5Var.h).setBackground(gradientDrawable);
            }
        }
    }
}
