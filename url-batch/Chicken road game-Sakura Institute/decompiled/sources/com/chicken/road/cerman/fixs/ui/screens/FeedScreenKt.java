package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavController;
import com.chicken.road.cerman.fixs.BroilerApp;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.FeedEntry;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FeedScreen.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a=\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002"}, d2 = {"FeedScreen", "", "nav", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "AddFeedDialog", "chickens", "", "Lcom/chicken/road/cerman/fixs/data/Chicken;", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "Lcom/chicken/road/cerman/fixs/data/FeedEntry;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "items", "addOpen", "", "feedType", "", "qty", "price", "pickedId", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeedScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddFeedDialog$lambda$25(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddFeedDialog(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedScreen$lambda$12(NavController navController, int i, Composer composer, int i2) {
        FeedScreen(navController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FeedScreen(final NavController nav, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(nav, "nav");
        Composer startRestartGroup = composer.startRestartGroup(-532872964);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nav) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532872964, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.FeedScreen (FeedScreen.kt:52)");
            }
            startRestartGroup.startReplaceGroup(1503467810);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = BroilerApp.INSTANCE.getINSTANCE().getRepository();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State collectAsState = SnapshotStateKt.collectAsState(repository.getAllFeed(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState2 = SnapshotStateKt.collectAsState(repository.getChickens(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(1503474297);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1503478765);
            boolean changedInstance = startRestartGroup.changedInstance(nav);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FeedScreen$lambda$7$lambda$6;
                        FeedScreen$lambda$7$lambda$6 = FeedScreenKt.FeedScreen$lambda$7$lambda$6(NavController.this);
                        return FeedScreen$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            CommonKt.FarmScaffold("Feed log", (Function0) rememberedValue4, null, ComposableLambdaKt.rememberComposableLambda(-582726816, true, new FeedScreenKt$FeedScreen$2(mutableState), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(179869724, true, new FeedScreenKt$FeedScreen$3(collectAsState, collectAsState2), startRestartGroup, 54), startRestartGroup, 27654, 4);
            if (FeedScreen$lambda$4(mutableState)) {
                List<Chicken> FeedScreen$lambda$2 = FeedScreen$lambda$2(collectAsState2);
                startRestartGroup.startReplaceGroup(1503557322);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit FeedScreen$lambda$9$lambda$8;
                            FeedScreen$lambda$9$lambda$8 = FeedScreenKt.FeedScreen$lambda$9$lambda$8(MutableState.this);
                            return FeedScreen$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                Function0 function0 = (Function0) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1503558748);
                boolean changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit FeedScreen$lambda$11$lambda$10;
                            FeedScreen$lambda$11$lambda$10 = FeedScreenKt.FeedScreen$lambda$11$lambda$10(CoroutineScope.this, repository, mutableState, (FeedEntry) obj);
                            return FeedScreen$lambda$11$lambda$10;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceGroup();
                AddFeedDialog(FeedScreen$lambda$2, function0, (Function1) rememberedValue6, startRestartGroup, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FeedScreen$lambda$12;
                    FeedScreen$lambda$12 = FeedScreenKt.FeedScreen$lambda$12(NavController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FeedScreen$lambda$12;
                }
            });
        }
    }

    private static final boolean FeedScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FeedScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedScreen$lambda$7$lambda$6(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedScreen$lambda$9$lambda$8(MutableState mutableState) {
        FeedScreen$lambda$5(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FeedScreen$lambda$11$lambda$10(CoroutineScope coroutineScope, Repository repository, MutableState mutableState, FeedEntry f) {
        Intrinsics.checkNotNullParameter(f, "f");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FeedScreenKt$FeedScreen$5$1$1(repository, f, null), 3, null);
        FeedScreen$lambda$5(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final void AddFeedDialog(final List<Chicken> list, final Function0<Unit> function0, Function1<? super FeedEntry, Unit> function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        final int i3;
        final Function1<? super FeedEntry, Unit> function12;
        final Function0<Unit> function02;
        Composer startRestartGroup = composer.startRestartGroup(-312722733);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312722733, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.AddFeedDialog (FeedScreen.kt:126)");
            }
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"Starter", "Grower", "Finisher", "Layer mash", "Corn", "Greens"});
            startRestartGroup.startReplaceGroup(362011137);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(listOf.get(0), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(362012889);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(362014457);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(362016130);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            i3 = i;
            function12 = function1;
            function02 = function0;
            AndroidAlertDialog_androidKt.m1440AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(71100699, true, new FeedScreenKt$AddFeedDialog$1(function1, mutableState2, mutableState3, mutableState4, mutableState), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-876951267, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$AddFeedDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-876951267, i5, -1, "com.chicken.road.cerman.fixs.ui.screens.AddFeedDialog.<anonymous> (FeedScreen.kt:169)");
                    }
                    ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$FeedScreenKt.INSTANCE.m6712getLambda5$app_release(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableSingletons$FeedScreenKt.INSTANCE.m6713getLambda6$app_release(), ComposableLambdaKt.rememberComposableLambda(1995938080, true, new FeedScreenKt$AddFeedDialog$3(list, mutableState4, listOf, mutableState, mutableState2, mutableState3), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i4 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            function02 = function0;
            composer2 = startRestartGroup;
            i3 = i;
            function12 = function1;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.FeedScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AddFeedDialog$lambda$25;
                    AddFeedDialog$lambda$25 = FeedScreenKt.AddFeedDialog$lambda$25(list, function02, function12, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return AddFeedDialog$lambda$25;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddFeedDialog$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddFeedDialog$lambda$17(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddFeedDialog$lambda$20(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AddFeedDialog$lambda$23(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<FeedEntry> FeedScreen$lambda$1(State<? extends List<FeedEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Chicken> FeedScreen$lambda$2(State<? extends List<Chicken>> state) {
        return state.getValue();
    }
}
