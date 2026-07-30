package com.crrepa.band.my.home.training;

import android.content.Intent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentHomeSportBinding;
import com.crrepa.band.my.training.TrainingHistoryActivity;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.classes.ClassesFragment;
import com.moyoung.classes.completed.ClassesHistoryActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public class HomeSportFragment extends BaseVBFragment<FragmentHomeSportBinding> {
    private int selectedTab = 0;

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            HomeSportFragment.this.selectedTab = tab.getPosition();
            ((FragmentHomeSportBinding) ((BaseVBFragment) HomeSportFragment.this).binding).ivHistory.setVisibility(HomeSportFragment.this.selectedTab == 0 ? 0 : 8);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public static HomeSportFragment getInstance() {
        return new HomeSportFragment();
    }

    private void initViewPager() {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getChildFragmentManager());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ClassesFragment());
        arrayList.add(HomeTrainingFragment.getInstance());
        contentPagerAdapter.setContentFragments(arrayList);
        ((FragmentHomeSportBinding) this.binding).vpClass.setAdapter(contentPagerAdapter);
        ((FragmentHomeSportBinding) this.binding).vpClass.setOffscreenPageLimit(2);
        ((FragmentHomeSportBinding) this.binding).tab.setTabMode(2);
        VB vb = this.binding;
        ((FragmentHomeSportBinding) vb).tab.setupWithViewPager(((FragmentHomeSportBinding) vb).vpClass);
        int[] iArr = {R.string.gps_exercise_class_title, R.string.gps_exercise_workout_title};
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            TabLayout.Tab tabAt = ((FragmentHomeSportBinding) this.binding).tab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setText(iArr[i8]);
            }
            Objects.requireNonNull(tabAt);
            o0.hideTabToast(tabAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        if (this.selectedTab == 0) {
            startActivity(new Intent(requireActivity(), (Class<?>) ClassesHistoryActivity.class));
        } else {
            startActivity(TrainingHistoryActivity.getCallingIntent(requireActivity()));
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        initViewPager();
        ((FragmentHomeSportBinding) this.binding).ivHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.training.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeSportFragment.this.lambda$initBinding$0(view);
            }
        });
        ((FragmentHomeSportBinding) this.binding).tab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }
}
