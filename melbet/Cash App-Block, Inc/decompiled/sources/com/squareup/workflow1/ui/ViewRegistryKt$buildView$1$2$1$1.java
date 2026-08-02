package com.squareup.workflow1.ui;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.pointer.HitPathTracker;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.ScrollObservationScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.data.upload.GzipRequestInterceptor;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator;
import com.datadog.android.core.internal.time.DefaultAppStartTimeProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.s;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import radiography.Radiography$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class ViewRegistryKt$buildView$1$2$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ Object $doStart;
    public final /* synthetic */ Object $newView;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewRegistryKt$buildView$1$2$1$1(int i, Object obj, Object obj2) {
        super(0);
        this.$r8$classId = i;
        this.$doStart = obj;
        this.$newView = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        SemanticsNode semanticsNode;
        LayoutNode layoutNode;
        long j;
        FrameProducer.Event event;
        ViewModelProvider$Factory defaultViewModelProviderFactory;
        int i = this.$r8$classId;
        Object[] objArr = 0;
        Object obj = this.$doStart;
        Object obj2 = this.$newView;
        switch (i) {
            case 0:
                ((Function1) obj).invoke((View) obj2);
                return Unit.INSTANCE;
            case 1:
                ((Ref$ObjectRef) obj).element = ((FocusTargetNode) obj2).fetchFocusProperties$ui();
                return Unit.INSTANCE;
            case 2:
                ((HitPathTracker) obj).removePointerInputModifierNode((Modifier.Node) obj2);
                return Unit.INSTANCE;
            case 3:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj2);
                return Boolean.valueOf(dispatchKeyEvent);
            case 4:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj2);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            case 5:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj2;
                ScrollObservationScope scrollObservationScope = (ScrollObservationScope) obj;
                ScrollAxisRange scrollAxisRange = scrollObservationScope.horizontalScrollAxisRange;
                ScrollAxisRange scrollAxisRange2 = scrollObservationScope.verticalScrollAxisRange;
                Float f = scrollObservationScope.oldXValue;
                Float f2 = scrollObservationScope.oldYValue;
                float floatValue = (scrollAxisRange == null || f == null) ? 0.0f : ((Number) scrollAxisRange.value.invoke()).floatValue() - f.floatValue();
                float floatValue2 = (scrollAxisRange2 == null || f2 == null) ? 0.0f : ((Number) scrollAxisRange2.value.invoke()).floatValue() - f2.floatValue();
                if (floatValue != RecyclerView.DECELERATION_RATE || floatValue2 != RecyclerView.DECELERATION_RATE) {
                    int semanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.semanticsNodeId);
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId);
                    if (semanticsNodeWithAdjustedBounds != null) {
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                            if (accessibilityNodeInfoCompat != null) {
                                accessibilityNodeInfoCompat.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId);
                    if (semanticsNodeWithAdjustedBounds2 != null) {
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                            if (accessibilityNodeInfoCompat2 != null) {
                                accessibilityNodeInfoCompat2.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    androidComposeViewAccessibilityDelegateCompat.view.invalidate();
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(semanticsNodeIdToAccessibilityVirtualNodeId);
                    if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.semanticsNode) != null && (layoutNode = semanticsNode.layoutNode) != null) {
                        if (scrollAxisRange != null) {
                            androidComposeViewAccessibilityDelegateCompat.pendingHorizontalScrollEvents.set(semanticsNodeIdToAccessibilityVirtualNodeId, scrollAxisRange);
                        }
                        if (scrollAxisRange2 != null) {
                            androidComposeViewAccessibilityDelegateCompat.pendingVerticalScrollEvents.set(semanticsNodeIdToAccessibilityVirtualNodeId, scrollAxisRange2);
                        }
                        androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                    }
                }
                if (scrollAxisRange != null) {
                    scrollObservationScope.oldXValue = (Float) scrollAxisRange.value.invoke();
                }
                if (scrollAxisRange2 != null) {
                    scrollObservationScope.oldYValue = (Float) scrollAxisRange2.value.invoke();
                }
                return Unit.INSTANCE;
            case 6:
                JobKt.launch$default((CoroutineScope) obj, null, null, new BlockRunner$cancel$1(obj2, (Continuation) (objArr == true ? 1 : 0), 1), 3);
                return Unit.INSTANCE;
            case 7:
                CoreFeature coreFeature = (CoreFeature) obj;
                OkHttpClient.Builder newBuilder = ((OkHttpClient) coreFeature.lazySharedOkHttpClient$delegate.getValue()).newBuilder();
                ((Configuration.Core) obj2).getClass();
                newBuilder.interceptors.add(new GzipRequestInterceptor(coreFeature.internalLogger));
                return new OkHttpClient(newBuilder);
            case 8:
                return "Unexpected consent migration from " + ((TrackingConsent) obj) + " to " + ((TrackingConsent) obj2);
            case 9:
                return String.format(Locale.US, "The file provided (%s) doesn't belong to the current folder (%s)", Arrays.copyOf(new Object[]{((File) obj).getPath(), ((BatchFileOrchestrator) obj2).rootDir.getPath()}, 2));
            case 10:
                if (((BuildSdkVersionProvider$Companion$DEFAULT$1) ((BuildSdkVersionProvider) obj)).isAtLeastN) {
                    ((Strings) ((DefaultAppStartTimeProvider) obj2).timeProviderFactory.invoke()).getClass();
                    j = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
                    long j2 = DdRumContentProvider.createTimeNs;
                    if (j2 - j > DefaultAppStartTimeProvider.PROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS) {
                        j = j2;
                    }
                } else {
                    j = DdRumContentProvider.createTimeNs;
                }
                return Long.valueOf(j);
            case 11:
                return ((String) obj) + " for OkHttp instrumentation is not found, skipping tracking of request with url=" + ((Request) obj2).url;
            case 12:
                ((SessionEndedMetricDispatcher) obj).getClass();
                return "Failed to track null error, session " + ((String) obj2) + " has ended";
            case 13:
                final CameraWrapper cameraWrapper = (CameraWrapper) obj;
                CameraSelectorFilter cameraSelectorFilter = (CameraSelectorFilter) obj2;
                MiSnapSettings.Camera camera = cameraWrapper.a;
                final Context context = (Context) cameraWrapper.e.get();
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) cameraWrapper.f.get();
                cameraWrapper.r = MibiData.bindSession();
                if (context != null && lifecycleOwner != null) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
                        event = FrameProducer.Event.InitializationError.CameraNotAvailable.INSTANCE;
                    } else {
                        if (!Intrinsics.areEqual(camera.advanced.a, Boolean.TRUE) || s.requireProfile(camera) == MiSnapSettings.Camera.Profile.FACE_FRONT_CAMERA) {
                            DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
                            PreviewView.DisplayRotationListener displayRotationListener = cameraWrapper.s;
                            Looper myLooper = Looper.myLooper();
                            if (myLooper == null) {
                                myLooper = Looper.getMainLooper();
                            }
                            displayManager.registerDisplayListener(displayRotationListener, new Handler(myLooper));
                            lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.miteksystems.misnap.camera.frameproducers.CameraWrapper$openCameraInstanceSync$1
                                @Override // androidx.lifecycle.DefaultLifecycleObserver
                                public final void onDestroy(LifecycleOwner lifecycleOwner2) {
                                    LifecycleOwner.this.getLifecycle().removeObserver(this);
                                    Object systemService = context.getSystemService("display");
                                    systemService.getClass();
                                    CameraWrapper cameraWrapper2 = cameraWrapper;
                                    ((DisplayManager) systemService).unregisterDisplayListener(cameraWrapper2.s);
                                    cameraWrapper2.t.removeCallbacksAndMessages(cameraWrapper2.u);
                                }
                            });
                            cameraWrapper.h = cameraSelectorFilter;
                            try {
                                ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                                ChainingListenableFuture switchViewKt = SwitchViewKt.getInstance(context);
                                switchViewKt.addListener(new Radiography$$ExternalSyntheticLambda0(cameraWrapper, switchViewKt, cameraSelectorFilter, lifecycleOwner, context, 5), cameraWrapper.d);
                            } catch (Exception e) {
                                Log.e("CameraWrapper", "Camera Provider Future Listener rejected by the executor", e);
                            }
                            return Unit.INSTANCE;
                        }
                        cameraWrapper.r.addUxpEvent("CIUCE", new String[0]);
                        event = FrameProducer.Event.InitializationError.InsufficientCamera.INSTANCE;
                    }
                    cameraWrapper.a(event);
                    return Unit.INSTANCE;
                }
                Log.e("CameraWrapper", "Context or LifecycleOwner not available");
                event = FrameProducer.Event.InitializationError.CameraInitialization.INSTANCE;
                cameraWrapper.a(event);
                return Unit.INSTANCE;
            default:
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) ((Lazy) obj2).getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? ((InquiryFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }
}
