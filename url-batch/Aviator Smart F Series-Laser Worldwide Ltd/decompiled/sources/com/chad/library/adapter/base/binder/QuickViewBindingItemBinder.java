package com.chad.library.adapter.base.binder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class QuickViewBindingItemBinder<T, VB extends ViewBinding> extends BaseItemBinder<T, BinderVBHolder<VB>> {

    public static final class BinderVBHolder<VB extends ViewBinding> extends BaseViewHolder {
        private final VB viewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BinderVBHolder(VB viewBinding) {
            super(r0);
            s.checkNotNullParameter(viewBinding, "viewBinding");
            View root = viewBinding.getRoot();
            s.checkNotNullExpressionValue(root, "viewBinding.root");
            this.viewBinding = viewBinding;
        }

        public final VB getViewBinding() {
            return this.viewBinding;
        }
    }

    public abstract VB onCreateViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup, int i8);

    @Override // com.chad.library.adapter.base.binder.BaseItemBinder
    public BinderVBHolder<VB> onCreateViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        s.checkNotNullExpressionValue(from, "from(parent.context)");
        return new BinderVBHolder<>(onCreateViewBinding(from, parent, i8));
    }
}
