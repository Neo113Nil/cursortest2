package com.yandex.div.core.view2.errors;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import h2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VariableAdapter extends m {

    @NotNull
    private final n variableMutator;

    @Metadata
    private static final class VariableDiffUtilCallback extends h.f {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull VariableModel oldItem, @NotNull VariableModel newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getValue(), newItem.getValue());
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull VariableModel oldItem, @NotNull VariableModel newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getName(), newItem.getName());
        }
    }

    @Metadata
    public static final class VariableViewHolder extends RecyclerView.E {

        @NotNull
        private final VariableView root;

        @NotNull
        private final n variableMutator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VariableViewHolder(@NotNull VariableView root, @NotNull n variableMutator) {
            super(root);
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(variableMutator, "variableMutator");
            this.root = root;
            this.variableMutator = variableMutator;
        }

        private final String fullName(VariableModel variableModel) {
            if (variableModel.getPath().length() <= 0) {
                return variableModel.getName();
            }
            return variableModel.getPath() + '/' + variableModel.getName();
        }

        private final int inputType(VariableModel variableModel) {
            String type = variableModel.getType();
            return Intrinsics.areEqual(type, "number") ? true : Intrinsics.areEqual(type, "integer") ? 2 : 1;
        }

        public final void bind(@NotNull VariableModel variable) {
            Intrinsics.checkNotNullParameter(variable, "variable");
            VariableView variableView = this.root;
            variableView.getNameText().setText(fullName(variable));
            variableView.getTypeText().setText(variable.getType());
            variableView.getValueText().setText(variable.getValue());
            variableView.getValueText().setInputType(inputType(variable));
            variableView.setOnEnterAction(new VariableAdapter$VariableViewHolder$bind$1$1(this, variable));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableAdapter(@NotNull n variableMutator) {
        super(new VariableDiffUtilCallback());
        Intrinsics.checkNotNullParameter(variableMutator, "variableMutator");
        this.variableMutator = variableMutator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull VariableViewHolder holder, int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = getCurrentList().get(i4);
        Intrinsics.checkNotNullExpressionValue(obj, "currentList[position]");
        holder.bind((VariableModel) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public VariableViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new VariableViewHolder(new VariableView(context), this.variableMutator);
    }
}
