package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.chicken.road.cerman.fixs.data.EggLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: EggSalesScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EggSalesScreenKt$AddEggDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $count$delegate;
    final /* synthetic */ Function1<EggLog, Unit> $onSave;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    EggSalesScreenKt$AddEggDialog$1(Function1<? super EggLog, Unit> function1, MutableState<String> mutableState, MutableState<Long> mutableState2) {
        this.$onSave = function1;
        this.$count$delegate = mutableState;
        this.$pickedId$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String AddEggDialog$lambda$22;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-121040703, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEggDialog.<anonymous> (EggSalesScreen.kt:175)");
            }
            AddEggDialog$lambda$22 = EggSalesScreenKt.AddEggDialog$lambda$22(this.$count$delegate);
            boolean z = StringsKt.toIntOrNull(AddEggDialog$lambda$22) != null;
            composer.startReplaceGroup(-401349641);
            boolean changed = composer.changed(this.$onSave);
            final Function1<EggLog, Unit> function1 = this.$onSave;
            final MutableState<Long> mutableState = this.$pickedId$delegate;
            final MutableState<String> mutableState2 = this.$count$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$AddEggDialog$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = EggSalesScreenKt$AddEggDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState, mutableState2);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6704getLambda6$app_release(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, MutableState mutableState, MutableState mutableState2) {
        Long AddEggDialog$lambda$25;
        String AddEggDialog$lambda$22;
        AddEggDialog$lambda$25 = EggSalesScreenKt.AddEggDialog$lambda$25(mutableState);
        AddEggDialog$lambda$22 = EggSalesScreenKt.AddEggDialog$lambda$22(mutableState2);
        function1.invoke(new EggLog(0L, AddEggDialog$lambda$25, 0L, Integer.parseInt(AddEggDialog$lambda$22), 5, null));
        return Unit.INSTANCE;
    }
}
