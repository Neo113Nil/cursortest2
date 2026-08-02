package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.marketing.components.CardUpsellKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTileKt$$ExternalSyntheticLambda24 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ ComposableLambdaImpl f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CardAppletTileKt$$ExternalSyntheticLambda24(Modifier modifier, Function0 function0, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = function0;
        this.f$2 = composableLambdaImpl;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        ComposableLambdaImpl composableLambdaImpl = this.f$2;
        Function0 function0 = this.f$1;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CardAppletTileKt.CardAppletTileRow(Updater.updateChangedFlags(i2 | 1), composer, composableLambdaImpl, modifier, function0);
                break;
            default:
                CardUpsellKt.CardUpsellContainer(Updater.updateChangedFlags(i2 | 1), composer, composableLambdaImpl, modifier, function0);
                break;
        }
        return Unit.INSTANCE;
    }
}
