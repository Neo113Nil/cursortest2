package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0171c;

/* renamed from: k.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206q extends FrameLayout implements InterfaceC0171c {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f3116a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0206q(View view) {
        super(view.getContext());
        this.f3116a = (CollapsibleActionView) view;
        addView(view);
    }
}
