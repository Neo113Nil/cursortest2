package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.tc;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
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
        tc tcVar = (tc) getLayoutParams();
        if (this.f && tcVar.a == i) {
            return;
        }
        tcVar.a = i;
        setLayoutParams(tcVar);
    }

    public void setGuidelineEnd(int i) {
        tc tcVar = (tc) getLayoutParams();
        if (this.f && tcVar.b == i) {
            return;
        }
        tcVar.b = i;
        setLayoutParams(tcVar);
    }

    public void setGuidelinePercent(float f) {
        tc tcVar = (tc) getLayoutParams();
        if (this.f && tcVar.c == f) {
            return;
        }
        tcVar.c = f;
        setLayoutParams(tcVar);
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
