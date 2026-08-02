package com.stripe.android.financialconnections.features.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class ModalBottomSheetContentKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TextResource f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ModalBottomSheetContentKt$$ExternalSyntheticLambda2(Function1 function1, TextResource textResource, Function0 function0, String str) {
        this.f$0 = function1;
        this.f$1 = textResource;
        this.f$2 = function0;
        this.f$3 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                ListItemKt.ModalBottomSheetFooter(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ListItemKt.ModalBottomSheetFooter(this.f$0, this.f$1, this.f$2, this.f$3, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ModalBottomSheetContentKt$$ExternalSyntheticLambda2(Function1 function1, TextResource textResource, Function0 function0, String str, int i) {
        this.f$0 = function1;
        this.f$1 = textResource;
        this.f$2 = function0;
        this.f$3 = str;
    }
}
