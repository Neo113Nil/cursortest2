package gbcorp.c312.merkmarker.info.ui.composable.screen;

import android.content.Context;
import android.os.Build;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
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
import androidx.core.os.EnvironmentCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.google.android.gms.common.internal.ImagesContract;
import gbcorp.c312.merkmarker.info.data.model.GTSLYUrlState;
import gbcorp.c312.merkmarker.info.ui.viewmodel.GTSLYPrepViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.koin.compose.KoinApplicationKt;
import org.koin.viewmodel.CreationExtrasExtKt;
import org.koin.viewmodel.GetViewModelKt;

/* compiled from: GTSLYPrepScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\b\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"GTSLYPrepScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lgbcorp/c312/merkmarker/info/ui/viewmodel/GTSLYPrepViewModel;", "onNavigateToWebview", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", ImagesContract.URL, "onFallbackNavigation", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/viewmodel/GTSLYPrepViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "emulatorCheck", "", "app_release", "urlState", "Lgbcorp/c312/merkmarker/info/data/model/GTSLYUrlState;", "permissionResolvedState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYPrepScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GTSLYPrepScreen$lambda$9(Modifier modifier, GTSLYPrepViewModel gTSLYPrepViewModel, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        GTSLYPrepScreen(modifier, gTSLYPrepViewModel, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GTSLYPrepScreen(Modifier modifier, GTSLYPrepViewModel gTSLYPrepViewModel, final Function1<? super String, Unit> onNavigateToWebview, final Function0<Unit> onFallbackNavigation, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        GTSLYPrepViewModel gTSLYPrepViewModel2;
        final Modifier modifier3;
        final GTSLYPrepViewModel gTSLYPrepViewModel3;
        Modifier modifier4;
        int i4;
        GTSLYPrepViewModel gTSLYPrepViewModel4;
        int i5;
        Intrinsics.checkNotNullParameter(onNavigateToWebview, "onNavigateToWebview");
        Intrinsics.checkNotNullParameter(onFallbackNavigation, "onFallbackNavigation");
        Composer startRestartGroup = composer.startRestartGroup(-616796452);
        ComposerKt.sourceInformation(startRestartGroup, "C(GTSLYPrepScreen)N(modifier,viewModel,onNavigateToWebview,onFallbackNavigation)31@1274L7,32@1321L16,34@1374L93,41@1644L73,39@1518L209,46@1754L524,46@1733L545,63@2305L143,63@2284L164,70@2479L358,70@2454L383,81@2843L128:GTSLYPrepScreen.kt#m3and0");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                gTSLYPrepViewModel2 = gTSLYPrepViewModel;
                if (startRestartGroup.changedInstance(gTSLYPrepViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                gTSLYPrepViewModel2 = gTSLYPrepViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            gTSLYPrepViewModel2 = gTSLYPrepViewModel;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToWebview) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onFallbackNavigation) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "27@1136L15");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                i4 = i3;
                gTSLYPrepViewModel4 = gTSLYPrepViewModel2;
                modifier4 = modifier2;
            } else {
                Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1614864554, "CC(koinViewModel)N(qualifier,viewModelStoreOwner,key,extras,scope,parameters)43@1516L7,46@1711L18:ViewModel.kt#m7on9k");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(GTSLYPrepViewModel.class), current.getViewModelStore(), null, CreationExtrasExtKt.defaultExtras(current), null, KoinApplicationKt.currentKoinScope(startRestartGroup, 0), null);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i7 = i3 & (-113);
                    modifier4 = companion;
                    i4 = i7;
                    gTSLYPrepViewModel4 = (GTSLYPrepViewModel) resolveViewModel;
                } else {
                    int i8 = i3;
                    modifier4 = companion;
                    i4 = i8;
                    gTSLYPrepViewModel4 = gTSLYPrepViewModel2;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616796452, i4, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYPrepScreen (GTSLYPrepScreen.kt:30)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            State collectAsState = SnapshotStateKt.collectAsState(gTSLYPrepViewModel4.getUrlState(), null, startRestartGroup, 0, 1);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -35892871, "CC(remember):GTSLYPrepScreen.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(Build.VERSION.SDK_INT < 33), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -35884251, "CC(remember):GTSLYPrepScreen.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYPrepScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit GTSLYPrepScreen$lambda$4$0;
                        GTSLYPrepScreen$lambda$4$0 = GTSLYPrepScreenKt.GTSLYPrepScreen$lambda$4$0(MutableState.this, ((Boolean) obj).booleanValue());
                        return GTSLYPrepScreen$lambda$4$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue2, startRestartGroup, 48);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -35880280, "CC(remember):GTSLYPrepScreen.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(rememberLauncherForActivityResult);
            GTSLYPrepScreenKt$GTSLYPrepScreen$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new GTSLYPrepScreenKt$GTSLYPrepScreen$1$1(context, rememberLauncherForActivityResult, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
            Unit unit2 = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -35863029, "CC(remember):GTSLYPrepScreen.kt#9igjgp");
            int i9 = i4 & 7168;
            boolean z = i9 == 2048;
            GTSLYPrepScreenKt$GTSLYPrepScreen$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (z || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new GTSLYPrepScreenKt$GTSLYPrepScreen$2$1(onFallbackNavigation, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 6);
            GTSLYUrlState GTSLYPrepScreen$lambda$0 = GTSLYPrepScreen$lambda$0(collectAsState);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -35857246, "CC(remember):GTSLYPrepScreen.kt#9igjgp");
            boolean changed = startRestartGroup.changed(collectAsState) | (i9 == 2048) | ((i4 & 896) == 256);
            GTSLYPrepScreenKt$GTSLYPrepScreen$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new GTSLYPrepScreenKt$GTSLYPrepScreen$3$1(onFallbackNavigation, onNavigateToWebview, mutableState, collectAsState, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(GTSLYPrepScreen$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 0);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1823799270, "C85@2938L27:GTSLYPrepScreen.kt#m3and0");
            Modifier modifier5 = modifier4;
            ProgressIndicatorKt.m2834CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, startRestartGroup, 0, 63);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            gTSLYPrepViewModel3 = gTSLYPrepViewModel4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            gTSLYPrepViewModel3 = gTSLYPrepViewModel2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.GTSLYPrepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GTSLYPrepScreen$lambda$9;
                    GTSLYPrepScreen$lambda$9 = GTSLYPrepScreenKt.GTSLYPrepScreen$lambda$9(Modifier.this, gTSLYPrepViewModel3, onNavigateToWebview, onFallbackNavigation, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return GTSLYPrepScreen$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GTSLYPrepScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GTSLYPrepScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GTSLYPrepScreen$lambda$4$0(MutableState mutableState, boolean z) {
        GTSLYPrepScreen$lambda$3(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean emulatorCheck() {
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.startsWith$default(DEVICE, "generic", false, 2, (Object) null)) {
                return true;
            }
        }
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
            return true;
        }
        String FINGERPRINT2 = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
        if (StringsKt.startsWith$default(FINGERPRINT2, EnvironmentCompat.MEDIA_UNKNOWN, false, 2, (Object) null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (StringsKt.contains$default((CharSequence) HARDWARE, (CharSequence) "goldfish", false, 2, (Object) null)) {
            return true;
        }
        String HARDWARE2 = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE2, "HARDWARE");
        if (StringsKt.contains$default((CharSequence) HARDWARE2, (CharSequence) "ranchu", false, 2, (Object) null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
            return true;
        }
        String MODEL2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL2, (CharSequence) "Emulator", false, 2, (Object) null)) {
            return true;
        }
        String MODEL3 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL3, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "sdk_google", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT2 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT2, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT2, (CharSequence) "google_sdk", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT3 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT3, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT3, (CharSequence) "sdk", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT4 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT4, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT4, (CharSequence) "sdk_x86", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT5 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT5, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT5, (CharSequence) "sdk_gphone64_arm64", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT6 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT6, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT6, (CharSequence) "vbox86p", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT7 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT7, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT7, (CharSequence) "emulator", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT8 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT8, "PRODUCT");
        return StringsKt.contains$default((CharSequence) PRODUCT8, (CharSequence) "simulator", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GTSLYUrlState GTSLYPrepScreen$lambda$0(State<? extends GTSLYUrlState> state) {
        return state.getValue();
    }
}
