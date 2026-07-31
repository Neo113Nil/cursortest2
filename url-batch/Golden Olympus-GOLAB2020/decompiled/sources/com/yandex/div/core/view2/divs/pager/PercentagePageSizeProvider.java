package com.yandex.div.core.view2.divs.pager;

import O1.C0830g9;
import O1.E9;
import W1.m;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class PercentagePageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourSize;
    private final double pageWidthPercentage;

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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PercentagePageSizeProvider(@NotNull C0830g9 mode, @NotNull ExpressionResolver resolver, int i4, @NotNull DivPagerPaddingsHolder paddings, @NotNull E9.c alignment) {
        super(i4, paddings, alignment);
        float start;
        float itemSize;
        float f4;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        double doubleValue = ((Number) mode.f6241a.f5399a.evaluate(resolver)).doubleValue();
        this.pageWidthPercentage = doubleValue;
        this.itemSize = (float) ((i4 * doubleValue) / 100);
        int i5 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i5 == 1) {
            start = i4 - paddings.getStart();
            itemSize = getItemSize();
        } else if (i5 == 2) {
            f4 = (i4 - getItemSize()) / 2;
            this.neighbourSize = f4;
            this.hasOffScreenPages = doubleValue < 100.0d;
        } else {
            if (i5 != 3) {
                throw new m();
            }
            start = i4 - paddings.getEnd();
            itemSize = getItemSize();
        }
        f4 = start - itemSize;
        this.neighbourSize = f4;
        this.hasOffScreenPages = doubleValue < 100.0d;
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
