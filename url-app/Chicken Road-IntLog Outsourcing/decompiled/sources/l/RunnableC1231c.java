package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1231c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f10833b;

    public /* synthetic */ RunnableC1231c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f10832a = i2;
        this.f10833b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10832a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10833b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4150t = actionBarOverlayLayout.f4133c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4151u);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10833b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4150t = actionBarOverlayLayout2.f4133c.animate().translationY(-actionBarOverlayLayout2.f4133c.getHeight()).setListener(actionBarOverlayLayout2.f4151u);
                break;
        }
    }
}
