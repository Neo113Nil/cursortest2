package sqip.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.core.app.ActivityCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.transition.Transition;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.bugsnag.android.TraceParser$parse$1;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader$logBlocksInUnexpectedBlocksOrderError$1;
import com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter;
import com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlock;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$TLVResult;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$logFailedToDeserializeError$1;
import com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.core.persistence.datastore.DataStoreContent;
import com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl$reportTTID$1;
import com.datadog.android.rum.internal.startup.RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.filament.Box;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.google.firebase.messaging.EnhancedIntentService;
import com.knotapi.knot.utilities.RunCustomScript;
import com.knotapi.knot.utilities.ScreenshotHelper;
import com.knotapi.knot.utilities.SsoCookieHelper;
import com.knotapi.knot.utilities.WebAppJSFetcher;
import com.knotapi.knot.webview.JSInterfaceObject;
import com.knotapi.knot.webview.KnotView;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.views.CameraXPreviewManager;
import com.squareup.cash.qrcodes.views.CameraXPreviewManager$cameraLifecycleOwner$1;
import com.squareup.cash.qrcodes.views.CameraXPreviewState;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import com.stripe.hcaptcha.webview.HCaptchaWebViewHelper$HCaptchaWebClient;
import com.withpersona.sdk2.inquiry.permissions.CheckRequestPermissionRationaleStateView;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;
import kotlin.UShort;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import okhttp3.FormBody;
import org.json.JSONObject;
import retrofit2.Callback;
import retrofit2.DefaultCallAdapterFactory;
import retrofit2.Response;
import sqip.CardEntryActivityCommand;
import sqip.CardNonceBackgroundHandler;
import sqip.internal.CardEntryResult;

/* loaded from: classes4.dex */
public final /* synthetic */ class CardEntryActivityController$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ CardEntryActivityController$$ExternalSyntheticLambda1(CardEntryActivityController cardEntryActivityController, CardEntryActivityCommand cardEntryActivityCommand, CardEntryResult.CardAndNonceResult cardAndNonceResult) {
        this.$r8$classId = 22;
        this.f$2 = cardEntryActivityController;
        this.f$0 = cardEntryActivityCommand;
        this.f$1 = cardAndNonceResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0314 A[LOOP:0: B:91:0x0253->B:100:0x0314, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte[] array2;
        byte[] bytes;
        InternalLogger.Target target;
        DataStoreContent dataStoreContent;
        TLVBlockFileReader$logFailedToDeserializeError$1 tLVBlockFileReader$logFailedToDeserializeError$1;
        byte[] bArr;
        TLVBlockFileReader$TLVResult tLVBlockFileReader$TLVResult;
        byte[] bArr2;
        byte[] bArr3;
        TLVBlockFileReader$TLVResult tLVBlockFileReader$TLVResult2;
        TLVBlockFileReader$TLVResult tLVBlockFileReader$TLVResult3;
        int i = this.$r8$classId;
        final int i2 = 1;
        byte[] bArr4 = null;
        LifecycleCamera lifecycleCamera = null;
        bArr4 = null;
        final int i3 = 0;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        Object obj3 = this.f$2;
        switch (i) {
            case 0:
                CardEntryActivityController.onCardNonceSuccess$lambda$2((CardNonceBackgroundHandler) obj2, (CardEntryResult.CardAndNonceResult) obj, (CardEntryActivityController) obj3);
                return;
            case 1:
                InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$1((View) obj2, (InAppMessageImmersiveBaseView) obj, (ViewParent) obj3);
                return;
            case 2:
                ((DatadogCore) obj2).getCoreFeature$dd_sdk_android_core_release().userInfoProvider.setUserInfo((String) obj, (Map) obj3);
                return;
            case 3:
                SdkFeature sdkFeature = (SdkFeature) obj2;
                Set set = (Set) obj;
                Function2 function2 = (Function2) obj3;
                if (sdkFeature.coreFeature.initialized.get()) {
                    DatadogContext context = sdkFeature.contextProvider.getContext(set);
                    function2.invoke(context, sdkFeature.storage.getEventWriteScope(context));
                    return;
                }
                return;
            case 4:
                Transition.AnonymousClass1 anonymousClass1 = (Transition.AnonymousClass1) obj3;
                DatastoreFileWriter datastoreFileWriter = (DatastoreFileWriter) ((UnleashContext) obj2).properties;
                obj.getClass();
                File dataStoreFile$dd_sdk_android_core_release = datastoreFileWriter.dataStoreFileHelper.getDataStoreFile$dd_sdk_android_core_release(datastoreFileWriter.storageDir, datastoreFileWriter.featureName, "anonymous_id_key");
                byte[] array3 = ByteBuffer.allocate(4).putInt(0).array();
                array3.getClass();
                LinkedHashMap linkedHashMap = TLVBlockType.map;
                InternalLogger internalLogger = datastoreFileWriter.internalLogger;
                internalLogger.getClass();
                int length = array3.length;
                InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
                final int i4 = 10485760;
                if (length != 0) {
                    int length2 = array3.length;
                    final int i5 = 6 + length2;
                    if (i5 <= 10485760) {
                        array2 = ByteBuffer.allocate(i5).putShort((short) 0).putInt(length2).put(array3).array();
                        bytes = anonymousClass1.serialize(obj).getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        if (bytes.length != 0) {
                            int length3 = bytes.length;
                            final int i6 = 6 + length3;
                            if (i6 > i4) {
                                DBUtil.log$default(internalLogger, 4, target2, new Function0() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlock$logEntrySizeExceededError$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i3;
                                        int i8 = i6;
                                        int i9 = i4;
                                        switch (i7) {
                                            case 0:
                                                return String.format(Locale.US, "DataBlock length exceeds limit of %s bytes, was %s", Arrays.copyOf(new Object[]{Integer.valueOf(i9), Integer.valueOf(i8)}, 2));
                                            default:
                                                return String.format(Locale.US, "Read error - datastore entry has invalid number of blocks. Was: %d, expected: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i9), Integer.valueOf(i8)}, 2));
                                        }
                                    }
                                }, null, false, 56);
                            } else {
                                bArr4 = ByteBuffer.allocate(i6).putShort((short) 1).putInt(length3).put(bytes).array();
                            }
                        }
                        if (array2 != null || bArr4 == null) {
                            return;
                        }
                        ((PlainFileReaderWriter) datastoreFileWriter.fileReaderWriter).writeData(dataStoreFile$dd_sdk_android_core_release, ByteArrayExtKt.join$default(CollectionsKt__CollectionsKt.listOf((Object[]) new byte[][]{array2, bArr4}), DatastoreFileWriter.EMPTY_BYTE_ARRAY, internalLogger), false);
                        return;
                    }
                    DBUtil.log$default(internalLogger, 4, target2, new Function0() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlock$logEntrySizeExceededError$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i3;
                            int i8 = i5;
                            int i9 = i4;
                            switch (i7) {
                                case 0:
                                    return String.format(Locale.US, "DataBlock length exceeds limit of %s bytes, was %s", Arrays.copyOf(new Object[]{Integer.valueOf(i9), Integer.valueOf(i8)}, 2));
                                default:
                                    return String.format(Locale.US, "Read error - datastore entry has invalid number of blocks. Was: %d, expected: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i9), Integer.valueOf(i8)}, 2));
                            }
                        }
                    }, null, false, 56);
                    i4 = 10485760;
                }
                array2 = null;
                bytes = anonymousClass1.serialize(obj).getBytes(Charsets.UTF_8);
                bytes.getClass();
                if (bytes.length != 0) {
                }
                if (array2 != null) {
                    return;
                } else {
                    return;
                }
            case 5:
                GlideBuilder$1 glideBuilder$1 = (GlideBuilder$1) obj;
                TraceParser$parse$1 traceParser$parse$1 = (TraceParser$parse$1) ((n.b) obj3).b;
                DatastoreFileWriter datastoreFileWriter2 = (DatastoreFileWriter) ((UnleashContext) obj2).remoteAddress;
                File dataStoreFile$dd_sdk_android_core_release2 = datastoreFileWriter2.dataStoreFileHelper.getDataStoreFile$dd_sdk_android_core_release(datastoreFileWriter2.storageDir, datastoreFileWriter2.featureName, "anonymous_id_key");
                if (!zzhk.existsSafe(dataStoreFile$dd_sdk_android_core_release2, datastoreFileWriter2.internalLogger)) {
                    traceParser$parse$1.invoke(null);
                    return;
                }
                Box box = (Box) datastoreFileWriter2.fileReaderWriter;
                byte[] bArr5 = (byte[]) ((PlainFileReaderWriter) box.mHalfExtent).readData(dataStoreFile$dd_sdk_android_core_release2);
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (true) {
                    int length4 = bArr5.length;
                    target = InternalLogger.Target.MAINTAINER;
                    if (i7 < length4) {
                        int i8 = i7 + 2;
                        int length5 = bArr5.length;
                        TLVBlockFileReader$logFailedToDeserializeError$1 tLVBlockFileReader$logFailedToDeserializeError$12 = TLVBlockFileReader$logFailedToDeserializeError$1.INSTANCE;
                        if (i8 > length5) {
                            DBUtil.log$default((InternalLogger) box.mCenter, 4, target, tLVBlockFileReader$logFailedToDeserializeError$12, null, false, 56);
                            tLVBlockFileReader$logFailedToDeserializeError$1 = tLVBlockFileReader$logFailedToDeserializeError$12;
                        } else {
                            tLVBlockFileReader$logFailedToDeserializeError$1 = tLVBlockFileReader$logFailedToDeserializeError$12;
                            try {
                                bArr = ArraysKt___ArraysJvmKt.copyOfRange(bArr5, i7, i8);
                            } catch (IllegalArgumentException unused) {
                                bArr = new byte[0];
                            } catch (IndexOutOfBoundsException unused2) {
                                bArr = new byte[0];
                            }
                            bArr.getClass();
                            final short s = ByteBuffer.wrap(bArr).getShort();
                            LinkedHashMap linkedHashMap2 = TLVBlockType.map;
                            UShort.Companion companion = UShort.Companion;
                            TLVBlockType tLVBlockType = (TLVBlockType) TLVBlockType.map.get(new UShort(s));
                            if (tLVBlockType == null) {
                                DBUtil.log$default((InternalLogger) box.mCenter, 4, target, new Function0() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader$logTypeCorruptionError$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return String.format(Locale.US, "TLV header corrupt. Invalid type %s", Arrays.copyOf(new Object[]{Short.valueOf(s)}, 1));
                                    }
                                }, null, false, 56);
                            } else {
                                tLVBlockFileReader$TLVResult = new TLVBlockFileReader$TLVResult(tLVBlockType, i8);
                                if (tLVBlockFileReader$TLVResult != null) {
                                    int i9 = tLVBlockFileReader$TLVResult.newIndex;
                                    int i10 = i9 + 4;
                                    if (i10 > bArr5.length) {
                                        DBUtil.log$default((InternalLogger) box.mCenter, 4, target, tLVBlockFileReader$logFailedToDeserializeError$1, null, false, 56);
                                        tLVBlockFileReader$TLVResult2 = null;
                                    } else {
                                        try {
                                            bArr2 = ArraysKt___ArraysJvmKt.copyOfRange(bArr5, i9, i10);
                                        } catch (IllegalArgumentException unused3) {
                                            bArr2 = new byte[0];
                                        } catch (IndexOutOfBoundsException unused4) {
                                            bArr2 = new byte[0];
                                        }
                                        bArr2.getClass();
                                        int i11 = ByteBuffer.wrap(bArr2).getInt() + i10;
                                        try {
                                            bArr3 = ArraysKt___ArraysJvmKt.copyOfRange(bArr5, i10, i11);
                                        } catch (IllegalArgumentException unused5) {
                                            bArr3 = new byte[0];
                                        } catch (IndexOutOfBoundsException unused6) {
                                            bArr3 = new byte[0];
                                        }
                                        tLVBlockFileReader$TLVResult2 = new TLVBlockFileReader$TLVResult(bArr3, i11);
                                    }
                                    if (tLVBlockFileReader$TLVResult2 != null) {
                                        tLVBlockFileReader$TLVResult3 = new TLVBlockFileReader$TLVResult(new TLVBlock((TLVBlockType) tLVBlockFileReader$TLVResult.data, (byte[]) tLVBlockFileReader$TLVResult2.data, (InternalLogger) box.mCenter), tLVBlockFileReader$TLVResult2.newIndex);
                                        if (tLVBlockFileReader$TLVResult3 != null) {
                                            arrayList.add(tLVBlockFileReader$TLVResult3.data);
                                            i7 = tLVBlockFileReader$TLVResult3.newIndex;
                                        }
                                    }
                                }
                                tLVBlockFileReader$TLVResult3 = null;
                                if (tLVBlockFileReader$TLVResult3 != null) {
                                }
                            }
                        }
                        tLVBlockFileReader$TLVResult = null;
                        if (tLVBlockFileReader$TLVResult != null) {
                        }
                        tLVBlockFileReader$TLVResult3 = null;
                        if (tLVBlockFileReader$TLVResult3 != null) {
                        }
                    }
                }
                final int size = arrayList.size();
                final int length6 = TLVBlockType.values().length;
                if (size != length6) {
                    DBUtil.log$default(datastoreFileWriter2.internalLogger, 5, target, new Function0() { // from class: com.datadog.android.core.internal.persistence.tlvformat.TLVBlock$logEntrySizeExceededError$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i2;
                            int i82 = length6;
                            int i92 = size;
                            switch (i72) {
                                case 0:
                                    return String.format(Locale.US, "DataBlock length exceeds limit of %s bytes, was %s", Arrays.copyOf(new Object[]{Integer.valueOf(i92), Integer.valueOf(i82)}, 2));
                                default:
                                    return String.format(Locale.US, "Read error - datastore entry has invalid number of blocks. Was: %d, expected: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i92), Integer.valueOf(i82)}, 2));
                            }
                        }
                    }, null, false, 56);
                    traceParser$parse$1.invoke(null);
                    return;
                }
                if (((TLVBlock) arrayList.get(0)).f947type == TLVBlockType.VERSION_CODE || ((TLVBlock) arrayList.get(1)).f947type == TLVBlockType.DATA) {
                    TLVBlock tLVBlock = (TLVBlock) arrayList.get(0);
                    TLVBlock tLVBlock2 = (TLVBlock) arrayList.get(1);
                    byte[] bArr6 = tLVBlock.data;
                    bArr6.getClass();
                    dataStoreContent = new DataStoreContent(ByteBuffer.wrap(bArr6).getInt(), glideBuilder$1.deserialize(new String(tLVBlock2.data, Charsets.UTF_8)));
                } else {
                    DBUtil.log$default(datastoreFileWriter2.internalLogger, 5, target, DatastoreFileReader$logBlocksInUnexpectedBlocksOrderError$1.INSTANCE, null, false, 56);
                    dataStoreContent = null;
                }
                if (dataStoreContent == null) {
                    traceParser$parse$1.invoke(null);
                    return;
                } else {
                    traceParser$parse$1.invoke((UUID) dataStoreContent.data);
                    return;
                }
            case 6:
                View view = (View) obj2;
                RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1 rumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1 = (RumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1) obj;
                MetadataRepo metadataRepo = (MetadataRepo) obj3;
                if (view.getViewTreeObserver().isAlive()) {
                    try {
                        view.getViewTreeObserver().removeOnDrawListener(rumFirstDrawTimeReporterImpl$registerOnDrawListener$listener$1);
                        return;
                    } catch (IllegalStateException e) {
                        DBUtil.log$default((InternalLogger) metadataRepo.mMetadataList, 4, InternalLogger.Target.TELEMETRY, RumAppStartupTelemetryReporterImpl$reportTTID$1.INSTANCE$2, e, false, 48);
                        return;
                    }
                }
                return;
            case 7:
                DefaultScheduler defaultScheduler = (DefaultScheduler) obj2;
                AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) obj;
                String str = autoValue_TransportContext.backendName;
                AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) obj3;
                defaultScheduler.getClass();
                Logger logger = DefaultScheduler.LOGGER;
                try {
                    TransportBackend transportBackend = defaultScheduler.backendRegistry.get(str);
                    if (transportBackend == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        defaultScheduler.guard.runCriticalSection(new PreviewView$1$$ExternalSyntheticLambda2(11, defaultScheduler, autoValue_TransportContext, ((CctTransportBackend) transportBackend).decorate(autoValue_EventInternal)));
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    return;
                }
            case 8:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                try {
                    ((EnhancedIntentService) obj2).handleIntent((Intent) obj);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 9:
                RunCustomScript.lambda$runScript$0((WebView) obj2, (JSONObject) obj, (String) obj3);
                return;
            case 10:
                ScreenshotHelper.lambda$startScreenshotFlow$2((WebView) obj2, (KnotView) obj, (String) obj3);
                return;
            case 11:
                ((SsoCookieHelper) obj2).lambda$saveTempCookiesToSharedPreferencesAsync$4((Context) obj, (JSONObject) obj3);
                return;
            case 12:
                WebAppJSFetcher.lambda$fetchJS$3(null, (String) obj2, (List) obj, (String) obj3);
                return;
            case 13:
                ((WebAppJSFetcher) obj2).lambda$fetchJS$4((String) obj, (String) obj3);
                return;
            case 14:
                ((JSInterfaceObject) obj2).lambda$sendDataToWebApp$15((String) obj, (String) obj3);
                return;
            case 15:
                ChainingListenableFuture chainingListenableFuture = (ChainingListenableFuture) obj2;
                CameraXPreviewManager cameraXPreviewManager = (CameraXPreviewManager) obj;
                CameraXPreviewState cameraXPreviewState = (CameraXPreviewState) obj3;
                if (chainingListenableFuture.mDelegate.isCancelled()) {
                    return;
                }
                ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) chainingListenableFuture.get();
                processCameraProvider.unbindAll();
                try {
                    CameraXPreviewManager$cameraLifecycleOwner$1 cameraXPreviewManager$cameraLifecycleOwner$1 = cameraXPreviewManager.cameraLifecycleOwner;
                    CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
                    cameraSelector.getClass();
                    LifecycleCamera bindToLifecycle = processCameraProvider.bindToLifecycle(cameraXPreviewManager$cameraLifecycleOwner$1, cameraSelector, cameraXPreviewManager.preview, cameraXPreviewManager.imageAnalysis);
                    cameraXPreviewState.flashAvailable$delegate.setValue(Boolean.valueOf(((AdapterCameraInfo) bindToLifecycle.getCameraInfo()).mCameraInfo.hasFlashUnit()));
                    lifecycleCamera = bindToLifecycle;
                } catch (IllegalArgumentException unused7) {
                    cameraXPreviewState.cameraAvailable$delegate.setValue(Boolean.FALSE);
                }
                cameraXPreviewManager.camera = lifecycleCamera;
                return;
            case 16:
                HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) ((TextSetter) obj2).scannerText;
                hCaptchaWebView.removeJavascriptInterface("JSInterface");
                hCaptchaWebView.removeJavascriptInterface("JSDI");
                ((HCaptchaWebViewHelper$HCaptchaWebClient) obj).listener.onFailure.invoke(new HCaptchaException(HCaptchaError.INSECURE_HTTP_REQUEST_ERROR, "Insecure resource " + ((Uri) obj3) + " requested"));
                return;
            case 17:
                CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) obj;
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj3;
                if (((FrameLayout) obj2).isAttachedToWindow()) {
                    Permission permission = checkRequestPermissionRationaleStateView.permission;
                    Function1 function1 = checkRequestPermissionRationaleStateView.callback;
                    if (permission != Permission.RecordAudio || checkRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck) {
                        function1.invoke(Boolean.valueOf(ActivityCompat.shouldShowRequestPermissionRationale(appCompatActivity, PermissionsStateKt.toPermissionString(permission))));
                        return;
                    } else {
                        function1.invoke(Boolean.TRUE);
                        return;
                    }
                }
                return;
            case 18:
                View view2 = (View) obj;
                ((Function0) obj2).invoke();
                ViewPropertyAnimator animate = view2.animate();
                animate.setStartDelay(1000L);
                animate.withStartAction(new P5$$ExternalSyntheticLambda0(6, (Function0) obj3)).withEndAction(new ViewUtils$$ExternalSyntheticLambda0(view2, 5)).alpha(RecyclerView.DECELERATION_RATE);
                return;
            case 19:
                OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) obj2;
                TaxWebAppLayoutBinding taxWebAppLayoutBinding = (TaxWebAppLayoutBinding) obj;
                oldSelfieOverlayView.oneShotOnAnimationCompleteListeners.add(new StateFlowsKt$$ExternalSyntheticLambda2(19, oldSelfieOverlayView, taxWebAppLayoutBinding, (Function0) obj3));
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding.taxWebAppErrorText).playAnimation();
                return;
            case 20:
                Callback callback = (Callback) obj;
                Response response = (Response) obj3;
                DefaultCallAdapterFactory.ExecutorCallbackCall executorCallbackCall = (DefaultCallAdapterFactory.ExecutorCallbackCall) ((FormBody.Builder) obj2).values;
                if (executorCallbackCall.delegate.isCanceled()) {
                    callback.onFailure(executorCallbackCall, new IOException("Canceled"));
                    return;
                } else {
                    callback.onResponse(executorCallbackCall, response);
                    return;
                }
            case 21:
                ((Callback) obj).onFailure((DefaultCallAdapterFactory.ExecutorCallbackCall) ((FormBody.Builder) obj2).values, (Throwable) obj3);
                return;
            default:
                CardEntryActivityController.onCardNonceSuccess$lambda$2$lambda$1((CardEntryActivityController) obj3, (CardEntryActivityCommand) obj2, (CardEntryResult.CardAndNonceResult) obj);
                return;
        }
    }

    public /* synthetic */ CardEntryActivityController$$ExternalSyntheticLambda1(DefaultScheduler defaultScheduler, AutoValue_TransportContext autoValue_TransportContext, TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda0, AutoValue_EventInternal autoValue_EventInternal) {
        this.$r8$classId = 7;
        this.f$0 = defaultScheduler;
        this.f$1 = autoValue_TransportContext;
        this.f$2 = autoValue_EventInternal;
    }

    public /* synthetic */ CardEntryActivityController$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
