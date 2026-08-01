package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class PangleViewStub extends View {
    private View icD;
    private final pvs pvs;

    public interface pvs {
        View pvs(Context context);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public PangleViewStub(Context context, pvs pvsVar) {
        super(context);
        this.pvs = pvsVar;
        pvs();
    }

    private void pvs() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.icD;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            icD();
        }
    }

    private View icD() {
        pvs pvsVar;
        if (this.icD == null && (pvsVar = this.pvs) != null) {
            this.icD = pvsVar.pvs(getContext());
            pvs(this.icD, (ViewGroup) getParent());
        }
        return this.icD;
    }

    private void pvs(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
