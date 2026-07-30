package com.crrepa.band.my.device.cricket.presenter;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.cricket.fragment.CWCRankingFragment;
import com.crrepa.band.my.device.cricket.fragment.CWCTeamFragment;
import com.crrepa.band.my.device.cricket.fragment.CricketGameFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private b1.c view;

    private String[] getTabTitles() {
        Resources resources = com.moyoung.dafit.module.common.utils.d.get().getResources();
        return new String[]{resources.getString(R.string.cricket_matches), resources.getString(R.string.cricket_team), resources.getString(R.string.cricket_points_table)};
    }

    public List<Fragment> getContentFragments() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CricketGameFragment.getInstance());
        arrayList.add(CWCTeamFragment.getInstance());
        arrayList.add(CWCRankingFragment.getInstance());
        return arrayList;
    }

    public void initTabLayout() {
        this.view.renderTabLayout(getTabTitles());
    }

    public void loadViewPagerFragment() {
        this.view.renderViewPager(getContentFragments());
    }

    public void setView(b1.c cVar) {
        this.view = cVar;
    }
}
