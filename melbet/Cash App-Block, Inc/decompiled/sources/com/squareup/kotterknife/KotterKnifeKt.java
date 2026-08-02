package com.squareup.kotterknife;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes7.dex */
public abstract class KotterKnifeKt {
    static {
        new TypedValue();
    }

    public static final Lazy bindView(View view, int i) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        return new Lazy(new KotterKnifeKt$$ExternalSyntheticLambda1(new KotterKnifeKt$$ExternalSyntheticLambda0(0), i, context));
    }
}
