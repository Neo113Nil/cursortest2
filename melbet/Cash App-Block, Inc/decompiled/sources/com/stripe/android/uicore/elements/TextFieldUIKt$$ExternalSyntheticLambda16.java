package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class TextFieldUIKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ boolean f$4;

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda16(TextFieldIcon$Trailing textFieldIcon$Trailing, boolean z, Function1 function1, Function1 function12, boolean z2) {
        this.f$1 = z;
        this.f$2 = function1;
        this.f$3 = function12;
        this.f$4 = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextFieldUIKt.Composable(null, this.f$1, this.f$2, this.f$3, this.f$4, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                TextFieldUIKt.Composable(null, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda16(TextFieldIcon$Trailing textFieldIcon$Trailing, boolean z, Function1 function1, Function1 function12, boolean z2, int i) {
        this.f$1 = z;
        this.f$2 = function1;
        this.f$3 = function12;
        this.f$4 = z2;
    }
}
