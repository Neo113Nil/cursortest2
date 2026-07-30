package com.crrepa.band.my.health.base;

import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import com.moyoung.dafit.module.common.baseui.BaseFragement;

/* loaded from: classes2.dex */
public class BaseStatisticsFragment extends BaseFragement {
    private BaseBandStatisticsActivity getStatisticsActivity() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseBandStatisticsActivity) {
            return (BaseBandStatisticsActivity) activity;
        }
        return null;
    }

    protected void setActivityMenuVisible(boolean z7) {
        BaseBandStatisticsActivity statisticsActivity = getStatisticsActivity();
        if (statisticsActivity != null) {
            statisticsActivity.setMenuVisible(z7);
        }
    }

    protected void setActivityTitle(@StringRes int i8) {
        BaseBandStatisticsActivity statisticsActivity = getStatisticsActivity();
        if (statisticsActivity != null) {
            statisticsActivity.setTitleContent(i8);
        }
    }

    protected void setActivityTitle(String str) {
        BaseBandStatisticsActivity statisticsActivity = getStatisticsActivity();
        if (statisticsActivity != null) {
            statisticsActivity.setTitleContent(str);
        }
    }
}
