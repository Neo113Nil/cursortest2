package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gq0 extends yx<wx.f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextView f26270a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextView f26271b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextView f26272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f26270a = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.item_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f26271b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f26272c = (TextView) findViewById3;
    }

    @Override // com.yandex.mobile.ads.impl.yx
    public final void a(wx.f fVar) {
        wx.f unit = fVar;
        Intrinsics.checkNotNullParameter(unit, "unit");
        String a4 = unit.a();
        qx b4 = unit.b();
        ow c4 = unit.c();
        Context context = this.itemView.getContext();
        if (a4 != null) {
            this.f26270a.setVisibility(0);
            this.f26270a.setText(a4);
        } else {
            this.f26270a.setVisibility(8);
        }
        if (b4 == null || StringsKt.z(b4.d())) {
            this.f26271b.setVisibility(8);
        } else {
            this.f26271b.setVisibility(0);
            this.f26271b.setText(b4.d());
            Intrinsics.checkNotNull(context);
            this.f26271b.setTextColor(C1832bh.a(context, b4.a()));
            Integer b5 = b4.b();
            this.f26271b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, b5 != null ? b5.intValue() : 0, 0);
        }
        if (c4 == null || StringsKt.z(c4.c())) {
            this.f26272c.setVisibility(8);
            return;
        }
        this.f26272c.setVisibility(0);
        this.f26272c.setText(c4.c());
        Intrinsics.checkNotNull(context);
        this.f26272c.setTextColor(C1832bh.a(context, c4.a()));
    }
}
