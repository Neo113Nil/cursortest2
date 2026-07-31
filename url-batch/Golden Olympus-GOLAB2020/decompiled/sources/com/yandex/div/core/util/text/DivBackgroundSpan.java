package com.yandex.div.core.util.text;

import O1.AbstractC0853he;
import O1.C0942me;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivBackgroundSpan extends UnderlineSpan {

    @Nullable
    private final AbstractC0853he background;

    @Nullable
    private final C0942me border;

    public DivBackgroundSpan(@Nullable C0942me c0942me, @Nullable AbstractC0853he abstractC0853he) {
        this.border = c0942me;
        this.background = abstractC0853he;
    }

    @Nullable
    public final AbstractC0853he getBackground() {
        return this.background;
    }

    @Nullable
    public final C0942me getBorder() {
        return this.border;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setUnderlineText(false);
    }
}
