package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    /* renamed from: com.google.android.material.carousel.KeylineStateList$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private KeylineStateList(@NonNull KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = Collections.unmodifiableList(list);
        this.endStateSteps = Collections.unmodifiableList(list2);
        float f8 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f8;
        float f9 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f9;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f8, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f9, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f8, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f8, fArr);
        return stateStepsRange[0] >= 0.5f ? list.get((int) stateStepsRange[2]) : list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f8) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f8 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i8 = 0; i8 < keylineState.getKeylines().size(); i8++) {
            if (!keylineState.getKeylines().get(i8).isAnchor) {
                return i8;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f8) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f8 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f8, float f9, float f10, CarouselStrategy.StrategyType strategyType) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f8, f9, strategyType), getStateStepsEnd(carousel, keylineState, f8, f10, strategyType));
    }

    private static float[] getStateStepInterpolationPoints(float f8, List<KeylineState> list, boolean z7) {
        int size = list.size();
        float[] fArr = new float[size];
        int i8 = 1;
        while (i8 < size) {
            int i9 = i8 - 1;
            KeylineState keylineState = list.get(i9);
            KeylineState keylineState2 = list.get(i8);
            fArr[i8] = i8 == size + (-1) ? 1.0f : fArr[i9] + ((z7 ? keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc : keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc) / f8);
            i8++;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f8, float f9, CarouselStrategy.StrategyType strategyType) {
        int i8;
        int i9;
        int i10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) || findLastNonAnchorKeylineIndex == -1) {
            if (f9 > 0.0f) {
                arrayList.add(shiftKeylineStateForPadding(keylineState, f9, containerWidth, false, f8, strategyType));
            }
            return arrayList;
        }
        int lastFocalKeylineIndex = findLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
        float f10 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
        if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
            arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, (f10 - keylineState.getLastFocalKeyline().cutoff) - f9, containerWidth));
            return arrayList;
        }
        float f11 = 0.0f;
        int i11 = 0;
        while (i11 < lastFocalKeylineIndex) {
            KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
            int i12 = findLastNonAnchorKeylineIndex - i11;
            float f12 = f11 + keylineState.getKeylines().get(i12).cutoff;
            int i13 = i12 + 1;
            KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findLastNonAnchorKeylineIndex, i13 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i13).mask) + 1 : 0, f10 - f12, keylineState.getFirstFocalKeylineIndex() + i11 + 1, keylineState.getLastFocalKeylineIndex() + i11 + 1, containerWidth);
            if (i11 != lastFocalKeylineIndex - 1 || f9 <= 0.0f) {
                i8 = i11;
                i9 = lastFocalKeylineIndex;
                i10 = containerWidth;
            } else {
                i8 = i11;
                i9 = lastFocalKeylineIndex;
                i10 = containerWidth;
                moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f9, containerWidth, false, f8, strategyType);
            }
            arrayList.add(moveKeylineAndCreateKeylineState);
            i11 = i8 + 1;
            lastFocalKeylineIndex = i9;
            containerWidth = i10;
            f11 = f12;
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f8, float[] fArr) {
        int size = list.size();
        float f9 = fArr[0];
        int i8 = 1;
        while (i8 < size) {
            float f10 = fArr[i8];
            if (f8 <= f10) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f9, f10, f8), i8 - 1, i8};
            }
            i8++;
            f9 = f10;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f8, float f9, CarouselStrategy.StrategyType strategyType) {
        int i8;
        int i9;
        int i10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (isFirstFocalItemAtLeftOfContainer(keylineState) || findFirstNonAnchorKeylineIndex == -1) {
            if (f9 > 0.0f) {
                arrayList.add(shiftKeylineStateForPadding(keylineState, f9, containerWidth, true, f8, strategyType));
            }
            return arrayList;
        }
        int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - findFirstNonAnchorKeylineIndex;
        float f10 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
        if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
            arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f10 + keylineState.getFirstFocalKeyline().cutoff + f9, containerWidth));
            return arrayList;
        }
        float f11 = 0.0f;
        int i11 = 0;
        while (i11 < firstFocalKeylineIndex) {
            KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
            int i12 = findFirstNonAnchorKeylineIndex + i11;
            int size = keylineState.getKeylines().size() - 1;
            float f12 = f11 + keylineState.getKeylines().get(i12).cutoff;
            KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findFirstNonAnchorKeylineIndex, i12 - 1 >= 0 ? findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(r2).mask) - 1 : size, f10 + f12, (keylineState.getFirstFocalKeylineIndex() - i11) - 1, (keylineState.getLastFocalKeylineIndex() - i11) - 1, containerWidth);
            if (i11 != firstFocalKeylineIndex - 1 || f9 <= 0.0f) {
                i8 = i11;
                i9 = firstFocalKeylineIndex;
                i10 = containerWidth;
            } else {
                i8 = i11;
                i9 = firstFocalKeylineIndex;
                i10 = containerWidth;
                moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f9, containerWidth, true, f8, strategyType);
            }
            arrayList.add(moveKeylineAndCreateKeylineState);
            i11 = i8 + 1;
            firstFocalKeylineIndex = i9;
            containerWidth = i10;
            f11 = f12;
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        return keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline();
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        return keylineState.getLastFocalKeyline().locOffset + (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) <= ((float) containerHeight) && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline();
    }

    private static KeylineState lerp(List<KeylineState> list, float f8, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f8, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i8, int i9, float f8, int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i9, (KeylineState.Keyline) arrayList.remove(i8));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i12);
        int i13 = 0;
        while (i13 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i13);
            float f9 = keyline.maskedItemSize;
            builder.addKeyline(f8 + (f9 / 2.0f), keyline.mask, f9, i13 >= i10 && i13 <= i11, keyline.isAnchor, keyline.cutoff);
            f8 += keyline.maskedItemSize;
            i13++;
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPadding(@NonNull KeylineState keylineState, float f8, int i8, boolean z7, float f9, CarouselStrategy.StrategyType strategyType) {
        return AnonymousClass1.$SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType[strategyType.ordinal()] != 1 ? shiftKeylineStateForPaddingUncontained(keylineState, f8, i8, z7) : shiftKeylineStateForPaddingContained(keylineState, f8, i8, z7, f9);
    }

    private static KeylineState shiftKeylineStateForPaddingContained(KeylineState keylineState, float f8, int i8, boolean z7, float f9) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i8);
        float numberOfNonAnchorKeylines = f8 / keylineState.getNumberOfNonAnchorKeylines();
        float f10 = z7 ? f8 : 0.0f;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i9);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z8 = i9 >= keylineState.getFirstFocalKeylineIndex() && i9 <= keylineState.getLastFocalKeylineIndex();
                float f11 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f11, keylineState.getItemSize(), f9);
                float f12 = (f11 / 2.0f) + f10;
                float abs = Math.abs(f12 - keyline.locOffset);
                builder.addKeyline(f12, childMaskPercentage, f11, z8, false, keyline.cutoff, z7 ? abs : 0.0f, z7 ? 0.0f : abs);
                f10 += f11;
            }
            i9++;
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPaddingUncontained(@NonNull KeylineState keylineState, float f8, int i8, boolean z7) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i8);
        int size = z7 ? 0 : arrayList.size() - 1;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i9);
            if (keyline.isAnchor && i9 == size) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                float f9 = keyline.locOffset;
                float f10 = z7 ? f9 + f8 : f9 - f8;
                float f11 = z7 ? f8 : 0.0f;
                float f12 = z7 ? 0.0f : f8;
                boolean z8 = i9 >= keylineState.getFirstFocalKeylineIndex() && i9 <= keylineState.getLastFocalKeylineIndex();
                float f13 = keyline.mask;
                float f14 = keyline.maskedItemSize;
                builder.addKeyline(f10, f13, f14, z8, keyline.isAnchor, Math.abs(z7 ? Math.max(0.0f, ((f14 / 2.0f) + f10) - i8) : Math.min(0.0f, f10 - (f14 / 2.0f))), f11, f12);
            }
            i9++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f8, int i8) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f8, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), i8);
    }

    KeylineState getDefaultState() {
        return this.defaultState;
    }

    KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    Map<Integer, KeylineState> getKeylineStateForPositionMap(int i8, int i9, int i10, boolean z7) {
        float itemSize = this.defaultState.getItemSize();
        HashMap hashMap = new HashMap();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i8) {
                break;
            }
            int i13 = z7 ? (i8 - i11) - 1 : i11;
            if (i13 * itemSize * (z7 ? -1 : 1) > i10 - this.endShiftRange || i11 >= i8 - this.endStateSteps.size()) {
                Integer valueOf = Integer.valueOf(i13);
                List<KeylineState> list = this.endStateSteps;
                hashMap.put(valueOf, list.get(MathUtils.clamp(i12, 0, list.size() - 1)));
                i12++;
            }
            i11++;
        }
        int i14 = 0;
        for (int i15 = i8 - 1; i15 >= 0; i15--) {
            int i16 = z7 ? (i8 - i15) - 1 : i15;
            if (i16 * itemSize * (z7 ? -1 : 1) < i9 + this.startShiftRange || i15 < this.startStateSteps.size()) {
                Integer valueOf2 = Integer.valueOf(i16);
                List<KeylineState> list2 = this.startStateSteps;
                hashMap.put(valueOf2, list2.get(MathUtils.clamp(i14, 0, list2.size() - 1)));
                i14++;
            }
        }
        return hashMap;
    }

    @NonNull
    public KeylineState getShiftedState(float f8, float f9, float f10) {
        return getShiftedState(f8, f9, f10, false);
    }

    KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    KeylineState getShiftedState(float f8, float f9, float f10, boolean z7) {
        float lerp;
        List<KeylineState> list;
        float[] fArr;
        float f11 = this.startShiftRange + f9;
        float f12 = f10 - this.endShiftRange;
        float f13 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f14 = getEndState().getFirstFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f13) {
            f11 += f13;
        }
        if (this.endShiftRange == f14) {
            f12 -= f14;
        }
        if (f8 < f11) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, f9, f11, f8);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f8 <= f12) {
                return this.defaultState;
            }
            lerp = AnimationUtils.lerp(0.0f, 1.0f, f12, f10, f8);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z7 ? closestStateStepFromInterpolation(list, lerp, fArr) : lerp(list, lerp, fArr);
    }
}
