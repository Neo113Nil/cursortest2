package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

/* loaded from: classes3.dex */
public class BannerAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<GameModel> bannerList;

    public BannerAdapter(List<GameModel> list) {
        this.bannerList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_banner, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        List<GameModel> list = this.bannerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        final GameModel gameModel = this.bannerList.get(i % this.bannerList.size());
        viewHolder.tvTitle.setText(gameModel.getTitle());
        Glide.with(viewHolder.itemView.getContext()).load(gameModel.getIconUrl()).placeholder(android.R.drawable.dialog_holo_dark_frame).into(viewHolder.ivBanner);
        viewHolder.btnPlay.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.BannerAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerAdapter.lambda$onBindViewHolder$0(GameModel.this, view);
            }
        });
    }

    static /* synthetic */ void lambda$onBindViewHolder$0(GameModel gameModel, View view) {
        Intent intent = new Intent(view.getContext(), (Class<?>) decriptionActivity.class);
        intent.putExtra("game_title", gameModel.getTitle());
        intent.putExtra("game_desc", gameModel.getDescription());
        intent.putExtra("game_icon", gameModel.getIconUrl());
        intent.putExtra("game_url", gameModel.getGameUrl());
        view.getContext().startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<GameModel> list = this.bannerList;
        return (list == null || list.isEmpty()) ? 0 : Integer.MAX_VALUE;
    }

    public int getRealCount() {
        List<GameModel> list = this.bannerList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        View btnPlay;
        ImageView ivBanner;
        TextView tvTitle;

        public ViewHolder(View view) {
            super(view);
            this.ivBanner = (ImageView) view.findViewById(R.id.ivBanner);
            this.tvTitle = (TextView) view.findViewById(R.id.tvBannerTitle);
            this.btnPlay = view.findViewById(R.id.btnBannerPlay);
        }
    }
}
