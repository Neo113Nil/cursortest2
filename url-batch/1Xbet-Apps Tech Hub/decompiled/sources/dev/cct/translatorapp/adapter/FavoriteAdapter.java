package dev.cct.translatorapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.adapter.HistoryAdapter;
import dev.cct.translatorapp.dataModel.FavoriteModel;
import dev.cct.translatorapp.dataModel.HistoryModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FavoriteAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001e\u0010\u0014\u001a\u00020\r2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Ldev/cct/translatorapp/adapter/FavoriteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cct/translatorapp/adapter/FavoriteAdapter$ViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/cct/translatorapp/adapter/HistoryAdapter$Favorite;", "(Ldev/cct/translatorapp/adapter/HistoryAdapter$Favorite;)V", "mList", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/dataModel/FavoriteModel;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ViewHolder", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FavoriteAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final HistoryAdapter.Favorite listener;
    private final ArrayList<FavoriteModel> mList = new ArrayList<>();

    public FavoriteAdapter(HistoryAdapter.Favorite favorite) {
        this.listener = favorite;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favorite_item_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FavoriteModel favoriteModel = this.mList.get(position);
        Intrinsics.checkNotNullExpressionValue(favoriteModel, "mList[position]");
        final FavoriteModel favoriteModel2 = favoriteModel;
        holder.getInText().setText(favoriteModel2.getInput());
        holder.getOutText().setText(favoriteModel2.getOutput());
        holder.getILang().setText(favoriteModel2.getILangC());
        holder.getOLang().setText(favoriteModel2.getOLangC());
        holder.getFavoriteIcon().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.FavoriteAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavoriteAdapter.onBindViewHolder$lambda$0(FavoriteAdapter.this, favoriteModel2, position, view);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.FavoriteAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavoriteAdapter.onBindViewHolder$lambda$1(FavoriteAdapter.this, favoriteModel2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(FavoriteAdapter this$0, FavoriteModel itemsViewModel, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        HistoryAdapter.Favorite favorite = this$0.listener;
        if (favorite != null) {
            favorite.onClickFavorite(new HistoryModel(itemsViewModel.getId(), itemsViewModel.getILangC(), itemsViewModel.getOLangC(), itemsViewModel.getInput(), itemsViewModel.getOutput(), false, false, 64, null), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(FavoriteAdapter this$0, FavoriteModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        HistoryAdapter.Favorite favorite = this$0.listener;
        if (favorite != null) {
            favorite.onTranslationClick(new HistoryModel(itemsViewModel.getId(), itemsViewModel.getILangC(), itemsViewModel.getOLangC(), itemsViewModel.getInput(), itemsViewModel.getOutput(), itemsViewModel.isFavorite(), false, 64, null));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public final void setData(ArrayList<FavoriteModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    /* compiled from: FavoriteAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Ldev/cct/translatorapp/adapter/FavoriteAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "favoriteIcon", "Landroid/widget/ImageView;", "getFavoriteIcon", "()Landroid/widget/ImageView;", "iLang", "Landroid/widget/TextView;", "getILang", "()Landroid/widget/TextView;", "inText", "getInText", "oLang", "getOLang", "outText", "getOutText", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView favoriteIcon;
        private final TextView iLang;
        private final TextView inText;
        private final TextView oLang;
        private final TextView outText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View findViewById = this.itemView.findViewById(R.id.input_text);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.input_text)");
            this.inText = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.output_text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.output_text)");
            this.outText = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.input_lang_code);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.input_lang_code)");
            this.iLang = (TextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.output_lang_code);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.output_lang_code)");
            this.oLang = (TextView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.favorite_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.favorite_icon)");
            this.favoriteIcon = (ImageView) findViewById5;
        }

        public final TextView getInText() {
            return this.inText;
        }

        public final TextView getOutText() {
            return this.outText;
        }

        public final TextView getILang() {
            return this.iLang;
        }

        public final TextView getOLang() {
            return this.oLang;
        }

        public final ImageView getFavoriteIcon() {
            return this.favoriteIcon;
        }
    }
}
