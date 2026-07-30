package com.crrepa.band.my.device.cricket.adapter;

import a1.e;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.cricket.model.CricketTeamPointsEntity;

/* loaded from: classes2.dex */
public class CWCRankingAdapter extends BaseQuickAdapter<CricketTeamPointsEntity, BaseViewHolder> {
    public CWCRankingAdapter() {
        super(R.layout.item_cricket_ranking);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, CricketTeamPointsEntity cricketTeamPointsEntity) {
        int itemPosition = getItemPosition(cricketTeamPointsEntity);
        int color = ContextCompat.getColor(getContext(), R.color.color_line_bg);
        if (itemPosition == 0) {
            baseViewHolder.setBackgroundResource(R.id.rl_item_cricket_ranking, R.drawable.shape_cricket_ranking_first_bg);
            color = ContextCompat.getColor(getContext(), R.color.color_cricket_ranking_1);
        } else if (itemPosition == 1) {
            baseViewHolder.setBackgroundResource(R.id.rl_item_cricket_ranking, R.drawable.shape_cricket_ranking_second_bg);
            color = ContextCompat.getColor(getContext(), R.color.color_cricket_ranking_2);
        } else if (itemPosition == 2) {
            baseViewHolder.setBackgroundResource(R.id.rl_item_cricket_ranking, R.drawable.shape_cricket_ranking_third_bg);
            color = ContextCompat.getColor(getContext(), R.color.color_cricket_ranking_3);
        } else {
            baseViewHolder.setBackgroundColor(R.id.rl_item_cricket_ranking, -1);
        }
        if (color != ContextCompat.getColor(getContext(), R.color.color_line_bg)) {
            ((TextView) baseViewHolder.getView(R.id.tv_rank)).setTypeface(Typeface.DEFAULT_BOLD);
        }
        baseViewHolder.setTextColor(R.id.tv_rank, color);
        baseViewHolder.setText(R.id.tv_rank, String.valueOf(itemPosition + 1));
        baseViewHolder.setText(R.id.tv_team_name, cricketTeamPointsEntity.getTeam());
        baseViewHolder.setImageResource(R.id.iv_flag, e.getImageFlag(cricketTeamPointsEntity.getTeam()));
        baseViewHolder.setText(R.id.tv_pl, cricketTeamPointsEntity.getPlayed());
        baseViewHolder.setText(R.id.tv_win, cricketTeamPointsEntity.getWon());
        baseViewHolder.setText(R.id.tv_lose, cricketTeamPointsEntity.getLost());
        baseViewHolder.setText(R.id.tv_pts, cricketTeamPointsEntity.getPoints());
    }
}
