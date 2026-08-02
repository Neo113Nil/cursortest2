package com.stripe.hcaptcha;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.icu.text.MessageFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.CameraInternalAdapter;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe$CameraInteropConfig;
import androidx.camera.camera2.pipe.compat.AndroidCameraState;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl;
import androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor;
import androidx.camera.camera2.pipe.compat.Camera2MetadataCache;
import androidx.camera.camera2.pipe.compat.Camera2MetadataProvider;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$1;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.AdapterCameraInternal;
import androidx.camera.core.impl.AutoValue_Identifier;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda3;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.primitives.LocalBrandBanner;
import app.cash.trifle.KeyHandle$keyPair$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.memory.RealStrongMemoryCache;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.material.R$styleable;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.resources.MaterialAttributes;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphPresenter$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.graph.BitcoinGraphWidgetPresenter$models$3$1;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.graph.BitcoinHomeGraphWidgetViewModel;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileUploadService$Result;
import com.squareup.cash.fileupload.api.FileValidator$Result;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.p2pblocking.presenters.BlockListController$WhenMappings;
import com.squareup.cash.p2pblocking.presenters.BlockListController$fetchData$1;
import com.squareup.cash.p2pblocking.presenters.BlockListController$searchCustomers$1;
import com.squareup.cash.p2pblocking.presenters.P2PListController;
import com.squareup.cash.p2pblocking.presenters.SearchResultsData;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PSearchData;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListButtonValues;
import com.squareup.cash.p2pblocking.viewmodels.P2PListEmptyState;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter$Factory$Impl;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.backend.api.ScreenshotService$FileState;
import com.squareup.cash.support.backend.api.ScreenshotService$ServiceState;
import com.squareup.cash.support.backend.real.RealScreenshotService$UploadedFile;
import com.squareup.cash.support.backend.real.RealScreenshotService$uploadAllFiles$1;
import com.squareup.cash.support.backend.real.RealScreenshotService$uploadFile$1;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.blockly.api.BlockSearchRequest;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse$Results$BlockSearchResults;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse$Results$BlockSuggestions;
import com.squareup.protos.cash.blockly.api.BlocklistDetails;
import com.squareup.protos.cash.blockly.api.BlocklyCustomer;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersRequest;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cashsessionrecorder.app.v1.ScreenshotBundleService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt$produceState$1$1;
import com.stripe.hcaptcha.task.OnFailureListener;
import com.stripe.hcaptcha.task.OnSuccessListener;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes4.dex */
public final class HCaptcha implements NdkCrashHandler, BitcoinHomeWidgetPresenter, P2PListController {
    public Object captchaVerifier;
    public Object exception;
    public Object handler;
    public Object internalConfig;
    public Object onFailureListeners;
    public Object onOpenListeners;
    public Object onSuccessListeners;
    public Object result;

    public HCaptcha(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveTypedValueOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, R$styleable.MaterialCalendar);
        this.result = AdapterHelper.create(context, obtainStyledAttributes.getResourceId(4, 0));
        this.internalConfig = AdapterHelper.create(context, obtainStyledAttributes.getResourceId(2, 0));
        this.exception = AdapterHelper.create(context, obtainStyledAttributes.getResourceId(3, 0));
        this.onSuccessListeners = AdapterHelper.create(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateList = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 7);
        this.onFailureListeners = AdapterHelper.create(context, obtainStyledAttributes.getResourceId(9, 0));
        this.onOpenListeners = AdapterHelper.create(context, obtainStyledAttributes.getResourceId(8, 0));
        this.handler = AdapterHelper.create(context, obtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.captchaVerifier = paint;
        paint.setColor(colorStateList.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public static final CameraConfigs.DefaultCameraConfig access$getCameraConfig(HCaptcha hCaptcha, CameraSelector cameraSelector) {
        Iterator it = cameraSelector.mCameraFilterSet.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            AutoValue_Identifier autoValue_Identifier = CameraFilter.DEFAULT_ID;
            if (!Intrinsics.areEqual(autoValue_Identifier, autoValue_Identifier)) {
                synchronized (ExtendedCameraConfigProviderStore.LOCK) {
                }
                ((Context) hCaptcha.handler).getClass();
            }
        }
        return CameraConfigs.DEFAULT_CAMERA_CONFIG;
    }

    public static final void access$setCameraOperatingMode(HCaptcha hCaptcha, int i) {
        CameraRepository cameraRepository;
        CameraX cameraX = (CameraX) hCaptcha.onFailureListeners;
        if (cameraX != null) {
            cameraX.getClass();
            StuckPlayerDetector stuckPlayerDetector = cameraX.mCameraFactory;
            if (stuckPlayerDetector == null) {
                a$$ExternalSyntheticBUOutline0.m$1("CameraX not initialized yet.");
                return;
            }
            CameraCoordinatorAdapter cameraCoordinatorAdapter = (CameraCoordinatorAdapter) stuckPlayerDetector.period;
            synchronized (cameraCoordinatorAdapter.lock) {
                cameraCoordinatorAdapter.concurrentMode = i;
                cameraRepository = cameraCoordinatorAdapter.cameraRepository;
            }
            if (cameraRepository == null) {
                return;
            }
            boolean z = i == 2;
            cameraCoordinatorAdapter.concurrentModeOn = z;
            if (!z) {
                cameraCoordinatorAdapter.activeConcurrentCameraInfosList = EmptyList.INSTANCE;
            }
            Iterator it = cameraRepository.getCameras().iterator();
            it.getClass();
            while (it.hasNext()) {
                CameraInternal cameraInternal = (CameraInternal) it.next();
                CameraInternalAdapter cameraInternalAdapter = cameraInternal instanceof CameraInternalAdapter ? (CameraInternalAdapter) cameraInternal : null;
                if (cameraInternalAdapter != null) {
                    if (i == 1) {
                        UseCaseManager useCaseManager = cameraInternalAdapter.useCaseManager;
                        synchronized (useCaseManager.lock) {
                            useCaseManager.shouldCreateCameraGraphImmediately = true;
                        }
                    } else if (i != 2) {
                        continue;
                    } else {
                        UseCaseManager useCaseManager2 = cameraInternalAdapter.useCaseManager;
                        synchronized (useCaseManager2.lock) {
                            useCaseManager2.shouldCreateCameraGraphImmediately = false;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b6 -> B:10:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$uploadAllFiles(HCaptcha hCaptcha, List list, ContinuationImpl continuationImpl) {
        RealScreenshotService$uploadAllFiles$1 realScreenshotService$uploadAllFiles$1;
        int i;
        Iterator it;
        List list2;
        if (continuationImpl instanceof RealScreenshotService$uploadAllFiles$1) {
            realScreenshotService$uploadAllFiles$1 = (RealScreenshotService$uploadAllFiles$1) continuationImpl;
            int i2 = realScreenshotService$uploadAllFiles$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realScreenshotService$uploadAllFiles$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realScreenshotService$uploadAllFiles$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realScreenshotService$uploadAllFiles$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) hCaptcha.captchaVerifier;
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new ScreenshotService$FileState.StandBy((String) it2.next()));
                    }
                    ScreenshotService$ServiceState.Uploading uploading = new ScreenshotService$ServiceState.Uploading(arrayList, 0, list.size());
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, uploading);
                    ArrayList arrayList2 = new ArrayList();
                    it = list.iterator();
                    list2 = arrayList2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = realScreenshotService$uploadAllFiles$1.L$3;
                    it = realScreenshotService$uploadAllFiles$1.L$2;
                    list2 = realScreenshotService$uploadAllFiles$1.L$1;
                    List list4 = realScreenshotService$uploadAllFiles$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    RealScreenshotService$UploadedFile realScreenshotService$UploadedFile = (RealScreenshotService$UploadedFile) obj;
                    if (realScreenshotService$UploadedFile != null) {
                        return EmptyList.INSTANCE;
                    }
                    list2.add(realScreenshotService$UploadedFile);
                    hCaptcha.notifyFileUploading(new ScreenshotService$FileState.Uploaded(str), list2.size(), list4.size());
                    list = list4;
                    if (it.hasNext()) {
                        return list2;
                    }
                    String str2 = (String) it.next();
                    hCaptcha.notifyFileUploading(new ScreenshotService$FileState.Uploading(str2), list2.size(), list.size());
                    realScreenshotService$uploadAllFiles$1.L$0 = list;
                    realScreenshotService$uploadAllFiles$1.L$1 = list2;
                    realScreenshotService$uploadAllFiles$1.L$2 = it;
                    realScreenshotService$uploadAllFiles$1.L$3 = str2;
                    realScreenshotService$uploadAllFiles$1.label = 1;
                    Object uploadFile = hCaptcha.uploadFile(str2, realScreenshotService$uploadAllFiles$1);
                    if (uploadFile == obj2) {
                        return obj2;
                    }
                    list4 = list;
                    str = str2;
                    obj = uploadFile;
                    RealScreenshotService$UploadedFile realScreenshotService$UploadedFile2 = (RealScreenshotService$UploadedFile) obj;
                    if (realScreenshotService$UploadedFile2 != null) {
                    }
                }
            }
        }
        realScreenshotService$uploadAllFiles$1 = new RealScreenshotService$uploadAllFiles$1(hCaptcha, continuationImpl);
        Object obj3 = realScreenshotService$uploadAllFiles$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realScreenshotService$uploadAllFiles$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:6:0x0041, B:8:0x0054, B:10:0x0060, B:12:0x0064, B:17:0x0072, B:18:0x0075, B:75:0x007b), top: B:5:0x0041, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r18v1, types: [androidx.camera.core.impl.AdapterCameraInfo, androidx.camera.core.impl.CameraInternal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LifecycleCamera bindToLifecycleInternal$default(HCaptcha hCaptcha, LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, LegacySessionConfig legacySessionConfig) {
        LifecycleCamera lifecycleCamera;
        Collection unmodifiableCollection;
        Object obj;
        boolean contains;
        boolean z;
        AdapterCameraInternal adapterCameraInternal;
        UseCaseGroup useCaseGroup = UseCaseGroup.DEFAULT;
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:bindToLifecycle-internal"));
        try {
            Threads.checkMainThread();
            CameraX cameraX = (CameraX) hCaptcha.onFailureListeners;
            cameraX.getClass();
            CameraInternal select = cameraSelector.select(cameraX.mCameraRepository.getCameras());
            select.getClass();
            select.setPrimary(true);
            AdapterCameraInfo cameraInfo = hCaptcha.getCameraInfo(cameraSelector);
            Object obj2 = null;
            CameraIdentifier fromAdapterInfos = Aliases.fromAdapterInfos(cameraInfo, null);
            LifecycleCameraRepository lifecycleCameraRepository = (LifecycleCameraRepository) hCaptcha.onOpenListeners;
            lifecycleCameraRepository.getClass();
            synchronized (lifecycleCameraRepository.mLock) {
                try {
                    lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.mCameraMap.get(new AutoValue_LifecycleCameraRepository_Key(System.identityHashCode(lifecycleOwner), fromAdapterInfos));
                    if (lifecycleCamera != null) {
                        CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.mCameraUseCaseAdapter;
                        if (!cameraUseCaseAdapter.mCameraInternal.mCameraInternal.isRemoved() && ((adapterCameraInternal = cameraUseCaseAdapter.mSecondaryCameraInternal) == null || !adapterCameraInternal.mCameraInternal.isRemoved())) {
                            z = false;
                            if (z) {
                                lifecycleCameraRepository.unregisterCamera(lifecycleCamera);
                                lifecycleCamera = null;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                } finally {
                }
            }
            LifecycleCameraRepository lifecycleCameraRepository2 = (LifecycleCameraRepository) hCaptcha.onOpenListeners;
            lifecycleCameraRepository2.getClass();
            synchronized (lifecycleCameraRepository2.mLock) {
                unmodifiableCollection = Collections.unmodifiableCollection(lifecycleCameraRepository2.mCameraMap.values());
            }
            for (UseCase useCase : (List) legacySessionConfig.useCases) {
                for (Object obj3 : unmodifiableCollection) {
                    obj3.getClass();
                    LifecycleCamera lifecycleCamera2 = (LifecycleCamera) obj3;
                    synchronized (lifecycleCamera2.mLock) {
                        obj = obj2;
                        contains = ((ArrayList) lifecycleCamera2.mCameraUseCaseAdapter.getUseCases()).contains(useCase);
                    }
                    if (contains && !Intrinsics.areEqual(lifecycleCamera2.getLifecycleOwner(), lifecycleOwner)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1)));
                    }
                    obj2 = obj;
                }
            }
            ?? r18 = obj2;
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository3 = (LifecycleCameraRepository) hCaptcha.onOpenListeners;
                lifecycleCameraRepository3.getClass();
                CameraX cameraX2 = (CameraX) hCaptcha.onFailureListeners;
                cameraX2.getClass();
                n nVar = cameraX2.mCameraUseCaseAdapterProvider;
                if (nVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                CameraUseCaseAdapter cameraUseCaseAdapter2 = new CameraUseCaseAdapter(select, r18, cameraInfo, r18, useCaseGroup, useCaseGroup, (CameraCoordinatorAdapter) nVar.b, (Recorder.AnonymousClass1) nVar.d, (UseCaseConfigFactory) nVar.c);
                CameraX cameraX3 = (CameraX) hCaptcha.onFailureListeners;
                cameraX3.getClass();
                lifecycleCamera = lifecycleCameraRepository3.createLifecycleCamera(lifecycleOwner, cameraUseCaseAdapter2, (RotationProvider) cameraX3.mRotationProvider.getValue());
            }
            if (!((List) legacySessionConfig.useCases).isEmpty()) {
                LifecycleCameraRepository lifecycleCameraRepository4 = (LifecycleCameraRepository) hCaptcha.onOpenListeners;
                lifecycleCameraRepository4.getClass();
                CameraX cameraX4 = (CameraX) hCaptcha.onFailureListeners;
                cameraX4.getClass();
                StuckPlayerDetector stuckPlayerDetector = cameraX4.mCameraFactory;
                if (stuckPlayerDetector == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                lifecycleCameraRepository4.bindToLifecycleCamera(lifecycleCamera, legacySessionConfig, (CameraCoordinatorAdapter) stuckPlayerDetector.period);
                ((HashSet) hCaptcha.captchaVerifier).add(new AutoValue_LifecycleCameraRepository_Key(System.identityHashCode(lifecycleOwner), fromAdapterInfos));
            }
            return lifecycleCamera;
        } finally {
            Trace.endSection();
        }
    }

    public static ArrayList update(List list, ScreenshotService$FileState screenshotService$FileState) {
        List<ScreenshotService$FileState> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (ScreenshotService$FileState screenshotService$FileState2 : list2) {
            if (Intrinsics.areEqual(screenshotService$FileState2.getFileUri(), screenshotService$FileState.getFileUri())) {
                screenshotService$FileState2 = screenshotService$FileState;
            }
            arrayList.add(screenshotService$FileState2);
        }
        return arrayList;
    }

    public void IgnoreFirstLaunchedEffect(Object obj, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1988978107);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(function2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StateFlowsComposeKt$produceState$1$1(function2, mutableState, null, 5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, obj, (Function2) rememberedValue2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(this, obj, function2, i, 27);
        }
    }

    public void clearCrashLog() {
        File file = (File) this.handler;
        InternalLogger internalLogger = (InternalLogger) this.onSuccessListeners;
        if (zzhk.existsSafe(file, internalLogger)) {
            try {
                File[] listFilesSafe = zzhk.listFilesSafe(file, internalLogger);
                if (listFilesSafe != null) {
                    for (File file2 : listFilesSafe) {
                        FilesKt__UtilsKt.deleteRecursively(file2);
                    }
                }
            } catch (Throwable th) {
                DBUtil.log$default((InternalLogger) this.onSuccessListeners, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new KeyHandle$keyPair$2(this, 20), th, 48);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchData(String str, BlockingContext blockingContext, ContinuationImpl continuationImpl) {
        BlockListController$fetchData$1 blockListController$fetchData$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof BlockListController$fetchData$1) {
            blockListController$fetchData$1 = (BlockListController$fetchData$1) continuationImpl;
            int i2 = blockListController$fetchData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                blockListController$fetchData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = blockListController$fetchData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = blockListController$fetchData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlocklyService blocklyService = (BlocklyService) this.result;
                    GetBlockedCustomersRequest getBlockedCustomersRequest = new GetBlockedCustomersRequest(str, blockingContext);
                    blockListController$fetchData$1.label = 1;
                    obj = blocklyService.getBlockedCustomers(getBlockedCustomersRequest, blockListController$fetchData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) this.onOpenListeners;
                    GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) ((ApiResult.Success) apiResult).response;
                    getBlockedCustomersResponse.getClass();
                    List list = getBlockedCustomersResponse.blocked_customers;
                    BlocklistDetails blocklistDetails = getBlockedCustomersResponse.blocklist_details;
                    P2PListData.BlockListData blockListData = new P2PListData.BlockListData(list, blocklistDetails != null ? blocklistDetails.support_page_client_route_url : null);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, blockListData);
                }
                return Unit.INSTANCE;
            }
        }
        blockListController$fetchData$1 = new BlockListController$fetchData$1(this, continuationImpl);
        Object obj2 = blockListController$fetchData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blockListController$fetchData$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public P2PListButtonValues getButtonValues(boolean z, boolean z2, boolean z3, Integer num) {
        P2PListButtonValues p2PListButtonValues = new P2PListButtonValues(((AndroidStringManager) this.exception).get(R.string.block_list_search_to_block_button_title), false, P2PListViewEvent.TapBlocklist.INSTANCE, true);
        if (z) {
            return p2PListButtonValues;
        }
        return null;
    }

    public AdapterCameraInfo getCameraInfo(CameraSelector cameraSelector) {
        Object obj;
        cameraSelector.getClass();
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:getCameraInfo"));
        try {
            CameraX cameraX = (CameraX) this.onFailureListeners;
            cameraX.getClass();
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.mCameraRepository.getCameras()).getCameraInfoInternal();
            cameraInfoInternal.getClass();
            CameraConfigs.DefaultCameraConfig access$getCameraConfig = access$getCameraConfig(this, cameraSelector);
            String cameraId = cameraInfoInternal.getCameraId();
            cameraId.getClass();
            CameraIdentifier create = Aliases.create(cameraId, null, access$getCameraConfig.mIdentifier);
            synchronized (this.result) {
                obj = ((HashMap) this.internalConfig).get(create);
                if (obj == null) {
                    obj = new AdapterCameraInfo(cameraInfoInternal, access$getCameraConfig);
                    ((HashMap) this.internalConfig).put(create, obj);
                }
            }
            return (AdapterCameraInfo) obj;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public P2PListEmptyState getEmptyState(String str, boolean z, FamilyProfile familyProfile, BlockingContext blockingContext) {
        String str2;
        familyProfile.getClass();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.exception;
        Resources resources = androidStringManager.resources;
        String str3 = androidStringManager.get(R.string.block_list_empty_state_title);
        if ((blockingContext == null ? -1 : BlockListController$WhenMappings.$EnumSwitchMapping$0[blockingContext.ordinal()]) != 1) {
            str2 = z ? androidStringManager.get(R.string.block_list_empty_state_subtitle_shown_to_self_teen) : androidStringManager.get(R.string.block_list_empty_state_subtitle_shown_to_self_non_teen);
        } else if (familyProfile instanceof FamilyProfile.ManagedAccount) {
            String str4 = ((FamilyProfile.ManagedAccount) familyProfile).firstName;
            if (str4 != null) {
                resources.getClass();
                str2 = new MessageFormat(resources.getString(R.string.block_list_empty_state_subtitle_shown_to_managed_account)).format(new Object[]{str4});
                str2.getClass();
            } else {
                str2 = androidStringManager.get(R.string.block_list_empty_state_subtitle_shown_to_self_non_teen);
            }
        } else if (str != null) {
            resources.getClass();
            str2 = new MessageFormat(resources.getString(R.string.block_list_empty_state_subtitle_shown_to_sponsor)).format(new Object[]{str});
            str2.getClass();
        } else {
            str2 = "";
        }
        return new P2PListEmptyState(str3, str2);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getFooter(String str, boolean z, boolean z2, Integer num) {
        return null;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public StateFlowImpl getListData() {
        return (StateFlowImpl) this.handler;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public StateFlowImpl getSearchData() {
        return (StateFlowImpl) this.captchaVerifier;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getSearchHeaderTitle(boolean z) {
        String str = ((AndroidStringManager) this.exception).get(R.string.select_customer_to_block_search_section_title);
        if (z) {
            return null;
        }
        return str;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getSearchPlaceholder() {
        return ((AndroidStringManager) this.exception).get(R.string.select_customer_to_block_search_bar_hint);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getSearchTitle(boolean z) {
        String str = ((AndroidStringManager) this.exception).get(R.string.select_customer_to_search_section_title_blocklist);
        if (z) {
            return str;
        }
        return null;
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public String getToolbarTitle() {
        return ((AndroidStringManager) this.exception).get(R.string.block_list_screen_title);
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void handleNdkCrash(DatadogCore datadogCore) {
        zzho.executeSafe((BackPressureExecutorService) this.result, "NDK crash report ", (InternalLogger) this.onSuccessListeners, new q4$$ExternalSyntheticLambda0(19, this, datadogCore));
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public Object handleRowTap(String str, P2PListRowTapButtonEvent p2PListRowTapButtonEvent, MutableState mutableState, Continuation continuation) {
        String str2;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.exception;
        Resources resources = androidStringManager.resources;
        if (p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapBlockOrUnblock) {
            P2PListRowTapButtonEvent.TapBlockOrUnblock tapBlockOrUnblock = (P2PListRowTapButtonEvent.TapBlockOrUnblock) p2PListRowTapButtonEvent;
            ((BetterNavigator.ScreenNavigator) this.onSuccessListeners).goTo(new HistoryScreens.ReportAbuse(tapBlockOrUnblock.toBlock, "", tapBlockOrUnblock.customerToken, "", new RedactedString(tapBlockOrUnblock.customerName), tapBlockOrUnblock.url, (String) null, (String) null, (Screen) this.onFailureListeners, 192));
        } else if (p2PListRowTapButtonEvent instanceof P2PListRowTapButtonEvent.TapDisabledUnblock) {
            P2PListRowTapButtonEvent.TapDisabledUnblock tapDisabledUnblock = (P2PListRowTapButtonEvent.TapDisabledUnblock) p2PListRowTapButtonEvent;
            String str3 = tapDisabledUnblock.blockedCustomerFullName;
            str3.getClass();
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.block_list_unable_to_unblock_dialog_title)).format(new Object[]{str3});
            format2.getClass();
            String str4 = tapDisabledUnblock.blockerNameInDialogMessageStart;
            if (str4 != null) {
                String firstName = LayoutUpdate.firstName(str3);
                firstName.getClass();
                resources.getClass();
                str2 = new MessageFormat(resources.getString(R.string.block_list_unable_to_unblock_dialog_message)).format(new Object[]{str4, firstName});
                str2.getClass();
            } else {
                str2 = "";
            }
            mutableState.setValue(new P2PFailureDialogModel(format2, str2, androidStringManager.get(R.string.block_list_unable_to_unblock_dialog_dismiss_button)));
        }
        return Unit.INSTANCE;
    }

    public void initInternal(CameraX cameraX, Context context) {
        CameraPresenceProvider cameraPresenceProvider;
        synchronized (this.result) {
            this.onFailureListeners = cameraX;
            this.handler = context;
            if (cameraX != null && (cameraPresenceProvider = cameraX.mCameraPresenceProvider) != null) {
                HandlerScheduledExecutorService mainThreadExecutor = zzabp.mainThreadExecutor();
                mainThreadExecutor.getClass();
                cameraPresenceProvider.publicApiListeners.add(new CameraPresenceProvider.ListenerWrapper(this, mainThreadExecutor));
                mainThreadExecutor.execute(new CameraPresenceProvider$$ExternalSyntheticLambda3(cameraPresenceProvider, this));
            }
        }
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        int i2;
        String str;
        Pair pair;
        gapComposer.startReplaceGroup(-536019879);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 25);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Flow flow2 = (Flow) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(HistoricalRange.DAY);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = FlowKt.MutableStateFlow(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState4 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            Object cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealJurisdictionConfigManager) this.handler).select(), 10);
            gapComposer.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
            rememberedValue7 = cardModelView$cardHeat$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        int i3 = 26;
        if (changedInstance || rememberedValue8 == obj) {
            rememberedValue8 = new MLKitTitleGenerator$prepareModel$1(this, mutableState, continuation, i3);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue8);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj) {
            rememberedValue9 = ((RealBitcoinActivityProvider) this.onOpenListeners).hasBitcoinActivity();
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Flow flow3 = (Flow) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj) {
            Object dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1(flow2, i3), 17);
            gapComposer.updateRememberedValue(dataStoreImpl$data$1$invokeSuspend$$inlined$map$1);
            rememberedValue10 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
        }
        Flow flow4 = (Flow) rememberedValue10;
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj) {
            rememberedValue11 = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow2, 27);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Flow flow5 = (Flow) rememberedValue11;
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == obj) {
            rememberedValue12 = ViewShowRenderingKt.displayUnitProto((RealBitcoinProfileRepo) this.onSuccessListeners);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue12, BitcoinDisplayUnits.BITCOIN, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow5, new AndroidSecureStore$read$2(flow5, (Continuation) null, mutableState, collectAsState, this, 12));
        Object rememberedValue13 = gapComposer.rememberedValue();
        int i4 = 2;
        if (rememberedValue13 == obj) {
            Object flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i4, continuation, 7), new BitcoinDepositsPresenter$special$$inlined$filter$1(flow4, 28)), new TabContentPresenter$models$4$1$1$1(mutableState2, continuation, 8), 3);
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue13 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        Object obj2 = (Flow) rememberedValue13;
        HistoricalRange historicalRange = (HistoricalRange) mutableState2.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue14 = gapComposer.rememberedValue();
        int i5 = 0;
        if (changedInstance2 || rememberedValue14 == obj) {
            rememberedValue14 = new BitcoinGraphWidgetPresenter$models$3$1(this, mutableState2, null, i5);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        int i6 = i & 896;
        IgnoreFirstLaunchedEffect(historicalRange, (Function2) rememberedValue14, gapComposer, i6);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (rememberedValue15 == obj) {
            i2 = 0;
            Object flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1(flow4, 29), new TabContentPresenter$models$4$1$1$1(mutableState3, (Continuation) null, 9), 3);
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$12);
            rememberedValue15 = flowKt__MergeKt$flatMapConcat$$inlined$map$12;
        } else {
            i2 = 0;
        }
        Object obj3 = (Flow) rememberedValue15;
        InvestingGraphViewEvent.ScrubPoint scrubPoint = (InvestingGraphViewEvent.ScrubPoint) mutableState3.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue16 = gapComposer.rememberedValue();
        int i7 = 1;
        if (changedInstance3 || rememberedValue16 == obj) {
            rememberedValue16 = new BitcoinGraphWidgetPresenter$models$3$1(this, mutableState3, null, i7);
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        IgnoreFirstLaunchedEffect(scrubPoint, (Function2) rememberedValue16, gapComposer, i6);
        boolean changed = gapComposer.changed(obj2) | gapComposer.changed(obj3);
        Object rememberedValue17 = gapComposer.rememberedValue();
        if (changed || rememberedValue17 == obj) {
            Flow[] flowArr = new Flow[2];
            flowArr[i2] = obj2;
            flowArr[1] = obj3;
            rememberedValue17 = FlowKt.merge(flowArr);
            gapComposer.updateRememberedValue(rememberedValue17);
        }
        Flow flow6 = (Flow) rememberedValue17;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) mutableStateFlow;
        stateFlowImpl.setValue(((ErrorPresenter) this.captchaVerifier).models(flow6, (Composer) gapComposer, i2));
        boolean changed2 = gapComposer.changed(stateFlowImpl) | gapComposer.changed(flow3);
        Object rememberedValue18 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue18 == obj) {
            RealInvestingCryptoGraphHeaderPresenter$Factory$Impl realInvestingCryptoGraphHeaderPresenter$Factory$Impl = (RealInvestingCryptoGraphHeaderPresenter$Factory$Impl) this.result;
            RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(stateFlowImpl, 24);
            Money money = new Money((Long) 100000000L, CurrencyCode.BTC, 4);
            flow3.getClass();
            RealBrandFollowPresenter.MetroFactory metroFactory = realInvestingCryptoGraphHeaderPresenter$Factory$Impl.delegateFactory;
            CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) metroFactory.syncer.invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.store.invoke();
            RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) metroFactory.service.invoke();
            RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) metroFactory.repository.invoke();
            RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) metroFactory.analytics.invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.responseContextHandlerFactory.invoke();
            currencyConverter$Factory.getClass();
            androidStringManager.getClass();
            realCryptoBalanceRepo.getClass();
            realCryptoValueRepo.getClass();
            realJurisdictionConfigManager.getClass();
            factory.getClass();
            rememberedValue18 = new RealInvestingCryptoGraphHeaderPresenter(currencyConverter$Factory, androidStringManager, realCryptoBalanceRepo, realCryptoValueRepo, realJurisdictionConfigManager, factory, realBadger2$setup$lambda$0$$inlined$mapNotNull$1, flow3, money);
            gapComposer.updateRememberedValue(rememberedValue18);
        }
        mutableState4.setValue((InvestingHomePortfolioHeaderContentModel) ((RealInvestingCryptoGraphHeaderPresenter) rememberedValue18).models(flow6, gapComposer, 0));
        InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = (InvestingHomePortfolioHeaderContentModel) mutableState4.getValue();
        Money money2 = investingHomePortfolioHeaderContentModel != null ? investingHomePortfolioHeaderContentModel.rawBalance : null;
        if (money2 != null) {
            gapComposer.startReplaceGroup(123075357);
            boolean changed3 = gapComposer.changed(((Boolean) mutableState.getValue()).booleanValue()) | gapComposer.changed(money2);
            Object rememberedValue19 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue19 == obj) {
                rememberedValue19 = RealBitcoinFormatter.formatBitcoinWithSymbolPrefix$default((RealBitcoinFormatter) this.onFailureListeners, (BitcoinDisplayUnits) collectAsState2.getValue(), money2, ((Boolean) mutableState.getValue()).booleanValue());
                gapComposer.updateRememberedValue(rememberedValue19);
            }
            str = (String) rememberedValue19;
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(123216531);
            gapComposer.end(false);
            str = null;
        }
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel2 = (InvestingHomePortfolioHeaderContentModel) mutableState4.getValue();
            pair = new Pair(investingHomePortfolioHeaderContentModel2 != null ? investingHomePortfolioHeaderContentModel2.title : null, str);
        } else {
            InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel3 = (InvestingHomePortfolioHeaderContentModel) mutableState4.getValue();
            String str2 = investingHomePortfolioHeaderContentModel3 != null ? investingHomePortfolioHeaderContentModel3.title : null;
            pair = new Pair(str, str2 + " " + ((CurrencyCode) collectAsState.getValue()));
        }
        BitcoinHomeGraphWidgetViewModel bitcoinHomeGraphWidgetViewModel = new BitcoinHomeGraphWidgetViewModel((InvestingGraphContentModel) Updater.collectAsState(stateFlowImpl, null, gapComposer, 1).getValue(), (InvestingHomePortfolioHeaderContentModel) mutableState4.getValue(), (String) pair.first, (String) pair.second, (HistoricalRange) mutableState2.getValue());
        gapComposer.end(false);
        return bitcoinHomeGraphWidgetViewModel;
    }

    public void notifyFileUploadFailed(String str, String str2) {
        ScreenshotService$FileState.Failed failed = new ScreenshotService$FileState.Failed(str, str2);
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.captchaVerifier;
        ScreenshotService$ServiceState.Failed failed2 = new ScreenshotService$ServiceState.Failed(update(((ScreenshotService$ServiceState) stateFlowImpl.getValue()).getFileStates(), failed), ScreenshotService$ServiceState.Failed.FailReason.UPLOAD_FILE_FAILED);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, failed2);
    }

    public void notifyFileUploading(ScreenshotService$FileState screenshotService$FileState, int i, int i2) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.captchaVerifier;
        ScreenshotService$ServiceState.Uploading uploading = new ScreenshotService$ServiceState.Uploading(update(((ScreenshotService$ServiceState) stateFlowImpl.getValue()).getFileStates(), screenshotService$FileState), i, i2);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, uploading);
    }

    public void notifyState(Function1 function1) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.captchaVerifier;
        stateFlowImpl.setValue(function1.invoke(((ScreenshotService$ServiceState) stateFlowImpl.getValue()).getFileStates()));
    }

    public void reset() {
        ((ArrayList) this.onSuccessListeners).clear();
        ((ArrayList) this.onFailureListeners).clear();
        ((ArrayList) this.onOpenListeners).clear();
        IHCaptchaVerifier iHCaptchaVerifier = (IHCaptchaVerifier) this.captchaVerifier;
        if (iHCaptchaVerifier != null) {
            iHCaptchaVerifier.reset();
            this.captchaVerifier = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object searchCustomers(String str, String str2, BlockingContext blockingContext, ContinuationImpl continuationImpl) {
        BlockListController$searchCustomers$1 blockListController$searchCustomers$1;
        int i;
        ApiResult apiResult;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.internalConfig;
        if (continuationImpl instanceof BlockListController$searchCustomers$1) {
            blockListController$searchCustomers$1 = (BlockListController$searchCustomers$1) continuationImpl;
            int i2 = blockListController$searchCustomers$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                blockListController$searchCustomers$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = blockListController$searchCustomers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = blockListController$searchCustomers$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    stateFlowImpl.setValue(null);
                    BlocklyService blocklyService = (BlocklyService) this.result;
                    BlockSearchRequest blockSearchRequest = new BlockSearchRequest(str, str2, blockingContext, ByteString.EMPTY);
                    blockListController$searchCustomers$1.label = 1;
                    obj = blocklyService.blockSearch(blockSearchRequest, blockListController$searchCustomers$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    P2PSearchData.BlockSearchData blockSearchData = new P2PSearchData.BlockSearchData((BlockSearchResponse) ((ApiResult.Success) apiResult).response);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, blockSearchData);
                }
                return Unit.INSTANCE;
            }
        }
        blockListController$searchCustomers$1 = new BlockListController$searchCustomers$1(this, continuationImpl);
        Object obj2 = blockListController$searchCustomers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blockListController$searchCustomers$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchResultsData transformSearchResults(P2PSearchData p2PSearchData, String str, String str2, String str3, boolean z, boolean z2, Integer num, BlockingContext blockingContext) {
        ?? r14;
        LocalBrandBanner.Companion companion;
        ?? r9;
        List list;
        String m$1;
        boolean z3;
        String str4;
        List list2;
        String m$12;
        boolean z4;
        String str5;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.exception;
        Resources resources = androidStringManager.resources;
        str6.getClass();
        str7.getClass();
        BlockSearchResponse blockSearchResponse = ((P2PSearchData.BlockSearchData) p2PSearchData).response;
        LocalBrandBanner.Companion companion2 = blockSearchResponse.results;
        if (companion2 != null) {
            BlockSearchResponse$Results$BlockSuggestions blockSearchResponse$Results$BlockSuggestions = companion2 instanceof BlockSearchResponse$Results$BlockSuggestions ? (BlockSearchResponse$Results$BlockSuggestions) companion2 : null;
            BlockSearchResponse.BlockSuggestions blockSuggestions = blockSearchResponse$Results$BlockSuggestions != null ? blockSearchResponse$Results$BlockSuggestions.value : null;
            if (blockSuggestions != null && (list2 = blockSuggestions.customers) != null) {
                List<BlocklyCustomer> list3 = list2;
                r14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (BlocklyCustomer blocklyCustomer : list3) {
                    if (Intrinsics.areEqual(blocklyCustomer.is_blocked, Boolean.TRUE) && (blockingContext == BlockingContext.FAMILY_BLOCKLIST || z)) {
                        String blockerNameInSubtitleEnd = LayoutUpdate.blockerNameInSubtitleEnd(blocklyCustomer, str8, str6, str7, androidStringManager);
                        if (blockerNameInSubtitleEnd != null) {
                            resources.getClass();
                            m$12 = new MessageFormat(resources.getString(R.string.block_list_row_subtitle)).format(new Object[]{blockerNameInSubtitleEnd});
                            m$12.getClass();
                            str5 = m$12;
                            z4 = z2;
                        }
                        z4 = z2;
                        str5 = "";
                    } else {
                        BlocklyCustomerMetadata blocklyCustomerMetadata = blocklyCustomer.metadata;
                        blocklyCustomerMetadata.getClass();
                        Cashtag cashtag = blocklyCustomerMetadata.cashtag;
                        if (cashtag != null) {
                            m$12 = Recorder$$ExternalSyntheticOutline2.m$1(cashtag.prefix, cashtag.name);
                            str5 = m$12;
                            z4 = z2;
                        }
                        z4 = z2;
                        str5 = "";
                    }
                    r14.add(LayoutUpdate.toRowModel(blocklyCustomer, str6, str7, androidStringManager, str8, z4, str5));
                }
                companion = blockSearchResponse.results;
                if (companion != null) {
                    BlockSearchResponse$Results$BlockSearchResults blockSearchResponse$Results$BlockSearchResults = companion instanceof BlockSearchResponse$Results$BlockSearchResults ? (BlockSearchResponse$Results$BlockSearchResults) companion : null;
                    BlockSearchResponse.BlockSearchResults blockSearchResults = blockSearchResponse$Results$BlockSearchResults != null ? blockSearchResponse$Results$BlockSearchResults.value : null;
                    if (blockSearchResults != null && (list = blockSearchResults.customers) != null) {
                        List<BlocklyCustomer> list4 = list;
                        r9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        for (BlocklyCustomer blocklyCustomer2 : list4) {
                            if (Intrinsics.areEqual(blocklyCustomer2.is_blocked, Boolean.TRUE) && (blockingContext == BlockingContext.FAMILY_BLOCKLIST || z)) {
                                String blockerNameInSubtitleEnd2 = LayoutUpdate.blockerNameInSubtitleEnd(blocklyCustomer2, str8, str6, str7, androidStringManager);
                                if (blockerNameInSubtitleEnd2 != null) {
                                    resources.getClass();
                                    m$1 = new MessageFormat(resources.getString(R.string.block_list_row_subtitle)).format(new Object[]{blockerNameInSubtitleEnd2});
                                    m$1.getClass();
                                    str4 = m$1;
                                    z3 = z2;
                                }
                                z3 = z2;
                                str4 = "";
                            } else {
                                BlocklyCustomerMetadata blocklyCustomerMetadata2 = blocklyCustomer2.metadata;
                                blocklyCustomerMetadata2.getClass();
                                Cashtag cashtag2 = blocklyCustomerMetadata2.cashtag;
                                if (cashtag2 != null) {
                                    m$1 = Recorder$$ExternalSyntheticOutline2.m$1(cashtag2.prefix, cashtag2.name);
                                    str4 = m$1;
                                    z3 = z2;
                                }
                                z3 = z2;
                                str4 = "";
                            }
                            r9.add(LayoutUpdate.toRowModel(blocklyCustomer2, str6, str7, androidStringManager, str8, z3, str4));
                            str6 = str;
                            str7 = str2;
                            str8 = str3;
                        }
                        return new SearchResultsData(r14, r9);
                    }
                }
                r9 = EmptyList.INSTANCE;
                return new SearchResultsData(r14, r9);
            }
        }
        r14 = EmptyList.INSTANCE;
        companion = blockSearchResponse.results;
        if (companion != null) {
        }
        r9 = EmptyList.INSTANCE;
        return new SearchResultsData(r14, r9);
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public ArrayList transformToRowModels(P2PListData p2PListData, String str, String str2, String str3, boolean z, boolean z2, Integer num, BlockingContext blockingContext) {
        String blockerNameInSubtitleEnd;
        Cashtag cashtag;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.exception;
        str.getClass();
        str2.getClass();
        List list = ((P2PListData.BlockListData) p2PListData).customers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Boolean bool = ((BlocklyCustomer) obj).is_blocked;
            bool.getClass();
            if (bool.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BlocklyCustomer blocklyCustomer = (BlocklyCustomer) it.next();
            String str4 = "";
            if (z2) {
                BlocklyCustomerMetadata blocklyCustomerMetadata = blocklyCustomer.metadata;
                if (blocklyCustomerMetadata != null && (cashtag = blocklyCustomerMetadata.cashtag) != null) {
                    str4 = Recorder$$ExternalSyntheticOutline2.m$1(cashtag.prefix, cashtag.name);
                }
            } else if ((z || blockingContext != BlockingContext.BLOCKLIST) && (blockerNameInSubtitleEnd = LayoutUpdate.blockerNameInSubtitleEnd(blocklyCustomer, str3, str, str2, androidStringManager)) != null) {
                Object[] objArr = {blockerNameInSubtitleEnd};
                Resources resources = androidStringManager.resources;
                resources.getClass();
                str4 = new MessageFormat(resources.getString(R.string.block_list_row_subtitle)).format(objArr);
                str4.getClass();
            }
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            boolean z3 = z2;
            arrayList2.add(LayoutUpdate.toRowModel(blocklyCustomer, str5, str6, androidStringManager, str7, z3, str4));
            str = str5;
            str2 = str6;
            str3 = str7;
            z2 = z3;
        }
        return arrayList2;
    }

    public void tryCallbacks() {
        HCaptchaTokenResponse hCaptchaTokenResponse = (HCaptchaTokenResponse) this.result;
        boolean z = false;
        if (hCaptchaTokenResponse != null) {
            Iterator it = ((ArrayList) this.onSuccessListeners).iterator();
            while (it.hasNext()) {
                ((OnSuccessListener) it.next()).onSuccess(hCaptchaTokenResponse);
                z = true;
            }
        }
        HCaptchaException hCaptchaException = (HCaptchaException) this.exception;
        if (hCaptchaException != null) {
            Iterator it2 = ((ArrayList) this.onFailureListeners).iterator();
            while (it2.hasNext()) {
                ((OnFailureListener) it2.next()).onFailure(hCaptchaException);
                z = true;
            }
        }
        if (z) {
            this.result = null;
            this.exception = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: tryOpenCamera-7pD7j80$camera_camera2_pipe, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m4081tryOpenCamera7pD7j80$camera_camera2_pipe(String str, int i, long j, Camera2DeviceCloserImpl camera2DeviceCloserImpl, AudioRestrictionControllerImpl audioRestrictionControllerImpl, ContinuationImpl continuationImpl) {
        CameraStateOpener$tryOpenCamera$1 cameraStateOpener$tryOpenCamera$1;
        int i2;
        Camera2DeviceCloserImpl camera2DeviceCloserImpl2;
        AudioRestrictionControllerImpl audioRestrictionControllerImpl2;
        long j2;
        int i3;
        String str2;
        if (continuationImpl instanceof CameraStateOpener$tryOpenCamera$1) {
            cameraStateOpener$tryOpenCamera$1 = (CameraStateOpener$tryOpenCamera$1) continuationImpl;
            int i4 = cameraStateOpener$tryOpenCamera$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                cameraStateOpener$tryOpenCamera$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = cameraStateOpener$tryOpenCamera$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cameraStateOpener$tryOpenCamera$1.label;
                Continuation continuation = null;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Camera2MetadataProvider camera2MetadataProvider = (Camera2MetadataProvider) this.exception;
                    cameraStateOpener$tryOpenCamera$1.L$0 = str;
                    cameraStateOpener$tryOpenCamera$1.L$1 = camera2DeviceCloserImpl;
                    cameraStateOpener$tryOpenCamera$1.L$2 = audioRestrictionControllerImpl;
                    cameraStateOpener$tryOpenCamera$1.I$0 = i;
                    cameraStateOpener$tryOpenCamera$1.J$0 = j;
                    cameraStateOpener$tryOpenCamera$1.label = 1;
                    Camera2MetadataCache camera2MetadataCache = (Camera2MetadataCache) camera2MetadataProvider;
                    synchronized (camera2MetadataCache.cache) {
                        CameraMetadata cameraMetadata = (CameraMetadata) camera2MetadataCache.cache.get(str);
                        obj = cameraMetadata != null ? cameraMetadata : JobKt.withContext(camera2MetadataCache.threads.backgroundDispatcher, new RealBadger2$clear$2(camera2MetadataCache, str, continuation, 10), cameraStateOpener$tryOpenCamera$1);
                    }
                    if (obj != coroutineSingletons) {
                        camera2DeviceCloserImpl2 = camera2DeviceCloserImpl;
                        audioRestrictionControllerImpl2 = audioRestrictionControllerImpl;
                        j2 = j;
                        i3 = i;
                        str2 = str;
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j3 = cameraStateOpener$tryOpenCamera$1.J$0;
                int i5 = cameraStateOpener$tryOpenCamera$1.I$0;
                AudioRestrictionControllerImpl audioRestrictionControllerImpl3 = cameraStateOpener$tryOpenCamera$1.L$2;
                Camera2DeviceCloserImpl camera2DeviceCloserImpl3 = cameraStateOpener$tryOpenCamera$1.L$1;
                String str3 = cameraStateOpener$tryOpenCamera$1.L$0;
                SafeTrace.throwOnFailure(obj);
                i3 = i5;
                audioRestrictionControllerImpl2 = audioRestrictionControllerImpl3;
                camera2DeviceCloserImpl2 = camera2DeviceCloserImpl3;
                j2 = j3;
                str2 = str3;
                SystemTimeSource systemTimeSource = (SystemTimeSource) this.onOpenListeners;
                Camera2ErrorProcessor camera2ErrorProcessor = (Camera2ErrorProcessor) this.onSuccessListeners;
                Camera2Quirks camera2Quirks = (Camera2Quirks) this.onFailureListeners;
                androidx.camera.camera2.pipe.core.Threads threads = (androidx.camera.camera2.pipe.core.Threads) this.internalConfig;
                CameraPipe$CameraInteropConfig cameraPipe$CameraInteropConfig = (CameraPipe$CameraInteropConfig) this.handler;
                ZiplineLoader$load$2 ziplineLoader$load$2 = new ZiplineLoader$load$2(this, str2, new AndroidCameraState(str2, (CameraMetadata) obj, i3, j2, systemTimeSource, camera2ErrorProcessor, camera2DeviceCloserImpl2, camera2Quirks, threads, audioRestrictionControllerImpl2, cameraPipe$CameraInteropConfig.cameraDeviceStateCallback, cameraPipe$CameraInteropConfig.cameraCaptureSessionListener), null);
                cameraStateOpener$tryOpenCamera$1.L$0 = null;
                cameraStateOpener$tryOpenCamera$1.L$1 = null;
                cameraStateOpener$tryOpenCamera$1.L$2 = null;
                cameraStateOpener$tryOpenCamera$1.label = 2;
                Object supervisorScope = JobKt.supervisorScope(ziplineLoader$load$2, cameraStateOpener$tryOpenCamera$1);
                return supervisorScope != coroutineSingletons ? coroutineSingletons : supervisorScope;
            }
        }
        cameraStateOpener$tryOpenCamera$1 = new CameraStateOpener$tryOpenCamera$1(this, continuationImpl);
        Object obj2 = cameraStateOpener$tryOpenCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cameraStateOpener$tryOpenCamera$1.label;
        Continuation continuation2 = null;
        if (i2 != 0) {
        }
        SystemTimeSource systemTimeSource2 = (SystemTimeSource) this.onOpenListeners;
        Camera2ErrorProcessor camera2ErrorProcessor2 = (Camera2ErrorProcessor) this.onSuccessListeners;
        Camera2Quirks camera2Quirks2 = (Camera2Quirks) this.onFailureListeners;
        androidx.camera.camera2.pipe.core.Threads threads2 = (androidx.camera.camera2.pipe.core.Threads) this.internalConfig;
        CameraPipe$CameraInteropConfig cameraPipe$CameraInteropConfig2 = (CameraPipe$CameraInteropConfig) this.handler;
        ZiplineLoader$load$2 ziplineLoader$load$22 = new ZiplineLoader$load$2(this, str2, new AndroidCameraState(str2, (CameraMetadata) obj2, i3, j2, systemTimeSource2, camera2ErrorProcessor2, camera2DeviceCloserImpl2, camera2Quirks2, threads2, audioRestrictionControllerImpl2, cameraPipe$CameraInteropConfig2.cameraDeviceStateCallback, cameraPipe$CameraInteropConfig2.cameraCaptureSessionListener), null);
        cameraStateOpener$tryOpenCamera$1.L$0 = null;
        cameraStateOpener$tryOpenCamera$1.L$1 = null;
        cameraStateOpener$tryOpenCamera$1.L$2 = null;
        cameraStateOpener$tryOpenCamera$1.label = 2;
        Object supervisorScope2 = JobKt.supervisorScope(ziplineLoader$load$22, cameraStateOpener$tryOpenCamera$1);
        if (supervisorScope2 != coroutineSingletons2) {
        }
    }

    public void unbindAll() {
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:unbindAll"));
        try {
            Threads.checkMainThread();
            access$setCameraOperatingMode(this, 0);
            LifecycleCameraRepository lifecycleCameraRepository = (LifecycleCameraRepository) this.onOpenListeners;
            lifecycleCameraRepository.getClass();
            lifecycleCameraRepository.unbindAll((HashSet) this.captchaVerifier);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.squareup.cash.p2pblocking.presenters.P2PListController
    public Unit updateData(P2PListData p2PListData) {
        ((StateFlowImpl) this.onOpenListeners).setValue(p2PListData);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object uploadFile(String str, ContinuationImpl continuationImpl) {
        RealScreenshotService$uploadFile$1 realScreenshotService$uploadFile$1;
        int i;
        String str2;
        FileValidator$Result fileValidator$Result;
        String str3;
        FileMetadata fileMetadata;
        String str4;
        FileUploadService$Result fileUploadService$Result;
        if (continuationImpl instanceof RealScreenshotService$uploadFile$1) {
            realScreenshotService$uploadFile$1 = (RealScreenshotService$uploadFile$1) continuationImpl;
            int i2 = realScreenshotService$uploadFile$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realScreenshotService$uploadFile$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realScreenshotService$uploadFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realScreenshotService$uploadFile$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    str.getClass();
                    RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) this.handler;
                    realScreenshotService$uploadFile$1.L$0 = str;
                    realScreenshotService$uploadFile$1.L$1 = str;
                    realScreenshotService$uploadFile$1.label = 1;
                    obj = realStrongMemoryCache.m1457validate8YU3vEA(str, realScreenshotService$uploadFile$1);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileMetadata = realScreenshotService$uploadFile$1.L$3;
                    str3 = realScreenshotService$uploadFile$1.L$1;
                    str4 = realScreenshotService$uploadFile$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    fileUploadService$Result = (FileUploadService$Result) obj;
                    if (!(fileUploadService$Result instanceof FileUploadService$Result.Failure)) {
                        notifyFileUploadFailed(str4, "File failed to upload");
                        return null;
                    }
                    if (fileUploadService$Result instanceof FileUploadService$Result.Success) {
                        return new RealScreenshotService$UploadedFile(fileMetadata, str3, ((FileUploadService$Result.Success) fileUploadService$Result).fileToken);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = realScreenshotService$uploadFile$1.L$1;
                str2 = realScreenshotService$uploadFile$1.L$0;
                SafeTrace.throwOnFailure(obj);
                fileValidator$Result = (FileValidator$Result) obj;
                if (!(fileValidator$Result instanceof FileValidator$Result.Failure)) {
                    notifyFileUploadFailed(str2, "File validation failed: " + ((FileValidator$Result.Failure) fileValidator$Result).error);
                    return null;
                }
                FileMetadata metadata = fileValidator$Result.getMetadata();
                RealFileUploadService realFileUploadService = (RealFileUploadService) this.result;
                realScreenshotService$uploadFile$1.L$0 = str2;
                realScreenshotService$uploadFile$1.L$1 = str;
                realScreenshotService$uploadFile$1.L$3 = metadata;
                realScreenshotService$uploadFile$1.label = 2;
                Object m3558uploadkVGMmk0 = realFileUploadService.m3558uploadkVGMmk0(str, metadata, "screenshot", realScreenshotService$uploadFile$1);
                if (m3558uploadkVGMmk0 != coroutineSingletons) {
                    str3 = str;
                    fileMetadata = metadata;
                    obj = m3558uploadkVGMmk0;
                    str4 = str2;
                    fileUploadService$Result = (FileUploadService$Result) obj;
                    if (!(fileUploadService$Result instanceof FileUploadService$Result.Failure)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realScreenshotService$uploadFile$1 = new RealScreenshotService$uploadFile$1(this, continuationImpl);
        Object obj2 = realScreenshotService$uploadFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realScreenshotService$uploadFile$1.label;
        if (i != 0) {
        }
        fileValidator$Result = (FileValidator$Result) obj2;
        if (!(fileValidator$Result instanceof FileValidator$Result.Failure)) {
        }
    }

    public HCaptcha(int i) {
        switch (i) {
            case 2:
                this.result = new Object();
                this.onSuccessListeners = ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
                this.internalConfig = new HashMap();
                this.captchaVerifier = new HashSet();
                break;
            default:
                this.handler = new Handler(Looper.getMainLooper());
                this.onSuccessListeners = new ArrayList();
                this.onFailureListeners = new ArrayList();
                this.onOpenListeners = new ArrayList();
                this.result = null;
                this.exception = null;
                break;
        }
    }

    public HCaptcha(RealFileValidator$Factory$Impl realFileValidator$Factory$Impl, RealFileUploadService realFileUploadService, RealConversationService realConversationService, ScreenshotBundleService screenshotBundleService, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.result = realFileUploadService;
        this.exception = realConversationService;
        this.onSuccessListeners = screenshotBundleService;
        this.onFailureListeners = coroutineScope;
        this.onOpenListeners = coroutineContext;
        this.handler = RealFileValidator$Factory$Impl.create$default(realFileValidator$Factory$Impl, Long.MAX_VALUE);
        this.captchaVerifier = FlowKt.MutableStateFlow(ScreenshotService$ServiceState.StandBy.INSTANCE);
    }

    public HCaptcha(RealProfileManager realProfileManager, RealFileDownloader realFileDownloader, AndroidFileProvider androidFileProvider, AndroidStringManager androidStringManager, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.result = realProfileManager;
        this.exception = realFileDownloader;
        this.onSuccessListeners = androidFileProvider;
        this.onFailureListeners = androidStringManager;
        this.onOpenListeners = coroutineContext;
        this.handler = coroutineScope;
        this.internalConfig = new LinkedHashMap();
        this.captchaVerifier = new LinkedHashMap();
    }

    public HCaptcha(BlocklyService blocklyService, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, Screen screen) {
        screen.getClass();
        this.result = blocklyService;
        this.exception = androidStringManager;
        this.onSuccessListeners = screenNavigator;
        this.onFailureListeners = screen;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
        this.onOpenListeners = MutableStateFlow;
        this.handler = MutableStateFlow;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(null);
        this.internalConfig = MutableStateFlow2;
        this.captchaVerifier = MutableStateFlow2;
    }

    public HCaptcha(RealInvestingCryptoGraphHeaderPresenter$Factory$Impl realInvestingCryptoGraphHeaderPresenter$Factory$Impl, RealProfileManager realProfileManager, RealBitcoinProfileRepo realBitcoinProfileRepo, RealBitcoinFormatter realBitcoinFormatter, RealBitcoinGraphPresenter$Factory$Impl realBitcoinGraphPresenter$Factory$Impl, RealBitcoinActivityProvider realBitcoinActivityProvider, RealJurisdictionConfigManager realJurisdictionConfigManager, Analytics analytics) {
        this.result = realInvestingCryptoGraphHeaderPresenter$Factory$Impl;
        this.exception = realProfileManager;
        this.onSuccessListeners = realBitcoinProfileRepo;
        this.onFailureListeners = realBitcoinFormatter;
        this.onOpenListeners = realBitcoinActivityProvider;
        this.handler = realJurisdictionConfigManager;
        this.internalConfig = analytics;
        LoadTimeClock.MetroFactory metroFactory = realBitcoinGraphPresenter$Factory$Impl.delegateFactory;
        RealBitcoinGraphModelProvider realBitcoinGraphModelProvider = (RealBitcoinGraphModelProvider) metroFactory.clock.invoke();
        RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = (RealDependentBalanceDetailLoggingManager) metroFactory.observabilityManager.invoke();
        realBitcoinGraphModelProvider.getClass();
        realDependentBalanceDetailLoggingManager.getClass();
        this.captchaVerifier = new ErrorPresenter(6, realBitcoinGraphModelProvider, realDependentBalanceDetailLoggingManager);
    }

    public /* synthetic */ HCaptcha(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.result = obj;
        this.exception = obj2;
        this.onSuccessListeners = obj3;
        this.onFailureListeners = obj4;
        this.onOpenListeners = obj5;
        this.handler = obj6;
        this.internalConfig = obj7;
        this.captchaVerifier = obj8;
    }
}
