package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import f.a;

/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    private final int f495f;

    /* renamed from: g, reason: collision with root package name */
    private final int f496g;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f495f = getResources().getDimensionPixelOffset(a.f16081b);
        this.f496g = getResources().getDimensionPixelOffset(a.f16080a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f495f * 2), this.f496g), 1073741824), i8);
    }
}
