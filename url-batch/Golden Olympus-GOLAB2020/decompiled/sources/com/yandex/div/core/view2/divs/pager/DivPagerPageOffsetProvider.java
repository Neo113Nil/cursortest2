package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerPageOffsetProvider {

    @NotNull
    private final DivPagerAdapter adapter;

    @NotNull
    private final E9.c alignment;
    private final boolean infiniteScroll;
    private final float itemSpacing;

    @NotNull
    private final DivPagerPaddingsHolder paddings;

    @NotNull
    private final DivPagerPageSizeProvider pageSizeProvider;
    private final int parentSize;

    public DivPagerPageOffsetProvider(int i4, float f4, @NotNull DivPagerPageSizeProvider pageSizeProvider, @NotNull DivPagerPaddingsHolder paddings, boolean z4, @NotNull DivPagerAdapter adapter, @NotNull E9.c alignment) {
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.parentSize = i4;
        this.itemSpacing = f4;
        this.pageSizeProvider = pageSizeProvider;
        this.paddings = paddings;
        this.infiniteScroll = z4;
        this.adapter = adapter;
        this.alignment = alignment;
    }

    private final boolean biggerThan(float f4, float f5) {
        return f4 >= Math.abs(f5);
    }

    private final boolean contentIsSmallerThanPager(int i4, int i5) {
        float start = (this.parentSize - this.paddings.getStart()) - this.paddings.getEnd();
        Float itemSize = this.pageSizeProvider.getItemSize(i4);
        if (itemSize != null) {
            float floatValue = itemSize.floatValue();
            if (floatValue >= start) {
                return false;
            }
            if (i4 != i5) {
                float f4 = this.itemSpacing;
                Float itemSize2 = this.pageSizeProvider.getItemSize(i5);
                if (itemSize2 == null) {
                    return true;
                }
                floatValue += f4 + itemSize2.floatValue();
                if (floatValue >= start) {
                    return false;
                }
            }
            for (int i6 = i4 - 1; -1 < i6; i6--) {
                float f5 = this.itemSpacing;
                Float itemSize3 = this.pageSizeProvider.getItemSize(i6);
                if (itemSize3 == null) {
                    break;
                }
                floatValue += f5 + itemSize3.floatValue();
                if (floatValue >= start) {
                    return false;
                }
            }
            int itemCount = this.adapter.getItemCount();
            for (int i7 = i5 + 1; i7 < itemCount; i7++) {
                float f6 = this.itemSpacing;
                Float itemSize4 = this.pageSizeProvider.getItemSize(i7);
                if (itemSize4 == null) {
                    break;
                }
                floatValue += f6 + itemSize4.floatValue();
                if (floatValue >= start) {
                    return false;
                }
            }
        }
        return true;
    }

    private final float getEndOffset(float f4, int i4, int i5) {
        Float nextNeighbourSize;
        Float itemSize;
        if (this.alignment != E9.c.END && (nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(i4)) != null) {
            float floatValue = nextNeighbourSize.floatValue();
            Float nextNeighbourSize2 = this.pageSizeProvider.getNextNeighbourSize(i5);
            if (nextNeighbourSize2 != null) {
                float floatValue2 = nextNeighbourSize2.floatValue();
                float frac = f4 > 0.0f ? getFrac(f4) : getFracInverted(f4);
                float end = ((floatValue * frac) + (floatValue2 * (1 - frac))) - this.paddings.getEnd();
                if (end != 0.0f && (itemSize = this.pageSizeProvider.getItemSize(i5)) != null) {
                    float floatValue3 = itemSize.floatValue() * frac;
                    if (biggerThan(floatValue3, end)) {
                        return 0.0f;
                    }
                    int itemCount = this.adapter.getItemCount();
                    for (int i6 = i5 + 1; i6 < itemCount; i6++) {
                        Float itemSize2 = this.pageSizeProvider.getItemSize(i6);
                        if (itemSize2 == null) {
                            return 0.0f;
                        }
                        floatValue3 += itemSize2.floatValue() + this.itemSpacing;
                        if (biggerThan(floatValue3, end)) {
                            return 0.0f;
                        }
                    }
                    return end - floatValue3;
                }
            }
        }
        return 0.0f;
    }

    private final float getFrac(float f4) {
        float abs = Math.abs(f4);
        return abs - ((float) Math.floor(abs));
    }

    private final float getFracInverted(float f4) {
        float frac = getFrac(f4);
        if (frac > 0.0f) {
            return 1 - frac;
        }
        return 0.0f;
    }

    private final float getInitialOffset(float f4, int i4, boolean z4) {
        if (z4) {
            return 0.0f;
        }
        double d4 = f4;
        int ceil = i4 - ((int) Math.ceil(d4));
        int floor = i4 - ((int) Math.floor(d4));
        if (contentIsSmallerThanPager(ceil, floor)) {
            return getOffsetForSmallContent(f4, ceil, floor);
        }
        if (this.infiniteScroll) {
            return 0.0f;
        }
        float startOffset = getStartOffset(f4, ceil, floor);
        if (startOffset != 0.0f) {
            return startOffset;
        }
        float endOffset = getEndOffset(f4, ceil, floor);
        if (endOffset == 0.0f) {
            return 0.0f;
        }
        return endOffset;
    }

    private final float getInitialStartOffset(int i4, int i5, float f4) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(i4);
        if (prevNeighbourSize != null) {
            float floatValue = prevNeighbourSize.floatValue();
            Float prevNeighbourSize2 = this.pageSizeProvider.getPrevNeighbourSize(i5);
            if (prevNeighbourSize2 != null) {
                return ((floatValue * (1 - f4)) + (prevNeighbourSize2.floatValue() * f4)) - this.paddings.getStart();
            }
        }
        return 0.0f;
    }

    private final float getOffset(float f4, int i4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int signum = (int) Math.signum(f4);
        int abs = (int) Math.abs(f4);
        int i5 = 1;
        float f5 = 0.0f;
        if (1 <= abs) {
            while (true) {
                f5 += getOnePositionOffset(i4, signum);
                i4 -= signum;
                if (i5 == abs) {
                    break;
                }
                i5++;
            }
        }
        float frac = getFrac(f4);
        return f5 + (frac > 0.0f ? frac * getOnePositionOffset(i4, signum) : 0.0f);
    }

    private final float getOffsetForSmallContent(float f4, int i4, int i5) {
        float frac = f4 <= 0.0f ? getFrac(f4) : getFracInverted(f4);
        Float itemSize = this.pageSizeProvider.getItemSize(i4);
        if (itemSize == null) {
            return 0.0f;
        }
        float floatValue = itemSize.floatValue() * frac;
        for (int i6 = i4 - 1; -1 < i6; i6--) {
            Float itemSize2 = this.pageSizeProvider.getItemSize(i6);
            if (itemSize2 == null) {
                return 0.0f;
            }
            floatValue += itemSize2.floatValue() + this.itemSpacing;
        }
        return floatValue - getInitialStartOffset(i4, i5, frac);
    }

    private final float getOnePositionOffset(int i4, int i5) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(i5 > 0 ? i4 : i4 + 1);
        if (prevNeighbourSize != null) {
            float floatValue = prevNeighbourSize.floatValue();
            DivPagerPageSizeProvider divPagerPageSizeProvider = this.pageSizeProvider;
            if (i5 > 0) {
                i4--;
            }
            Float nextNeighbourSize = divPagerPageSizeProvider.getNextNeighbourSize(i4);
            if (nextNeighbourSize != null) {
                return ((floatValue + nextNeighbourSize.floatValue()) - this.itemSpacing) * i5;
            }
        }
        return 0.0f;
    }

    private final float getStartOffset(float f4, int i4, int i5) {
        Float itemSize;
        if (this.alignment == E9.c.START) {
            return 0.0f;
        }
        float frac = f4 <= 0.0f ? getFrac(f4) : getFracInverted(f4);
        float initialStartOffset = getInitialStartOffset(i4, i5, frac);
        if (initialStartOffset == 0.0f || (itemSize = this.pageSizeProvider.getItemSize(i4)) == null) {
            return 0.0f;
        }
        float floatValue = itemSize.floatValue() * frac;
        if (biggerThan(floatValue, initialStartOffset)) {
            return 0.0f;
        }
        do {
            i4--;
            if (-1 >= i4) {
                return floatValue - initialStartOffset;
            }
            Float itemSize2 = this.pageSizeProvider.getItemSize(i4);
            if (itemSize2 == null) {
                return 0.0f;
            }
            floatValue += itemSize2.floatValue() + this.itemSpacing;
        } while (!biggerThan(floatValue, initialStartOffset));
        return 0.0f;
    }

    public final float getPageOffset(float f4, int i4, boolean z4) {
        return getOffset(f4, i4) - getInitialOffset(f4, i4, z4);
    }
}
