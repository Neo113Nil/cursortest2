package dev.cct.translatorapp.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.dataModel.LanguageModel;
import dev.cct.translatorapp.util.Preferences;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanguageAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\rH\u0017J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rH\u0016J \u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Ldev/cct/translatorapp/adapter/LanguageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cct/translatorapp/adapter/LanguageAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "isFirst", "", "isListClick", "isSelectedItem", "", "mList", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/dataModel/LanguageModel;", "Lkotlin/collections/ArrayList;", "getItemCount", "isNightMode", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ViewHolder", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LanguageAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private boolean isFirst;
    private boolean isListClick;
    private int isSelectedItem;
    private ArrayList<LanguageModel> mList;

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public LanguageAdapter(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mList = new ArrayList<>();
        this.isFirst = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.language_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LanguageModel languageModel = this.mList.get(position);
        Intrinsics.checkNotNullExpressionValue(languageModel, "mList[position]");
        final LanguageModel languageModel2 = languageModel;
        new Preferences(this.context).getAppSelectedLang();
        holder.getLangCurrentName().setText(languageModel2.getLangName());
        boolean isNightMode = isNightMode(this.context);
        boolean areEqual = Intrinsics.areEqual(new Preferences(this.context).getAppLang(), languageModel2.getLangCode());
        int i = R.color.black;
        int i2 = R.color.white;
        if (areEqual) {
            holder.getSelectedIcon().setImageResource(R.drawable.selected_icon);
            holder.getLang().setTypeface(Typeface.DEFAULT_BOLD);
            holder.getItemLayout().setStrokeColor(ContextCompat.getColor(this.context, R.color.blue_text_color));
            holder.getLang().setTextColor(ContextCompat.getColor(this.context, isNightMode ? R.color.white : R.color.blue_text_color));
        } else {
            holder.getSelectedIcon().setImageResource(R.drawable.unselected);
            holder.getLang().setTypeface(Typeface.DEFAULT);
            holder.getLang().setTextColor(ContextCompat.getColor(this.context, isNightMode ? R.color.white : R.color.black));
            holder.getItemLayout().setStrokeColor(ContextCompat.getColor(this.context, R.color.grey_1));
        }
        if (this.isListClick) {
            if (this.isSelectedItem == position) {
                holder.getSelectedIcon().setImageResource(R.drawable.selected_icon);
                holder.getLang().setTypeface(Typeface.DEFAULT_BOLD);
                TextView lang = holder.getLang();
                Context context = this.context;
                if (!isNightMode) {
                    i2 = R.color.blue_text_color;
                }
                lang.setTextColor(ContextCompat.getColor(context, i2));
                holder.getItemLayout().setStrokeColor(ContextCompat.getColor(this.context, R.color.blue_text_color));
            } else {
                holder.getSelectedIcon().setImageResource(R.drawable.unselected);
                holder.getLang().setTypeface(Typeface.DEFAULT);
                TextView lang2 = holder.getLang();
                Context context2 = this.context;
                if (isNightMode) {
                    i = R.color.white;
                }
                lang2.setTextColor(ContextCompat.getColor(context2, i));
                holder.getItemLayout().setStrokeColor(ContextCompat.getColor(this.context, R.color.grey_1));
            }
        }
        holder.getLangFlag().setImageResource(languageModel2.getImage());
        StringBuilder sb = new StringBuilder();
        sb.append(this.context.getString(languageModel2.getLang()));
        holder.getLang().setText(sb);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LanguageAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageAdapter.onBindViewHolder$lambda$0(LanguageAdapter.this, position, languageModel2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(LanguageAdapter this$0, int i, LanguageModel item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.isSelectedItem = i;
        new Preferences(this$0.context).setAppSelectedLang(this$0.mList.indexOf(item));
        this$0.isListClick = true;
        this$0.notifyDataSetChanged();
    }

    private final boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public final void setData(ArrayList<LanguageModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    /* compiled from: LanguageAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Ldev/cct/translatorapp/adapter/LanguageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "itemLayout", "Lcom/google/android/material/card/MaterialCardView;", "getItemLayout", "()Lcom/google/android/material/card/MaterialCardView;", "lang", "Landroid/widget/TextView;", "getLang", "()Landroid/widget/TextView;", "langCurrentName", "getLangCurrentName", "langFlag", "Landroid/widget/ImageView;", "getLangFlag", "()Landroid/widget/ImageView;", "selectedIcon", "getSelectedIcon", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final MaterialCardView itemLayout;
        private final TextView lang;
        private final TextView langCurrentName;
        private final ImageView langFlag;
        private final ImageView selectedIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View findViewById = this.itemView.findViewById(R.id.lang_flag);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.lang_flag)");
            this.langFlag = (ImageView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.ph_category_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.ph_category_tv)");
            this.lang = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.code_category_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.code_category_tv)");
            this.langCurrentName = (TextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.lang_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.lang_icon)");
            this.selectedIcon = (ImageView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.itemLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.itemLayout)");
            this.itemLayout = (MaterialCardView) findViewById5;
        }

        public final ImageView getLangFlag() {
            return this.langFlag;
        }

        public final TextView getLang() {
            return this.lang;
        }

        public final TextView getLangCurrentName() {
            return this.langCurrentName;
        }

        public final ImageView getSelectedIcon() {
            return this.selectedIcon;
        }

        public final MaterialCardView getItemLayout() {
            return this.itemLayout;
        }
    }
}
