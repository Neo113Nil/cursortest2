package com.yandex.div.core.player;

import O1.Lf;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.div.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? R$attr.divImageStyle : i4);
    }

    @Nullable
    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return super.getAttachedPlayer();
    }

    public /* bridge */ /* synthetic */ void setScale(@NotNull Lf lf) {
        super.setScale(lf);
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z4) {
        super.setVisibleOnScreen(z4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
