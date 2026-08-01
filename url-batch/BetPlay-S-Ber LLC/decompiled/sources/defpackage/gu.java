package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gu extends FrameLayout implements bb {
    public final CollapsibleActionView f;

    /* JADX WARN: Multi-variable type inference failed */
    public gu(View view) {
        super(view.getContext());
        this.f = (CollapsibleActionView) view;
        addView(view);
    }
}
