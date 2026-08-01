package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.df;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
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
        df dfVar = (df) getLayoutParams();
        if (this.f && dfVar.a == i) {
            return;
        }
        dfVar.a = i;
        setLayoutParams(dfVar);
    }

    public void setGuidelineEnd(int i) {
        df dfVar = (df) getLayoutParams();
        if (this.f && dfVar.b == i) {
            return;
        }
        dfVar.b = i;
        setLayoutParams(dfVar);
    }

    public void setGuidelinePercent(float f) {
        df dfVar = (df) getLayoutParams();
        if (this.f && dfVar.c == f) {
            return;
        }
        dfVar.c = f;
        setLayoutParams(dfVar);
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
