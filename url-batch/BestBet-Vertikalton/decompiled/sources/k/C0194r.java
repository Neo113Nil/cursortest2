package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC0165b;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194r extends FrameLayout implements InterfaceC0165b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f3217a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0194r(View view) {
        super(view.getContext());
        this.f3217a = (CollapsibleActionView) view;
        addView(view);
    }
}
