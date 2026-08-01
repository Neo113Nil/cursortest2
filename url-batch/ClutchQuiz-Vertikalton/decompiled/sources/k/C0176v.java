package k;

import android.widget.PopupWindow;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0177w f2806a;

    public C0176v(C0177w c0177w) {
        this.f2806a = c0177w;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2806a.c();
    }
}
