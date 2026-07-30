package org.game.play.aviator.gameplay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes3.dex */
public class FaqAdapter extends RecyclerView.Adapter<FaqViewHolder> {
    private List<FaqModel> faqList;
    private OnFaqClickListener listener;

    public interface OnFaqClickListener {
        void onReadClick(FaqModel faqModel);
    }

    public FaqAdapter(List<FaqModel> list, OnFaqClickListener onFaqClickListener) {
        this.faqList = list;
        this.listener = onFaqClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public FaqViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FaqViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_faq, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(FaqViewHolder faqViewHolder, int i) {
        final FaqModel faqModel = this.faqList.get(i);
        faqViewHolder.tvTitle.setText((i + 1) + ". " + faqModel.getTitle());
        faqViewHolder.tvDesc.setText(faqModel.getDescription());
        faqViewHolder.btnRead.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.FaqAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaqAdapter.this.m2183xf08e9b48(faqModel, view);
            }
        });
    }

    /* renamed from: lambda$onBindViewHolder$0$org-game-play-aviator-gameplay-FaqAdapter, reason: not valid java name */
    /* synthetic */ void m2183xf08e9b48(FaqModel faqModel, View view) {
        OnFaqClickListener onFaqClickListener = this.listener;
        if (onFaqClickListener != null) {
            onFaqClickListener.onReadClick(faqModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.faqList.size();
    }

    public static class FaqViewHolder extends RecyclerView.ViewHolder {
        View btnRead;
        TextView tvDesc;
        TextView tvTitle;

        public FaqViewHolder(View view) {
            super(view);
            this.tvTitle = (TextView) view.findViewById(R.id.tvFaqTitle);
            this.tvDesc = (TextView) view.findViewById(R.id.tvFaqDesc);
            this.btnRead = view.findViewById(R.id.btnRead);
        }
    }
}
