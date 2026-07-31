package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k42 extends kg2<TextView, String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k42(@NotNull TextView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(TextView textView) {
        TextView view = textView;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText("");
        super.a(view);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void b(TextView textView, String str) {
        TextView view = textView;
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        view.setText(value);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(TextView textView, String str) {
        TextView view = textView;
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        CharSequence text = view.getText();
        if (text != null) {
            return StringsKt.w(String.valueOf(text), value, true);
        }
        return false;
    }
}
