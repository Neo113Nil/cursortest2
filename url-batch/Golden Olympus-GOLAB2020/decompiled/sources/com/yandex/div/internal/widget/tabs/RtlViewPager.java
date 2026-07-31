package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.util.ViewsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class RtlViewPager extends ViewPager {

    @NotNull
    private final HashMap<ViewPager.j, ReversingOnPageChangeListener> pageChangeListeners;

    @Metadata
    public final class ReversingOnPageChangeListener implements ViewPager.j {

        @NotNull
        private final ViewPager.j listener;
        final /* synthetic */ RtlViewPager this$0;

        public ReversingOnPageChangeListener(@NotNull RtlViewPager rtlViewPager, ViewPager.j listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.this$0 = rtlViewPager;
            this.listener = listener;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i4) {
            this.listener.onPageScrollStateChanged(i4);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i4, float f4, int i5) {
            androidx.viewpager.widget.a adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(this.this$0) && adapter != null) {
                int count = adapter.getCount();
                int width = ((int) (this.this$0.getWidth() * (1 - adapter.getPageWidth(i4)))) + i5;
                while (i4 < count && width > 0) {
                    i4++;
                    width -= (int) (this.this$0.getWidth() * adapter.getPageWidth(i4));
                }
                i4 = (count - i4) - 1;
                i5 = -width;
                f4 = i5 / (this.this$0.getWidth() * adapter.getPageWidth(i4));
            }
            this.listener.onPageScrolled(i4, f4, i5);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i4) {
            androidx.viewpager.widget.a adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(this.this$0) && adapter != null) {
                i4 = (adapter.getCount() - i4) - 1;
            }
            this.listener.onPageSelected(i4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtlViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pageChangeListeners = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NotNull ViewPager.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(this, listener);
        this.pageChangeListeners.put(listener, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.pageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !ViewsKt.isLayoutRtl(this)) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NotNull ViewPager.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReversingOnPageChangeListener remove = this.pageChangeListeners.remove(listener);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4, boolean z4) {
        androidx.viewpager.widget.a adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i4 = (adapter.getCount() - i4) - 1;
        }
        super.setCurrentItem(i4, z4);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4) {
        androidx.viewpager.widget.a adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i4 = (adapter.getCount() - i4) - 1;
        }
        super.setCurrentItem(i4);
    }
}
