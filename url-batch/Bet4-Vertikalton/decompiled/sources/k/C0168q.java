package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0143b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168q extends FrameLayout implements InterfaceC0143b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2738a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0168q(View view) {
        super(view.getContext());
        this.f2738a = (CollapsibleActionView) view;
        addView(view);
    }
}
