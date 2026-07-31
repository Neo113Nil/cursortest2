package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import n.AbstractC3263a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f10990a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10991b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10990a = getResources().getDimensionPixelOffset(AbstractC3263a.f41374b);
        this.f10991b = getResources().getDimensionPixelOffset(AbstractC3263a.f41373a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f10990a * 2), this.f10991b), 1073741824), i5);
    }
}
