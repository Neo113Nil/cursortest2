package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.input.OffsetMapping;

/* loaded from: classes8.dex */
public final class PhoneNumberFormatter$UnknownRegion$visualTransformation$1$1 implements OffsetMapping {
    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int originalToTransformed(int i) {
        return i + 1;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int transformedToOriginal(int i) {
        return Math.max(i - 1, 0);
    }
}
