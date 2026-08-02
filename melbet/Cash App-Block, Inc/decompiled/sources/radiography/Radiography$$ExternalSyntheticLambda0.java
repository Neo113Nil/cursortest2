package radiography;

import android.content.Context;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.util.DBUtil;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileOrchestrator;
import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator;
import com.datadog.android.privacy.TrackingConsent;
import com.fillr.browsersdk.Fillr;
import com.fillr.infopages.AboutFragment;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.common.util.concurrent.ExecutionSequencer$RunningState;
import com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import com.google.mlkit.common.sdkinternal.zzn;
import com.miteksystems.misnap.camera.a.e;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.squareup.util.Strings;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class Radiography$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ Radiography$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MutableSnapshot takeNestedMutableSnapshot;
        Runnable anonymousClass3;
        FrameProducer.Event event;
        Camera2CameraInfo camera2CameraInfo;
        CameraSelectorFilter cameraSelectorFilter;
        FrameProducer.Event event2;
        MiSnapCameraInfo miSnapCameraInfo = null;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = (StringBuilder) this.f$0;
                ScannableView scannableView = (ScannableView) this.f$1;
                List list = (List) this.f$2;
                ViewFilters$$ExternalSyntheticLambda0 viewFilters$$ExternalSyntheticLambda0 = (ViewFilters$$ExternalSyntheticLambda0) this.f$3;
                CountDownLatch countDownLatch = (CountDownLatch) this.f$4;
                ViewFilters.scanFromLooperThread(sb, scannableView, list, viewFilters$$ExternalSyntheticLambda0);
                countDownLatch.countDown();
                return;
            case 1:
                TextStyle textStyle = (TextStyle) this.f$0;
                LayoutDirection layoutDirection = (LayoutDirection) this.f$1;
                String str = (String) this.f$2;
                Density density = (Density) this.f$3;
                FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) this.f$4;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                    MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
                    if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        Snapshot makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                        try {
                            TextStyle resolveDefaults = BundleKt.resolveDefaults(textStyle, layoutDirection);
                            EmptyList emptyList = EmptyList.INSTANCE;
                            AndroidParagraphIntrinsics androidParagraphIntrinsics = new AndroidParagraphIntrinsics(str, resolveDefaults, emptyList, emptyList, fontFamilyResolverImpl, density);
                            androidParagraphIntrinsics.getMaxIntrinsicWidth();
                            androidParagraphIntrinsics.getMinIntrinsicWidth();
                            takeNestedMutableSnapshot.apply().check();
                            Trace.endSection();
                            return;
                        } finally {
                            Snapshot.restoreCurrent(makeCurrent);
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 2:
                DefaultInAppMessageFullViewFactory.createInAppMessageView$lambda$4((View) this.f$0, (InAppMessageFullView) this.f$1, (InAppMessageFull) this.f$2, (Context) this.f$3, (View) this.f$4);
                return;
            case 3:
                ConsentAwareFileOrchestrator consentAwareFileOrchestrator = (ConsentAwareFileOrchestrator) this.f$0;
                TrackingConsent trackingConsent = (TrackingConsent) this.f$1;
                FileOrchestrator fileOrchestrator = (FileOrchestrator) this.f$2;
                TrackingConsent trackingConsent2 = (TrackingConsent) this.f$3;
                FileOrchestrator fileOrchestrator2 = (FileOrchestrator) this.f$4;
                SVG svg = consentAwareFileOrchestrator.dataMigrator;
                fileOrchestrator.getClass();
                trackingConsent2.getClass();
                fileOrchestrator2.getClass();
                Strings strings = (Strings) svg.idToElementMap;
                InternalLogger internalLogger = (InternalLogger) svg.cssRules;
                FileMover fileMover = (FileMover) svg.rootElement;
                TrackingConsent trackingConsent3 = TrackingConsent.GRANTED;
                TrackingConsent trackingConsent4 = TrackingConsent.NOT_GRANTED;
                Pair pair = new Pair(trackingConsent, trackingConsent2);
                TrackingConsent trackingConsent5 = TrackingConsent.PENDING;
                if (pair.equals(new Pair(null, trackingConsent5)) ? true : pair.equals(new Pair(null, trackingConsent3)) ? true : pair.equals(new Pair(null, trackingConsent4)) ? true : pair.equals(new Pair(trackingConsent5, trackingConsent4))) {
                    anonymousClass3 = new ProfileAdapter.AnonymousClass8(fileOrchestrator.getRootDir(), fileMover, internalLogger, strings);
                } else {
                    if (pair.equals(new Pair(trackingConsent3, trackingConsent5)) ? true : pair.equals(new Pair(trackingConsent4, trackingConsent5))) {
                        anonymousClass3 = new ProfileAdapter.AnonymousClass8(fileOrchestrator2.getRootDir(), fileMover, internalLogger, strings);
                    } else if (pair.equals(new Pair(trackingConsent5, trackingConsent3))) {
                        anonymousClass3 = new zzn(fileOrchestrator.getRootDir(), fileOrchestrator2.getRootDir(), (FileMover) svg.rootElement, (InternalLogger) svg.cssRules, (Strings) svg.idToElementMap);
                    } else {
                        if (pair.equals(new Pair(trackingConsent5, trackingConsent5)) ? true : pair.equals(new Pair(trackingConsent3, trackingConsent3)) ? true : pair.equals(new Pair(trackingConsent3, trackingConsent4)) ? true : pair.equals(new Pair(trackingConsent4, trackingConsent4)) ? true : pair.equals(new Pair(trackingConsent4, trackingConsent3))) {
                            anonymousClass3 = new Fillr.AnonymousClass3(i);
                        } else {
                            DBUtil.log$default((InternalLogger) svg.cssRules, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new ViewRegistryKt$buildView$1$2$1$1(8, trackingConsent, trackingConsent2), null, 56);
                            anonymousClass3 = new Fillr.AnonymousClass3(i);
                        }
                    }
                }
                anonymousClass3.run();
                consentAwareFileOrchestrator.delegateOrchestrator = fileOrchestrator2;
                return;
            case 4:
                TrustedListenableFutureTask trustedListenableFutureTask = (TrustedListenableFutureTask) this.f$0;
                SettableFuture settableFuture = (SettableFuture) this.f$1;
                ListenableFuture listenableFuture = (ListenableFuture) this.f$2;
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f$3;
                ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = (ExecutionSequencer$TaskNonReentrantExecutor) this.f$4;
                if (trustedListenableFutureTask.isDone()) {
                    settableFuture.setFuture(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i2 = ExecutionSequencer$TaskNonReentrantExecutor.$r8$clinit;
                        if (executionSequencer$TaskNonReentrantExecutor.compareAndSet(ExecutionSequencer$RunningState.NOT_RUN, ExecutionSequencer$RunningState.CANCELLED)) {
                            trustedListenableFutureTask.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                CameraWrapper cameraWrapper = (CameraWrapper) this.f$0;
                ChainingListenableFuture chainingListenableFuture = (ChainingListenableFuture) this.f$1;
                CameraSelectorFilter cameraSelectorFilter2 = (CameraSelectorFilter) this.f$2;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f$3;
                Context context = (Context) this.f$4;
                MiSnapSettings.Camera camera = cameraWrapper.a;
                try {
                    cameraWrapper.w = (ProcessCameraProvider) chainingListenableFuture.get();
                    CameraInfo a = cameraWrapper.a(cameraSelectorFilter2, ((ProcessCameraProvider) chainingListenableFuture.get()).getAvailableCameraInfos());
                    CameraSelector cameraSelector = a != null ? a.getCameraSelector() : null;
                    cameraWrapper.x = cameraSelector;
                    if (cameraSelector == null) {
                        event2 = FrameProducer.Event.InitializationError.InsufficientCamera.INSTANCE;
                    } else {
                        cameraWrapper.a(lifecycleOwner);
                        Camera2CameraInfo camera2CameraInfo2 = cameraWrapper.I;
                        if (camera2CameraInfo2 != null && cameraWrapper.J != null) {
                            MiSnapCameraInfo cameraInfo = cameraSelectorFilter2.getCameraInfo(camera2CameraInfo2);
                            if (cameraInfo == null) {
                                event2 = FrameProducer.Event.InitializationError.InsufficientCamera.INSTANCE;
                            } else {
                                Boolean bool = camera.advanced.a;
                                Boolean bool2 = Boolean.TRUE;
                                if (!Intrinsics.areEqual(bool, bool2) || cameraInfo.a) {
                                    cameraWrapper.i = new e(cameraInfo, WindowCompat$Api35Impl.getRotationFromNaturalOrientation(context), Intrinsics.areEqual(camera.advanced.a, bool2));
                                    Integer num = cameraWrapper.v;
                                    if (num != null) {
                                        new CameraWrapper.i(0, 0, CameraWrapper.class, cameraWrapper, "customFocusMode", "getCustomFocusMode()Ljava/lang/Integer;").set(Integer.valueOf(num.intValue()));
                                    }
                                    MutableLiveData mutableLiveData = cameraWrapper.O;
                                    Boolean bool3 = Boolean.FALSE;
                                    mutableLiveData.getClass();
                                    if (Looper.getMainLooper().isCurrentThread()) {
                                        mutableLiveData.setValue(bool3);
                                    } else {
                                        mutableLiveData.postValue(bool3);
                                    }
                                } else {
                                    event2 = FrameProducer.Event.InitializationError.InsufficientCamera.INSTANCE;
                                }
                            }
                        }
                        if (cameraWrapper.isInitialized()) {
                            LifecycleCamera lifecycleCamera = cameraWrapper.y;
                            lifecycleCamera.getClass();
                            LiveData torchState = ((AdapterCameraInfo) lifecycleCamera.getCameraInfo()).mCameraInfo.getTorchState();
                            torchState.getClass();
                            torchState.observe(lifecycleOwner, new AboutFragment.AnonymousClass1(cameraWrapper, i));
                            if (cameraWrapper.isInitialized() && (camera2CameraInfo = cameraWrapper.I) != null && (cameraSelectorFilter = cameraWrapper.h) != null) {
                                miSnapCameraInfo = cameraSelectorFilter.getCameraInfo(camera2CameraInfo);
                            }
                            miSnapCameraInfo.getClass();
                            if (cameraWrapper.r.isCurrentSession()) {
                                MibiData.c = miSnapCameraInfo;
                            }
                            MutableLiveData mutableLiveData2 = cameraWrapper.K;
                            FrameProducer.Event.CameraInitialized cameraInitialized = new FrameProducer.Event.CameraInitialized(miSnapCameraInfo);
                            mutableLiveData2.getClass();
                            if (Looper.getMainLooper().isCurrentThread()) {
                                mutableLiveData2.setValue(cameraInitialized);
                                return;
                            } else {
                                mutableLiveData2.postValue(cameraInitialized);
                                return;
                            }
                        }
                        event2 = FrameProducer.Event.InitializationError.CameraInitialization.INSTANCE;
                    }
                    cameraWrapper.a(event2);
                    cameraWrapper.release();
                    return;
                } catch (IllegalArgumentException e) {
                    Log.e("CameraWrapper", "Could not resolve to a valid camera", e);
                    event = FrameProducer.Event.InitializationError.InsufficientCamera.INSTANCE;
                    cameraWrapper.a(event);
                    return;
                } catch (Exception e2) {
                    Log.e("CameraWrapper", "Could not bind the camera selector", e2);
                    event = FrameProducer.Event.InitializationError.CameraInitialization.INSTANCE;
                    cameraWrapper.a(event);
                    return;
                }
        }
    }
}
