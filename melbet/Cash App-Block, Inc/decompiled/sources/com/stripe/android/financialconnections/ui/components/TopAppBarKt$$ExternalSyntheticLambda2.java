package com.stripe.android.financialconnections.ui.components;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes8.dex */
public final /* synthetic */ class TopAppBarKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ CoroutineScope f$0;
    public final /* synthetic */ RealWebSocket$connect$1 f$1;
    public final /* synthetic */ OnBackPressedDispatcher f$2;

    public /* synthetic */ TopAppBarKt$$ExternalSyntheticLambda2(CoroutineScope coroutineScope, RealWebSocket$connect$1 realWebSocket$connect$1, OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f$0 = coroutineScope;
        this.f$1 = realWebSocket$connect$1;
        this.f$2 = onBackPressedDispatcher;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        OnBackPressedDispatcher onBackPressedDispatcher = this.f$2;
        RealWebSocket$connect$1 realWebSocket$connect$1 = this.f$1;
        CoroutineScope coroutineScope = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextKt.BackButton(coroutineScope, realWebSocket$connect$1, onBackPressedDispatcher, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                TextKt.BackButton(coroutineScope, realWebSocket$connect$1, onBackPressedDispatcher, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TopAppBarKt$$ExternalSyntheticLambda2(CoroutineScope coroutineScope, RealWebSocket$connect$1 realWebSocket$connect$1, OnBackPressedDispatcher onBackPressedDispatcher, int i) {
        this.f$0 = coroutineScope;
        this.f$1 = realWebSocket$connect$1;
        this.f$2 = onBackPressedDispatcher;
    }
}
