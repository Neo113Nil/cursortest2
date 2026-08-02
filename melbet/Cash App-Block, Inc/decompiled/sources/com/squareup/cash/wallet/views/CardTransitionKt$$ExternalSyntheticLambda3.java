package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda3(String str, int i) {
        this.$r8$classId = 2;
        this.f$0 = str;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        String str = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                CardTransitionKt.CardTransition(str, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, this.f$1, 0, 0, 0, 0, 4030, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                TextCardKt.FallbackGenieCard(str, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ActionBodyViewKt.LoadingContent(str, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ActionBodyViewKt.MissingContent(str, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                CardTransitionKt.CardTransition(str, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda3(String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = i;
    }
}
