package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0141b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165q extends FrameLayout implements InterfaceC0141b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2665a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0165q(View view) {
        super(view.getContext());
        this.f2665a = (CollapsibleActionView) view;
        addView(view);
    }
}
