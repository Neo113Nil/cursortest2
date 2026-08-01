package dev.cct.translatorapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.dataModel.PhrasebookModel;
import dev.cct.translatorapp.ui.GeneralActivity;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PhrasebookAdapter.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J(\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fJ\u001e\u0010 \u001a\u00020\u00152\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Ldev/cct/translatorapp/adapter/PhrasebookAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cct/translatorapp/adapter/PhrasebookAdapter$ViewHolder;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/cct/translatorapp/adapter/PhrasebookAdapter$Test;", "(Landroid/content/Context;Ldev/cct/translatorapp/adapter/PhrasebookAdapter$Test;)V", "getContext", "()Landroid/content/Context;", "getListener", "()Ldev/cct/translatorapp/adapter/PhrasebookAdapter$Test;", "mList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "pref", "Ldev/cct/translatorapp/util/Preferences;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "searchCategoryList", "searchedText", "", "list", "setData", "Test", "ViewHolder", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhrasebookAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Context context;
    private final Test listener;
    private ArrayList<String> mList;
    private Preferences pref;

    /* compiled from: PhrasebookAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Ldev/cct/translatorapp/adapter/PhrasebookAdapter$Test;", "", "showDialog", "", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Test {
        void showDialog();
    }

    public PhrasebookAdapter(Context context, Test listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.listener = listener;
        this.mList = new ArrayList<>();
    }

    public final Context getContext() {
        return this.context;
    }

    public final Test getListener() {
        return this.listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phrasebook_item_layout, parent, false);
        this.pref = new Preferences(this.context);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.context.getResources().getConfiguration().getLayoutDirection() == 1) {
            holder.getTextView().setTextDirection(4);
        } else {
            holder.getTextView().setTextDirection(3);
        }
        String str = this.mList.get(position);
        Intrinsics.checkNotNullExpressionValue(str, "mList[position]");
        PhrasebookModel phrasebookModel = ExtensionFunctionKt.getCategoryList().get(position);
        Intrinsics.checkNotNullExpressionValue(phrasebookModel, "categoryList[position]");
        holder.getImageView().setImageResource(phrasebookModel.getIcon());
        holder.getTextView().setText(str);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.PhrasebookAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhrasebookAdapter.onBindViewHolder$lambda$0(PhrasebookAdapter.this, holder, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(PhrasebookAdapter this$0, ViewHolder holder, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (ExtensionFunction.INSTANCE.checkInternetConnection(this$0.context)) {
            Intent intent = new Intent(this$0.context, (Class<?>) GeneralActivity.class);
            intent.putExtra("category", holder.getTextView().getText());
            intent.putExtra("phrasesFile", ExtensionFunctionKt.getCategoryList().get(i).getPath());
            ArrayList<LanguageListModel> translateLangList = ExtensionFunctionKt.getTranslateLangList();
            Preferences preferences = this$0.pref;
            Preferences preferences2 = null;
            if (preferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pref");
                preferences = null;
            }
            intent.putExtra("inputLangC", translateLangList.get(preferences.getPhInputLang()).getLangCode());
            ArrayList<LanguageListModel> translateLangList2 = ExtensionFunctionKt.getTranslateLangList();
            Preferences preferences3 = this$0.pref;
            if (preferences3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pref");
            } else {
                preferences2 = preferences3;
            }
            intent.putExtra("outputLangC", translateLangList2.get(preferences2.getPhOutputLang()).getLangCode());
            this$0.context.startActivity(intent);
            Context context = this$0.context;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
            Context context2 = this$0.context;
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context2).overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            return;
        }
        this$0.listener.showDialog();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public final void setData(ArrayList<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void searchCategoryList(CharSequence searchedText, ArrayList<String> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList<String> arrayList = new ArrayList<>();
        if (searchedText != null && StringsKt.isBlank(searchedText)) {
            setData(list);
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String item = it.next();
            if (searchedText != null) {
                Intrinsics.checkNotNullExpressionValue(item, "item");
                if (StringsKt.contains((CharSequence) item, searchedText, true)) {
                    z = true;
                    if (!z) {
                        arrayList.add(item);
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        setData(arrayList);
    }

    /* compiled from: PhrasebookAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldev/cct/translatorapp/adapter/PhrasebookAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageView;
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View findViewById = this.itemView.findViewById(R.id.ph_category_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.ph_category_icon)");
            this.imageView = (ImageView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.ph_category_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.ph_category_tv)");
            this.textView = (TextView) findViewById2;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final TextView getTextView() {
            return this.textView;
        }
    }
}
