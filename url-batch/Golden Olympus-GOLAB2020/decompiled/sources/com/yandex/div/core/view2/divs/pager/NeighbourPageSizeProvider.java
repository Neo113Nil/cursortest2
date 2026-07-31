package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import O1.M8;
import W1.m;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class NeighbourPageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourPageWidth;
    private final float neighbourSize;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[E9.c.values().length];
            try {
                iArr[E9.c.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E9.c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E9.c.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeighbourPageSizeProvider(@NotNull M8 mode, @NotNull ExpressionResolver resolver, @NotNull DisplayMetrics metrics, int i4, float f4, @NotNull DivPagerPaddingsHolder paddings, @NotNull E9.c alignment) {
        super(i4, paddings, alignment);
        float start;
        float neighbourSize;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        float pxF = BaseDivViewExtensionsKt.toPxF(mode.f3873a, metrics, resolver);
        this.neighbourPageWidth = pxF;
        this.neighbourSize = f4 + pxF;
        int i5 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i5 == 1) {
            start = i4 - paddings.getStart();
            neighbourSize = getNeighbourSize();
        } else if (i5 == 2) {
            start = i4;
            neighbourSize = getNeighbourSize() * 2;
        } else {
            if (i5 != 3) {
                throw new m();
            }
            start = i4 - paddings.getEnd();
            neighbourSize = getNeighbourSize();
        }
        this.itemSize = start - neighbourSize;
        this.hasOffScreenPages = pxF > 0.0f;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public boolean getHasOffScreenPages() {
        return this.hasOffScreenPages;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getItemSize() {
        return this.itemSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getNeighbourSize() {
        return this.neighbourSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @NotNull
    public Float getItemSize(int i4) {
        return Float.valueOf(getItemSize());
    }
}
