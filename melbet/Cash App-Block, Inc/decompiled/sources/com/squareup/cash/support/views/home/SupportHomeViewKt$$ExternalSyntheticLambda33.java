package com.squareup.cash.support.views.home;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class SupportHomeViewKt$$ExternalSyntheticLambda33 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ ComposableLambdaImpl f$2;

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda33(boolean z, Function1 function1, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = z;
        this.f$1 = function1;
        this.f$2 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$2;
        Function1 function1 = this.f$1;
        boolean z = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (z) {
                        gapComposer.startReplaceGroup(-1853391901);
                        SupportHomeViewKt.DisputeCell(function1, gapComposer, 0);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1853241985);
                        gapComposer.end(false);
                    }
                    composableLambdaImpl.invoke((Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                EarnerEnrollmentBlockerViewKt.AgreementRow(z, function1, composableLambdaImpl, composer, Updater.updateChangedFlags(385));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda33(boolean z, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = z;
        this.f$1 = function1;
        this.f$2 = composableLambdaImpl;
    }
}
