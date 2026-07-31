package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2270u9 extends yx<wx.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f32886a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextView f32887b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextView f32888c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextView f32889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2270u9(@NotNull Function1 onAdUnitClick, @NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onAdUnitClick, "onAdUnitClick");
        this.f32886a = onAdUnitClick;
        View findViewById = itemView.findViewById(R.id.item_name);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f32887b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.item_ad_unit_format);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f32888c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.item_ad_unit_id);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f32889d = (TextView) findViewById3;
    }

    @Override // com.yandex.mobile.ads.impl.yx
    public final void a(@NotNull final wx.a unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f32887b.setText(unit.c());
        this.f32888c.setText(unit.a());
        this.f32889d.setText(unit.b());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Bh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2270u9.a(C2270u9.this, unit, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2270u9 this$0, wx.a unit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f32886a.invoke(unit.b());
    }
}
