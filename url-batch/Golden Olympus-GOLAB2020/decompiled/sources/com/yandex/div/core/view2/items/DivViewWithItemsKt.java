package com.yandex.div.core.view2.items;

import O1.EnumC0779dc;
import W1.m;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivViewWithItemsKt {

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC0779dc.values().length];
            try {
                iArr2[EnumC0779dc.PX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC0779dc.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC0779dc.DP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final <T extends RecyclerView> boolean canScroll(T t4) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t4);
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.getOrientation()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            return t4.canScrollHorizontally(1);
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return t4.canScrollVertically(1);
        }
        return false;
    }

    private static final <T extends RecyclerView> int completelyVisibleItemPosition(T t4, Direction direction) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t4);
        if (linearLayoutManager == null) {
            return -1;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i4 == 1) {
            return linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        }
        if (i4 == 2) {
            return canScroll(t4) ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() : linearLayoutManager.findLastCompletelyVisibleItemPosition();
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int currentItem(T t4, Direction direction) {
        Integer valueOf = Integer.valueOf(completelyVisibleItemPosition(t4, direction));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t4);
        if (linearLayoutManager != null) {
            return visibleItemPosition(linearLayoutManager, direction);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getItemCount(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.getItemCount();
        }
        return 0;
    }

    private static final <T extends RecyclerView> LinearLayoutManager getLinearLayoutManager(T t4) {
        RecyclerView.p layoutManager = t4.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollOffset(T t4) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t4);
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.getOrientation()) : null;
        return (valueOf != null && valueOf.intValue() == 0) ? t4.computeHorizontalScrollOffset() : t4.computeVerticalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollRange(T t4) {
        int computeVerticalScrollRange;
        int paddingBottom;
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t4);
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.getOrientation()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            computeVerticalScrollRange = (t4.computeHorizontalScrollRange() - t4.getWidth()) + t4.getPaddingLeft();
            paddingBottom = t4.getPaddingRight();
        } else {
            computeVerticalScrollRange = (t4.computeVerticalScrollRange() - t4.getHeight()) + t4.getPaddingTop();
            paddingBottom = t4.getPaddingBottom();
        }
        return computeVerticalScrollRange + paddingBottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollTo(T t4, int i4, EnumC0779dc enumC0779dc, DisplayMetrics displayMetrics, boolean z4) {
        int i5 = WhenMappings.$EnumSwitchMapping$1[enumC0779dc.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i4 = BaseDivViewExtensionsKt.spToPx(Integer.valueOf(i4), displayMetrics);
            } else {
                if (i5 != 3) {
                    throw new m();
                }
                i4 = BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i4), displayMetrics);
            }
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t4);
        if (linearLayoutManager == null) {
            return;
        }
        Function2 divViewWithItemsKt$scrollTo$scroll$1 = z4 ? new DivViewWithItemsKt$scrollTo$scroll$1(t4) : new DivViewWithItemsKt$scrollTo$scroll$2(t4);
        int orientation = linearLayoutManager.getOrientation();
        if (orientation == 0) {
            divViewWithItemsKt$scrollTo$scroll$1.invoke(Integer.valueOf(i4 - t4.computeHorizontalScrollOffset()), 0);
        } else {
            if (orientation != 1) {
                return;
            }
            divViewWithItemsKt$scrollTo$scroll$1.invoke(0, Integer.valueOf(i4 - t4.computeVerticalScrollOffset()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollToTheEnd(T t4, DisplayMetrics displayMetrics, boolean z4) {
        scrollTo(t4, scrollRange(t4), EnumC0779dc.PX, displayMetrics, z4);
    }

    private static final int visibleItemPosition(LinearLayoutManager linearLayoutManager, Direction direction) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i4 == 1) {
            return linearLayoutManager.findLastVisibleItemPosition();
        }
        if (i4 == 2) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        throw new m();
    }
}
