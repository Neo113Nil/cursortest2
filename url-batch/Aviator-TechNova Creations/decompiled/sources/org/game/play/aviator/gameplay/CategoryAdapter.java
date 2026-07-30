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
public class CategoryAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<CategoryModel> categoryList;

    public CategoryAdapter(List<CategoryModel> list) {
        this.categoryList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final CategoryModel categoryModel = this.categoryList.get(i);
        viewHolder.tvName.setText(categoryModel.getCategoryName());
        Glide.with(viewHolder.itemView.getContext()).load(categoryModel.getCategoryIcon()).placeholder(android.R.drawable.presence_video_online).into(viewHolder.ivIcon);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.CategoryAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CategoryAdapter.lambda$onBindViewHolder$0(CategoryModel.this, view);
            }
        });
    }

    static /* synthetic */ void lambda$onBindViewHolder$0(CategoryModel categoryModel, View view) {
        Intent intent = new Intent(view.getContext(), (Class<?>) GameListActivity.class);
        intent.putExtra("category_name", categoryModel.getCategoryName());
        view.getContext().startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.categoryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivIcon;
        TextView tvName;

        public ViewHolder(View view) {
            super(view);
            this.ivIcon = (ImageView) view.findViewById(R.id.ivCategoryIcon);
            this.tvName = (TextView) view.findViewById(R.id.tvCategoryName);
        }
    }
}
