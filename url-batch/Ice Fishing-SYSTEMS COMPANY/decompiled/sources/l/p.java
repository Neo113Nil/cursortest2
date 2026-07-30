package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC4615c;

/* loaded from: classes.dex */
public final class p extends FrameLayout implements InterfaceC4615c {

    /* renamed from: n, reason: collision with root package name */
    public final CollapsibleActionView f39003n;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f39003n = (CollapsibleActionView) view;
        addView(view);
    }
}
