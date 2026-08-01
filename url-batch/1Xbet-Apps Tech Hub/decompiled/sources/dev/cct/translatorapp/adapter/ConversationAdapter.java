package dev.cct.translatorapp.adapter;

import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.dataModel.ConversationModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationAdapter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003'()B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0006\u0010\u0019\u001a\u00020\u0012J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0016H\u0016J\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u000fJ\u001e\u0010$\u001a\u00020\u00122\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rJ\u0006\u0010&\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Ldev/cct/translatorapp/adapter/ConversationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldev/cct/translatorapp/adapter/ConversationAdapter$ViewHolder;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ldev/cct/translatorapp/adapter/ConversationAdapter$Output;", "(Ldev/cct/translatorapp/adapter/ConversationAdapter$Output;)V", "deleteBtnClicked", "", "isAllSelected", "mList", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/dataModel/ConversationModel;", "Lkotlin/collections/ArrayList;", "selectAllImg", "Landroid/widget/ImageView;", "toDelete", "addData", "", "data", "getArrayToDelete", "getItemCount", "", "getItemViewType", "position", "hideCheckBox", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onInit", NotificationCompat.CATEGORY_STATUS, "selectAllClicked", "imageView", "setData", "list", "showCheckBox", "Companion", "Output", "ViewHolder", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConversationAdapter extends RecyclerView.Adapter<ViewHolder> implements TextToSpeech.OnInitListener {
    private static final int TYPE_ADVIEW = 2;
    private static final int TYPE_FIRST_VOICE = 0;
    private static final int TYPE_SEC_VOICE = 1;
    private boolean deleteBtnClicked;
    private boolean isAllSelected;
    private final Output listener;
    private final ArrayList<ConversationModel> mList;
    private ImageView selectAllImg;
    private ArrayList<ConversationModel> toDelete;

    /* compiled from: ConversationAdapter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Ldev/cct/translatorapp/adapter/ConversationAdapter$Output;", "", "hideDeleteBtn", "", "showDeleteBtn", "showLastCard", "position", "", "speak", "text", "", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Output {
        void hideDeleteBtn();

        void showDeleteBtn();

        void showLastCard(int position);

        void speak(String text);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
    }

    public ConversationAdapter(Output listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.mList = new ArrayList<>();
        this.toDelete = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = R.layout.coversation_item_layout;
        if (viewType != 0 && viewType == 1) {
            i = R.layout.conversation_output_item_layout;
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(i, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ConversationModel conversationModel = this.mList.get(position);
        Intrinsics.checkNotNullExpressionValue(conversationModel, "mList[position]");
        final ConversationModel conversationModel2 = conversationModel;
        holder.getInputText().setText(conversationModel2.getInput());
        holder.getOutputText().setText(conversationModel2.getOutput());
        holder.getSpeak().setLayoutDirection(holder.getOutputText().getLayoutDirection());
        Log.e("conv", ": " + conversationModel2.getInput() + "//" + conversationModel2.getOutput());
        if (this.deleteBtnClicked) {
            holder.getCheckbox().setVisibility(0);
        } else {
            holder.getCheckbox().setVisibility(8);
        }
        if (conversationModel2.isSelected()) {
            holder.getCheckbox().setImageResource(R.drawable.selected_icon);
            this.toDelete.add(conversationModel2);
        } else {
            this.isAllSelected = false;
            holder.getCheckbox().setImageResource(R.drawable.unselected);
            this.toDelete.remove(conversationModel2);
            if (this.toDelete.isEmpty()) {
                this.listener.hideDeleteBtn();
            }
        }
        holder.getSpeak().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.ConversationAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAdapter.onBindViewHolder$lambda$0(ConversationAdapter.this, holder, view);
            }
        });
        holder.getCheckbox().setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.adapter.ConversationAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAdapter.onBindViewHolder$lambda$1(ConversationModel.this, this, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ConversationAdapter this$0, ViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Output output = this$0.listener;
        CharSequence text = holder.getOutputText().getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
        output.speak((String) text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(ConversationModel itemsViewModel, ConversationAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        itemsViewModel.setSelected(!itemsViewModel.isSelected());
        ImageView imageView = this$0.selectAllImg;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.unselected);
        }
        this$0.listener.showDeleteBtn();
        this$0.notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Log.e("listSize", "getItemCount: " + this.mList.size());
        return this.mList.size();
    }

    public final void addData(ConversationModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Log.e("conv", ": " + data + ",....." + data);
        this.mList.add(data);
        notifyItemInserted(this.mList.size() - 1);
        this.listener.showLastCard(this.mList.size() - 1);
    }

    public final void setData(ArrayList<ConversationModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.deleteBtnClicked = false;
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        String itemType = this.mList.get(position).getItemType();
        if (itemType == null) {
            return 0;
        }
        int hashCode = itemType.hashCode();
        if (hashCode == -1421968056) {
            return !itemType.equals("adview") ? 0 : 2;
        }
        if (hashCode != -687779101) {
            return (hashCode == -358981209 && itemType.equals("second_voice")) ? 1 : 0;
        }
        itemType.equals("first_voice");
        return 0;
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
            ((ConversationModel) it.next()).setSelected(this.isAllSelected);
            Log.e("listSize", "selectAllClicked: " + this.mList.size());
        }
        notifyDataSetChanged();
    }

    public final ArrayList<ConversationModel> getArrayToDelete() {
        return this.toDelete;
    }

    /* compiled from: ConversationAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Ldev/cct/translatorapp/adapter/ConversationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "checkbox", "Landroid/widget/ImageView;", "getCheckbox", "()Landroid/widget/ImageView;", "inputText", "Landroid/widget/TextView;", "getInputText", "()Landroid/widget/TextView;", "outputText", "getOutputText", "speak", "getSpeak", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView checkbox;
        private final TextView inputText;
        private final TextView outputText;
        private final ImageView speak;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View findViewById = this.itemView.findViewById(R.id.input_text);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.input_text)");
            this.inputText = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.output_text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.output_text)");
            this.outputText = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.speak_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.speak_icon)");
            this.speak = (ImageView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.checkbox);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.checkbox)");
            this.checkbox = (ImageView) findViewById4;
        }

        public final TextView getInputText() {
            return this.inputText;
        }

        public final TextView getOutputText() {
            return this.outputText;
        }

        public final ImageView getSpeak() {
            return this.speak;
        }

        public final ImageView getCheckbox() {
            return this.checkbox;
        }
    }
}
