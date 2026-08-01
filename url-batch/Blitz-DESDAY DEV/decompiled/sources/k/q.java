package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0145b;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements InterfaceC0145b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2818a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f2818a = (CollapsibleActionView) view;
        addView(view);
    }
}
