package com.withpersona.sdk2.inquiry.steps.ui.inputSelect;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.squareup.cash.support.chat.views.transcript.ItemDiffCallback;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiListItemBinding;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.text.StringsKt;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;

/* loaded from: classes9.dex */
public final class InputSelectListAdapter extends RecyclerView.Adapter {
    public final LinkedHashSet _selectedValues;
    public final AsyncListDiffer asyncListDiffer;
    public final boolean canSelectMultipleValues;
    public final LayoutInflater inflater;
    public final ComposeLayoutInfoKt$$ExternalSyntheticLambda6 onClick;
    public final List options;
    public String query;
    public final InputSelectBoxComponentStyle styles;

    public InputSelectListAdapter(Context context, List list, InputSelectBoxComponentStyle inputSelectBoxComponentStyle, boolean z, List list2, ComposeLayoutInfoKt$$ExternalSyntheticLambda6 composeLayoutInfoKt$$ExternalSyntheticLambda6) {
        context.getClass();
        list.getClass();
        list2.getClass();
        this.options = list;
        this.styles = inputSelectBoxComponentStyle;
        this.canSelectMultipleValues = z;
        this.onClick = composeLayoutInfoKt$$ExternalSyntheticLambda6;
        this.inflater = LayoutInflater.from(context);
        ItemDiffCallback itemDiffCallback = new ItemDiffCallback(2);
        OpReorderer opReorderer = new OpReorderer(this);
        synchronized (DiffUtil.sExecutorLock) {
            try {
                if (DiffUtil.sDiffExecutor == null) {
                    DiffUtil.sDiffExecutor = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.asyncListDiffer = new AsyncListDiffer(opReorderer, new AndroidSvg(9, DiffUtil.sDiffExecutor, itemDiffCallback));
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).value);
        }
        Set set = CollectionsKt.toSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (set.contains(((Option) obj).value)) {
                arrayList2.add(obj);
            }
        }
        this._selectedValues = CollectionsKt.toMutableSet(arrayList2);
        updateItems();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.asyncListDiffer.mReadOnlyList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        Integer focusedBackgroundColorValue;
        viewHolder.getClass();
        Option option = (Option) this.asyncListDiffer.mReadOnlyList.get(i);
        Pi2UiListItemBinding pi2UiListItemBinding = (Pi2UiListItemBinding) ((ViewBindingViewHolder) viewHolder).binding;
        pi2UiListItemBinding.label.setText(option.text);
        ConstraintLayout constraintLayout = pi2UiListItemBinding.rootView;
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectListAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ InputSelectListAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                RecyclerView.ViewHolder viewHolder2 = viewHolder;
                InputSelectListAdapter inputSelectListAdapter = this.f$0;
                switch (i3) {
                    case 0:
                        inputSelectListAdapter.selectItem(viewHolder2.getBindingAdapterPosition());
                        break;
                    default:
                        inputSelectListAdapter.selectItem(viewHolder2.getBindingAdapterPosition());
                        break;
                }
            }
        });
        MaterialCheckBox materialCheckBox = pi2UiListItemBinding.checkbox;
        final int i3 = 1;
        materialCheckBox.setOnClickListener(new View.OnClickListener(this) { // from class: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectListAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ InputSelectListAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                RecyclerView.ViewHolder viewHolder2 = viewHolder;
                InputSelectListAdapter inputSelectListAdapter = this.f$0;
                switch (i32) {
                    case 0:
                        inputSelectListAdapter.selectItem(viewHolder2.getBindingAdapterPosition());
                        break;
                    default:
                        inputSelectListAdapter.selectItem(viewHolder2.getBindingAdapterPosition());
                        break;
                }
            }
        });
        boolean contains = this._selectedValues.contains(option);
        materialCheckBox.setChecked(contains);
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle == null || (focusedBackgroundColorValue = inputSelectBoxComponentStyle.getFocusedBackgroundColorValue()) == null) {
            return;
        }
        int intValue = focusedBackgroundColorValue.intValue();
        if (this.canSelectMultipleValues) {
            return;
        }
        if (contains) {
            constraintLayout.setBackgroundColor(intValue);
            return;
        }
        TypedValue typedValue = new TypedValue();
        constraintLayout.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        constraintLayout.setBackgroundResource(typedValue.resourceId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = this.inflater.inflate(com.squareup.cash.R.layout.pi2_ui_list_item, viewGroup, false);
        int i2 = com.squareup.cash.R.id.checkbox;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) ViewBindings.findChildViewById(inflate, com.squareup.cash.R.id.checkbox);
        if (materialCheckBox != null) {
            i2 = com.squareup.cash.R.id.label;
            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, com.squareup.cash.R.id.label);
            if (textView != null) {
                ViewBindingViewHolder viewBindingViewHolder = new ViewBindingViewHolder(new Pi2UiListItemBinding((ConstraintLayout) inflate, materialCheckBox, textView));
                ViewBinding viewBinding = viewBindingViewHolder.binding;
                viewBinding.getClass();
                Pi2UiListItemBinding pi2UiListItemBinding = (Pi2UiListItemBinding) viewBinding;
                MaterialCheckBox materialCheckBox2 = pi2UiListItemBinding.checkbox;
                TextView textView2 = pi2UiListItemBinding.label;
                InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
                if (inputSelectBoxComponentStyle != null) {
                    TextStylingKt.style(textView2, inputSelectBoxComponentStyle.getTextBasedStyle(), EmptySet.INSTANCE);
                }
                if (!this.canSelectMultipleValues) {
                    materialCheckBox2.setVisibility(8);
                    return viewBindingViewHolder;
                }
                materialCheckBox2.setVisibility(0);
                materialCheckBox2.setButtonTintList(ColorStateList.valueOf(textView2.getCurrentTextColor()));
                return viewBindingViewHolder;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void selectItem(int i) {
        boolean z = this.canSelectMultipleValues;
        LinkedHashSet linkedHashSet = this._selectedValues;
        if (!z) {
            linkedHashSet.clear();
        }
        Option option = (Option) this.asyncListDiffer.mReadOnlyList.get(i);
        if (linkedHashSet.contains(option)) {
            linkedHashSet.remove(option);
        } else {
            option.getClass();
            linkedHashSet.add(option);
        }
        notifyItemChanged(i);
        option.getClass();
        this.onClick.invoke(option);
    }

    public final void updateItems() {
        String str = this.query;
        List list = this.options;
        if (str != null && !StringsKt.isBlank(str)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.contains((CharSequence) ((Option) obj).text, (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.asyncListDiffer.submitList(list, null);
    }
}
