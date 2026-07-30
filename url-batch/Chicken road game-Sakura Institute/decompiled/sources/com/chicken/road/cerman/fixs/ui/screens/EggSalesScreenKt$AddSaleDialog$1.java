package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.chicken.road.cerman.fixs.data.Sale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: EggSalesScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EggSalesScreenKt$AddSaleDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $buyer$delegate;
    final /* synthetic */ Function1<Sale, Unit> $onSave;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;
    final /* synthetic */ MutableState<String> $price$delegate;
    final /* synthetic */ MutableState<String> $qty$delegate;
    final /* synthetic */ MutableState<String> $saleType$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    EggSalesScreenKt$AddSaleDialog$1(Function1<? super Sale, Unit> function1, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Long> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5) {
        this.$onSave = function1;
        this.$qty$delegate = mutableState;
        this.$price$delegate = mutableState2;
        this.$pickedId$delegate = mutableState3;
        this.$saleType$delegate = mutableState4;
        this.$buyer$delegate = mutableState5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        String AddSaleDialog$lambda$32;
        boolean z;
        boolean changed;
        Object rememberedValue;
        String AddSaleDialog$lambda$35;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1949797623, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddSaleDialog.<anonymous> (EggSalesScreen.kt:213)");
            }
            AddSaleDialog$lambda$32 = EggSalesScreenKt.AddSaleDialog$lambda$32(this.$qty$delegate);
            if (StringsKt.toIntOrNull(AddSaleDialog$lambda$32) != null) {
                AddSaleDialog$lambda$35 = EggSalesScreenKt.AddSaleDialog$lambda$35(this.$price$delegate);
                if (StringsKt.toDoubleOrNull(AddSaleDialog$lambda$35) != null) {
                    z = true;
                    boolean z2 = z;
                    composer.startReplaceGroup(911538573);
                    changed = composer.changed(this.$onSave);
                    final Function1<Sale, Unit> function1 = this.$onSave;
                    final MutableState<Long> mutableState = this.$pickedId$delegate;
                    final MutableState<String> mutableState2 = this.$saleType$delegate;
                    final MutableState<String> mutableState3 = this.$qty$delegate;
                    final MutableState<String> mutableState4 = this.$price$delegate;
                    final MutableState<String> mutableState5 = this.$buyer$delegate;
                    rememberedValue = composer.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$AddSaleDialog$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$1$lambda$0;
                                invoke$lambda$1$lambda$0 = EggSalesScreenKt$AddSaleDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState, mutableState2, mutableState3, mutableState4, mutableState5);
                                return invoke$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.TextButton((Function0) rememberedValue, null, z2, null, null, null, null, null, null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6694getLambda10$app_release(), composer, 805306368, 506);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            z = false;
            boolean z22 = z;
            composer.startReplaceGroup(911538573);
            changed = composer.changed(this.$onSave);
            final Function1 function12 = this.$onSave;
            final MutableState mutableState6 = this.$pickedId$delegate;
            final MutableState mutableState22 = this.$saleType$delegate;
            final MutableState mutableState32 = this.$qty$delegate;
            final MutableState mutableState42 = this.$price$delegate;
            final MutableState mutableState52 = this.$buyer$delegate;
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$AddSaleDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = EggSalesScreenKt$AddSaleDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState6, mutableState22, mutableState32, mutableState42, mutableState52);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue, null, z22, null, null, null, null, null, null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6694getLambda10$app_release(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        Long AddSaleDialog$lambda$41;
        String AddSaleDialog$lambda$29;
        String AddSaleDialog$lambda$32;
        String AddSaleDialog$lambda$35;
        String AddSaleDialog$lambda$38;
        AddSaleDialog$lambda$41 = EggSalesScreenKt.AddSaleDialog$lambda$41(mutableState);
        AddSaleDialog$lambda$29 = EggSalesScreenKt.AddSaleDialog$lambda$29(mutableState2);
        AddSaleDialog$lambda$32 = EggSalesScreenKt.AddSaleDialog$lambda$32(mutableState3);
        int parseInt = Integer.parseInt(AddSaleDialog$lambda$32);
        AddSaleDialog$lambda$35 = EggSalesScreenKt.AddSaleDialog$lambda$35(mutableState4);
        double parseDouble = Double.parseDouble(AddSaleDialog$lambda$35);
        AddSaleDialog$lambda$38 = EggSalesScreenKt.AddSaleDialog$lambda$38(mutableState5);
        function1.invoke(new Sale(0L, AddSaleDialog$lambda$41, 0L, AddSaleDialog$lambda$29, parseInt, parseDouble, StringsKt.trim((CharSequence) AddSaleDialog$lambda$38).toString(), 5, null));
        return Unit.INSTANCE;
    }
}
