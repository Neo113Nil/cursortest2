package org.game.play.aviator.gameplay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

/* loaded from: classes3.dex */
public class GameListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<GameModel> gameList;
    private OnGameClickListener listener;

    public interface OnGameClickListener {
        void onGameClick(GameModel gameModel);
    }

    public GameListAdapter(List<GameModel> list, OnGameClickListener onGameClickListener) {
        this.gameList = list;
        this.listener = onGameClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game_list, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final GameModel gameModel = this.gameList.get(i);
        viewHolder.tvTitle.setText(gameModel.getShortTitle());
        Glide.with(viewHolder.itemView.getContext()).load(gameModel.getIconUrl()).placeholder(android.R.drawable.ic_menu_gallery).into(viewHolder.ivIcon);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GameListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameListAdapter.this.m2186xcdf13af0(gameModel, view);
            }
        });
        viewHolder.btnPlay.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GameListAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameListAdapter.this.m2187x7bbdccf(gameModel, view);
            }
        });
    }

    /* renamed from: lambda$onBindViewHolder$0$org-game-play-aviator-gameplay-GameListAdapter, reason: not valid java name */
    /* synthetic */ void m2186xcdf13af0(GameModel gameModel, View view) {
        this.listener.onGameClick(gameModel);
    }

    /* renamed from: lambda$onBindViewHolder$1$org-game-play-aviator-gameplay-GameListAdapter, reason: not valid java name */
    /* synthetic */ void m2187x7bbdccf(GameModel gameModel, View view) {
        this.listener.onGameClick(gameModel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.gameList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        View btnPlay;
        ImageView ivIcon;
        TextView tvTitle;

        public ViewHolder(View view) {
            super(view);
            this.ivIcon = (ImageView) view.findViewById(R.id.ivGameIcon);
            this.tvTitle = (TextView) view.findViewById(R.id.tvGameTitle);
            this.btnPlay = view.findViewById(R.id.btnPlay);
        }
    }
}
