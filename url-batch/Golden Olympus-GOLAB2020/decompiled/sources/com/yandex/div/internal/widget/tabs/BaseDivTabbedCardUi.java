package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC1281a0;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.Views;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class BaseDivTabbedCardUi<TAB_DATA extends Input.TabBase<ACTION>, TAB_VIEW, ACTION> {

    @NonNull
    private final AbstractTabBar<ACTION> mAbstractTabBar;

    @NonNull
    private final ActiveTabClickListener<ACTION> mActiveTabClickListener;

    @NonNull
    private HeightCalculatorFactory mHeightCalculatorFactory;

    @NonNull
    protected final ScrollableViewPager mPager;

    @NonNull
    private final String mTabHeaderTag;

    @NonNull
    private final String mTabItemTag;

    @NonNull
    private final BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.BaseTabTitleBarHost mTabTitleBarHost;

    @NonNull
    private final View mView;
    private final ViewPagerFixedSizeLayout mViewPagerFixedSizeLayout;
    private ViewPagerFixedSizeLayout.HeightCalculator mViewPagerHeightCalculator;

    @NonNull
    private final ViewPool mViewPool;

    @NonNull
    private final Map<ViewGroup, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> mBindings = new androidx.collection.a();

    @NonNull
    private final Map<Integer, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> mBindingByPosition = new androidx.collection.a();
    private final androidx.viewpager.widget.a mPagerAdapter = new androidx.viewpager.widget.a() { // from class: com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.1
        private SparseArray<Parcelable> mChildStates;

        @Override // androidx.viewpager.widget.a
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            if (ViewsKt.isLayoutRtl(BaseDivTabbedCardUi.this.mPager)) {
                i4 = (getCount() - i4) - 1;
            }
            ViewGroup viewGroup2 = (ViewGroup) obj;
            ((Binding) BaseDivTabbedCardUi.this.mBindings.remove(viewGroup2)).unbind();
            BaseDivTabbedCardUi.this.mBindingByPosition.remove(Integer.valueOf(i4));
            Log.d("BaseDivTabbedCardUi", "destroyItem pos " + i4);
            viewGroup.removeView(viewGroup2);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            if (BaseDivTabbedCardUi.this.mCurrentData == null) {
                return 0;
            }
            return BaseDivTabbedCardUi.this.mCurrentData.getTabs().size();
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            ViewGroup viewGroup2;
            if (ViewsKt.isLayoutRtl(BaseDivTabbedCardUi.this.mPager)) {
                i4 = (getCount() - i4) - 1;
            }
            int i5 = i4;
            Log.d("BaseDivTabbedCardUi", "instantiateItem pos " + i5);
            Binding binding = (Binding) BaseDivTabbedCardUi.this.mBindingByPosition.get(Integer.valueOf(i5));
            if (binding != null) {
                viewGroup2 = binding.mContainer;
                Assert.assertNull(binding.mContainer.getParent());
            } else {
                ViewGroup viewGroup3 = (ViewGroup) BaseDivTabbedCardUi.this.mViewPool.obtain(BaseDivTabbedCardUi.this.mTabItemTag);
                Binding binding2 = new Binding(viewGroup3, (Input.TabBase) BaseDivTabbedCardUi.this.mCurrentData.getTabs().get(i5), i5);
                BaseDivTabbedCardUi.this.mBindingByPosition.put(Integer.valueOf(i5), binding2);
                binding = binding2;
                viewGroup2 = viewGroup3;
            }
            viewGroup.addView(viewGroup2);
            BaseDivTabbedCardUi.this.mBindings.put(viewGroup2, binding);
            if (i5 == BaseDivTabbedCardUi.this.mPager.getCurrentItem()) {
                binding.bind();
            }
            SparseArray<Parcelable> sparseArray = this.mChildStates;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(View view, Object obj) {
            return obj == view;
        }

        @Override // androidx.viewpager.widget.a
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            if (!(parcelable instanceof Bundle)) {
                this.mChildStates = null;
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(getClass().getClassLoader());
            this.mChildStates = bundle.getSparseParcelableArray("div_tabs_child_states");
        }

        @Override // androidx.viewpager.widget.a
        @NonNull
        public Parcelable saveState() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>(BaseDivTabbedCardUi.this.mBindings.size());
            Iterator it = BaseDivTabbedCardUi.this.mBindings.keySet().iterator();
            while (it.hasNext()) {
                ((ViewGroup) it.next()).saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    };
    private boolean mTabTitleBarIgnoreScrollEvents = false;
    private Input<TAB_DATA> mCurrentData = null;
    private boolean mInSetData = false;

    public interface AbstractTabBar<ACTION> {

        public interface Host<ACTION> {
            void onActiveTabClicked(@NonNull ACTION action, int i4);

            void setCurrentPage(int i4, boolean z4);
        }

        void fixScrollPosition(int i4);

        ViewPager.j getCustomPageChangeListener();

        void manuallyScroll(int i4);

        void setData(@NonNull List<? extends Input.TabBase<ACTION>> list, int i4, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber);

        void setHost(@NonNull Host<ACTION> host);

        void setIntermediateState(int i4, float f4);

        void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider);

        void setViewPool(@NonNull ViewPool viewPool, @NonNull String str);
    }

    public interface ActiveTabClickListener<ACTION> {
        void onActiveTabClicked(@NonNull ACTION action, int i4);
    }

    private class BaseTabTitleBarHost implements AbstractTabBar.Host<ACTION> {
        private BaseTabTitleBarHost() {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        public void onActiveTabClicked(@NonNull ACTION action, int i4) {
            BaseDivTabbedCardUi.this.mActiveTabClickListener.onActiveTabClicked(action, i4);
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        public void setCurrentPage(int i4, boolean z4) {
            if (z4) {
                BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents = true;
            }
            BaseDivTabbedCardUi.this.mPager.setCurrentItem(i4);
        }
    }

    private class Binding {

        @NonNull
        private final ViewGroup mContainer;

        @NonNull
        private final TAB_DATA mData;
        private final int mPosition;
        private TAB_VIEW mView;

        void bind() {
            if (this.mView != null) {
                return;
            }
            this.mView = (TAB_VIEW) BaseDivTabbedCardUi.this.bindTabData(this.mContainer, this.mData, this.mPosition);
        }

        void unbind() {
            TAB_VIEW tab_view = this.mView;
            if (tab_view == null) {
                return;
            }
            BaseDivTabbedCardUi.this.unbindTabData(tab_view);
            this.mView = null;
        }

        private Binding(@NonNull ViewGroup viewGroup, @NonNull TAB_DATA tab_data, int i4) {
            this.mContainer = viewGroup;
            this.mData = tab_data;
            this.mPosition = i4;
        }
    }

    private class DataBindingTransformer implements ViewPager.k {
        private DataBindingTransformer() {
        }

        @Override // androidx.viewpager.widget.ViewPager.k
        public void transformPage(View view, float f4) {
            Binding binding;
            if (!BaseDivTabbedCardUi.this.mInSetData && f4 > -1.0f && f4 < 1.0f && (binding = (Binding) BaseDivTabbedCardUi.this.mBindings.get(view)) != null) {
                binding.bind();
            }
        }
    }

    public interface Input<TAB extends TabBase> {

        public interface TabBase<ACTION> {
            ACTION getActionable();

            Integer getTabHeight();

            Integer getTabHeightLayoutParam();

            String getTitle();
        }

        @NonNull
        List<? extends TAB> getTabs();
    }

    private class PagerChangeListener implements ViewPager.j {
        int mCurrentState;

        private PagerChangeListener() {
            this.mCurrentState = 0;
        }

        private void fixViewPagerHeightOnScrollEnd(int i4) {
            if (BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null || BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout == null) {
                return;
            }
            BaseDivTabbedCardUi.this.mViewPagerHeightCalculator.setPositionAndOffsetForMeasure(i4, 0.0f);
            BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.requestLayout();
        }

        private void updateViewPagerHeightOnScroll(int i4, float f4) {
            if (BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout == null || BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null) {
                return;
            }
            BaseDivTabbedCardUi.this.mViewPagerHeightCalculator.setPositionAndOffsetForMeasure(i4, f4);
            if (BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.shouldRequestLayoutOnScroll(i4, f4)) {
                if (!BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.isInLayout()) {
                    BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.requestLayout();
                    return;
                }
                ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout;
                final ViewPagerFixedSizeLayout viewPagerFixedSizeLayout2 = BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout;
                Objects.requireNonNull(viewPagerFixedSizeLayout2);
                viewPagerFixedSizeLayout.post(new Runnable() { // from class: com.yandex.div.internal.widget.tabs.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewPagerFixedSizeLayout.this.requestLayout();
                    }
                });
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i4) {
            this.mCurrentState = i4;
            if (i4 == 0) {
                int currentItem = BaseDivTabbedCardUi.this.mPager.getCurrentItem();
                fixViewPagerHeightOnScrollEnd(currentItem);
                if (!BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents) {
                    BaseDivTabbedCardUi.this.mAbstractTabBar.fixScrollPosition(currentItem);
                }
                BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i4, float f4, int i5) {
            if (this.mCurrentState != 0) {
                updateViewPagerHeightOnScroll(i4, f4);
            }
            if (BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents) {
                return;
            }
            BaseDivTabbedCardUi.this.mAbstractTabBar.setIntermediateState(i4, f4);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i4) {
            if (BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null) {
                BaseDivTabbedCardUi.this.mPager.requestLayout();
            } else if (this.mCurrentState == 0) {
                fixViewPagerHeightOnScrollEnd(i4);
            }
        }
    }

    public static class TabbedCardConfig {
        private final int mCardPagerContainerHelperId;
        private final int mCardPagerContainerId;
        private final int mCardTitleContainerScrollerId;
        private final boolean mIsViewPagerEdgeScrollable;
        private final boolean mIsViewPagerScrollable;

        @NonNull
        private final String mTabHeaderTag;

        @NonNull
        private final String mTabItemTag;

        public TabbedCardConfig(int i4, int i5, int i6, boolean z4, boolean z5, @NonNull String str, @NonNull String str2) {
            this.mCardTitleContainerScrollerId = i4;
            this.mCardPagerContainerId = i5;
            this.mCardPagerContainerHelperId = i6;
            this.mIsViewPagerScrollable = z4;
            this.mIsViewPagerEdgeScrollable = z5;
            this.mTabHeaderTag = str;
            this.mTabItemTag = str2;
        }

        int getCardPagerContainerHelperId() {
            return this.mCardPagerContainerHelperId;
        }

        int getCardPagerContainerId() {
            return this.mCardPagerContainerId;
        }

        int getCardTitleContainerScrollerId() {
            return this.mCardTitleContainerScrollerId;
        }

        @NonNull
        String getTabHeaderTag() {
            return this.mTabHeaderTag;
        }

        @NonNull
        String getTabItemTag() {
            return this.mTabItemTag;
        }

        boolean isViewPagerEdgeScrollable() {
            return this.mIsViewPagerEdgeScrollable;
        }

        boolean isViewPagerScrollable() {
            return this.mIsViewPagerScrollable;
        }
    }

    public BaseDivTabbedCardUi(@NonNull ViewPool viewPool, @NonNull View view, @NonNull TabbedCardConfig tabbedCardConfig, @NonNull HeightCalculatorFactory heightCalculatorFactory, @NonNull TabTextStyleProvider tabTextStyleProvider, ViewPager.j jVar, @NonNull ActiveTabClickListener<ACTION> activeTabClickListener, @NonNull ViewPager.j jVar2) {
        this.mViewPool = viewPool;
        this.mView = view;
        this.mHeightCalculatorFactory = heightCalculatorFactory;
        this.mActiveTabClickListener = activeTabClickListener;
        BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.BaseTabTitleBarHost baseTabTitleBarHost = new BaseTabTitleBarHost();
        this.mTabTitleBarHost = baseTabTitleBarHost;
        String tabHeaderTag = tabbedCardConfig.getTabHeaderTag();
        this.mTabHeaderTag = tabHeaderTag;
        this.mTabItemTag = tabbedCardConfig.getTabItemTag();
        AbstractTabBar<ACTION> abstractTabBar = (AbstractTabBar) Views.findViewAndCast(view, tabbedCardConfig.getCardTitleContainerScrollerId());
        this.mAbstractTabBar = abstractTabBar;
        abstractTabBar.setHost(baseTabTitleBarHost);
        abstractTabBar.setTypefaceProvider(tabTextStyleProvider.getTypefaceProvider());
        abstractTabBar.setViewPool(viewPool, tabHeaderTag);
        ScrollableViewPager scrollableViewPager = (ScrollableViewPager) Views.findViewAndCast(view, tabbedCardConfig.getCardPagerContainerId());
        this.mPager = scrollableViewPager;
        AbstractC1281a0.C0(scrollableViewPager, scrollableViewPager.getResources().getConfiguration().getLayoutDirection());
        scrollableViewPager.setAdapter(null);
        scrollableViewPager.clearOnPageChangeListeners();
        scrollableViewPager.addOnPageChangeListener(new PagerChangeListener());
        ViewPager.j customPageChangeListener = abstractTabBar.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            scrollableViewPager.addOnPageChangeListener(customPageChangeListener);
        }
        if (jVar != null) {
            scrollableViewPager.addOnPageChangeListener(jVar);
        }
        scrollableViewPager.addOnPageChangeListener(jVar2);
        scrollableViewPager.setScrollEnabled(tabbedCardConfig.isViewPagerScrollable());
        scrollableViewPager.setEdgeScrollEnabled(tabbedCardConfig.isViewPagerEdgeScrollable());
        scrollableViewPager.setPageTransformer(false, new DataBindingTransformer());
        this.mViewPagerFixedSizeLayout = (ViewPagerFixedSizeLayout) Views.findViewAndCast(view, tabbedCardConfig.getCardPagerContainerHelperId());
        initializeViewPagerFixedSizeLayout();
    }

    private int findCorrespondingTab(int i4, Input<TAB_DATA> input) {
        if (input == null) {
            return -1;
        }
        return Math.min(i4, input.getTabs().size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabCount() {
        Input<TAB_DATA> input = this.mCurrentData;
        if (input == null) {
            return 0;
        }
        return input.getTabs().size();
    }

    private void initializeViewPagerFixedSizeLayout() {
        if (this.mViewPagerFixedSizeLayout == null) {
            return;
        }
        ViewPagerFixedSizeLayout.HeightCalculator cardHeightCalculator = this.mHeightCalculatorFactory.getCardHeightCalculator((ViewGroup) this.mViewPool.obtain(this.mTabItemTag), new HeightCalculatorFactory.MeasureTabHeightFn() { // from class: com.yandex.div.internal.widget.tabs.b
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory.MeasureTabHeightFn
            public final int apply(ViewGroup viewGroup, int i4, int i5, int i6) {
                int measureTabHeight;
                measureTabHeight = BaseDivTabbedCardUi.this.measureTabHeight(viewGroup, i4, i5, i6);
                return measureTabHeight;
            }
        }, new HeightCalculatorFactory.GetTabCountFn() { // from class: com.yandex.div.internal.widget.tabs.c
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory.GetTabCountFn
            public final int apply() {
                int tabCount;
                tabCount = BaseDivTabbedCardUi.this.getTabCount();
                return tabCount;
            }
        });
        this.mViewPagerHeightCalculator = cardHeightCalculator;
        this.mViewPagerFixedSizeLayout.setHeightCalculator(cardHeightCalculator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int measureTabHeight(@NonNull ViewGroup viewGroup, int i4, int i5, int i6) {
        ViewGroup viewGroup2;
        int measuredHeight;
        if (this.mCurrentData == null) {
            return -1;
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.mViewPagerFixedSizeLayout;
        boolean z4 = false;
        int collapsiblePaddingBottom = viewPagerFixedSizeLayout != null ? viewPagerFixedSizeLayout.getCollapsiblePaddingBottom() : 0;
        List<? extends TAB_DATA> tabs = this.mCurrentData.getTabs();
        if (i6 >= 0 && i6 < tabs.size()) {
            z4 = true;
        }
        Assert.assertTrue("Tab index is out ouf bounds!", z4);
        TAB_DATA tab_data = tabs.get(i6);
        Integer tabHeight = tab_data.getTabHeight();
        if (tabHeight != null) {
            measuredHeight = tabHeight.intValue();
        } else {
            BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding = this.mBindingByPosition.get(Integer.valueOf(i6));
            if (binding == null) {
                viewGroup2 = (ViewGroup) this.mViewPool.obtain(this.mTabItemTag);
                BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding2 = new Binding(viewGroup2, tab_data, i6);
                this.mBindingByPosition.put(Integer.valueOf(i6), binding2);
                binding = binding2;
            } else {
                viewGroup2 = ((Binding) binding).mContainer;
            }
            binding.bind();
            viewGroup2.forceLayout();
            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), resolveHeightMeasureSpec(i5, tab_data));
            measuredHeight = viewGroup2.getMeasuredHeight();
        }
        return measuredHeight + collapsiblePaddingBottom;
    }

    private int resolveHeightMeasureSpec(int i4, TAB_DATA tab_data) {
        return tab_data.getTabHeightLayoutParam().intValue() == -1 ? i4 : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @NonNull
    protected abstract TAB_VIEW bindTabData(@NonNull ViewGroup viewGroup, @NonNull TAB_DATA tab_data, int i4);

    public void requestViewPagerLayout() {
        Log.d("BaseDivTabbedCardUi", "requestViewPagerLayout");
        ViewPagerFixedSizeLayout.HeightCalculator heightCalculator = this.mViewPagerHeightCalculator;
        if (heightCalculator != null) {
            heightCalculator.dropMeasureCache();
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.mViewPagerFixedSizeLayout;
        if (viewPagerFixedSizeLayout != null) {
            viewPagerFixedSizeLayout.requestLayout();
        }
    }

    public void setData(Input<TAB_DATA> input, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        int findCorrespondingTab = findCorrespondingTab(this.mPager.getCurrentItem(), input);
        this.mBindingByPosition.clear();
        this.mCurrentData = input;
        if (this.mPager.getAdapter() != null) {
            this.mInSetData = true;
            try {
                this.mPagerAdapter.notifyDataSetChanged();
            } finally {
                this.mInSetData = false;
            }
        }
        List<? extends TAB_DATA> tabs = input == null ? Collections.EMPTY_LIST : input.getTabs();
        this.mAbstractTabBar.setData(tabs, findCorrespondingTab, expressionResolver, expressionSubscriber);
        if (this.mPager.getAdapter() == null) {
            this.mPager.setAdapter(this.mPagerAdapter);
        } else if (!tabs.isEmpty() && findCorrespondingTab != -1) {
            this.mPager.setCurrentItem(findCorrespondingTab);
            this.mAbstractTabBar.manuallyScroll(findCorrespondingTab);
        }
        requestViewPagerLayout();
    }

    public void setDisabledScrollPages(@NonNull Set<Integer> set) {
        this.mPager.setDisabledScrollPages(set);
    }

    protected abstract void unbindTabData(@NonNull TAB_VIEW tab_view);
}
