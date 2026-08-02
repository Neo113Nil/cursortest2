package com.squareup.util.android;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* loaded from: classes4.dex */
public final /* synthetic */ class Views$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ View f$0;
    public final /* synthetic */ View f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ Views$$ExternalSyntheticLambda0(View view, View view2, int i, int i2, int i3, int i4) {
        this.f$0 = view;
        this.f$1 = view2;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = i3;
        this.f$5 = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect = new Rect();
        View view = this.f$1;
        view.getHitRect(rect);
        rect.set(rect.left - this.f$2, rect.top - this.f$3, rect.right + this.f$4, rect.bottom + this.f$5);
        this.f$0.setTouchDelegate(new TouchDelegate(rect, view));
    }
}
