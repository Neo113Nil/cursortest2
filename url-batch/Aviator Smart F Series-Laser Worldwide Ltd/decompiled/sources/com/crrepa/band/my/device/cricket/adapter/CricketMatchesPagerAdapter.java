package com.crrepa.band.my.device.cricket.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public class CricketMatchesPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;

    public CricketMatchesPagerAdapter(FragmentManager fragmentManager) {
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
