package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l32 extends yx<wx.h> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<wx.h.a, Boolean, Unit> f28408a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UseSwitchCompatOrMaterialCode"})
    @NotNull
    private final Switch f28409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l32(@NotNull View itemView, @NotNull Function2<? super wx.h.a, ? super Boolean, Unit> onCheckedChange) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        this.f28408a = onCheckedChange;
        View findViewById = itemView.findViewById(R.id.item_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f28409b = (Switch) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.yx
    public final void a(@NotNull final wx.h unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f28409b.setOnCheckedChangeListener(null);
        this.f28409b.setText(unit.c());
        this.f28409b.setChecked(unit.a());
        this.f28409b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.mobile.ads.impl.D9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                l32.a(l32.this, unit, compoundButton, z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(l32 this$0, wx.h unit, CompoundButton compoundButton, boolean z4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f28408a.invoke(unit.b(), Boolean.valueOf(z4));
    }
}
