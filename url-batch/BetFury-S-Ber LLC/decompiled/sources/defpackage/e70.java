package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class e70 extends ConstraintLayout {
    public final r1 v;
    public int w;
    public final g10 x;

    public e70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g10 g10Var = new g10();
        this.x = g10Var;
        g10Var.setShapeAppearanceModel(g10Var.g.a.e(new e90(0.5f)));
        this.x.r(ColorStateList.valueOf(-1));
        setBackground(this.x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.E, R.attr.materialClockStyle, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = new r1(11, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            r1 r1Var = this.v;
            handler.removeCallbacks(r1Var);
            handler.post(r1Var);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            r1 r1Var = this.v;
            handler.removeCallbacks(r1Var);
            handler.post(r1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.x.r(ColorStateList.valueOf(i));
    }
}
