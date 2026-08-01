package dev.cct.translatorapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: LangSelAdapter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#J\u001e\u0010$\u001a\u00020\u001a2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eR\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Ldev/cct/translatorapp/adapter/LangSelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cct/translatorapp/adapter/LangSelAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", LinkHeader.Parameters.Type, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/cct/translatorapp/adapter/IOLanguages;", "(Landroid/content/Context;Ljava/lang/String;Ldev/cct/translatorapp/adapter/IOLanguages;)V", "listener2", "mList", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/LanguageListModel;", "Lkotlin/collections/ArrayList;", "pref", "Ldev/cct/translatorapp/util/Preferences;", "getPref", "()Ldev/cct/translatorapp/util/Preferences;", "setPref", "(Ldev/cct/translatorapp/util/Preferences;)V", "getType", "()Ljava/lang/String;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "searchList", "searchedText", "", "setData", "list", "ViewHolder", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LangSelAdapter extends RecyclerView.Adapter<ViewHolder> {
    private IOLanguages listener2;
    private final Context mContext;
    private ArrayList<LanguageListModel> mList;
    public Preferences pref;
    private final String type;

    public LangSelAdapter(Context mContext, String str, IOLanguages listener) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mContext = mContext;
        this.type = str;
        this.mList = new ArrayList<>();
        this.listener2 = listener;
    }

    public final String getType() {
        return this.type;
    }

    public final Preferences getPref() {
        Preferences preferences = this.pref;
        if (preferences != null) {
            return preferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pref");
        return null;
    }

    public final void setPref(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "<set-?>");
        this.pref = preferences;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.choose_lang_item, parent, false);
        setPref(new Preferences(this.mContext));
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LanguageListModel languageListModel = this.mList.get(position);
        Intrinsics.checkNotNullExpressionValue(languageListModel, "mList[position]");
        final LanguageListModel languageListModel2 = languageListModel;
        holder.getTextView().setText(this.mContext.getString(languageListModel2.getLangName()));
        holder.getLangName().setText("(" + languageListModel2.getCurrentLangName() + ")");
        Log.d("TAG22", "onBindViewHolder: called");
        if (this.mList.get(position).getLangName() == R.string.choose_language) {
            holder.itemView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            layoutParams.height = 0;
            layoutParams.width = 0;
            holder.itemView.setLayoutParams(layoutParams);
            return;
        }
        holder.itemView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = holder.itemView.getLayoutParams();
        layoutParams2.height = -2;
        layoutParams2.width = -1;
        holder.itemView.setLayoutParams(layoutParams2);
        if (Intrinsics.areEqual(this.type, "input")) {
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getTranslateInput()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$0(LangSelAdapter.this, languageListModel2, view);
                }
            });
        }
        if (Intrinsics.areEqual(this.type, AgentOptions.OUTPUT)) {
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getTranslateOutput()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$1(LangSelAdapter.this, languageListModel2, view);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(this.type, "speech")) {
            Log.d("TAG22", "onBindViewHolder: speech ");
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getSpeechToTextLang()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$2(LangSelAdapter.this, languageListModel2, view);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(this.type, "ph_input")) {
            Log.d("TAG22", "onBindViewHolder: ph input ");
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getPhInputLang()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$3(LangSelAdapter.this, languageListModel2, view);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(this.type, "ph_output")) {
            Log.d("TAG22", "onBindViewHolder: ph output ");
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getPhOutputLang()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$4(LangSelAdapter.this, languageListModel2, view);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(this.type, "con_input")) {
            Log.d("TAG22", "onBindViewHolder: coversation input ");
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getConInputLang()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$5(LangSelAdapter.this, languageListModel2, view);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(this.type, "con_output")) {
            Log.d("TAG22", "onBindViewHolder: coversation output ");
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getConOutputLang()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$6(LangSelAdapter.this, languageListModel2, view);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(this.type, "widget_input")) {
            Log.d("TAG22", "onBindViewHolder: widget output ");
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getWidgetInputLang()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$7(LangSelAdapter.this, languageListModel2, view);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(this.type, "widget_output")) {
            Log.d("TAG22", "onBindViewHolder: widget output ");
            if (ExtensionFunctionKt.getTranslateLangList().get(new Preferences(this.mContext).getWidgetOutputLang()).getLangName() == languageListModel2.getLangName()) {
                holder.getImageView().setImageResource(R.drawable.selected_icon);
            } else {
                holder.getImageView().setImageResource(R.drawable.unselected);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.LangSelAdapter$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LangSelAdapter.onBindViewHolder$lambda$8(LangSelAdapter.this, languageListModel2, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setInputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setOutputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setSpeechLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setPhInputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setPhOutputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setConInputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setConOutputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$7(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setWidgetInputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$8(LangSelAdapter this$0, LanguageListModel itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        IOLanguages iOLanguages = this$0.listener2;
        if (iOLanguages != null) {
            iOLanguages.setWidgetOutputLang(ExtensionFunctionKt.getTranslateLangList().indexOf(itemsViewModel), itemsViewModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return ((this.mList.isEmpty() ^ true) && this.mList.get(0).getLangName() == R.string.choose_language) ? this.mList.size() - 1 : this.mList.size();
    }

    public final void setData(ArrayList<LanguageListModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void searchList(CharSequence searchedText) {
        boolean z;
        ArrayList<LanguageListModel> arrayList = new ArrayList<>();
        if (searchedText != null && StringsKt.isBlank(searchedText)) {
            setData(ExtensionFunctionKt.getTranslateLangList());
            return;
        }
        Iterator<LanguageListModel> it = ExtensionFunctionKt.getTranslateLangList().iterator();
        while (it.hasNext()) {
            LanguageListModel next = it.next();
            if (searchedText != null) {
                String string = this.mContext.getString(next.getLangName());
                Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(item.langName)");
                if (StringsKt.contains((CharSequence) string, searchedText, true)) {
                    z = true;
                    if (!z) {
                        arrayList.add(next);
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        setData(arrayList);
    }

    /* compiled from: LangSelAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Ldev/cct/translatorapp/adapter/LangSelAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "langName", "Landroid/widget/TextView;", "getLangName", "()Landroid/widget/TextView;", "textView", "getTextView", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageView;
        private final TextView langName;
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View findViewById = this.itemView.findViewById(R.id.lang_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.lang_icon)");
            this.imageView = (ImageView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.textView);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.textView)");
            this.textView = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.langName);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.langName)");
            this.langName = (TextView) findViewById3;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final TextView getTextView() {
            return this.textView;
        }

        public final TextView getLangName() {
            return this.langName;
        }
    }
}
