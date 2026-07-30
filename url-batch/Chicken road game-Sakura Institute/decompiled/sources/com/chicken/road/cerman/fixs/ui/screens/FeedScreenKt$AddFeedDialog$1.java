package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.chicken.road.cerman.fixs.data.FeedEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: FeedScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FeedScreenKt$AddFeedDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $feedType$delegate;
    final /* synthetic */ Function1<FeedEntry, Unit> $onSave;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;
    final /* synthetic */ MutableState<String> $price$delegate;
    final /* synthetic */ MutableState<String> $qty$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    FeedScreenKt$AddFeedDialog$1(Function1<? super FeedEntry, Unit> function1, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Long> mutableState3, MutableState<String> mutableState4) {
        this.$onSave = function1;
        this.$qty$delegate = mutableState;
        this.$price$delegate = mutableState2;
        this.$pickedId$delegate = mutableState3;
        this.$feedType$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        String AddFeedDialog$lambda$17;
        boolean z;
        boolean changed;
        Object rememberedValue;
        String AddFeedDialog$lambda$20;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(71100699, i, -1, "com.chicken.road.cerman.fixs.ui.screens.AddFeedDialog.<anonymous> (FeedScreen.kt:155)");
            }
            AddFeedDialog$lambda$17 = FeedScreenKt.AddFeedDialog$lambda$17(this.$qty$delegate);
            if (StringsKt.toDoubleOrNull(AddFeedDialog$lambda$17) != null) {
                AddFeedDialog$lambda$20 = FeedScreenKt.AddFeedDialog$lambda$20(this.$price$delegate);
                if (StringsKt.toDoubleOrNull(AddFeedDialog$lambda$20) != null) {
                    z = true;
                    boolean z2 = z;
                    composer.startReplaceGroup(-658233391);
                    changed = composer.changed(this.$onSave);
                    final Function1<FeedEntry, Unit> function1 = this.$onSave;
                    final MutableState<Long> mutableState = this.$pickedId$delegate;
                    final MutableState<String> mutableState2 = this.$feedType$delegate;
                    final MutableState<String> mutableState3 = this.$qty$delegate;
                    final MutableState<String> mutableState4 = this.$price$delegate;
                    rememberedValue = composer.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$1$lambda$0;
                                invoke$lambda$1$lambda$0 = FeedScreenKt$AddFeedDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState, mutableState2, mutableState3, mutableState4);
                                return invoke$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.TextButton((Function0) rememberedValue, null, z2, null, null, null, null, null, null, ComposableSingletons$FeedScreenKt.INSTANCE.m6711getLambda4$app_release(), composer, 805306368, 506);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            z = false;
            boolean z22 = z;
            composer.startReplaceGroup(-658233391);
            changed = composer.changed(this.$onSave);
            final Function1 function12 = this.$onSave;
            final MutableState mutableState5 = this.$pickedId$delegate;
            final MutableState mutableState22 = this.$feedType$delegate;
            final MutableState mutableState32 = this.$qty$delegate;
            final MutableState mutableState42 = this.$price$delegate;
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = FeedScreenKt$AddFeedDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState5, mutableState22, mutableState32, mutableState42);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue, null, z22, null, null, null, null, null, null, ComposableSingletons$FeedScreenKt.INSTANCE.m6711getLambda4$app_release(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        Long AddFeedDialog$lambda$23;
        String AddFeedDialog$lambda$14;
        String AddFeedDialog$lambda$17;
        String AddFeedDialog$lambda$20;
        AddFeedDialog$lambda$23 = FeedScreenKt.AddFeedDialog$lambda$23(mutableState);
        AddFeedDialog$lambda$14 = FeedScreenKt.AddFeedDialog$lambda$14(mutableState2);
        AddFeedDialog$lambda$17 = FeedScreenKt.AddFeedDialog$lambda$17(mutableState3);
        double parseDouble = Double.parseDouble(AddFeedDialog$lambda$17);
        AddFeedDialog$lambda$20 = FeedScreenKt.AddFeedDialog$lambda$20(mutableState4);
        function1.invoke(new FeedEntry(0L, AddFeedDialog$lambda$23, 0L, AddFeedDialog$lambda$14, parseDouble, Double.parseDouble(AddFeedDialog$lambda$20), 5, null));
        return Unit.INSTANCE;
    }
}
