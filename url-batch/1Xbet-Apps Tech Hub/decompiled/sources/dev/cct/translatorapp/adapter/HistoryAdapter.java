package dev.cct.translatorapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.dataModel.HistoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryAdapter.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002./B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010J\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u001aJ\u0014\u0010 \u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001eH\u0016J\u0016\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0010J\u0018\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eH\u0016J\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0013J\u0006\u0010-\u001a\u00020\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00060"}, d2 = {"Ldev/cct/translatorapp/adapter/HistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cct/translatorapp/adapter/HistoryAdapter$ViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/cct/translatorapp/adapter/HistoryAdapter$Favorite;", "(Ldev/cct/translatorapp/adapter/HistoryAdapter$Favorite;)V", "deleteBtnClicked", "", "getDeleteBtnClicked", "()Z", "setDeleteBtnClicked", "(Z)V", "isAllSelected", "isSelected", "mList", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "Lkotlin/collections/ArrayList;", "selectAllImg", "Landroid/widget/ImageView;", "toDelete", "getToDelete", "()Ljava/util/ArrayList;", "setToDelete", "(Ljava/util/ArrayList;)V", "addData", "", "item", "getArrayToDelete", "getItemCount", "", "hideCheckBox", "loadAdapter", "list", "", "onBindViewHolder", "holder", "position", "onClickFavorite", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "selectAllClicked", "imageView", "showCheckBox", "Favorite", "ViewHolder", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoryAdapter extends RecyclerView.Adapter<ViewHolder> {
    private boolean deleteBtnClicked;
    private boolean isAllSelected;
    private boolean isSelected;
    private final Favorite listener;
    private ImageView selectAllImg;
    private final ArrayList<HistoryModel> mList = new ArrayList<>();
    private ArrayList<HistoryModel> toDelete = new ArrayList<>();

    /* compiled from: HistoryAdapter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Ldev/cct/translatorapp/adapter/HistoryAdapter$Favorite;", "", "hideDeleteBtn", "", "onClickFavorite", "itemsViewModel", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "position", "", "onTranslationClick", "showDeleteBtn", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Favorite {
        void hideDeleteBtn();

        void onClickFavorite(HistoryModel itemsViewModel, int position);

        void onTranslationClick(HistoryModel itemsViewModel);

        void showDeleteBtn();
    }

    public HistoryAdapter(Favorite favorite) {
        this.listener = favorite;
    }

    public final boolean getDeleteBtnClicked() {
        return this.deleteBtnClicked;
    }

    public final void setDeleteBtnClicked(boolean z) {
        this.deleteBtnClicked = z;
    }

    public final ArrayList<HistoryModel> getToDelete() {
        return this.toDelete;
    }

    public final void setToDelete(ArrayList<HistoryModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.toDelete = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_item_layout, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Favorite favorite;
        Intrinsics.checkNotNullParameter(holder, "holder");
        HistoryModel historyModel = this.mList.get(position);
        Intrinsics.checkNotNullExpressionValue(historyModel, "mList[position]");
        final HistoryModel historyModel2 = historyModel;
        holder.getInText().setText(historyModel2.getInput());
        holder.getOutText().setText(historyModel2.getOutput());
        holder.getILang().setText(historyModel2.getILangC());
        holder.getOLang().setText(historyModel2.getOLangC());
        if (historyModel2.isFavorite()) {
            holder.getFavoriteIcon().setImageResource(R.drawable.star);
        } else {
            holder.getFavoriteIcon().setImageResource(R.drawable.unselect_star);
        }
        if (historyModel2.isSelected()) {
            holder.getCheckbox().setImageResource(R.drawable.selected_icon);
            this.toDelete.add(historyModel2);
        } else {
            this.isAllSelected = false;
            holder.getCheckbox().setImageResource(R.drawable.unselected);
            this.toDelete.remove(historyModel2);
            if (this.toDelete.isEmpty() && (favorite = this.listener) != null) {
                favorite.hideDeleteBtn();
            }
        }
        if (this.deleteBtnClicked) {
            holder.getCheckbox().setVisibility(0);
        } else {
            holder.getCheckbox().setVisibility(8);
        }
        holder.getCheckbox().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.HistoryAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryAdapter.onBindViewHolder$lambda$0(HistoryModel.this, this, position, view);
            }
        });
        holder.getFavoriteIcon().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.HistoryAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryAdapter.onBindViewHolder$lambda$1(HistoryAdapter.this, historyModel2, position, view);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.HistoryAdapter$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryAdapter.onBindViewHolder$lambda$2(HistoryAdapter.this, historyModel2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(HistoryModel itemsViewModel, HistoryAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        itemsViewModel.setSelected(!itemsViewModel.isSelected());
        ImageView imageView = this$0.selectAllImg;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.unselected);
        }
        Favorite favorite = this$0.listener;
        if (favorite != null) {
            favorite.showDeleteBtn();
        }
        this$0.notifyItemChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(HistoryAdapter this$0, HistoryModel itemsViewModel, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        Favorite favorite = this$0.listener;
        if (favorite != null) {
            favorite.onClickFavorite(new HistoryModel(itemsViewModel.getId(), itemsViewModel.getILangC(), itemsViewModel.getOLangC(), itemsViewModel.getInput(), itemsViewModel.getOutput(), !itemsViewModel.isFavorite(), false, 64, null), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(HistoryAdapter this$0, HistoryModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        Favorite favorite = this$0.listener;
        if (favorite != null) {
            favorite.onTranslationClick(itemsViewModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public final void loadAdapter(List<HistoryModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.deleteBtnClicked = false;
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    public final void addData(HistoryModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mList.add(0, item);
        notifyDataSetChanged();
    }

    public final void onClickFavorite(int position, HistoryModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mList.set(position, item);
        notifyItemChanged(position);
    }

    public final void showCheckBox() {
        this.deleteBtnClicked = true;
        notifyDataSetChanged();
    }

    public final void hideCheckBox() {
        this.deleteBtnClicked = false;
        notifyDataSetChanged();
    }

    public final void selectAllClicked(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.deleteBtnClicked = true;
        this.toDelete.clear();
        boolean z = true ^ this.isAllSelected;
        this.isAllSelected = z;
        this.selectAllImg = imageView;
        if (z) {
            imageView.setImageResource(R.drawable.selected_icon);
        } else {
            imageView.setImageResource(R.drawable.unselected);
        }
        Iterator<T> it = this.mList.iterator();
        while (it.hasNext()) {
            ((HistoryModel) it.next()).setSelected(this.isAllSelected);
        }
        notifyDataSetChanged();
    }

    public final ArrayList<HistoryModel> getArrayToDelete() {
        return this.toDelete;
    }

    /* compiled from: HistoryAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Ldev/cct/translatorapp/adapter/HistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "checkbox", "Landroid/widget/ImageView;", "getCheckbox", "()Landroid/widget/ImageView;", "favoriteIcon", "getFavoriteIcon", "iLang", "Landroid/widget/TextView;", "getILang", "()Landroid/widget/TextView;", "inText", "getInText", "oLang", "getOLang", "outText", "getOutText", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView checkbox;
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
            View findViewById6 = this.itemView.findViewById(R.id.checkbox);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.checkbox)");
            this.checkbox = (ImageView) findViewById6;
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

        public final ImageView getCheckbox() {
            return this.checkbox;
        }
    }
}
