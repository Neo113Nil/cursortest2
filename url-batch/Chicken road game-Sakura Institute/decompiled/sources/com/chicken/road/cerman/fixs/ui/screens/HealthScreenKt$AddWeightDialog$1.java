package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.chicken.road.cerman.fixs.data.WeightEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HealthScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HealthScreenKt$AddWeightDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $grams$delegate;
    final /* synthetic */ Function1<WeightEntry, Unit> $onSave;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    HealthScreenKt$AddWeightDialog$1(Function1<? super WeightEntry, Unit> function1, MutableState<Long> mutableState, MutableState<String> mutableState2) {
        this.$onSave = function1;
        this.$pickedId$delegate = mutableState;
        this.$grams$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        Long AddWeightDialog$lambda$43;
        boolean z;
        boolean changed;
        Object rememberedValue;
        String AddWeightDialog$lambda$40;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1577627453, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddWeightDialog.<anonymous> (HealthScreen.kt:281)");
            }
            AddWeightDialog$lambda$43 = HealthScreenKt.AddWeightDialog$lambda$43(this.$pickedId$delegate);
            if (AddWeightDialog$lambda$43 != null) {
                AddWeightDialog$lambda$40 = HealthScreenKt.AddWeightDialog$lambda$40(this.$grams$delegate);
                if (StringsKt.toIntOrNull(AddWeightDialog$lambda$40) != null) {
                    z = true;
                    boolean z2 = z;
                    composer.startReplaceGroup(108496543);
                    changed = composer.changed(this.$onSave);
                    final Function1<WeightEntry, Unit> function1 = this.$onSave;
                    final MutableState<Long> mutableState = this.$pickedId$delegate;
                    final MutableState<String> mutableState2 = this.$grams$delegate;
                    rememberedValue = composer.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddWeightDialog$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$1$lambda$0;
                                invoke$lambda$1$lambda$0 = HealthScreenKt$AddWeightDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState, mutableState2);
                                return invoke$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.TextButton((Function0) rememberedValue, null, z2, null, null, null, null, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6729getLambda13$app_release(), composer, 805306368, 506);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            z = false;
            boolean z22 = z;
            composer.startReplaceGroup(108496543);
            changed = composer.changed(this.$onSave);
            final Function1 function12 = this.$onSave;
            final MutableState mutableState3 = this.$pickedId$delegate;
            final MutableState mutableState22 = this.$grams$delegate;
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.HealthScreenKt$AddWeightDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = HealthScreenKt$AddWeightDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState3, mutableState22);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue, null, z22, null, null, null, null, null, null, ComposableSingletons$HealthScreenKt.INSTANCE.m6729getLambda13$app_release(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, MutableState mutableState, MutableState mutableState2) {
        Long AddWeightDialog$lambda$43;
        String AddWeightDialog$lambda$40;
        AddWeightDialog$lambda$43 = HealthScreenKt.AddWeightDialog$lambda$43(mutableState);
        Intrinsics.checkNotNull(AddWeightDialog$lambda$43);
        long longValue = AddWeightDialog$lambda$43.longValue();
        AddWeightDialog$lambda$40 = HealthScreenKt.AddWeightDialog$lambda$40(mutableState2);
        function1.invoke(new WeightEntry(0L, longValue, 0L, Integer.parseInt(AddWeightDialog$lambda$40), 5, null));
        return Unit.INSTANCE;
    }
}
