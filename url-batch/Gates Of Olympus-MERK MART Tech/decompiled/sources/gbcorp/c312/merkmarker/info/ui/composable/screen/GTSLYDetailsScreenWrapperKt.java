package gbcorp.c312.merkmarker.info.ui.composable.screen;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.google.android.gms.common.internal.ImagesContract;
import gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYDetailsScreenViewModel;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: GTSLYDetailsScreenWrapper.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"GTSLYDetailsScreenWrapper", "", ImagesContract.URL, "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/GTSLYDetailsScreenViewModel;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/GTSLYDetailsScreenViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release", "isConnected", "", "gtslyDetails", "Ljava/lang/reflect/Method;", "isPageLoaded"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYDetailsScreenWrapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GTSLYDetailsScreenWrapper$lambda$7(String str, Modifier modifier, GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel, int i, int i2, Composer composer, int i3) {
        GTSLYDetailsScreenWrapper(str, modifier, gTSLYDetailsScreenViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GTSLYDetailsScreenWrapper(final String url, Modifier modifier, GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel2;
        final Modifier modifier3;
        final GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        int i4;
        GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel4;
        State collectAsState;
        Object rememberedValue;
        boolean changedInstance;
        GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1 rememberedValue2;
        GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel5;
        int i5;
        Intrinsics.checkNotNullParameter(url, "url");
        Composer startRestartGroup = composer.startRestartGroup(849754777);
        ComposerKt.sourceInformation(startRestartGroup, "C(GTSLYDetailsScreenWrapper)N(url,modifier,viewModel)28@1085L7,30@1143L16,31@1212L16,33@1254L34,35@1315L53,35@1294L74,39@1374L407:GTSLYDetailsScreenWrapper.kt#m3and0");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    gTSLYDetailsScreenViewModel2 = gTSLYDetailsScreenViewModel;
                    if (startRestartGroup.changedInstance(gTSLYDetailsScreenViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    gTSLYDetailsScreenViewModel2 = gTSLYDetailsScreenViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                gTSLYDetailsScreenViewModel2 = gTSLYDetailsScreenViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "26@1034L15");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                } else {
                    companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1614864554, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)43@1516L7,46@1711L18:ViewModel.kt#m7on9k");
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(GTSLYDetailsScreenViewModel.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        GTSLYDetailsScreenViewModel gTSLYDetailsScreenViewModel6 = (GTSLYDetailsScreenViewModel) resolveViewModel;
                        i4 = i3 & (-897);
                        modifier3 = companion;
                        gTSLYDetailsScreenViewModel4 = gTSLYDetailsScreenViewModel6;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(849754777, i4, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYDetailsScreenWrapper (GTSLYDetailsScreenWrapper.kt:27)");
                        }
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Context context = (Context) consume;
                        State collectAsState2 = SnapshotStateKt.collectAsState(gTSLYDetailsScreenViewModel4.getConnectionState(), null, startRestartGroup, 0, 1);
                        collectAsState = SnapshotStateKt.collectAsState(gTSLYDetailsScreenViewModel4.getGtslyDetailsState(), null, startRestartGroup, 0, 1);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 570565627, "CC(remember):GTSLYDetailsScreenWrapper.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Unit unit = Unit.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 570567598, "CC(remember):GTSLYDetailsScreenWrapper.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(gTSLYDetailsScreenViewModel4) | startRestartGroup.changedInstance(context);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1(gTSLYDetailsScreenViewModel4, context, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4643constructorimpl = Updater.m4643constructorimpl(startRestartGroup);
                        Updater.m4651setimpl(m4643constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2137938703, "C:GTSLYDetailsScreenWrapper.kt#m3and0");
                        if (GTSLYDetailsScreenWrapper$lambda$1(collectAsState) == null) {
                            startRestartGroup.startReplaceGroup(-2137915485);
                            ComposerKt.sourceInformation(startRestartGroup, "48@1619L23");
                            Method GTSLYDetailsScreenWrapper$lambda$1 = GTSLYDetailsScreenWrapper$lambda$1(collectAsState);
                            Intrinsics.checkNotNull(GTSLYDetailsScreenWrapper$lambda$1);
                            Boolean valueOf = Boolean.valueOf(GTSLYDetailsScreenWrapper$lambda$0(collectAsState2));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1454434538, "CC(remember):GTSLYDetailsScreenWrapper.kt#9igjgp");
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYDetailsScreenWrapperKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit GTSLYDetailsScreenWrapper$lambda$6$0$0;
                                        GTSLYDetailsScreenWrapper$lambda$6$0$0 = GTSLYDetailsScreenWrapperKt.GTSLYDetailsScreenWrapper$lambda$6$0$0(MutableState.this);
                                        return GTSLYDetailsScreenWrapper$lambda$6$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            GTSLYDetailsScreenWrapper$lambda$1.invoke(null, url, valueOf, (Function0) rememberedValue3, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                            gTSLYDetailsScreenViewModel5 = gTSLYDetailsScreenViewModel4;
                        } else {
                            startRestartGroup.startReplaceGroup(-2137692688);
                            ComposerKt.sourceInformation(startRestartGroup, "53@1738L27");
                            gTSLYDetailsScreenViewModel5 = gTSLYDetailsScreenViewModel4;
                            ProgressIndicatorKt.m2834CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, startRestartGroup, 0, 63);
                            startRestartGroup.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        gTSLYDetailsScreenViewModel3 = gTSLYDetailsScreenViewModel5;
                    }
                }
                i4 = i3;
                modifier3 = companion;
                gTSLYDetailsScreenViewModel4 = gTSLYDetailsScreenViewModel2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context2 = (Context) consume2;
                State collectAsState22 = SnapshotStateKt.collectAsState(gTSLYDetailsScreenViewModel4.getConnectionState(), null, startRestartGroup, 0, 1);
                collectAsState = SnapshotStateKt.collectAsState(gTSLYDetailsScreenViewModel4.getGtslyDetailsState(), null, startRestartGroup, 0, 1);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 570565627, "CC(remember):GTSLYDetailsScreenWrapper.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState2 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Unit unit2 = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 570567598, "CC(remember):GTSLYDetailsScreenWrapper.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(gTSLYDetailsScreenViewModel4) | startRestartGroup.changedInstance(context2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new GTSLYDetailsScreenWrapperKt$GTSLYDetailsScreenWrapper$1$1(gTSLYDetailsScreenViewModel4, context2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                Composer m4643constructorimpl2 = Updater.m4643constructorimpl(startRestartGroup);
                Updater.m4651setimpl(m4643constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2137938703, "C:GTSLYDetailsScreenWrapper.kt#m3and0");
                if (GTSLYDetailsScreenWrapper$lambda$1(collectAsState) == null) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                gTSLYDetailsScreenViewModel3 = gTSLYDetailsScreenViewModel5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                gTSLYDetailsScreenViewModel3 = gTSLYDetailsScreenViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYDetailsScreenWrapperKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit GTSLYDetailsScreenWrapper$lambda$7;
                        GTSLYDetailsScreenWrapper$lambda$7 = GTSLYDetailsScreenWrapperKt.GTSLYDetailsScreenWrapper$lambda$7(url, modifier3, gTSLYDetailsScreenViewModel3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return GTSLYDetailsScreenWrapper$lambda$7;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void GTSLYDetailsScreenWrapper$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GTSLYDetailsScreenWrapper$lambda$6$0$0(MutableState mutableState) {
        GTSLYDetailsScreenWrapper$lambda$4(mutableState, true);
        return Unit.INSTANCE;
    }

    private static final boolean GTSLYDetailsScreenWrapper$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final Method GTSLYDetailsScreenWrapper$lambda$1(State<Method> state) {
        return state.getValue();
    }
}
