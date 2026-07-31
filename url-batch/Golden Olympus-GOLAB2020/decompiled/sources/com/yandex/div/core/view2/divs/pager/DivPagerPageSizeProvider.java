package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import W1.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivPagerPageSizeProvider {

    @NotNull
    private final E9.c alignment;

    @NotNull
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

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

    public DivPagerPageSizeProvider(int i4, @NotNull DivPagerPaddingsHolder paddings, @NotNull E9.c alignment) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.parentSize = i4;
        this.paddings = paddings;
        this.alignment = alignment;
    }

    private final Float getCenteredNeighbourSize(int i4) {
        Float itemSize = getItemSize(i4);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - itemSize.floatValue()) / 2.0f);
    }

    @Nullable
    public abstract Float getItemSize(int i4);

    @Nullable
    public final Float getNextNeighbourSize(int i4) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return getCenteredNeighbourSize(i4);
            }
            if (i5 == 3) {
                return Float.valueOf(this.paddings.getEnd());
            }
            throw new m();
        }
        Float itemSize = getItemSize(i4);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getStart()) - itemSize.floatValue());
    }

    @Nullable
    public final Float getPrevNeighbourSize(int i4) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i5 == 1) {
            return Float.valueOf(this.paddings.getStart());
        }
        if (i5 == 2) {
            return getCenteredNeighbourSize(i4);
        }
        if (i5 != 3) {
            throw new m();
        }
        Float itemSize = getItemSize(i4);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getEnd()) - itemSize.floatValue());
    }
}
