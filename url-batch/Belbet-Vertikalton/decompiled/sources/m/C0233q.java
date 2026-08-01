package m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import l.InterfaceC0205b;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233q extends FrameLayout implements InterfaceC0205b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f3401a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0233q(View view) {
        super(view.getContext());
        this.f3401a = (CollapsibleActionView) view;
        addView(view);
    }
}
