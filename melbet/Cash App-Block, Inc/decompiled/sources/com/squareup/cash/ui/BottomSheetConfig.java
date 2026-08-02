package com.squareup.cash.ui;

/* loaded from: classes.dex */
public interface BottomSheetConfig {

    /* loaded from: classes7.dex */
    public enum HeightMode {
        FULL_SCREEN(100),
        FIFTY_PERCENT(50),
        EIGHTY_PERCENT(80);

        public final int percentage;

        HeightMode(int i) {
            this.percentage = i;
        }
    }

    default BottomSheetStyle getBottomSheetStyle() {
        if (this instanceof BottomSheetStyle) {
            return (BottomSheetStyle) this;
        }
        return null;
    }

    default int getInitialHeight() {
        return 0;
    }

    default HeightMode getMaxHeightMode() {
        return HeightMode.FULL_SCREEN;
    }

    default boolean getWrapChildInNestedScrollingContainer() {
        return true;
    }

    default boolean isLocked() {
        return false;
    }

    default boolean isSnapping() {
        return false;
    }

    default void onSheetPositionChanged(int i) {
    }
}
