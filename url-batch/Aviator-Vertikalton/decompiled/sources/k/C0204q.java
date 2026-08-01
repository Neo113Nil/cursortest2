package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0170c;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204q extends FrameLayout implements InterfaceC0170c {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f3112a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0204q(View view) {
        super(view.getContext());
        this.f3112a = (CollapsibleActionView) view;
        addView(view);
    }
}
