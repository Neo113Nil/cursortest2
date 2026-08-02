package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.rockchicken.pump.up.road.R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f4499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4500b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4499a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f4500b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4499a * 2), this.f4500b), 1073741824), i5);
    }
}
