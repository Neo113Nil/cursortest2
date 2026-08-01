package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.pd;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean f;

    public Guideline(Context context) {
        super(context);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f = z;
    }

    public void setGuidelineBegin(int i) {
        pd pdVar = (pd) getLayoutParams();
        if (this.f && pdVar.a == i) {
            return;
        }
        pdVar.a = i;
        setLayoutParams(pdVar);
    }

    public void setGuidelineEnd(int i) {
        pd pdVar = (pd) getLayoutParams();
        if (this.f && pdVar.b == i) {
            return;
        }
        pdVar.b = i;
        setLayoutParams(pdVar);
    }

    public void setGuidelinePercent(float f) {
        pd pdVar = (pd) getLayoutParams();
        if (this.f && pdVar.c == f) {
            return;
        }
        pdVar.c = f;
        setLayoutParams(pdVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
