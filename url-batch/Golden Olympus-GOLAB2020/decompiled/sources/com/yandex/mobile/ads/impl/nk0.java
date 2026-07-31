package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class nk0 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f29656a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2351xl f29657b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextView f29658c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final View.OnClickListener f29659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk0(@NotNull Context context, @NotNull d10 dimensionConverter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f29656a = dimensionConverter;
        this.f29657b = new C2351xl(context, dimensionConverter);
        this.f29658c = new TextView(context);
        this.f29659d = new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Qa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nk0.a(nk0.this, view);
            }
        };
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nk0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean isSelected = this$0.f29657b.isSelected();
        this$0.f29657b.setSelected(!isSelected);
        this$0.f29658c.setVisibility(!isSelected ? 0 : 8);
    }

    public final void setDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f29658c.setText(description);
    }

    private final void a(Context context) {
        setOrientation(0);
        this.f29656a.getClass();
        int a4 = d10.a(context, 4.0f);
        setPadding(a4, a4, a4, a4);
        this.f29657b.setOnClickListener(this.f29659d);
        addView(this.f29657b);
        this.f29656a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int c4 = AbstractC3185a.c(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f29658c.setPadding(c4, c4, c4, c4);
        this.f29656a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int c5 = AbstractC3185a.c(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(c5, -65536);
        this.f29658c.setBackgroundDrawable(gradientDrawable);
        addView(this.f29658c);
        this.f29656a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int c6 = AbstractC3185a.c(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f29658c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(c6, 0, c6, c6);
        this.f29658c.setLayoutParams(layoutParams2);
        this.f29658c.setVisibility(8);
    }
}
