package com.crrepa.band.my.device.cricket.fragment;

import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import b1.c;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentCricketCwcBinding;
import com.crrepa.band.my.device.cricket.adapter.CricketMatchesPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.List;

/* loaded from: classes2.dex */
public class CWCFragment extends BaseVBFragment<FragmentCricketCwcBinding> implements c {
    private com.crrepa.band.my.device.cricket.presenter.a presenter = new com.crrepa.band.my.device.cricket.presenter.a();

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ((TextView) tab.getCustomView().findViewById(R.id.tv_tab_name)).setTextColor(ContextCompat.getColor(CWCFragment.this.requireContext(), R.color.main));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) tab.getCustomView().findViewById(R.id.tv_tab_name)).setTextColor(ContextCompat.getColor(CWCFragment.this.requireContext(), R.color.assist_7_B3));
        }
    }

    public static CWCFragment getInstance() {
        return new CWCFragment();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        this.presenter.setView(this);
        this.presenter.loadViewPagerFragment();
        this.presenter.initTabLayout();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void onFirstVisible() {
        super.onFirstVisible();
        s0.logPage(getClass(), "赛事-CWC");
    }

    @Override // b1.c
    public void renderTabLayout(String[] strArr) {
        VB vb = this.binding;
        TabLayout tabLayout = ((FragmentCricketCwcBinding) vb).tabCricketCwcType;
        tabLayout.setupWithViewPager(((FragmentCricketCwcBinding) vb).pagerCricketCwc);
        int count = ((FragmentCricketCwcBinding) this.binding).pagerCricketCwc.getAdapter().getCount();
        for (int i8 = 0; i8 < count; i8++) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_cricket_tab);
                TextView textView = (TextView) tabAt.getCustomView().findViewById(R.id.tv_tab_name);
                textView.setText(strArr[i8]);
                if (i8 == 0) {
                    textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.main));
                } else {
                    textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.assist_7_B3));
                }
            }
        }
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    @Override // b1.c
    public void renderViewPager(List<Fragment> list) {
        CricketMatchesPagerAdapter cricketMatchesPagerAdapter = new CricketMatchesPagerAdapter(getChildFragmentManager());
        cricketMatchesPagerAdapter.setContentFragments(list);
        ((FragmentCricketCwcBinding) this.binding).pagerCricketCwc.setAdapter(cricketMatchesPagerAdapter);
        ((FragmentCricketCwcBinding) this.binding).pagerCricketCwc.setOffscreenPageLimit(list.size());
    }
}
