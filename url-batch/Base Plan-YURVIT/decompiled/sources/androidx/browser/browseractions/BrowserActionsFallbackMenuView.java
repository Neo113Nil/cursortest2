package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.crane.slab.beam.R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public final int f1388e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1389f;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1388e = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f1389f = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1388e * 2), this.f1389f), 1073741824), i3);
    }
}
