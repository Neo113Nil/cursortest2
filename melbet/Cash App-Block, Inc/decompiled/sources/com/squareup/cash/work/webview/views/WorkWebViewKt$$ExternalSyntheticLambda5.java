package com.squareup.cash.work.webview.views;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda16;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkWebViewKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ WorkWebViewKt$$ExternalSyntheticLambda5(boolean z, String str, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = str;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl composableLambdaImpl;
        String str;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    boolean z = this.f$0;
                    String stringResource = Room.stringResource(gapComposer, z ? R.string.work_webview_error_title_retryable : R.string.work_webview_error_title_not_retryable);
                    Function1 function1 = this.f$2;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2122259181, new MoneyTabUIKt$$ExternalSyntheticLambda16(z, function1, 6), gapComposer);
                    if (z) {
                        gapComposer.startReplaceGroup(1588442108);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-2012680721, new WorkWebViewKt$$ExternalSyntheticLambda14(i, function1), gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1588655481);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    }
                    ModalKt.Modal((Modifier) null, stringResource, this.f$1, rememberComposableLambda, composableLambdaImpl, (Function3) null, gapComposer, 3072, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                boolean z2 = this.f$0;
                if (z2) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    str = re$$ExternalSyntheticOutline0.m(gapComposer2, -1945567129, R.string.moneybot_system_preamble_override_indicator, gapComposer2, false);
                } else {
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    gapComposer3.startReplaceGroup(-1945461171);
                    gapComposer3.end(false);
                    str = this.f$1;
                    if (str == null) {
                        str = "";
                    }
                }
                CardViewApi21Impl.Disclosure(fillMaxWidth, str, z2, this.f$2, composer2, 6);
                break;
        }
        return Unit.INSTANCE;
    }
}
