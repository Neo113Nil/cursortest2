package com.crrepa.band.my.device.cricket.adapter;

import a1.e;
import a1.f;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.cricket.model.CricketGameModel;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class CricketGameAdapter extends BaseQuickAdapter<CricketGameModel, BaseViewHolder> {
    public CricketGameAdapter(@Nullable List<CricketGameModel> list) {
        super(R.layout.item_cricket_matches_result, list);
        addChildClickViewIds(R.id.btn_reserve);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, CricketGameModel cricketGameModel) {
        if (getItemPosition(cricketGameModel) == getItemCount() - 1) {
            baseViewHolder.setGone(R.id.border, true);
        } else {
            baseViewHolder.setVisible(R.id.border, true);
        }
        baseViewHolder.setText(R.id.tv_match_time, cricketGameModel.getStartTime());
        baseViewHolder.setText(R.id.tv_match_schedule, cricketGameModel.getTitle());
        baseViewHolder.setImageResource(R.id.iv_first_team, e.getImageFlag(cricketGameModel.getTeamName1()));
        baseViewHolder.setText(R.id.tv_first_team_name, cricketGameModel.getTeamName1());
        baseViewHolder.setImageResource(R.id.iv_second_team, e.getImageFlag(cricketGameModel.getTeamName2()));
        baseViewHolder.setText(R.id.tv_second_team_name, cricketGameModel.getTeamName2());
        if (!TextUtils.isEmpty(cricketGameModel.getScore1()) && !TextUtils.isEmpty(cricketGameModel.getScore2())) {
            baseViewHolder.setText(R.id.tv_first_points, cricketGameModel.getScore1());
            baseViewHolder.setText(R.id.tv_second_points, cricketGameModel.getScore2());
            int cricketScore = f.getCricketScore(cricketGameModel.getScore1());
            int cricketScore2 = f.getCricketScore(cricketGameModel.getScore2());
            if (cricketScore > cricketScore2) {
                baseViewHolder.setTextColor(R.id.tv_first_points, ContextCompat.getColor(getContext(), R.color.black));
                baseViewHolder.setTextColor(R.id.tv_second_points, ContextCompat.getColor(getContext(), R.color.assist_8_A9));
            } else if (cricketScore < cricketScore2) {
                baseViewHolder.setTextColor(R.id.tv_first_points, ContextCompat.getColor(getContext(), R.color.assist_8_A9));
                baseViewHolder.setTextColor(R.id.tv_second_points, ContextCompat.getColor(getContext(), R.color.black));
            }
        }
        if (cricketGameModel.isReserved()) {
            baseViewHolder.setBackgroundResource(R.id.btn_reserve, R.drawable.shape_cricket_reserved);
            baseViewHolder.setText(R.id.btn_reserve, R.string.cricket_match_reserved);
        } else {
            baseViewHolder.setBackgroundResource(R.id.btn_reserve, R.drawable.shape_cricket_reserve);
            baseViewHolder.setText(R.id.btn_reserve, R.string.cricket_match_reserve);
        }
        if (cricketGameModel.getEndTime().getTime() < new Date().getTime()) {
            baseViewHolder.setGone(R.id.btn_reserve, true);
            baseViewHolder.setVisible(R.id.tv_match_end, true);
        } else {
            baseViewHolder.setVisible(R.id.btn_reserve, true);
            baseViewHolder.setGone(R.id.tv_match_end, true);
        }
    }
}
