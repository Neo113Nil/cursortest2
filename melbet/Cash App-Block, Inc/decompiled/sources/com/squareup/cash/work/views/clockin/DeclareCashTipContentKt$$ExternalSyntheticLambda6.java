package com.squareup.cash.work.views.clockin;

import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.core.widget.EdgeEffectCompat;
import com.squareup.cash.scrubbing.CurrencyConfig;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class DeclareCashTipContentKt$$ExternalSyntheticLambda6 implements OutputTransformation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CurrencyConfig f$0;

    public /* synthetic */ DeclareCashTipContentKt$$ExternalSyntheticLambda6(CurrencyConfig currencyConfig, int i) {
        this.$r8$classId = i;
        this.f$0 = currencyConfig;
    }

    @Override // androidx.compose.foundation.text.input.OutputTransformation
    public final void transformOutput(TextFieldBuffer textFieldBuffer) {
        Character orNull;
        Character orNull2;
        int i = this.$r8$classId;
        int i2 = 0;
        CurrencyConfig currencyConfig = this.f$0;
        switch (i) {
            case 0:
                PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
                String moneyFormatMask = EdgeEffectCompat.moneyFormatMask(currencyConfig, partialGapBuffer.toString());
                int length = moneyFormatMask.length();
                while (i2 < length) {
                    char charAt = moneyFormatMask.charAt(i2);
                    if (i2 < partialGapBuffer.length() && charAt != 'X' && ((orNull = StringsKt___StringsKt.getOrNull(i2, partialGapBuffer)) == null || orNull.charValue() != charAt)) {
                        textFieldBuffer.replace(i2, i2, String.valueOf(charAt));
                    }
                    i2++;
                }
                break;
            default:
                PartialGapBuffer partialGapBuffer2 = textFieldBuffer.buffer;
                String moneyFormatMask2 = EdgeEffectCompat.moneyFormatMask(currencyConfig, partialGapBuffer2.toString());
                int length2 = moneyFormatMask2.length();
                while (i2 < length2) {
                    char charAt2 = moneyFormatMask2.charAt(i2);
                    if (i2 < partialGapBuffer2.length() && charAt2 != 'X' && ((orNull2 = StringsKt___StringsKt.getOrNull(i2, partialGapBuffer2)) == null || orNull2.charValue() != charAt2)) {
                        textFieldBuffer.replace(i2, i2, String.valueOf(charAt2));
                    }
                    i2++;
                }
                break;
        }
    }
}
