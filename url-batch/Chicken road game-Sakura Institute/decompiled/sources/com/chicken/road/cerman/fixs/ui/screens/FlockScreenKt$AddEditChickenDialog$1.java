package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.ChickenStatus;
import com.chicken.road.cerman.fixs.data.ChickenType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: FlockScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FlockScreenKt$AddEditChickenDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $breed$delegate;
    final /* synthetic */ MutableState<String> $cost$delegate;
    final /* synthetic */ Chicken $initial;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ MutableState<String> $notes$delegate;
    final /* synthetic */ Function1<Chicken, Unit> $onSave;
    final /* synthetic */ MutableState<ChickenStatus> $status$delegate;
    final /* synthetic */ MutableState<ChickenType> $type$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    FlockScreenKt$AddEditChickenDialog$1(Function1<? super Chicken, Unit> function1, Chicken chicken, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<ChickenType> mutableState3, MutableState<ChickenStatus> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6) {
        this.$onSave = function1;
        this.$initial = chicken;
        this.$name$delegate = mutableState;
        this.$breed$delegate = mutableState2;
        this.$type$delegate = mutableState3;
        this.$status$delegate = mutableState4;
        this.$cost$delegate = mutableState5;
        this.$notes$delegate = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        String AddEditChickenDialog$lambda$14;
        boolean z;
        boolean changed;
        Object rememberedValue;
        String AddEditChickenDialog$lambda$17;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1111823124, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddEditChickenDialog.<anonymous> (FlockScreen.kt:204)");
            }
            AddEditChickenDialog$lambda$14 = FlockScreenKt.AddEditChickenDialog$lambda$14(this.$name$delegate);
            if (!StringsKt.isBlank(AddEditChickenDialog$lambda$14)) {
                AddEditChickenDialog$lambda$17 = FlockScreenKt.AddEditChickenDialog$lambda$17(this.$breed$delegate);
                if (!StringsKt.isBlank(AddEditChickenDialog$lambda$17)) {
                    z = true;
                    composer.startReplaceGroup(-195637500);
                    changed = composer.changed(this.$onSave) | composer.changed(this.$initial);
                    final Function1<Chicken, Unit> function1 = this.$onSave;
                    final Chicken chicken = this.$initial;
                    final MutableState<String> mutableState = this.$name$delegate;
                    final MutableState<String> mutableState2 = this.$breed$delegate;
                    final MutableState<ChickenType> mutableState3 = this.$type$delegate;
                    final MutableState<ChickenStatus> mutableState4 = this.$status$delegate;
                    final MutableState<String> mutableState5 = this.$cost$delegate;
                    final MutableState<String> mutableState6 = this.$notes$delegate;
                    rememberedValue = composer.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$1$lambda$0;
                                invoke$lambda$1$lambda$0 = FlockScreenKt$AddEditChickenDialog$1.invoke$lambda$1$lambda$0(Function1.this, chicken, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6);
                                return invoke$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.TextButton((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableSingletons$FlockScreenKt.INSTANCE.m6719getLambda4$app_release(), composer, 805306368, 506);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            z = false;
            composer.startReplaceGroup(-195637500);
            changed = composer.changed(this.$onSave) | composer.changed(this.$initial);
            final Function1 function12 = this.$onSave;
            final Chicken chicken2 = this.$initial;
            final MutableState mutableState7 = this.$name$delegate;
            final MutableState mutableState22 = this.$breed$delegate;
            final MutableState mutableState32 = this.$type$delegate;
            final MutableState mutableState42 = this.$status$delegate;
            final MutableState mutableState52 = this.$cost$delegate;
            final MutableState mutableState62 = this.$notes$delegate;
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$AddEditChickenDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FlockScreenKt$AddEditChickenDialog$1.invoke$lambda$1$lambda$0(Function1.this, chicken2, mutableState7, mutableState22, mutableState32, mutableState42, mutableState52, mutableState62);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableSingletons$FlockScreenKt.INSTANCE.m6719getLambda4$app_release(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Chicken chicken, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        String AddEditChickenDialog$lambda$14;
        String AddEditChickenDialog$lambda$17;
        ChickenType AddEditChickenDialog$lambda$20;
        ChickenStatus AddEditChickenDialog$lambda$23;
        String AddEditChickenDialog$lambda$26;
        String AddEditChickenDialog$lambda$29;
        long id = chicken != null ? chicken.getId() : 0L;
        AddEditChickenDialog$lambda$14 = FlockScreenKt.AddEditChickenDialog$lambda$14(mutableState);
        String obj = StringsKt.trim((CharSequence) AddEditChickenDialog$lambda$14).toString();
        AddEditChickenDialog$lambda$17 = FlockScreenKt.AddEditChickenDialog$lambda$17(mutableState2);
        String obj2 = StringsKt.trim((CharSequence) AddEditChickenDialog$lambda$17).toString();
        AddEditChickenDialog$lambda$20 = FlockScreenKt.AddEditChickenDialog$lambda$20(mutableState3);
        AddEditChickenDialog$lambda$23 = FlockScreenKt.AddEditChickenDialog$lambda$23(mutableState4);
        long acquiredDate = chicken != null ? chicken.getAcquiredDate() : System.currentTimeMillis();
        AddEditChickenDialog$lambda$26 = FlockScreenKt.AddEditChickenDialog$lambda$26(mutableState5);
        Double doubleOrNull = StringsKt.toDoubleOrNull(AddEditChickenDialog$lambda$26);
        double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        AddEditChickenDialog$lambda$29 = FlockScreenKt.AddEditChickenDialog$lambda$29(mutableState6);
        function1.invoke(new Chicken(id, obj, obj2, AddEditChickenDialog$lambda$20, AddEditChickenDialog$lambda$23, acquiredDate, doubleValue, StringsKt.trim((CharSequence) AddEditChickenDialog$lambda$29).toString()));
        return Unit.INSTANCE;
    }
}
