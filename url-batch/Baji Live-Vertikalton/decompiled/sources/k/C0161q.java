package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0138b;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161q extends FrameLayout implements InterfaceC0138b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2716a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0161q(View view) {
        super(view.getContext());
        this.f2716a = (CollapsibleActionView) view;
        addView(view);
    }
}
