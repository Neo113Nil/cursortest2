package com.chad.library.adapter.base.binder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class QuickDataBindingItemBinder<T, DB extends ViewDataBinding> extends BaseItemBinder<T, BinderDataBindingHolder<DB>> {

    public static final class BinderDataBindingHolder<DB extends ViewDataBinding> extends BaseViewHolder {
        private final DB dataBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BinderDataBindingHolder(DB dataBinding) {
            super(r0);
            s.checkNotNullParameter(dataBinding, "dataBinding");
            View root = dataBinding.getRoot();
            s.checkNotNullExpressionValue(root, "dataBinding.root");
            this.dataBinding = dataBinding;
        }

        public final DB getDataBinding() {
            return this.dataBinding;
        }
    }

    public abstract DB onCreateDataBinding(LayoutInflater layoutInflater, ViewGroup viewGroup, int i8);

    @Override // com.chad.library.adapter.base.binder.BaseItemBinder
    public BinderDataBindingHolder<DB> onCreateViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        s.checkNotNullExpressionValue(from, "from(parent.context)");
        return new BinderDataBindingHolder<>(onCreateDataBinding(from, parent, i8));
    }
}
