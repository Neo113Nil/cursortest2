package com.moyoung.dafit.module.common.widgets;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/* loaded from: classes4.dex */
public class ContentPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;

    public ContentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<Fragment> list = this.fragments;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i8) {
        return this.fragments.get(i8);
    }

    public void setContentFragments(List<Fragment> list) {
        this.fragments = list;
    }
}
