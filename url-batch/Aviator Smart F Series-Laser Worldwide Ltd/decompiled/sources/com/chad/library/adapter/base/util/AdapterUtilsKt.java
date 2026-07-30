package com.chad.library.adapter.base.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class AdapterUtilsKt {
    public static final View getItemView(ViewGroup viewGroup, @LayoutRes int i8) {
        s.checkNotNullParameter(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i8, viewGroup, false);
        s.checkNotNullExpressionValue(inflate, "from(this.context).infla…layoutResId, this, false)");
        return inflate;
    }
}
