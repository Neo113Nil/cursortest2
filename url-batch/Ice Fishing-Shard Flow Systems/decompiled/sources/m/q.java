package m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import l.InterfaceC0647c;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements InterfaceC0647c {

    /* renamed from: d, reason: collision with root package name */
    public final CollapsibleActionView f6467d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f6467d = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // l.InterfaceC0647c
    public final void onActionViewCollapsed() {
        this.f6467d.onActionViewCollapsed();
    }

    @Override // l.InterfaceC0647c
    public final void onActionViewExpanded() {
        this.f6467d.onActionViewExpanded();
    }
}
