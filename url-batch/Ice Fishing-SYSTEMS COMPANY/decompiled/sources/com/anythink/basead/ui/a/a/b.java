package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.SimpleGuideToClickView;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    SimpleGuideToClickView f10569e;

    public b(View view) {
        super(view);
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public final synchronized void a() {
        View view = this.f10564a;
        if (view != null && view.getParent() != null && (this.f10564a.getParent() instanceof RelativeLayout)) {
            Context context = this.f10564a.getContext();
            if (this.f10569e == null) {
                try {
                    RelativeLayout relativeLayout = (RelativeLayout) this.f10564a.getParent();
                    relativeLayout.setClipChildren(false);
                    SimpleGuideToClickView simpleGuideToClickView = new SimpleGuideToClickView(context);
                    this.f10569e = simpleGuideToClickView;
                    simpleGuideToClickView.init(q.a(context, "myoffer_simple_guide_to_click_cta", "layout"), q.a(context, 1.0f), q.a(context, 3.0f), q.a(context, 6.0f), q.a(context, 6.0f));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(7, this.f10564a.getId());
                    layoutParams.addRule(15);
                    relativeLayout.addView(this.f10569e, layoutParams);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.a.a.a
    public final ValueAnimator e() {
        return null;
    }
}
