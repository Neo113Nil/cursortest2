package okio;

import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.tooling.data.Group;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieViewModel;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepViewModel;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepViewModel_Factory_Impl;
import comsquareupcashexchangedatadb.ExchangeDataQueries$exchangeRates$2;
import dev.chrisbanes.haze.RenderScriptBlurEffect;
import io.noties.markwon.MarkwonImpl;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.AbstractMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$CONTEXTUAL;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonTreeEncoder;
import okhttp3.internal.Tags;
import papa.ActivityTouchEvent;
import papa.AppStart$AppStartData;
import papa.internal.LaunchTracker;
import radiography.internal.ComposeLayoutInfoKt;
import radiography.internal.CompositionContextsKt$REFLECTION_CONSTANTS$2$1;

/* loaded from: classes9.dex */
public final /* synthetic */ class ForwardingFileSystem$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ForwardingFileSystem$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 15;
        ExchangeDataQueries$exchangeRates$2 exchangeDataQueries$exchangeRates$2 = ExchangeDataQueries$exchangeRates$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v28 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BottomSheetBehavior bottomSheetBehavior;
        SerialDescriptor descriptor;
        int i = this.$r8$classId;
        int i2 = 3;
        r7 = null;
        List list = null;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Path path = (Path) obj;
                path.getClass();
                return ((ForwardingFileSystem) obj2).onPathResult(path, "listRecursively");
            case 1:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                updater.state = new SelfieState.RestartCamera(false, false, SelfieWorkflowUtilsKt.createBackState(updater, false), (CameraProperties.FacingMode) obj2);
                return Unit.INSTANCE;
            case 2:
                SelfieState.WebRtcFinished webRtcFinished = (SelfieState.WebRtcFinished) obj2;
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.state = SelfieWorkflowUtilsKt.reviewStateIfNeeded(updater2, webRtcFinished.selfies, webRtcFinished.webRtcObjectId, webRtcFinished.cameraProperties, webRtcFinished.startSelfieTimestamp, SelfieWorkflowUtilsKt.createBackState(updater2, false));
                return Unit.INSTANCE;
            case 3:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.setOutput((SelfieWorkflow.Output) obj2);
                return Unit.INSTANCE;
            case 4:
                SelfieState.ReviewCaptures reviewCaptures = (SelfieState.ReviewCaptures) obj2;
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                Object obj3 = updater4.state;
                r7 = obj3 instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) obj3 : 0;
                if (r7 == 0) {
                    return Unit.INSTANCE;
                }
                updater4.state = new SelfieState.Submit(r7.selfies, r7.webRtcObjectId, r7.cameraProperties, r7.startSelfieTimestamp, SelfieWorkflowUtilsKt.createBackState(updater4, true), reviewCaptures.cameraFacingMode);
                return Unit.INSTANCE;
            case 5:
                CameraError cameraError = (CameraError) obj;
                cameraError.getClass();
                ((SelfieWorkflow.Screen.CameraScreen) obj2).onCameraError.invoke(cameraError);
                return Unit.INSTANCE;
            case 6:
                SelfieStepFragment selfieStepFragment = (SelfieStepFragment) obj2;
                SavedStateHandle savedStateHandle = (SavedStateHandle) obj;
                savedStateHandle.getClass();
                SelfieViewModel_Factory_Impl selfieViewModel_Factory_Impl = selfieStepFragment.viewModelFactory;
                if (selfieViewModel_Factory_Impl != null) {
                    return new SelfieViewModel(savedStateHandle, ((SelfieStepFragment.SelfieStepFragmentArgs) selfieStepFragment.args$delegate.getValue()).props, (SelfieStepStateManager_Factory_Impl) selfieViewModel_Factory_Impl.delegateFactory.selfieStepStateManagerFactoryProvider.instance);
                }
                Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                throw null;
            case 7:
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (SelfieState.FinalizeLocalVideoCapture) obj2;
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                Object obj4 = updater5.state;
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = obj4 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) obj4 : null;
                if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.isFinalizeComplete) {
                    updater5.state = SelfieWorkflowUtilsKt.reviewStateIfNeeded(updater5, ((SelfieState) obj4).getSelfies$selfie_release(), null, finalizeLocalVideoCapture.cameraProperties, finalizeLocalVideoCapture.startSelfieTimestamp, SelfieWorkflowUtilsKt.createBackState(updater5, false));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 8:
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                windowInsetsCompat.getClass();
                Insets insetsIgnoringVisibility = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                insetsIgnoringVisibility.getClass();
                Space space = ((HelpBottomSheetController) obj2).getBinding().bottomInset;
                ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                if (layoutParams == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = insetsIgnoringVisibility.bottom;
                space.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            case 9:
                Typeface typeface = (Typeface) obj;
                typeface.getClass();
                ((TextInputLayout) obj2).setTypeface(typeface);
                return Unit.INSTANCE;
            case 10:
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                updater6.setOutput(new UiWorkflow.Output.Error(((UiAddressDetailsWorker.Response.Error) ((UiAddressDetailsWorker.Response) obj2)).cause));
                return Unit.INSTANCE;
            case 11:
                ((UiComponent) obj).getClass();
                MarkwonImpl markwonImpl = ((UiScreenRunner) obj2).nestedUiBottomSheetController;
                UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) markwonImpl.visitorFactory;
                if (uiStepBottomSheet != null && (bottomSheetBehavior = uiStepBottomSheet.bottomSheetBehavior) != null) {
                    bottomSheetBehavior.setState(5);
                }
                markwonImpl.plugins = null;
                return Unit.INSTANCE;
            case 12:
                UiWorkflow.Input input = (UiWorkflow.Input) obj2;
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                Object obj5 = updater7.state;
                UiState.Displaying displaying = obj5 instanceof UiState.Displaying ? (UiState.Displaying) obj5 : null;
                if (displaying == null) {
                    return Unit.INSTANCE;
                }
                updater7.state = UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65471);
                updater7.setOutput(input.finalStep ? UiWorkflow.Output.Completed.INSTANCE : UiWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 13:
                UiStepStateManager uiStepStateManager = (UiStepStateManager) obj2;
                UiState uiState = (UiState) obj;
                if (uiState == null) {
                    return Unit.INSTANCE;
                }
                JobKt.launch$default((ContextScope) uiStepStateManager.parent, Dispatchers.Unconfined, null, new RxConvertKt$asFlow$1(uiStepStateManager, uiState, r7, i2), 2);
                return Unit.INSTANCE;
            case 14:
                UiStepFragment uiStepFragment = (UiStepFragment) obj2;
                SavedStateHandle savedStateHandle2 = (SavedStateHandle) obj;
                savedStateHandle2.getClass();
                UiStepViewModel_Factory_Impl uiStepViewModel_Factory_Impl = uiStepFragment.viewModelFactory;
                if (uiStepViewModel_Factory_Impl != null) {
                    return new UiStepViewModel(savedStateHandle2, ((UiStepFragment.UiStepFragmentArgs) uiStepFragment.args$delegate.getValue()).props, (UiStepStateManager_Factory_Impl) uiStepViewModel_Factory_Impl.delegateFactory.uiStepStateManagerFactoryProvider.instance);
                }
                Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                throw null;
            case 15:
                ExchangeDataQueries$exchangeRates$2 exchangeDataQueries$exchangeRates$2 = ExchangeDataQueries$exchangeRates$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 0, (EnumColumnAdapter) ((LaunchTracker) gpsConfigQueries.gpsConfigAdapter).appLaunchedCallback);
                LaunchTracker launchTracker = (LaunchTracker) gpsConfigQueries.gpsConfigAdapter;
                Enum m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 1, (EnumColumnAdapter) launchTracker.lastAppBecameInvisibleRealtimeMillis);
                WireRepeatedAdapter wireRepeatedAdapter = (WireRepeatedAdapter) launchTracker.launchInProgress;
                ?? bytes = androidCursor.getBytes(2);
                bytes.getClass();
                Object decode = wireRepeatedAdapter.decode(bytes);
                Long l = androidCursor.getLong(3);
                l.getClass();
                return exchangeDataQueries$exchangeRates$2.invoke(m, m2, decode, l);
            case 16:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                SizeKt.drawLayer(drawScope, ((RenderScriptBlurEffect) obj2).contentLayer);
                return Unit.INSTANCE;
            case 17:
                AbstractMap abstractMap = (AbstractMap) obj2;
                Map.Entry entry = (Map.Entry) obj;
                AbstractMap.Companion companion = AbstractMap.Companion;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 18:
                ((Disposable) obj2).dispose();
                return Unit.INSTANCE;
            case 19:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                KSerializer kSerializer = ((ContextualSerializer) obj2).fallbackSerializer;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    list = descriptor.getAnnotations();
                }
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                list.getClass();
                classSerialDescriptorBuilder.annotations = list;
                return Unit.INSTANCE;
            case 20:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj2;
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder2 = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder2.getClass();
                SerialDescriptor descriptor2 = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor();
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder2.element("type", descriptor2, emptyList, false);
                classSerialDescriptorBuilder2.element("value", Tags.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.baseClass.getSimpleName() + '>', SerialKind$CONTEXTUAL.INSTANCE, new SerialDescriptor[0]), emptyList, false);
                List list2 = polymorphicSerializer._annotations;
                list2.getClass();
                classSerialDescriptorBuilder2.annotations = list2;
                return Unit.INSTANCE;
            case 21:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                int intValue = ((Integer) obj).intValue();
                return serialDescriptor.getElementName(intValue) + ": " + serialDescriptor.getElementDescriptor(intValue).getSerialName();
            case 22:
                TripleSerializer tripleSerializer = (TripleSerializer) obj2;
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder3 = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder3.getClass();
                SerialDescriptor descriptor3 = tripleSerializer.aSerializer.getDescriptor();
                EmptyList emptyList2 = EmptyList.INSTANCE;
                classSerialDescriptorBuilder3.element("first", descriptor3, emptyList2, false);
                classSerialDescriptorBuilder3.element("second", tripleSerializer.bSerializer.getDescriptor(), emptyList2, false);
                classSerialDescriptorBuilder3.element("third", tripleSerializer.cSerializer.getDescriptor(), emptyList2, false);
                return Unit.INSTANCE;
            case 23:
                JsonTreeEncoder jsonTreeEncoder = (JsonTreeEncoder) obj2;
                JsonElement jsonElement = (JsonElement) obj;
                jsonElement.getClass();
                jsonTreeEncoder.putElement((String) CollectionsKt.last((List) jsonTreeEncoder.tagStack), jsonElement);
                return Unit.INSTANCE;
            case 24:
                MotionEvent motionEvent = (MotionEvent) obj2;
                AppStart$AppStartData appStart$AppStartData = (AppStart$AppStartData) obj;
                appStart$AppStartData.getClass();
                SystemClock.uptimeMillis();
                motionEvent.getEventTime();
                motionEvent.getRawX();
                motionEvent.getRawY();
                return AppStart$AppStartData.copy$default(appStart$AppStartData, null, null, null, null, null, null, null, null, null, null, null, null, null, new ActivityTouchEvent(), -536870913);
            case 25:
                Group group = (Group) obj;
                group.getClass();
                return ComposeLayoutInfoKt.computeLayoutInfos(group, EmptyList.INSTANCE, (SimpleActor) obj2);
            default:
                return Boolean.valueOf(obj != null && obj.getClass().equals(((CompositionContextsKt$REFLECTION_CONSTANTS$2$1) obj2).ReusableRememberObserverHolderClass));
        }
    }

    public /* synthetic */ ForwardingFileSystem$$ExternalSyntheticLambda0(MotionEvent motionEvent, String str) {
        this.$r8$classId = 24;
        this.f$0 = motionEvent;
    }

    public /* synthetic */ ForwardingFileSystem$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
