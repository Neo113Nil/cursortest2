package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
final class d extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f13277d;

    /* renamed from: e, reason: collision with root package name */
    private ViewPager2.k f13278e;

    d(LinearLayoutManager linearLayoutManager) {
        this.f13277d = linearLayoutManager;
    }

    ViewPager2.k a() {
        return this.f13278e;
    }

    void b(ViewPager2.k kVar) {
        this.f13278e = kVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrolled(int i4, float f4, int i5) {
        if (this.f13278e == null) {
            return;
        }
        float f5 = -f4;
        for (int i6 = 0; i6 < this.f13277d.getChildCount(); i6++) {
            View childAt = this.f13277d.getChildAt(i6);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i6), Integer.valueOf(this.f13277d.getChildCount())));
            }
            this.f13278e.transformPage(childAt, (this.f13277d.getPosition(childAt) - i4) + f5);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i4) {
    }
}
