package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l42 extends Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Drawable f28420a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28421b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28422c;

    public l42(@Nullable Drawable drawable, int i4, int i5) {
        this.f28420a = drawable;
        this.f28421b = i4;
        this.f28422c = i5;
    }

    @Override // android.text.Spannable.Factory
    @NotNull
    public final Spannable newSpannable(@NotNull CharSequence source) {
        Intrinsics.checkNotNullParameter(source, "source");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f28420a != null && this.f28421b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f28420a;
            int i4 = this.f28421b;
            drawable.setBounds(0, 0, i4, i4);
            C2204rc c2204rc = new C2204rc(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i5 = this.f28422c;
            colorDrawable.setBounds(0, 0, i5, i5);
            C2204rc c2204rc2 = new C2204rc(colorDrawable);
            spannableStringBuilder.setSpan(c2204rc, 0, 1, 33);
            spannableStringBuilder.setSpan(c2204rc2, 1, 2, 33);
        }
        spannableStringBuilder.append(source);
        return spannableStringBuilder;
    }
}
