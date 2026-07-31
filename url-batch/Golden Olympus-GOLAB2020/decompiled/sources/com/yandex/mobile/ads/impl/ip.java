package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.impl.gp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ip extends kg2<TextView, gp> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(@NotNull TextView view) {
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
    public final void b(TextView textView, gp gpVar) {
        TextView view = textView;
        gp value = gpVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        if (gp.a.f26264b == value.b()) {
            view.setText(value.a());
        }
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(TextView textView, gp gpVar) {
        TextView view = textView;
        gp value = gpVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        if (gp.a.f26264b == value.b()) {
            return Intrinsics.areEqual(view.getText().toString(), value.a());
        }
        return true;
    }
}
