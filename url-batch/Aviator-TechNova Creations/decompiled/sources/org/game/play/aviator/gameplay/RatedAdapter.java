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
public class RatedAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<GameModel> ratedList;

    public RatedAdapter(List<GameModel> list) {
        this.ratedList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rated, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final GameModel gameModel = this.ratedList.get(i);
        viewHolder.tvTitle.setText(gameModel.getShortTitle());
        Glide.with(viewHolder.itemView.getContext()).load(gameModel.getIconUrl()).placeholder(android.R.drawable.ic_menu_gallery).into(viewHolder.ivIcon);
        viewHolder.btnPlay.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.RatedAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RatedAdapter.lambda$onBindViewHolder$0(GameModel.this, view);
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
        return this.ratedList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        View btnPlay;
        ImageView ivIcon;
        TextView tvTitle;

        public ViewHolder(View view) {
            super(view);
            this.ivIcon = (ImageView) view.findViewById(R.id.ivRatedIcon);
            this.tvTitle = (TextView) view.findViewById(R.id.tvRatedTitle);
            this.btnPlay = view.findViewById(R.id.btnRatedPlay);
        }
    }
}
