package com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator;

import androidx.compose.runtime.OffsetApplier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositeOnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.FormBody;

/* loaded from: classes9.dex */
public final /* synthetic */ class Pi2DotsTabIndicator$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Pi2DotsTabIndicator f$0;

    public /* synthetic */ Pi2DotsTabIndicator$$ExternalSyntheticLambda1(Pi2DotsTabIndicator pi2DotsTabIndicator, int i) {
        this.$r8$classId = i;
        this.f$0 = pi2DotsTabIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Pi2DotsTabIndicator pi2DotsTabIndicator = this.f$0;
        switch (i) {
            case 0:
                int i2 = Pi2DotsTabIndicator.$r8$clinit;
                pi2DotsTabIndicator.refreshDots();
                break;
            case 1:
                int i3 = Pi2DotsTabIndicator.$r8$clinit;
                pi2DotsTabIndicator.refreshDots();
                break;
            case 2:
                int i4 = Pi2DotsTabIndicator.$r8$clinit;
                pi2DotsTabIndicator.refreshDots();
                break;
            default:
                ArrayList arrayList = pi2DotsTabIndicator.dots;
                float f = pi2DotsTabIndicator.dotsSize;
                FormBody.Builder builder = pi2DotsTabIndicator.pager;
                if (builder != null) {
                    if (arrayList.size() < builder.getCount()) {
                        int count = builder.getCount() - arrayList.size();
                        for (int i5 = 0; i5 < count; i5++) {
                            int i6 = pi2DotsTabIndicator.dotsColor;
                            Pi2DotsTabIndicator.Dot dot = new Pi2DotsTabIndicator.Dot();
                            dot.width = (int) f;
                            dot.color = i6;
                            arrayList.add(dot);
                        }
                    } else if (arrayList.size() > builder.getCount()) {
                        int size = arrayList.size() - builder.getCount();
                        for (int i7 = 0; i7 < size; i7++) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    pi2DotsTabIndicator.requestLayout();
                }
                pi2DotsTabIndicator.refreshDotsColors();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Pi2DotsTabIndicator.Dot) it.next()).width = (int) f;
                }
                FormBody.Builder builder2 = pi2DotsTabIndicator.pager;
                if (builder2 != null) {
                    ViewPager2 viewPager2 = (ViewPager2) builder2.names;
                    RecyclerView.Adapter adapter = viewPager2.mRecyclerView.mAdapter;
                    if ((adapter != null ? adapter.getItemCount() : 0) > 0) {
                        CompositeOnPageChangeCallback compositeOnPageChangeCallback = (CompositeOnPageChangeCallback) builder2.values;
                        if (compositeOnPageChangeCallback != null) {
                            ((ArrayList) viewPager2.mExternalPageChangeCallbacks.mCallbacks).remove(compositeOnPageChangeCallback);
                        }
                        OffsetApplier offsetApplier = new OffsetApplier(pi2DotsTabIndicator);
                        CompositeOnPageChangeCallback compositeOnPageChangeCallback2 = new CompositeOnPageChangeCallback(offsetApplier, 5);
                        builder2.values = compositeOnPageChangeCallback2;
                        viewPager2.registerOnPageChangeCallback(compositeOnPageChangeCallback2);
                        offsetApplier.onPageScrolled(RecyclerView.DECELERATION_RATE, viewPager2.mCurrentItem);
                        break;
                    }
                }
                break;
        }
    }
}
