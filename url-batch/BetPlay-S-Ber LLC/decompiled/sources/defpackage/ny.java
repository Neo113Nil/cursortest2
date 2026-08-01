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
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class ny extends ConstraintLayout {
    public final q1 v;
    public int w;
    public final rt x;

    public ny(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        rt rtVar = new rt();
        this.x = rtVar;
        rtVar.setShapeAppearanceModel(rtVar.g.a.e(new i00(0.5f)));
        this.x.r(ColorStateList.valueOf(-1));
        setBackground(this.x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.D, R.attr.materialClockStyle, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = new q1(11, this);
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
            q1 q1Var = this.v;
            handler.removeCallbacks(q1Var);
            handler.post(q1Var);
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
            q1 q1Var = this.v;
            handler.removeCallbacks(q1Var);
            handler.post(q1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.x.r(ColorStateList.valueOf(i));
    }
}
