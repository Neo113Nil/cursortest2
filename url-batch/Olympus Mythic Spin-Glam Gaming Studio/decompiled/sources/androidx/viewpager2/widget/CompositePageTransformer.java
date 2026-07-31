package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class CompositePageTransformer implements ViewPager2.PageTransformer {
    private final List mTransformers;

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f) {
        Iterator it = this.mTransformers.iterator();
        while (it.hasNext()) {
            ((ViewPager2.PageTransformer) it.next()).transformPage(view, f);
        }
    }
}
