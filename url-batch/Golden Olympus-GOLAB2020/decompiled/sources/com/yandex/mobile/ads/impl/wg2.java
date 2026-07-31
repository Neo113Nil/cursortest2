package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<rx, Unit> f34044a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ax f34045b;

    /* JADX WARN: Multi-variable type inference failed */
    public wg2(@NotNull Function1<? super rx, Unit> onAction, @NotNull ax imageLoader) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f34044a = onAction;
        this.f34045b = imageLoader;
    }

    @NotNull
    public final yx a(@NotNull View itemView, int i4) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return i4 == R.layout.debug_panel_item_action_button ? new C2260u(qg2.f30774b, itemView) : i4 == R.layout.debug_panel_item_switch ? new l32(itemView, new rg2(this)) : i4 == R.layout.deubg_panel_item_header ? new ef0(itemView) : i4 == R.layout.deubg_panel_item_key_value ? new gq0(itemView) : i4 == R.layout.debug_panel_item_mediation_adapter ? new kz0(itemView, this.f34045b, new sg2(this), new tg2(this)) : i4 == R.layout.debug_panel_item_ad_units ? new C2316w9(itemView, new ug2(this)) : i4 == R.layout.debug_panel_item_ad_unit ? new C2270u9(new vg2(this), itemView) : new d30(itemView);
    }
}
