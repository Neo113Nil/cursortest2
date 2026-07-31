package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.TextDiff;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PhoneInputMask extends BaseInputMask {

    @NotNull
    private final Function1<Exception, Unit> onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputMask(@NotNull Function1<? super Exception, Unit> onError) {
        super(PhoneInputMaskKt.getDEFAULT_MASK_DATA());
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.onError = onError;
    }

    private final void calculateCursorPositionBy(int i4) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < getDestructedValue().size() && i6 < i4) {
            int i7 = i5 + 1;
            if (getDestructedValue().get(i5) instanceof BaseInputMask.MaskChar.Dynamic) {
                i6++;
            }
            i5 = i7;
        }
        setCursorPosition(firstHolderAfter(i5));
    }

    private final String newMaskPatternFor(String str) {
        String phoneMaskPattern = PhoneInputMaskKt.getPhoneMaskPattern(str);
        if (Intrinsics.areEqual(phoneMaskPattern, getMaskData().getPattern())) {
            return null;
        }
        return phoneMaskPattern;
    }

    private final Unit tryInvalidateMaskDataWith(String str) {
        String newMaskPatternFor = newMaskPatternFor(str);
        if (newMaskPatternFor == null) {
            return null;
        }
        updateMaskDataWith(newMaskPatternFor);
        return Unit.f41027a;
    }

    private final void updateMaskDataWith(String str) {
        updateMaskData(new BaseInputMask.MaskData(str, PhoneInputMaskKt.getDEFAULT_DECODING_MASK_KEY(), getMaskData().getAlwaysVisible()), false);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        TextDiff.Companion companion = TextDiff.Companion;
        TextDiff build = companion.build(getValue(), newValue);
        if (num != null) {
            build = new TextDiff(g.d(num.intValue() - build.getAdded(), 0), build.getAdded(), build.getRemoved());
        }
        String rawValue = getRawValue();
        int replaceBodyTail = replaceBodyTail(build, newValue);
        String rawValue2 = getRawValue();
        String newMaskPatternFor = newMaskPatternFor(rawValue2);
        if (newMaskPatternFor == null) {
            calculateCursorPosition(build, replaceBodyTail);
            return;
        }
        updateMaskDataWith(newMaskPatternFor);
        BaseInputMask.replaceChars$default(this, rawValue2, 0, null, 4, null);
        TextDiff build2 = companion.build(rawValue, rawValue2);
        calculateCursorPositionBy(build2.getStart() + build2.getAdded());
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.onError.invoke(exception);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String newRawValue) {
        Intrinsics.checkNotNullParameter(newRawValue, "newRawValue");
        tryInvalidateMaskDataWith(newRawValue);
        super.overrideRawValue(newRawValue);
    }
}
