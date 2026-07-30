package com.chicken.road.kedbags.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import com.chicken.road.kedbags.ui.Screen;
import com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt;
import com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt;
import com.chicken.road.kedbags.ui.home.RoostGateScreenKt;
import com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt;
import com.chicken.road.kedbags.ui.splash.SplashController;
import com.chicken.road.kedbags.ui.splash.SplashScreenKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppRoot.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"AppRoot", "", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "splashController", "Lcom/chicken/road/kedbags/ui/splash/SplashController;", "(Lcom/chicken/road/kedbags/data/repository/TreasureRepository;Lcom/chicken/road/kedbags/ui/splash/SplashController;Landroidx/compose/runtime/Composer;I)V", "app", "screen", "Lcom/chicken/road/kedbags/ui/Screen;", "lastNav", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppRootKt {
    static final Unit AppRoot$lambda$23(TreasureRepository treasureRepository, SplashController splashController, int i, Composer composer, int i2) {
        AppRoot(treasureRepository, splashController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AppRoot(final TreasureRepository repository, final SplashController splashController, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(splashController, "splashController");
        Composer startRestartGroup = composer.startRestartGroup(829369509);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppRoot)30@1273L50,31@1343L35:AppRoot.kt#z4bp2j");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(repository) : startRestartGroup.changedInstance(repository) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(splashController) : startRestartGroup.changedInstance(splashController) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(829369509, i2, -1, "com.chicken.road.kedbags.ui.AppRoot (AppRoot.kt:29)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1839815017, "CC(remember):AppRoot.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Screen.Splash.INSTANCE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1839812792, "CC(remember):AppRoot.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotLongStateKt.mutableLongStateOf(0L);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableLongState mutableLongState = (MutableLongState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Screen AppRoot$lambda$1 = AppRoot$lambda$1(mutableState);
            if (Intrinsics.areEqual(AppRoot$lambda$1, Screen.Splash.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-1839803722);
                ComposerKt.sourceInformation(startRestartGroup, "42@1703L24,40@1624L113");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1839801283, "CC(remember):AppRoot.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppRootKt.AppRoot$lambda$7$lambda$6(MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SplashScreenKt.SplashScreen(splashController, (Function0) rememberedValue3, startRestartGroup, ((i2 >> 3) & 14) | SplashController.$stable | 48);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1839798490);
                ComposerKt.sourceInformation(startRestartGroup, "44@1754L1185");
                Modifier safeDrawingPadding = WindowInsetsPadding_androidKt.safeDrawingPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, safeDrawingPadding);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -181845936, "C:AppRoot.kt#z4bp2j");
                if (Intrinsics.areEqual(AppRoot$lambda$1, Screen.Home.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1102513417);
                    ComposerKt.sourceInformation(startRestartGroup, "52@2026L30,53@2093L32,54@2156L25,50@1932L267");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1102516188, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppRootKt.AppRoot$lambda$22$lambda$9$lambda$8(MutableLongState.this, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function0 = (Function0) rememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1102518334, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function1() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AppRootKt.AppRoot$lambda$22$lambda$11$lambda$10(MutableLongState.this, mutableState, (String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function1 = (Function1) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1102520343, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function0() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppRootKt.AppRoot$lambda$22$lambda$13$lambda$12(MutableLongState.this, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    RoostGateScreenKt.RoostGateScreen(repository, function0, function1, (Function0) rememberedValue6, startRestartGroup, TreasureRepository.$stable | 3504 | (i2 & 14));
                    startRestartGroup.endReplaceGroup();
                } else if (AppRoot$lambda$1 instanceof Screen.Catalog) {
                    startRestartGroup.startReplaceGroup(1102523159);
                    ComposerKt.sourceInformation(startRestartGroup, "59@2379L25,60@2437L31,56@2237L249");
                    String tag = ((Screen.Catalog) AppRoot$lambda$1).getTag();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1102527479, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function0() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppRootKt.AppRoot$lambda$22$lambda$15$lambda$14(MutableLongState.this, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function02 = (Function0) rememberedValue7;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1102529341, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new Function1() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AppRootKt.AppRoot$lambda$22$lambda$17$lambda$16(MutableLongState.this, mutableState, ((Integer) obj).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ShellRunLedgerScreenKt.ShellRunLedgerScreen(repository, tag, function02, (Function1) rememberedValue8, startRestartGroup, TreasureRepository.$stable | 3456 | (i2 & 14));
                    startRestartGroup.endReplaceGroup();
                } else if (AppRoot$lambda$1 instanceof Screen.Detail) {
                    startRestartGroup.startReplaceGroup(1102532246);
                    ComposerKt.sourceInformation(startRestartGroup, "65@2659L30,62@2523L184");
                    int id = ((Screen.Detail) AppRoot$lambda$1).getId();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1102536444, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function0() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppRootKt.AppRoot$lambda$22$lambda$19$lambda$18(MutableLongState.this, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EggmarkDossierScreenKt.EggmarkDossierScreen(repository, id, (Function0) rememberedValue9, startRestartGroup, (i2 & 14) | TreasureRepository.$stable | 384);
                    startRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(AppRoot$lambda$1, Screen.Quiz.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1102539112);
                    ComposerKt.sourceInformation(startRestartGroup, "69@2834L25,67@2739L138");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1102542039, "CC(remember):AppRoot.kt#9igjgp");
                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new Function0() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppRootKt.AppRoot$lambda$22$lambda$21$lambda$20(MutableLongState.this, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    NestPairTrialScreenKt.NestPairTrialScreen(repository, (Function0) rememberedValue10, startRestartGroup, (i2 & 14) | TreasureRepository.$stable | 48);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!Intrinsics.areEqual(AppRoot$lambda$1, Screen.Splash.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(1102512659);
                        startRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1102544482);
                    startRestartGroup.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.AppRootKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppRootKt.AppRoot$lambda$23(TreasureRepository.this, splashController, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Screen AppRoot$lambda$1(MutableState<Screen> mutableState) {
        return mutableState.getValue();
    }

    private static final long AppRoot$lambda$4(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    private static final void AppRoot$navigate(MutableLongState mutableLongState, MutableState<Screen> mutableState, Screen screen) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - AppRoot$lambda$4(mutableLongState) > 350) {
            mutableLongState.setLongValue(currentTimeMillis);
            mutableState.setValue(screen);
        }
    }

    static final Unit AppRoot$lambda$7$lambda$6(MutableState mutableState) {
        mutableState.setValue(Screen.Home.INSTANCE);
        return Unit.INSTANCE;
    }

    static final Unit AppRoot$lambda$22$lambda$9$lambda$8(MutableLongState mutableLongState, MutableState mutableState) {
        AppRoot$navigate(mutableLongState, mutableState, new Screen.Catalog(null, 1, null));
        return Unit.INSTANCE;
    }

    static final Unit AppRoot$lambda$22$lambda$11$lambda$10(MutableLongState mutableLongState, MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AppRoot$navigate(mutableLongState, mutableState, new Screen.Catalog(it));
        return Unit.INSTANCE;
    }

    static final Unit AppRoot$lambda$22$lambda$13$lambda$12(MutableLongState mutableLongState, MutableState mutableState) {
        AppRoot$navigate(mutableLongState, mutableState, Screen.Quiz.INSTANCE);
        return Unit.INSTANCE;
    }

    static final Unit AppRoot$lambda$22$lambda$15$lambda$14(MutableLongState mutableLongState, MutableState mutableState) {
        AppRoot$navigate(mutableLongState, mutableState, Screen.Home.INSTANCE);
        return Unit.INSTANCE;
    }

    static final Unit AppRoot$lambda$22$lambda$17$lambda$16(MutableLongState mutableLongState, MutableState mutableState, int i) {
        AppRoot$navigate(mutableLongState, mutableState, new Screen.Detail(i));
        return Unit.INSTANCE;
    }

    static final Unit AppRoot$lambda$22$lambda$19$lambda$18(MutableLongState mutableLongState, MutableState mutableState) {
        AppRoot$navigate(mutableLongState, mutableState, new Screen.Catalog(null, 1, null));
        return Unit.INSTANCE;
    }

    static final Unit AppRoot$lambda$22$lambda$21$lambda$20(MutableLongState mutableLongState, MutableState mutableState) {
        AppRoot$navigate(mutableLongState, mutableState, Screen.Home.INSTANCE);
        return Unit.INSTANCE;
    }
}
