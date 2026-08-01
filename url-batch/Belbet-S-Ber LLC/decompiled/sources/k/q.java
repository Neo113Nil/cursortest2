package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q extends FrameLayout implements j.b {

    /* renamed from: f, reason: collision with root package name */
    public final CollapsibleActionView f2259f;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f2259f = (CollapsibleActionView) view;
        addView(view);
    }
}
