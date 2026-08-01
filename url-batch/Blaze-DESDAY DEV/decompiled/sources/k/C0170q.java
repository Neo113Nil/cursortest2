package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0145b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170q extends FrameLayout implements InterfaceC0145b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2766a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0170q(View view) {
        super(view.getContext());
        this.f2766a = (CollapsibleActionView) view;
        addView(view);
    }
}
