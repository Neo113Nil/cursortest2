package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffb extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;
    public fwm c;

    public ffb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffg.b);
        this.a = obtainStyledAttributes.getInt(1, 0);
        this.c = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new fwm();
        if (obtainStyledAttributes.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public ffb() {
        super(-1, -2);
        this.a = 1;
    }

    public ffb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public ffb(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public ffb(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
