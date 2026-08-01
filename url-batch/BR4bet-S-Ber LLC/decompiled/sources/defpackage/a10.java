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
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class a10 extends ConstraintLayout {
    public final n1 v;
    public int w;
    public final dw x;

    public a10(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        dw dwVar = new dw();
        this.x = dwVar;
        dwVar.setShapeAppearanceModel(dwVar.g.a.e(new w20(0.5f)));
        this.x.r(ColorStateList.valueOf(-1));
        setBackground(this.x);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.F, R.attr.materialClockStyle, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = new n1(11, this);
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
            n1 n1Var = this.v;
            handler.removeCallbacks(n1Var);
            handler.post(n1Var);
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
            n1 n1Var = this.v;
            handler.removeCallbacks(n1Var);
            handler.post(n1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.x.r(ColorStateList.valueOf(i));
    }
}
