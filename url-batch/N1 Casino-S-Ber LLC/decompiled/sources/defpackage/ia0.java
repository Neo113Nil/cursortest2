package defpackage;

import android.widget.ImageButton;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class ia0 extends ImageButton {
    public int f;

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
