package com.moyoung.classes;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.classes.coach.CoachCourseDetailActivity;
import com.moyoung.classes.coach.CoachMainFragment;
import com.moyoung.classes.coach.model.event.ClassesMainDataLoadedEvent;
import com.moyoung.classes.completed.RecentClassesAdapter;
import com.moyoung.classes.completed.model.ClassesRecentBean;
import com.moyoung.classes.completed.model.ClassesRecentModel;
import com.moyoung.classes.databinding.FragmentClassesBinding;
import com.moyoung.classes.meditation.MeditationMainFragment;
import com.moyoung.classes.meditation.onlineclass.OnlineClassDetailActivity;
import com.moyoung.classes.meditation.onlineclass.model.OnlineClassDoneEvent;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes4.dex */
public class ClassesFragment extends BaseVBFragment<FragmentClassesBinding> {
    private static final int FRAGMENT_MIN_HEIGHT = 1400;
    private final List<Fragment> fragmentList = new ArrayList();
    private boolean isNetworkConnected;
    private RecentClassesAdapter recentClassesAdapter;
    private TabLayout.Tab selectedTab;

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ClassesFragment.this.selectedTab = tab;
            ClassesFragment.this.resetFragmentHeight(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    private void initRecentRv() {
        ((FragmentClassesBinding) this.binding).rvRecent.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        RecentClassesAdapter recentClassesAdapter = new RecentClassesAdapter();
        this.recentClassesAdapter = recentClassesAdapter;
        ((FragmentClassesBinding) this.binding).rvRecent.setAdapter(recentClassesAdapter);
        this.recentClassesAdapter.setEmptyView(R$layout.view_empty_recent_class);
        this.recentClassesAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.b
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                ClassesFragment.this.lambda$initRecentRv$0(baseQuickAdapter, view, i8);
            }
        });
    }

    private void initViewPager() {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getChildFragmentManager());
        this.fragmentList.add(new CoachMainFragment());
        this.fragmentList.add(new MeditationMainFragment());
        contentPagerAdapter.setContentFragments(this.fragmentList);
        ((FragmentClassesBinding) this.binding).vpClass.setAdapter(contentPagerAdapter);
        ((FragmentClassesBinding) this.binding).tab.setTabMode(1);
        VB vb = this.binding;
        ((FragmentClassesBinding) vb).tab.setupWithViewPager(((FragmentClassesBinding) vb).vpClass);
        int[] iArr = {R$string.course_fitness_programme_title, R$string.classes_meditation_title};
        int size = this.fragmentList.size();
        for (int i8 = 0; i8 < size; i8++) {
            TabLayout.Tab tabAt = ((FragmentClassesBinding) this.binding).tab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setText(iArr[i8]);
            }
            Objects.requireNonNull(tabAt);
            o0.hideTabToast(tabAt);
            if (i8 == 0) {
                this.selectedTab = tabAt;
                resetFragmentHeight(tabAt);
            }
        }
        ((FragmentClassesBinding) this.binding).tab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRecentRv$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        ClassesRecentBean classesRecentBean = (ClassesRecentBean) baseQuickAdapter.getData().get(i8);
        if (classesRecentBean.getClassesType() == 0) {
            OnlineClassDetailActivity.start(requireContext(), classesRecentBean.getClassId());
        } else {
            CoachCourseDetailActivity.start(requireContext(), classesRecentBean.getClassId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetFragmentHeight(TabLayout.Tab tab) {
        View view;
        if (((FragmentClassesBinding) this.binding).vpClass.getAdapter() == null || (view = ((Fragment) ((FragmentClassesBinding) this.binding).vpClass.getAdapter().instantiateItem((ViewGroup) ((FragmentClassesBinding) this.binding).vpClass, tab.getPosition())).getView()) == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((FragmentClassesBinding) this.binding).vpClass.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight() + 20;
        layoutParams.height = measuredHeight;
        if (measuredHeight < 1400) {
            layoutParams.height = 1400;
        }
        ((FragmentClassesBinding) this.binding).vpClass.setLayoutParams(layoutParams);
    }

    private void updateRecentRecord() {
        List<ClassesRecentBean> recentPlayedClassList;
        if (this.recentClassesAdapter == null || (recentPlayedClassList = ClassesRecentModel.getRecentPlayedClassList()) == null) {
            return;
        }
        this.recentClassesAdapter.setNewData(recentPlayedClassList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        initViewPager();
        initRecentRv();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void loadData() {
        super.loadData();
        updateRecentRecord();
        this.isNetworkConnected = a0.isNetworkConnected(com.moyoung.dafit.module.common.utils.d.get());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(OnlineClassDoneEvent onlineClassDoneEvent) {
        updateRecentRecord();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(ClassesMainDataLoadedEvent classesMainDataLoadedEvent) {
        resetFragmentHeight(this.selectedTab);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(com.moyoung.dafit.module.common.network.c cVar) {
        if (cVar.noConnectivity) {
            this.isNetworkConnected = false;
            return;
        }
        if (this.isNetworkConnected) {
            return;
        }
        this.isNetworkConnected = true;
        updateRecentRecord();
        Iterator<Fragment> it = this.fragmentList.iterator();
        while (it.hasNext()) {
            ((k) ((Fragment) it.next())).refreshOnNetworkReconnected();
        }
    }
}
