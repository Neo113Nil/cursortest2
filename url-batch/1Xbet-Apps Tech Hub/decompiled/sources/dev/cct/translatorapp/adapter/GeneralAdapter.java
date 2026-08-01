package dev.cct.translatorapp.adapter;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GeneralAdapter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002-.B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001dH\u0016J(\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010J\u001e\u0010,\u001a\u00020\u001f2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Ldev/cct/translatorapp/adapter/GeneralAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cct/translatorapp/adapter/GeneralAdapter$ViewHolder;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "mContext", "Landroid/content/Context;", "iLang", "", "oLang", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/cct/translatorapp/adapter/GeneralAdapter$Output;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ldev/cct/translatorapp/adapter/GeneralAdapter$Output;)V", "getILang", "()Ljava/lang/String;", "mList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getOLang", "outputText", "getOutputText", "setOutputText", "(Ljava/lang/String;)V", "pref", "Ldev/cct/translatorapp/util/Preferences;", "getPref", "()Ldev/cct/translatorapp/util/Preferences;", "setPref", "(Ldev/cct/translatorapp/util/Preferences;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onInit", NotificationCompat.CATEGORY_STATUS, "searchList", "searchedText", "", "list", "setData", "Output", "ViewHolder", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeneralAdapter extends RecyclerView.Adapter<ViewHolder> implements TextToSpeech.OnInitListener {
    private final String iLang;
    private final Output listener;
    private final Context mContext;
    private ArrayList<String> mList;
    private final String oLang;
    private String outputText;
    public Preferences pref;

    /* compiled from: GeneralAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/adapter/GeneralAdapter$Output;", "", "copy", "", "text", "", FirebaseAnalytics.Event.SHARE, "speak", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Output {
        void copy(String text);

        void share(String text);

        void speak(String text);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public final String getILang() {
        return this.iLang;
    }

    public final String getOLang() {
        return this.oLang;
    }

    public GeneralAdapter(Context mContext, String iLang, String oLang, Output listener) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(iLang, "iLang");
        Intrinsics.checkNotNullParameter(oLang, "oLang");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mContext = mContext;
        this.iLang = iLang;
        this.oLang = oLang;
        this.listener = listener;
        this.outputText = "";
        this.mList = new ArrayList<>();
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

    public final String getOutputText() {
        return this.outputText;
    }

    public final void setOutputText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.outputText = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.general_item_layout, parent, false);
        setPref(new Preferences(this.mContext));
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = this.mList.get(position);
        Intrinsics.checkNotNullExpressionValue(str, "mList[position]");
        final String str2 = str;
        holder.getTextView().setText(str2);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.GeneralAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralAdapter.onBindViewHolder$lambda$0(GeneralAdapter.this, holder, str2, view);
            }
        });
        holder.getSpeakIcon().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.GeneralAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralAdapter.onBindViewHolder$lambda$1(GeneralAdapter.this, holder, view);
            }
        });
        holder.getCopyIcon().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.GeneralAdapter$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralAdapter.onBindViewHolder$lambda$2(GeneralAdapter.this, holder, view);
            }
        });
        holder.getShareIcon().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.GeneralAdapter$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeneralAdapter.onBindViewHolder$lambda$3(GeneralAdapter.this, holder, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(GeneralAdapter this$0, ViewHolder holder, String phrase, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(phrase, "$phrase");
        Log.d("TAG", "onBindViewHolder: item clicked");
        if (ExtensionFunction.INSTANCE.checkInternetConnection(this$0.mContext)) {
            if (holder.getDropdownCard().getVisibility() != 0) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new GeneralAdapter$onBindViewHolder$1$1(this$0, phrase, holder, null), 3, null);
            } else {
                holder.getDropdownCard().setVisibility(8);
            }
            holder.getArrowIcon().setRotation(360.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(GeneralAdapter this$0, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Output output = this$0.listener;
        CharSequence text = holder.getOutText().getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        output.speak((String) text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(GeneralAdapter this$0, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Output output = this$0.listener;
        CharSequence text = holder.getOutText().getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        output.copy((String) text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(GeneralAdapter this$0, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Output output = this$0.listener;
        CharSequence text = holder.getOutText().getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        output.share((String) text);
    }

    public final void setData(ArrayList<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList = list;
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void searchList(CharSequence searchedText, ArrayList<String> list) {
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

    /* compiled from: GeneralAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Ldev/cct/translatorapp/adapter/GeneralAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "arrowIcon", "Landroid/widget/ImageView;", "getArrowIcon", "()Landroid/widget/ImageView;", "copyIcon", "getCopyIcon", "dropdownCard", "Landroidx/cardview/widget/CardView;", "getDropdownCard", "()Landroidx/cardview/widget/CardView;", "outText", "Landroid/widget/TextView;", "getOutText", "()Landroid/widget/TextView;", "outputCardLang", "getOutputCardLang", "shareIcon", "getShareIcon", "speakIcon", "getSpeakIcon", "textView", "getTextView", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView arrowIcon;
        private final ImageView copyIcon;
        private final CardView dropdownCard;
        private final TextView outText;
        private final TextView outputCardLang;
        private final ImageView shareIcon;
        private final ImageView speakIcon;
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View findViewById = this.itemView.findViewById(R.id.phrase_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.phrase_tv)");
            this.textView = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.out_text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.out_text)");
            this.outText = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.dropdown_card);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.dropdown_card)");
            this.dropdownCard = (CardView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.output_lang_card_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.output_lang_card_tv)");
            this.outputCardLang = (TextView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.out_speaker_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.out_speaker_icon)");
            this.speakIcon = (ImageView) findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.out_clipboard_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.out_clipboard_icon)");
            this.copyIcon = (ImageView) findViewById6;
            View findViewById7 = this.itemView.findViewById(R.id.share_out_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "itemView.findViewById(R.id.share_out_icon)");
            this.shareIcon = (ImageView) findViewById7;
            View findViewById8 = this.itemView.findViewById(R.id.arrow_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "itemView.findViewById(R.id.arrow_icon)");
            this.arrowIcon = (ImageView) findViewById8;
        }

        public final TextView getTextView() {
            return this.textView;
        }

        public final TextView getOutText() {
            return this.outText;
        }

        public final CardView getDropdownCard() {
            return this.dropdownCard;
        }

        public final TextView getOutputCardLang() {
            return this.outputCardLang;
        }

        public final ImageView getSpeakIcon() {
            return this.speakIcon;
        }

        public final ImageView getCopyIcon() {
            return this.copyIcon;
        }

        public final ImageView getShareIcon() {
            return this.shareIcon;
        }

        public final ImageView getArrowIcon() {
            return this.arrowIcon;
        }
    }
}
