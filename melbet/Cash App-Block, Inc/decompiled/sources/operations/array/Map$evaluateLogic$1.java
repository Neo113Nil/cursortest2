package operations.array;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import androidx.transition.Scene;
import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.R;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.workflow1.ui.Named;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewRegistry;
import com.squareup.workflow1.ui.ViewRegistryKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import com.squareup.workflow1.ui.backstack.BackStackConfig;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import evaluation.CommonLogicEvaluator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonElementMarker;
import operations.array.occurence.All;
import operations.array.occurence.OccurrenceCheckInputData;

/* loaded from: classes9.dex */
public final /* synthetic */ class Map$evaluateLogic$1 extends FunctionReferenceImpl implements Function2 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Map$evaluateLogic$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object executeExpression;
        Pair pair;
        Object executeExpression2;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                ArrayOperationInputData arrayOperationInputData = (ArrayOperationInputData) obj;
                CommonLogicEvaluator commonLogicEvaluator = (CommonLogicEvaluator) obj2;
                arrayOperationInputData.getClass();
                commonLogicEvaluator.getClass();
                ((Map) this.receiver).getClass();
                Iterable iterable = arrayOperationInputData.operationData;
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                for (Object obj3 : iterable2) {
                    java.util.Map map = arrayOperationInputData.mappingOperation;
                    Object obj4 = arrayOperationInputData.operationDefault;
                    if (map != null && (executeExpression = commonLogicEvaluator.executeExpression(map, obj3)) != null) {
                        obj4 = executeExpression;
                    }
                    arrayList.add(obj4);
                }
                return arrayList;
            case 1:
                SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen = (SelfieWorkflow.Screen.OldCameraScreen) obj;
                ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                oldCameraScreen.getClass();
                viewEnvironment.getClass();
                ((OldCameraScreenRunner) this.receiver).showRendering(oldCameraScreen, viewEnvironment);
                return Unit.INSTANCE;
            case 2:
                SelfieWorkflow.Screen.CameraScreen cameraScreen = (SelfieWorkflow.Screen.CameraScreen) obj;
                ViewEnvironment viewEnvironment2 = (ViewEnvironment) obj2;
                cameraScreen.getClass();
                viewEnvironment2.getClass();
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) this.receiver;
                cameraScreenRunner.getClass();
                cameraScreenRunner.showRendering(cameraScreen, zzat.getSystemUiController(viewEnvironment2));
                return Unit.INSTANCE;
            case 3:
                ScreenWithTransition screenWithTransition = (ScreenWithTransition) obj;
                ViewEnvironment viewEnvironment3 = (ViewEnvironment) obj2;
                screenWithTransition.getClass();
                viewEnvironment3.getClass();
                ScreenWithTransitionContainer screenWithTransitionContainer = (ScreenWithTransitionContainer) this.receiver;
                screenWithTransitionContainer.getClass();
                ViewEnvironment viewEnvironment4 = new ViewEnvironment(MapsKt__MapsKt.plus(viewEnvironment3.map, new Pair(BackStackConfig.Companion, BackStackConfig.First)));
                Named named = new Named(screenWithTransition.screen, "screen_with_transition");
                View childAt = screenWithTransitionContainer.getChildCount() > 0 ? screenWithTransitionContainer.getChildAt(0) : null;
                if (childAt != null) {
                    View view = ViewShowRenderingKt.canShowRendering(childAt, named) ? childAt : null;
                    if (view != null) {
                        screenWithTransitionContainer.viewStateCache.prune(CollectionsKt__CollectionsJVMKt.listOf(named));
                        ViewShowRenderingKt.showRendering(view, named, viewEnvironment4);
                        return Unit.INSTANCE;
                    }
                }
                ViewRegistry viewRegistry = (ViewRegistry) viewEnvironment4.get(ViewRegistry.Companion);
                Context context = screenWithTransitionContainer.getContext();
                context.getClass();
                View buildView = ViewRegistryKt.buildView(viewRegistry, named, viewEnvironment4, context, screenWithTransitionContainer, new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(29));
                ViewShowRenderingKt.start(buildView);
                ScreenTransition screenTransition = screenWithTransition.transition;
                if (childAt != null) {
                    View findViewById = childAt.findViewById(R.id.back_stack_body);
                    View findViewById2 = buildView.findViewById(R.id.back_stack_body);
                    if (findViewById == null || findViewById2 == null) {
                        findViewById = childAt;
                        findViewById2 = buildView;
                    }
                    int ordinal = screenTransition.ordinal();
                    if (ordinal == 0) {
                        pair = new Pair(8388611, 8388613);
                    } else if (ordinal == 1) {
                        pair = new Pair(8388613, 8388611);
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        TransitionManager.go(new Scene(buildView, screenWithTransitionContainer), null);
                    }
                    int intValue = ((Number) pair.first).intValue();
                    int intValue2 = ((Number) pair.second).intValue();
                    TransitionSet transitionSet = new TransitionSet();
                    Slide slide = new Slide(intValue);
                    slide.mTargets.add(findViewById);
                    transitionSet.addTransition(slide);
                    Slide slide2 = new Slide(intValue2);
                    slide2.mTargets.add(findViewById2);
                    transitionSet.addTransition(slide2);
                    transitionSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    TransitionManager.endTransitions(screenWithTransitionContainer);
                    TransitionManager.go(new Scene(buildView, screenWithTransitionContainer), transitionSet);
                } else {
                    screenWithTransitionContainer.addView(buildView);
                }
                if (childAt != null) {
                    LifecycleOwner lifecycleOwner = DBUtil.get(childAt);
                    RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = lifecycleOwner instanceof RealWorkflowLifecycleOwner ? (RealWorkflowLifecycleOwner) lifecycleOwner : null;
                    if (realWorkflowLifecycleOwner != null) {
                        realWorkflowLifecycleOwner.destroyOnDetach();
                    }
                }
                return Unit.INSTANCE;
            case 4:
                UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) obj;
                ViewEnvironment viewEnvironment5 = (ViewEnvironment) obj2;
                entryScreen.getClass();
                viewEnvironment5.getClass();
                ((UiScreenRunner) this.receiver).showRendering(entryScreen, viewEnvironment5);
                return Unit.INSTANCE;
            case 5:
                KotlinType kotlinType = (KotlinType) obj;
                KotlinType kotlinType2 = (KotlinType) obj2;
                kotlinType.getClass();
                kotlinType2.getClass();
                return Boolean.valueOf(TypeIntersector.access$isStrictSupertype((TypeIntersector) this.receiver, kotlinType, kotlinType2));
            case 6:
                KotlinType kotlinType3 = (KotlinType) obj;
                KotlinType kotlinType4 = (KotlinType) obj2;
                kotlinType3.getClass();
                kotlinType4.getClass();
                return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).equalTypes(kotlinType3, kotlinType4));
            case 7:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int intValue3 = ((Number) obj2).intValue();
                serialDescriptor.getClass();
                JsonElementMarker jsonElementMarker = (JsonElementMarker) this.receiver;
                jsonElementMarker.getClass();
                if (!serialDescriptor.isElementOptional(intValue3) && serialDescriptor.getElementDescriptor(intValue3).isNullable()) {
                    z = true;
                }
                jsonElementMarker.isUnmarkedNull = z;
                return Boolean.valueOf(z);
            case 8:
                ArrayOperationInputData arrayOperationInputData2 = (ArrayOperationInputData) obj;
                CommonLogicEvaluator commonLogicEvaluator2 = (CommonLogicEvaluator) obj2;
                arrayOperationInputData2.getClass();
                commonLogicEvaluator2.getClass();
                ((Filter) this.receiver).getClass();
                Iterable iterable3 = arrayOperationInputData2.operationData;
                if (iterable3 == null) {
                    iterable3 = EmptyList.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : iterable3) {
                    java.util.Map map2 = arrayOperationInputData2.mappingOperation;
                    Object obj6 = arrayOperationInputData2.operationDefault;
                    if (map2 != null && (executeExpression2 = commonLogicEvaluator2.executeExpression(map2, obj5)) != null) {
                        obj6 = executeExpression2;
                    }
                    if (X509CertUtils.unwrapValueAsBoolean(obj6)) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            default:
                OccurrenceCheckInputData occurrenceCheckInputData = (OccurrenceCheckInputData) obj;
                CommonLogicEvaluator commonLogicEvaluator3 = (CommonLogicEvaluator) obj2;
                occurrenceCheckInputData.getClass();
                commonLogicEvaluator3.getClass();
                int i = ((All) this.receiver).$r8$classId;
                occurrenceCheckInputData.getClass();
                commonLogicEvaluator3.getClass();
                switch (i) {
                    case 0:
                        Iterator it = occurrenceCheckInputData.operationData.iterator();
                        while (it.hasNext()) {
                            if (!X509CertUtils.unwrapValueAsBoolean(commonLogicEvaluator3.evaluateLogic(occurrenceCheckInputData.mappingOperation, it.next()))) {
                                return occurrenceCheckInputData.operationDefault;
                            }
                        }
                        return Boolean.TRUE;
                    case 1:
                        Iterator it2 = occurrenceCheckInputData.operationData.iterator();
                        while (it2.hasNext()) {
                            if (X509CertUtils.unwrapValueAsBoolean(commonLogicEvaluator3.evaluateLogic(occurrenceCheckInputData.mappingOperation, it2.next()))) {
                                return Boolean.FALSE;
                            }
                        }
                        return occurrenceCheckInputData.operationDefault;
                    default:
                        Iterator it3 = occurrenceCheckInputData.operationData.iterator();
                        while (it3.hasNext()) {
                            if (X509CertUtils.unwrapValueAsBoolean(commonLogicEvaluator3.evaluateLogic(occurrenceCheckInputData.mappingOperation, it3.next()))) {
                                return Boolean.TRUE;
                            }
                        }
                        return occurrenceCheckInputData.operationDefault;
                }
        }
    }
}
