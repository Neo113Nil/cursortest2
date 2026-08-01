package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC0148b;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173q extends FrameLayout implements InterfaceC0148b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2870a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0173q(View view) {
        super(view.getContext());
        this.f2870a = (CollapsibleActionView) view;
        addView(view);
    }
}
