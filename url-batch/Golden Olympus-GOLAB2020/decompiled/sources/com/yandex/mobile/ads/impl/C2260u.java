package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2260u extends yx<wx.c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<wx.c.a, Unit> f32757a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextView f32758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2260u(@NotNull Function1 onButtonClick, @NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f32757a = onButtonClick;
        View findViewById = itemView.findViewById(R.id.item_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f32758b = (TextView) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.yx
    public final void a(@NotNull final wx.c unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f32758b.setText(unit.b());
        this.f32758b.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Vg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2260u.a(C2260u.this, unit, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2260u this$0, wx.c unit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f32757a.invoke(unit.a());
    }
}
