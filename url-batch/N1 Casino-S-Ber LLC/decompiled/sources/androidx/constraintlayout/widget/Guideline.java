package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.pc;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
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
        pc pcVar = (pc) getLayoutParams();
        if (this.f && pcVar.a == i) {
            return;
        }
        pcVar.a = i;
        setLayoutParams(pcVar);
    }

    public void setGuidelineEnd(int i) {
        pc pcVar = (pc) getLayoutParams();
        if (this.f && pcVar.b == i) {
            return;
        }
        pcVar.b = i;
        setLayoutParams(pcVar);
    }

    public void setGuidelinePercent(float f) {
        pc pcVar = (pc) getLayoutParams();
        if (this.f && pcVar.c == f) {
            return;
        }
        pcVar.c = f;
        setLayoutParams(pcVar);
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
