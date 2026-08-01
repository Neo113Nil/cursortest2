package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class w10 extends FrameLayout implements sc {
    public final CollapsibleActionView f;

    /* JADX WARN: Multi-variable type inference failed */
    public w10(View view) {
        super(view.getContext());
        this.f = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.sc
    public final void onActionViewCollapsed() {
        this.f.onActionViewCollapsed();
    }

    @Override // defpackage.sc
    public final void onActionViewExpanded() {
        this.f.onActionViewExpanded();
    }
}
