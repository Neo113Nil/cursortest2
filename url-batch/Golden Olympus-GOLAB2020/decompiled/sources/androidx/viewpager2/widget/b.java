package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    private final List f13273d;

    b(int i4) {
        this.f13273d = new ArrayList(i4);
    }

    private void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    void a(ViewPager2.i iVar) {
        this.f13273d.add(iVar);
    }

    void b(ViewPager2.i iVar) {
        this.f13273d.remove(iVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrollStateChanged(int i4) {
        try {
            Iterator it = this.f13273d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).onPageScrollStateChanged(i4);
            }
        } catch (ConcurrentModificationException e4) {
            c(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrolled(int i4, float f4, int i5) {
        try {
            Iterator it = this.f13273d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).onPageScrolled(i4, f4, i5);
            }
        } catch (ConcurrentModificationException e4) {
            c(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i4) {
        try {
            Iterator it = this.f13273d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.i) it.next()).onPageSelected(i4);
            }
        } catch (ConcurrentModificationException e4) {
            c(e4);
        }
    }
}
