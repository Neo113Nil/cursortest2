package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sw extends FrameLayout implements ub {
    public final CollapsibleActionView f;

    /* JADX WARN: Multi-variable type inference failed */
    public sw(View view) {
        super(view.getContext());
        this.f = (CollapsibleActionView) view;
        addView(view);
    }
}
