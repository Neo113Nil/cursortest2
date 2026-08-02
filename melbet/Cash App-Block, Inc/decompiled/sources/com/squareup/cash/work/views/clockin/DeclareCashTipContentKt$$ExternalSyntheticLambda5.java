package com.squareup.cash.work.views.clockin;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.scrubbing.MoneyScrubber;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class DeclareCashTipContentKt$$ExternalSyntheticLambda5 implements InputTransformation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DeclareCashTipContentKt$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                String obj2 = textFieldBuffer.originalValue.text.toString();
                PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
                String partialGapBuffer2 = partialGapBuffer.toString();
                CharSequence scrub = ((MoneyScrubber) obj).scrub(obj2, partialGapBuffer2);
                if (!scrub.equals(partialGapBuffer2)) {
                    textFieldBuffer.replace(0, partialGapBuffer.length(), scrub);
                    break;
                }
                break;
            case 1:
                String obj3 = textFieldBuffer.originalValue.text.toString();
                PartialGapBuffer partialGapBuffer3 = textFieldBuffer.buffer;
                String partialGapBuffer4 = partialGapBuffer3.toString();
                CharSequence scrub2 = ((MoneyScrubber) obj).scrub(obj3, partialGapBuffer4);
                if (!scrub2.equals(partialGapBuffer4)) {
                    textFieldBuffer.replace(0, partialGapBuffer3.length(), scrub2);
                    break;
                }
                break;
            default:
                PartialGapBuffer partialGapBuffer5 = textFieldBuffer.buffer;
                CharSequence partialGapBuffer6 = partialGapBuffer5.toString();
                Iterator it = ((ArcadeFormTextInputGroupView.InputFieldModel) obj).inputTransformations.iterator();
                CharSequence charSequence = partialGapBuffer6;
                while (it.hasNext()) {
                    charSequence = (String) ((Function1) it.next()).invoke(charSequence);
                }
                if (!Intrinsics.areEqual(charSequence, partialGapBuffer6)) {
                    textFieldBuffer.replace(0, partialGapBuffer5.length(), charSequence);
                    break;
                }
                break;
        }
    }
}
