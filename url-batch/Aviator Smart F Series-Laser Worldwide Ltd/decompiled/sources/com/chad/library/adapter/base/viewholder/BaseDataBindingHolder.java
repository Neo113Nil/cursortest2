package com.chad.library.adapter.base.viewholder;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public class BaseDataBindingHolder<BD extends ViewDataBinding> extends BaseViewHolder {
    private final BD dataBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDataBindingHolder(View view) {
        super(view);
        s.checkNotNullParameter(view, "view");
        this.dataBinding = (BD) DataBindingUtil.bind(view);
    }

    public final BD getDataBinding() {
        return this.dataBinding;
    }
}
