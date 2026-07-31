package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2316w9 extends yx<wx.b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f33958a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextView f33959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2316w9(@NotNull View itemView, @NotNull Function0<Unit> onAdUnitsClick) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onAdUnitsClick, "onAdUnitsClick");
        this.f33958a = onAdUnitsClick;
        View findViewById = itemView.findViewById(R.id.item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f33959b = (TextView) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.yx
    public final void a(@NotNull wx.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f33959b.setText(this.itemView.getContext().getString(R.string.ad_units));
        this.f33959b.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Gk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2316w9.a(C2316w9.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2316w9 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f33958a.invoke();
    }
}
