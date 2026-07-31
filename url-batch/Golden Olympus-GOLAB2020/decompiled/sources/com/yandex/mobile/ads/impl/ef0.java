package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ef0 extends yx<wx.e> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextView f25280a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef0(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f25280a = (TextView) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.yx
    public final void a(wx.e eVar) {
        wx.e unit = eVar;
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f25280a.setText(unit.a());
    }
}
