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
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class xx extends ConstraintLayout {
    public final m1 v;
    public int w;
    public final ct x;

    public xx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ct ctVar = new ct();
        this.x = ctVar;
        ctVar.setShapeAppearanceModel(ctVar.g.a.e(new tz(0.5f)));
        this.x.r(ColorStateList.valueOf(-1));
        setBackground(this.x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vx.C, R.attr.materialClockStyle, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = new m1(11, this);
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
            m1 m1Var = this.v;
            handler.removeCallbacks(m1Var);
            handler.post(m1Var);
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
            m1 m1Var = this.v;
            handler.removeCallbacks(m1Var);
            handler.post(m1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.x.r(ColorStateList.valueOf(i));
    }
}
