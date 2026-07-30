package com.crrepa.band.my.health.pressure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentStressDetailBinding;
import com.crrepa.band.my.model.db.Stress;
import com.crrepa.band.my.model.db.proxy.StressDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;

/* loaded from: classes2.dex */
public class BandStressDetailFragment extends BaseFragement {
    private FragmentStressDetailBinding binding;

    private String getStress(int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append(i8);
        sb.append(l.SPACE);
        if (i8 < 30) {
            sb.append(getString(R.string.stress_relaxed));
        } else if (i8 < 60) {
            sb.append(getString(R.string.stress_normal));
        } else if (i8 < 80) {
            sb.append(getString(R.string.stress_medium));
        } else {
            sb.append(getString(R.string.stress_stressed));
        }
        return sb.toString();
    }

    public static BandStressDetailFragment newInstance(long j8) {
        BandStressDetailFragment bandStressDetailFragment = new BandStressDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandStressDetailFragment.setArguments(bundle);
        return bandStressDetailFragment;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FragmentStressDetailBinding inflate = FragmentStressDetailBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        return inflate.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        String stress;
        Date date;
        super.onLazyInitView(bundle);
        Stress stress2 = new StressDaoProxy().get(getArguments().getLong("statistics_id", -1L));
        if (stress2 == null) {
            date = new Date();
            stress = getString(R.string.data_blank);
        } else {
            Date date2 = stress2.getDate();
            stress = getStress(stress2.getStress().intValue());
            date = date2;
        }
        this.binding.tvStressDate.setText(m.format(date, getString(R.string.stress_date_format)));
        this.binding.tvStressTime.setText(m.format(date, getString(R.string.stress_time_format)));
        this.binding.tvStress.setText(stress);
    }
}
