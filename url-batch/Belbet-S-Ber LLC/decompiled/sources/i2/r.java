package i2;

import android.widget.ImageButton;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class r extends ImageButton {

    /* renamed from: f, reason: collision with root package name */
    public int f2068f;

    public final void a(int i, boolean z4) {
        super.setVisibility(i);
        if (z4) {
            this.f2068f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f2068f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
