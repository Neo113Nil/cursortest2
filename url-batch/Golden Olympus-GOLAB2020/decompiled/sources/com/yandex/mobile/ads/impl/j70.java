package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class j70 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private db2 f27553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final db2 getAdUiElements() {
        return this.f27553a;
    }

    public final void setAdUiElements(@Nullable db2 db2Var) {
        this.f27553a = db2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
