package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class rt extends FrameLayout implements za {
    public final CollapsibleActionView f;

    /* JADX WARN: Multi-variable type inference failed */
    public rt(View view) {
        super(view.getContext());
        this.f = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.za
    public final void onActionViewCollapsed() {
        this.f.onActionViewCollapsed();
    }

    @Override // defpackage.za
    public final void onActionViewExpanded() {
        this.f.onActionViewExpanded();
    }
}
