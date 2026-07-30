package com.crrepa.band.my.device.cricket.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.my.databinding.FragmentCricketCwcPointsBinding;
import com.crrepa.band.my.device.cricket.adapter.CWCRankingAdapter;
import com.crrepa.band.my.device.cricket.model.CricketTeamPointsEntity;
import com.crrepa.band.my.device.cricket.presenter.c;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import java.util.List;

/* loaded from: classes2.dex */
public class CWCRankingFragment extends BaseVBFragment<FragmentCricketCwcPointsBinding> implements b1.a {
    private c presenter = new c();
    private CWCRankingAdapter rankingAdapter = new CWCRankingAdapter();

    public static CWCRankingFragment getInstance() {
        return new CWCRankingFragment();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        ((FragmentCricketCwcPointsBinding) this.binding).rcvCwcPoints.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((FragmentCricketCwcPointsBinding) this.binding).rcvCwcPoints.setAdapter(this.rankingAdapter);
        this.presenter.getRanking();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // b1.a
    public void renderRanking(List<CricketTeamPointsEntity> list) {
        this.rankingAdapter.setNewData(list);
    }
}
