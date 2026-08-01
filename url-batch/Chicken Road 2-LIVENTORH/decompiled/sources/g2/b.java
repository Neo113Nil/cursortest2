package g2;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends FrameLayout implements i {

    /* renamed from: f, reason: collision with root package name */
    public boolean f1705f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1706g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1707h;

    public final void a() {
        setVisibility((!this.f1707h || (!this.f1705f && this.f1706g)) ? 8 : 0);
    }

    @Override // k.z
    public final void b(k.o oVar) {
        a();
    }

    @Override // k.z
    public k.o getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    public void setDividersEnabled(boolean z3) {
        this.f1707h = z3;
        a();
    }

    @Override // g2.i
    public void setExpanded(boolean z3) {
        this.f1705f = z3;
        a();
    }

    @Override // g2.i
    public void setOnlyShowWhenExpanded(boolean z3) {
        this.f1706g = z3;
        a();
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
