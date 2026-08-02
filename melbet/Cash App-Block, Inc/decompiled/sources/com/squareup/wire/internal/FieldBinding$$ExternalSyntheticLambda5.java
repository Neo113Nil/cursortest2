package com.squareup.wire.internal;

import android.os.Trace;
import androidx.collection.LruCache;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.wire.Message;
import com.squareup.workflow1.TimerWorker$run$1;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.model.Entry;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda4;
import com.stripe.android.financialconnections.ui.ImageResource$Network;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import com.stripe.android.uicore.elements.FormLabelKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import dev.chrisbanes.haze.HazeEffectNode;
import dev.chrisbanes.haze.HazeEffectNodeKt;
import dev.chrisbanes.haze.RenderEffectBlurEffect;
import dev.chrisbanes.haze.RenderEffectParams;
import dev.chrisbanes.haze.RenderEffect_androidKt;
import evaluation.CommonLogicEvaluator;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import operations.array.ArrayOperationInputData;
import operations.array.Map$evaluateLogic$1;
import operations.array.occurence.All;
import operations.array.occurence.OccurrenceCheckInputData;

/* loaded from: classes8.dex */
public final /* synthetic */ class FieldBinding$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FieldBinding$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.graphics.RenderEffect] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r9v10, types: [operations.array.Map$evaluateLogic$1] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object invoke;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        ?? r5 = 0;
        r5 = null;
        r5 = null;
        OccurrenceCheckInputData occurrenceCheckInputData = null;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Message.Builder builder = (Message.Builder) obj;
                builder.getClass();
                ((Method) obj3).invoke(builder, obj2);
                return Unit.INSTANCE;
            case 1:
                Message.Builder builder2 = (Message.Builder) obj;
                builder2.getClass();
                ((Field) obj3).set(builder2, obj2);
                return Unit.INSTANCE;
            case 2:
                IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = (IntentConfirmationChallengeActivity) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = IntentConfirmationChallengeActivity.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    boolean changedInstance = gapComposer.changedInstance(intentConfirmationChallengeActivity);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TimerWorker$run$1(intentConfirmationChallengeActivity, mutableState, r5, 24);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer, "BridgeEvents", (Function2) rememberedValue2);
                    ScaffoldKt.m502Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, Color.Transparent, 0L, Expect_jvmKt.rememberComposableLambda(1651918913, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(15, intentConfirmationChallengeActivity, mutableState), gapComposer), gapComposer, 0, 12779520, 98303);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                return Integer.valueOf(((Collator) obj3).compare(((Country) obj).name, ((Country) obj2).name));
            case 4:
                LinkBrand linkBrand = (LinkBrand) obj;
                LinkBrand linkBrand2 = (LinkBrand) obj2;
                return linkBrand == null ? linkBrand2 == null ? ((RealCurrentLinkBrand) obj3).initialState.linkBrand : linkBrand2 : linkBrand;
            case 5:
                AccountNumberRetrievalError accountNumberRetrievalError = (AccountNumberRetrievalError) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Image image = accountNumberRetrievalError.institution.icon;
                    ListItemKt.InstitutionIcon(0, 6, gapComposer2, null, (image == null || (str = image.f809default) == null) ? "" : str, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                InstitutionPlannedDowntimeError institutionPlannedDowntimeError = (InstitutionPlannedDowntimeError) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Image image2 = institutionPlannedDowntimeError.institution.icon;
                    ListItemKt.InstitutionIcon(0, 6, gapComposer3, null, (image2 == null || (str2 = image2.f809default) == null) ? "" : str2, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                InstitutionUnplannedDowntimeError institutionUnplannedDowntimeError = (InstitutionUnplannedDowntimeError) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Image image3 = institutionUnplannedDowntimeError.institution.icon;
                    ListItemKt.InstitutionIcon(0, 6, gapComposer4, null, (image3 == null || (str3 = image3.f809default) == null) ? "" : str3, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                AccountNoneEligibleForPaymentMethodError accountNoneEligibleForPaymentMethodError = (AccountNoneEligibleForPaymentMethodError) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Image image4 = accountNoneEligibleForPaymentMethodError.institution.icon;
                    ListItemKt.InstitutionIcon(0, 6, gapComposer5, null, (image4 == null || (str4 = image4.f809default) == null) ? "" : str4, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                AccountLoadError accountLoadError = (AccountLoadError) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Image image5 = accountLoadError.institution.icon;
                    ListItemKt.InstitutionIcon(0, 6, gapComposer6, null, (image5 == null || (str5 = image5.f809default) == null) ? "" : str5, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ListItemKt.ListItemIcon((ImageResource$Network) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ListItemKt.PrepaneImage((Entry.Image) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ConsentLogoHeaderKt.Logo((AndroidImageBitmap) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                InstitutionPickerState institutionPickerState = (InstitutionPickerState) obj;
                Async async = (Async) obj2;
                institutionPickerState.getClass();
                async.getClass();
                return InstitutionPickerState.copy$default(institutionPickerState, async instanceof Async.Loading ? ((FinancialConnectionsInstitution) obj3).id : null, null, null, async, 45);
            case 14:
                ((Integer) obj2).getClass();
                ManualEntryScreenKt.ErrorMessage((Throwable) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                FillrWidgetVersion.HeaderSection((LinkBrand) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    DropdownFieldUIKt.DropDown(payload.phoneController.countryDropdownController, SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 2.0f, RecyclerView.DECELERATION_RATE, 6.0f, RecyclerView.DECELERATION_RATE, 10), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), ((FinancialConnectionsColors) gapComposer7.consume(ThemeKt.LocalColors)).backgroundSecondary, ColorKt.RectangleShape), 8.0f, 12.0f), false, gapComposer7, 3128, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                NetworkingLinkVerificationScreenKt.Header((NetworkingLinkVerificationState.Payload) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                NetworkingSaveToLinkVerificationScreenKt.Header((NetworkingSaveToLinkVerificationState.Payload) obj3, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 19:
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i3 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    MutableState collectAsState = StateFlowsComposeKt.collectAsState(financialConnectionsSheetNativeActivity.getViewModel().stateFlow, gapComposer8);
                    ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                    StripeBottomSheetState rememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(gapComposer8, 6, 2);
                    FinancialConnectionsSheetNativeViewModel viewModel = financialConnectionsSheetNativeActivity.getViewModel();
                    boolean changedInstance2 = gapComposer8.changedInstance(viewModel);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        RenderSystem.AnonymousClass1 anonymousClass1 = new RenderSystem.AnonymousClass1(0, viewModel, FinancialConnectionsSheetNativeViewModel.class, "onBackPressed", "onBackPressed()V", 0, 9);
                        gapComposer8.updateRememberedValue(anonymousClass1);
                        rememberedValue3 = anonymousClass1;
                    }
                    TextKt.FinancialConnectionsBottomSheetLayout(rememberStripeBottomSheetState, null, (Function0) ((KFunction) rememberedValue3), Expect_jvmKt.rememberComposableLambda(1681319268, new FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda4(financialConnectionsSheetNativeActivity, collectAsState, r7 ? 1 : 0), gapComposer8), gapComposer8, 3080);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ResolvableString resolvableString = (ResolvableString) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    FormLabelKt.FormLabel(0, 2, gapComposer9, null, ScanningShapePulseKt.resolve(resolvableString, gapComposer9));
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                RenderEffectBlurEffect renderEffectBlurEffect = (RenderEffectBlurEffect) obj3;
                DrawScope drawScope = (DrawScope) obj;
                GraphicsLayer graphicsLayer = (GraphicsLayer) obj2;
                drawScope.getClass();
                graphicsLayer.getClass();
                HazeEffectNode hazeEffectNode = renderEffectBlurEffect.node;
                if (renderEffectBlurEffect.renderEffect == null || (hazeEffectNode.dirtyTracker & 907003) != 0) {
                    float m4109calculateInputScaleFactor3ABfNKs$default = HazeEffectNodeKt.m4109calculateInputScaleFactor3ABfNKs$default(hazeEffectNode);
                    float resolveBlurRadius = HazeEffectNodeKt.resolveBlurRadius(hazeEffectNode);
                    if (Float.isNaN(resolveBlurRadius)) {
                        resolveBlurRadius = RecyclerView.DECELERATION_RATE;
                    }
                    float f = resolveBlurRadius;
                    float resolveNoiseFactor = HazeEffectNodeKt.resolveNoiseFactor(hazeEffectNode);
                    List resolveTints = HazeEffectNodeKt.resolveTints(hazeEffectNode);
                    long j = hazeEffectNode.size;
                    long j2 = hazeEffectNode.layerOffset;
                    int i4 = Intrinsics.areEqual(hazeEffectNode.blurredEdgeTreatment, (Object) null) ? 3 : 0;
                    resolveTints.getClass();
                    Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("HazeEffectNode-getOrCreateRenderEffect"));
                    try {
                        RenderEffectParams renderEffectParams = new RenderEffectParams(f, resolveNoiseFactor, m4109calculateInputScaleFactor3ABfNKs$default, j, j2, resolveTints, 1.0f, null, i4);
                        Lazy lazy = HazeEffectNodeKt.renderEffectCache$delegate;
                        Object obj4 = (RenderEffect) ((LruCache) lazy.getValue()).get(renderEffectParams);
                        if (obj4 == null) {
                            obj4 = RenderEffect_androidKt.createRenderEffect(hazeEffectNode, renderEffectParams);
                            if (obj4 != null) {
                                ((LruCache) lazy.getValue()).put(renderEffectParams, obj4);
                            }
                            Trace.endSection();
                            renderEffectBlurEffect.renderEffect = r5;
                        }
                        r5 = obj4;
                        Trace.endSection();
                        renderEffectBlurEffect.renderEffect = r5;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                graphicsLayer.setRenderEffect(renderEffectBlurEffect.renderEffect);
                graphicsLayer.setAlpha(hazeEffectNode.alpha);
                SizeKt.drawLayer(drawScope, graphicsLayer);
                return Unit.INSTANCE;
            default:
                All all = (All) obj3;
                ArrayOperationInputData arrayOperationInputData = (ArrayOperationInputData) obj;
                CommonLogicEvaluator commonLogicEvaluator = (CommonLogicEvaluator) obj2;
                arrayOperationInputData.getClass();
                commonLogicEvaluator.getClass();
                ?? map$evaluateLogic$1 = new Map$evaluateLogic$1(2, all, All.class, "check", "check(Loperations/array/occurence/OccurrenceCheckInputData;LLogicEvaluator;)Ljava/lang/Object;", 0, 9);
                Map map = arrayOperationInputData.mappingOperation;
                Object obj5 = arrayOperationInputData.operationDefault;
                List list = arrayOperationInputData.operationData;
                if (map != null && list != null && !list.isEmpty()) {
                    occurrenceCheckInputData = new OccurrenceCheckInputData(list, map, obj5);
                }
                return (occurrenceCheckInputData == null || (invoke = map$evaluateLogic$1.invoke(occurrenceCheckInputData, commonLogicEvaluator)) == null) ? obj5 : invoke;
        }
    }

    public /* synthetic */ FieldBinding$$ExternalSyntheticLambda5(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
