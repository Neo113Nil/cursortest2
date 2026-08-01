package defpackage;

import android.widget.ImageButton;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class pn0 extends ImageButton {
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
