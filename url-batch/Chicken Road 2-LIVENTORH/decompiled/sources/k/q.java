package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q extends FrameLayout implements j.b {

    /* renamed from: f, reason: collision with root package name */
    public final CollapsibleActionView f2111f;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f2111f = (CollapsibleActionView) view;
        addView(view);
    }
}
