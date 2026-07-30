package com.crrepa.band.my.device;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public class ContentPagerAdapter extends FragmentStateAdapter {
    private List<Fragment> fragments;

    public ContentPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NonNull
    public Fragment createFragment(int i8) {
        return this.fragments.get(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Fragment> list = this.fragments;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setContentFragments(List<Fragment> list) {
        this.fragments = list;
    }
}
