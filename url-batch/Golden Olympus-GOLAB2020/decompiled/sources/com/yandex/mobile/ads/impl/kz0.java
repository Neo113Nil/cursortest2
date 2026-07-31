package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kz0 extends yx<wx.g> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ax f28359a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<wx.g, Unit> f28360b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f28361c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private LoadReference f28362d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinearLayout f28363e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ImageView f28364f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final TextView f28365g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ImageView f28366h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final TextView f28367i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final TextView f28368j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ImageView f28369k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kz0(@NotNull View itemView, @NotNull ax imageLoader, @NotNull Function1<? super wx.g, Unit> onNetworkClick, @NotNull Function1<? super String, Unit> onWaringButtonClick) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onNetworkClick, "onNetworkClick");
        Intrinsics.checkNotNullParameter(onWaringButtonClick, "onWaringButtonClick");
        this.f28359a = imageLoader;
        this.f28360b = onNetworkClick;
        this.f28361c = onWaringButtonClick;
        View findViewById = itemView.findViewById(R.id.item_mediation_adapter);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f28363e = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.item_logo);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f28364f = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.item_name);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f28365g = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.navigation_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f28366h = (ImageView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.item_info_first);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f28367i = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.item_info_second);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f28368j = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.item_warning_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f28369k = (ImageView) findViewById7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(kz0 this$0, wx.g unit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f28360b.invoke(unit);
    }

    @Override // com.yandex.mobile.ads.impl.yx
    public final void a(@NotNull final wx.g unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Context context = this.itemView.getContext();
        this.f28365g.setText(unit.f());
        qx c4 = unit.c();
        if (c4 != null) {
            this.f28367i.setVisibility(0);
            this.f28367i.setText(c4.d());
            this.f28367i.setTextAppearance(context, c4.c());
            TextView textView = this.f28367i;
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView.setTextColor(C1832bh.a(context2, c4.a()));
            TextView textView2 = this.f28367i;
            Integer b4 = c4.b();
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, b4 != null ? b4.intValue() : 0, 0);
        } else {
            this.f28367i.setVisibility(8);
        }
        ow d4 = unit.d();
        this.f28368j.setText(d4.c());
        this.f28368j.setTextAppearance(context, d4.b());
        TextView textView3 = this.f28368j;
        Context context3 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView3.setTextColor(C1832bh.a(context3, d4.a()));
        LinearLayout linearLayout = this.f28363e;
        String j4 = unit.j();
        linearLayout.setClickable(((j4 == null || StringsKt.z(j4)) && unit.g() == null) ? false : true);
        String j5 = unit.j();
        if (j5 == null || StringsKt.z(j5)) {
            this.f28369k.setVisibility(8);
        } else {
            this.f28369k.setVisibility(0);
            this.f28363e.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.B9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kz0.a(kz0.this, unit, view);
                }
            });
        }
        this.f28364f.setImageResource(0);
        LoadReference loadReference = this.f28362d;
        if (loadReference != null) {
            loadReference.cancel();
        }
        ax axVar = this.f28359a;
        String e4 = unit.e();
        if (e4 == null) {
            e4 = "";
        }
        this.f28362d = axVar.a(e4, this.f28364f);
        if (unit.g() == null) {
            this.f28366h.setVisibility(8);
        } else {
            this.f28366h.setVisibility(0);
            this.f28363e.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.C9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kz0.b(kz0.this, unit, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kz0 this$0, wx.g unit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f28361c.invoke(unit.j());
    }
}
