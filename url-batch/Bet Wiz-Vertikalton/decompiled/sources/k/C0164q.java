package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0140b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164q extends FrameLayout implements InterfaceC0140b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2714a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0164q(View view) {
        super(view.getContext());
        this.f2714a = (CollapsibleActionView) view;
        addView(view);
    }
}
