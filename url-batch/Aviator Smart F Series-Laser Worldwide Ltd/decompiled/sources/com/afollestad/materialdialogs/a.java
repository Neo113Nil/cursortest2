package com.afollestad.materialdialogs;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a extends RecyclerView.Adapter {
    private c callback;
    private final MaterialDialog dialog;
    private final GravityEnum itemGravity;

    @LayoutRes
    private final int layout;

    /* renamed from: com.afollestad.materialdialogs.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0010a {
        static final /* synthetic */ int[] $SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            $SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        final a adapter;
        final CompoundButton control;
        final TextView title;

        b(View view, a aVar) {
            super(view);
            this.control = (CompoundButton) view.findViewById(R$id.md_control);
            this.title = (TextView) view.findViewById(R$id.md_title);
            this.adapter = aVar;
            view.setOnClickListener(this);
            aVar.dialog.builder.getClass();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.adapter.callback == null || getAdapterPosition() == -1) {
                return;
            }
            this.adapter.callback.onItemSelected(this.adapter.dialog, view, getAdapterPosition(), (this.adapter.dialog.builder.items == null || getAdapterPosition() >= this.adapter.dialog.builder.items.size()) ? null : this.adapter.dialog.builder.items.get(getAdapterPosition()), false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.adapter.callback == null || getAdapterPosition() == -1) {
                return false;
            }
            return this.adapter.callback.onItemSelected(this.adapter.dialog, view, getAdapterPosition(), (this.adapter.dialog.builder.items == null || getAdapterPosition() >= this.adapter.dialog.builder.items.size()) ? null : this.adapter.dialog.builder.items.get(getAdapterPosition()), true);
        }
    }

    interface c {
        boolean onItemSelected(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence, boolean z7);
    }

    a(MaterialDialog materialDialog, @LayoutRes int i8) {
        this.dialog = materialDialog;
        this.layout = i8;
        this.itemGravity = materialDialog.builder.itemsGravity;
    }

    @TargetApi(17)
    private boolean isRTL() {
        return this.dialog.getBuilder().getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @TargetApi(17)
    private void setupGravity(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.itemGravity.getGravityInt() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.itemGravity == GravityEnum.END && !isRTL() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                View view = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(view);
                return;
            }
            if (this.itemGravity == GravityEnum.START && isRTL() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
                View view2 = (CompoundButton) viewGroup.getChildAt(1);
                viewGroup.removeView(view2);
                TextView textView2 = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView2);
                textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
                viewGroup.addView(view2);
                viewGroup.addView(textView2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<CharSequence> arrayList = this.dialog.builder.items;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void setCallback(c cVar) {
        this.callback = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(b bVar, int i8) {
        View view = bVar.itemView;
        boolean isIn = com.afollestad.materialdialogs.util.a.isIn(Integer.valueOf(i8), this.dialog.builder.disabledIndices);
        int adjustAlpha = isIn ? com.afollestad.materialdialogs.util.a.adjustAlpha(this.dialog.builder.itemColor, 0.4f) : this.dialog.builder.itemColor;
        bVar.itemView.setEnabled(!isIn);
        int i9 = C0010a.$SwitchMap$com$afollestad$materialdialogs$MaterialDialog$ListType[this.dialog.listType.ordinal()];
        if (i9 == 1) {
            RadioButton radioButton = (RadioButton) bVar.control;
            MaterialDialog.e eVar = this.dialog.builder;
            boolean z7 = eVar.selectedIndex == i8;
            ColorStateList colorStateList = eVar.choiceWidgetColor;
            if (colorStateList != null) {
                com.afollestad.materialdialogs.internal.a.setTint(radioButton, colorStateList);
            } else {
                com.afollestad.materialdialogs.internal.a.setTint(radioButton, eVar.widgetColor);
            }
            radioButton.setChecked(z7);
            radioButton.setEnabled(!isIn);
        } else if (i9 == 2) {
            CheckBox checkBox = (CheckBox) bVar.control;
            boolean contains = this.dialog.selectedIndicesList.contains(Integer.valueOf(i8));
            MaterialDialog.e eVar2 = this.dialog.builder;
            ColorStateList colorStateList2 = eVar2.choiceWidgetColor;
            if (colorStateList2 != null) {
                com.afollestad.materialdialogs.internal.a.setTint(checkBox, colorStateList2);
            } else {
                com.afollestad.materialdialogs.internal.a.setTint(checkBox, eVar2.widgetColor);
            }
            checkBox.setChecked(contains);
            checkBox.setEnabled(!isIn);
        }
        bVar.title.setText(this.dialog.builder.items.get(i8));
        bVar.title.setTextColor(adjustAlpha);
        MaterialDialog materialDialog = this.dialog;
        materialDialog.setTypeface(bVar.title, materialDialog.builder.regularFont);
        ViewGroup viewGroup = (ViewGroup) view;
        setupGravity(viewGroup);
        int[] iArr = this.dialog.builder.itemIds;
        if (iArr != null) {
            if (i8 < iArr.length) {
                view.setId(iArr[i8]);
            } else {
                view.setId(-1);
            }
        }
        if (viewGroup.getChildCount() == 2) {
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                viewGroup.getChildAt(0).setBackground(null);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                viewGroup.getChildAt(1).setBackground(null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public b onCreateViewHolder(ViewGroup viewGroup, int i8) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.layout, viewGroup, false);
        com.afollestad.materialdialogs.util.a.setBackgroundCompat(inflate, this.dialog.getListSelector());
        return new b(inflate, this);
    }
}
