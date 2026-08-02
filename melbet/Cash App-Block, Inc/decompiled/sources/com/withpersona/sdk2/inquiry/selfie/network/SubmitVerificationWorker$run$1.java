package com.withpersona.sdk2.inquiry.selfie.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt;
import com.withpersona.sdk2.inquiry.device.RootedDeviceUtilsKt;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.MultipartBody;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class SubmitVerificationWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public SubmitVerificationWorker L$2;
    public Iterator L$3;
    public Object L$4;
    public File L$5;
    public int label;
    public final /* synthetic */ SubmitVerificationWorker this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Selfie.Pose.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Selfie.Pose pose = Selfie.Pose.Center;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Selfie.Pose pose2 = Selfie.Pose.Center;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CameraProperties.FacingMode.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitVerificationWorker$run$1(SubmitVerificationWorker submitVerificationWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = submitVerificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SubmitVerificationWorker$run$1 submitVerificationWorker$run$1 = new SubmitVerificationWorker$run$1(this.this$0, continuation);
        submitVerificationWorker$run$1.L$0 = obj;
        return submitVerificationWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitVerificationWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0496, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x029e, code lost:
    
        if (r7.emit(r1, r52) == r8) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03bc  */
    /* JADX WARN: Type inference failed for: r6v113, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x03bc -> B:31:0x0499). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0448 -> B:30:0x03b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CameraProperties cameraProperties;
        SubmitVerificationWorker submitVerificationWorker;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        FlowCollector flowCollector;
        Iterator it;
        SubmitVerificationWorker submitVerificationWorker2;
        Object obj2;
        DataCollector dataCollector;
        File file;
        Selfie selfie;
        String str4;
        Iterator it2;
        Object obj3;
        String str5;
        CoroutineSingletons coroutineSingletons;
        String str6;
        SelfieType.ConfigurablePoses configurablePoses;
        SelfieType.ThreePhotos threePhotos;
        SelfieType.CenterOnly centerOnly;
        String str7;
        String str8;
        String str9;
        Object obj4;
        Throwable m4120exceptionOrNullimpl;
        FlowCollector flowCollector2;
        Throwable m4120exceptionOrNullimpl2;
        CoroutineSingletons coroutineSingletons2;
        String str10;
        String str11;
        CoroutineSingletons coroutineSingletons3;
        String str12;
        String str13;
        String lowerCase;
        Object enqueueVerificationRequestWithRetry;
        FlowCollector flowCollector3;
        NetworkCallResult networkCallResult;
        SubmitVerificationWorker submitVerificationWorker3 = this.this$0;
        String str14 = submitVerificationWorker3.webRtcObjectId;
        String str15 = submitVerificationWorker3.fromStep;
        DataCollector dataCollector2 = submitVerificationWorker3.dataCollector;
        List<Selfie> list = submitVerificationWorker3.selfies;
        CameraProperties cameraProperties2 = submitVerificationWorker3.cameraProperties;
        String str16 = submitVerificationWorker3.fieldKeySelfie;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        SelfieType.ConfigurablePoses configurablePoses2 = SelfieType.ConfigurablePoses.INSTANCE;
        SelfieType.ThreePhotos threePhotos2 = SelfieType.ThreePhotos.INSTANCE;
        SelfieType.CenterOnly centerOnly2 = SelfieType.CenterOnly.INSTANCE;
        String str17 = "][files][][capture-method]";
        String str18 = "][files][][name]";
        switch (i) {
            case 0:
                cameraProperties = cameraProperties2;
                SafeTrace.throwOnFailure(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                submitVerificationWorker = submitVerificationWorker3;
                str = str14;
                str2 = str16;
                str3 = "][files][][type]";
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(submitVerificationWorker3.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.SUBMITTING, null, null, null, 8, null), false, 2, null);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list) {
                    if (obj5 instanceof Selfie.SelfieImage) {
                        arrayList2.add(obj5);
                    }
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    linkedHashMap.put(((Selfie.SelfieImage) next).pose, next);
                }
                dataCollector2.submit(new SelfieStepData(str15, (Selfie) linkedHashMap.get(Selfie.Pose.Center), (Selfie) linkedHashMap.get(Selfie.Pose.Left), (Selfie) linkedHashMap.get(Selfie.Pose.Right)));
                arrayList = new ArrayList();
                flowCollector = flowCollector4;
                it = list.iterator();
                submitVerificationWorker2 = submitVerificationWorker;
                dataCollector = dataCollector2;
                if (it.hasNext()) {
                    selfie = (Selfie) it.next();
                    str4 = str15;
                    File file2 = new File(selfie.getAbsoluteFilePath());
                    if (selfie instanceof Selfie.SelfieImage) {
                        RealImageHelper realImageHelper = submitVerificationWorker2.imageHelper;
                        this.L$0 = flowCollector;
                        this.L$1 = arrayList;
                        this.L$2 = submitVerificationWorker2;
                        this.L$3 = it;
                        this.L$4 = selfie;
                        this.L$5 = file2;
                        Iterator it4 = it;
                        this.label = 1;
                        obj2 = realImageHelper.m4103resizeAndCompressImageInPlacegIAlus(file2, this);
                        if (obj2 != coroutineSingletons4) {
                            file = file2;
                            it2 = it4;
                            if (Result.m4120exceptionOrNullimpl(obj2) == null) {
                                SubmitVerificationWorker.Response.Error error = new SubmitVerificationWorker.Response.Error(new InternalErrorInfo.UnknownErrorInfo("Error processing image file in SubmitVerificationWorker."));
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.label = 2;
                                break;
                            } else {
                                Selfie.SelfieImage selfieImage = (Selfie.SelfieImage) selfie;
                                int ordinal = selfieImage.pose.ordinal();
                                if (ordinal != 0) {
                                    coroutineSingletons2 = coroutineSingletons4;
                                    if (ordinal == 1) {
                                        str10 = "left_photo";
                                    } else {
                                        if (ordinal != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str10 = "right_photo";
                                    }
                                } else {
                                    coroutineSingletons2 = coroutineSingletons4;
                                    str10 = "center_photo";
                                }
                                String str19 = submitVerificationWorker2.fieldKeySelfie;
                                String str20 = str10;
                                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str19, str18);
                                str5 = str18;
                                SelfieType selfieType = submitVerificationWorker2.selfieType;
                                if (Intrinsics.areEqual(selfieType, centerOnly2)) {
                                    str11 = "photo";
                                } else {
                                    if (!Intrinsics.areEqual(selfieType, threePhotos2) && !Intrinsics.areEqual(selfieType, configurablePoses2)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str11 = str20;
                                }
                                MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData(m, str11);
                                configurablePoses = configurablePoses2;
                                MultipartBody.Part createFormData2 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str19, str17), selfieImage.captureMethod.method);
                                String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str19, "][files][][captured-at]");
                                threePhotos = threePhotos2;
                                centerOnly = centerOnly2;
                                str7 = str17;
                                String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).format(new Date(selfieImage.capturedTimestamp));
                                format2.getClass();
                                MultipartBody.Part createFormData3 = MultipartBody.Part.Companion.createFormData(m2, format2);
                                StringBuilder sb = new StringBuilder("data[attributes][fields][");
                                sb.append(str19);
                                str6 = str3;
                                sb.append(str6);
                                arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{createFormData, createFormData2, createFormData3, MultipartBody.Part.Companion.createFormData(sb.toString(), "image")}));
                                SubmitVerificationWorker.FileType fileType = SubmitVerificationWorker.FileType.IMAGE;
                                this.L$0 = flowCollector;
                                this.L$1 = arrayList;
                                this.L$2 = submitVerificationWorker2;
                                this.L$3 = it2;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.label = 3;
                                obj3 = SubmitVerificationWorker.m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A(submitVerificationWorker2, file, fileType, arrayList, this);
                                coroutineSingletons = coroutineSingletons2;
                                if (obj3 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(obj3);
                                if (m4120exceptionOrNullimpl2 == null) {
                                    it = it2;
                                    str8 = str5;
                                    str9 = str7;
                                    str3 = str6;
                                    str18 = str8;
                                    str17 = str9;
                                    str15 = str4;
                                    configurablePoses2 = configurablePoses;
                                    threePhotos2 = threePhotos;
                                    centerOnly2 = centerOnly;
                                    coroutineSingletons4 = coroutineSingletons;
                                    dataCollector2 = dataCollector;
                                    dataCollector = dataCollector2;
                                    if (it.hasNext()) {
                                        String str21 = str15;
                                        SelfieType.ConfigurablePoses configurablePoses3 = configurablePoses2;
                                        SelfieType.ThreePhotos threePhotos3 = threePhotos2;
                                        SelfieType.CenterOnly centerOnly3 = centerOnly2;
                                        String str22 = str17;
                                        String str23 = str18;
                                        coroutineSingletons3 = coroutineSingletons4;
                                        String str24 = str3;
                                        if (str != null) {
                                            StringBuilder sb2 = new StringBuilder("data[attributes][fields][");
                                            str12 = str2;
                                            sb2.append(str12);
                                            sb2.append(str23);
                                            MultipartBody.Part createFormData4 = MultipartBody.Part.Companion.createFormData(sb2.toString(), "video");
                                            String m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, str22);
                                            Selfie.CaptureMethod captureMethod = Selfie.CaptureMethod.AUTO;
                                            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{createFormData4, MultipartBody.Part.Companion.createFormData(m3, "auto"), MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str12 + str24, "video"), MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str12 + "][files][][objectId]", str)}));
                                        } else {
                                            str12 = str2;
                                        }
                                        SubmitVerificationWorker submitVerificationWorker4 = submitVerificationWorker;
                                        MultipartBody.Part createFormData5 = MultipartBody.Part.Companion.createFormData("data[id]", submitVerificationWorker4.inquiryId);
                                        MultipartBody.Part createFormData6 = MultipartBody.Part.Companion.createFormData("data[type]", "inquiry");
                                        String m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][type]");
                                        SelfieType selfieType2 = submitVerificationWorker4.selfieType;
                                        if (Intrinsics.areEqual(selfieType2, centerOnly3)) {
                                            str13 = "only_center";
                                        } else if (Intrinsics.areEqual(selfieType2, threePhotos3)) {
                                            str13 = "profile_and_center";
                                        } else {
                                            if (!Intrinsics.areEqual(selfieType2, configurablePoses3)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            str13 = "configurable_poses";
                                        }
                                        MultipartBody.Part createFormData7 = MultipartBody.Part.Companion.createFormData(m4, str13);
                                        String m5 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][capture-started-at]");
                                        String format3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).format(new Date(submitVerificationWorker4.startSelfieTimestamp));
                                        format3.getClass();
                                        MultipartBody.Part createFormData8 = MultipartBody.Part.Companion.createFormData(m5, format3);
                                        MultipartBody.Part createFormData9 = MultipartBody.Part.Companion.createFormData("meta[from_component]", submitVerificationWorker4.fromComponent);
                                        MultipartBody.Part createFormData10 = MultipartBody.Part.Companion.createFormData("meta[from_step]", str21);
                                        CameraProperties cameraProperties3 = cameraProperties;
                                        MultipartBody.Part createFormData11 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][label]"), cameraProperties3.label);
                                        String m6 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][facing_mode]");
                                        if (WhenMappings.$EnumSwitchMapping$1[cameraProperties3.facingMode.ordinal()] == 1) {
                                            lowerCase = "";
                                        } else {
                                            lowerCase = cameraProperties3.facingMode.toString().toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                        }
                                        MultipartBody.Part createFormData12 = MultipartBody.Part.Companion.createFormData(m6, lowerCase);
                                        MultipartBody.Part createFormData13 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][width]"), String.valueOf(cameraProperties3.size.getWidth()));
                                        MultipartBody.Part createFormData14 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][height]"), String.valueOf(cameraProperties3.size.getHeight()));
                                        MultipartBody.Part createFormData15 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][aspectRatio]"), String.valueOf(cameraProperties3.getAspectRatio()));
                                        MultipartBody.Part createFormData16 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][frameRate]"), String.valueOf(cameraProperties3.frameRate));
                                        MultipartBody.Part createFormData17 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str12 + "][cameraProperties][kind]", "");
                                        MultipartBody.Part createFormData18 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str12 + "][cameraProperties][selectedCameraIndex]", "");
                                        MultipartBody.Part createFormData19 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str12 + "][cameraProperties][streamStability]", "");
                                        MultipartBody.Part createFormData20 = MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str12 + "][cameraProperties][allCameraLabels]", "");
                                        MultipartBody.Part createFormData21 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][client]"), RootedDeviceUtilsKt.isDeviceRooted(submitVerificationWorker4.context) ? "mobile" : "mobile_sdk");
                                        MultipartBody.Part createFormData22 = MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][platform]"), EmulatorDeviceUtilsKt.isDeviceEmulator() ? "android" : "android_sdk");
                                        String m7 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str12, "][cameraProperties][factor]");
                                        RealCameraStatsManager realCameraStatsManager = submitVerificationWorker4.cameraStatsManager;
                                        long j = realCameraStatsManager.measurementsTaken;
                                        arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{createFormData5, createFormData6, createFormData7, createFormData8, createFormData9, createFormData10, createFormData11, createFormData12, createFormData13, createFormData14, createFormData15, createFormData16, createFormData17, createFormData18, createFormData19, createFormData20, createFormData21, createFormData22, MultipartBody.Part.Companion.createFormData(m7, String.valueOf(j == 0 ? 0.0d : realCameraStatsManager.averageRotationPerMeasurement / j))}));
                                        ResetViewModel.AnonymousClass1 anonymousClass1 = new ResetViewModel.AnonymousClass1(submitVerificationWorker4, arrayList, null, 5);
                                        this.L$0 = flowCollector;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.label = 9;
                                        enqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass1, this);
                                        if (enqueueVerificationRequestWithRetry == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        flowCollector3 = flowCollector;
                                        networkCallResult = (NetworkCallResult) enqueueVerificationRequestWithRetry;
                                        if (networkCallResult instanceof NetworkCallResult.Success) {
                                            ((NetworkCallResult.Success) networkCallResult).getResponse();
                                            if (!dataCollector.isActive()) {
                                                for (Selfie selfie2 : list) {
                                                    if (selfie2 instanceof Selfie.SelfieImage) {
                                                        new File(((Selfie.SelfieImage) selfie2).absoluteFilePath).delete();
                                                    }
                                                }
                                            }
                                            this.L$0 = flowCollector3;
                                            this.L$1 = networkCallResult;
                                            this.label = 10;
                                            if (flowCollector3.emit(SubmitVerificationWorker.Response.Success.INSTANCE, this) == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                        }
                                        if (networkCallResult instanceof NetworkCallResult.Failure) {
                                            SubmitVerificationWorker.Response.Error error2 = new SubmitVerificationWorker.Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                                            this.L$0 = networkCallResult;
                                            this.L$1 = null;
                                            this.label = 11;
                                            if (flowCollector3.emit(error2, this) == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (m4120exceptionOrNullimpl2 instanceof SubmitVerificationWorker.InternalErrorException) {
                                        SubmitVerificationWorker.Response.Error error3 = new SubmitVerificationWorker.Response.Error(((SubmitVerificationWorker.InternalErrorException) m4120exceptionOrNullimpl2).errorInfo);
                                        this.L$0 = flowCollector;
                                        this.L$1 = arrayList;
                                        this.L$2 = submitVerificationWorker2;
                                        this.L$3 = it2;
                                        this.L$4 = obj3;
                                        this.label = 4;
                                        if (flowCollector.emit(error3, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        String message = m4120exceptionOrNullimpl2.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        SubmitVerificationWorker.Response.Error error4 = new SubmitVerificationWorker.Response.Error(new InternalErrorInfo.UnknownErrorInfo(message));
                                        this.L$0 = flowCollector;
                                        this.L$1 = arrayList;
                                        this.L$2 = submitVerificationWorker2;
                                        this.L$3 = it2;
                                        this.L$4 = obj3;
                                        this.label = 5;
                                        if (flowCollector.emit(error4, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                    flowCollector = flowCollector;
                                    str8 = str5;
                                    str9 = str7;
                                    it = it2;
                                    str3 = str6;
                                    str18 = str8;
                                    str17 = str9;
                                    str15 = str4;
                                    configurablePoses2 = configurablePoses;
                                    threePhotos2 = threePhotos;
                                    centerOnly2 = centerOnly;
                                    coroutineSingletons4 = coroutineSingletons;
                                    dataCollector2 = dataCollector;
                                    dataCollector = dataCollector2;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return coroutineSingletons4;
                    }
                    String str25 = str18;
                    Iterator it5 = it;
                    coroutineSingletons = coroutineSingletons4;
                    configurablePoses = configurablePoses2;
                    threePhotos = threePhotos2;
                    centerOnly = centerOnly2;
                    String str26 = str17;
                    str6 = str3;
                    if (!(selfie instanceof Selfie.SelfieVideo)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str27 = submitVerificationWorker2.fieldKeySelfie;
                    StringBuilder sb3 = new StringBuilder("data[attributes][fields][");
                    sb3.append(str27);
                    str8 = str25;
                    sb3.append(str8);
                    str9 = str26;
                    arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{MultipartBody.Part.Companion.createFormData(sb3.toString(), "video"), MultipartBody.Part.Companion.createFormData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("data[attributes][fields][", str27, str9), ((Selfie.SelfieVideo) selfie).captureMethod.method), MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + str27 + str6, "video")}));
                    SubmitVerificationWorker.FileType fileType2 = SubmitVerificationWorker.FileType.VIDEO;
                    this.L$0 = flowCollector;
                    this.L$1 = arrayList;
                    this.L$2 = submitVerificationWorker2;
                    this.L$3 = it5;
                    this.L$4 = null;
                    this.label = 6;
                    Object m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A = SubmitVerificationWorker.m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A(submitVerificationWorker2, file2, fileType2, arrayList, this);
                    if (m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj4 = m4100access$uploadIfNeededAndAddFileToBodyBWLJW6A;
                    it2 = it5;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj4);
                    if (m4120exceptionOrNullimpl != null) {
                        if (m4120exceptionOrNullimpl instanceof SubmitVerificationWorker.InternalErrorException) {
                            SubmitVerificationWorker.Response.Error error5 = new SubmitVerificationWorker.Response.Error(((SubmitVerificationWorker.InternalErrorException) m4120exceptionOrNullimpl).errorInfo);
                            this.L$0 = flowCollector;
                            this.L$1 = arrayList;
                            this.L$2 = submitVerificationWorker2;
                            this.L$3 = it2;
                            this.L$4 = obj4;
                            this.label = 7;
                            if (flowCollector.emit(error5, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            flowCollector2 = flowCollector;
                        } else {
                            String message2 = m4120exceptionOrNullimpl.getMessage();
                            if (message2 == null) {
                                message2 = "";
                            }
                            SubmitVerificationWorker.Response.Error error6 = new SubmitVerificationWorker.Response.Error(new InternalErrorInfo.UnknownErrorInfo(message2));
                            this.L$0 = flowCollector;
                            this.L$1 = arrayList;
                            this.L$2 = submitVerificationWorker2;
                            this.L$3 = it2;
                            this.L$4 = obj4;
                            this.label = 8;
                            if (flowCollector.emit(error6, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            flowCollector2 = flowCollector;
                        }
                        flowCollector = flowCollector2;
                    }
                    it = it2;
                    str3 = str6;
                    str18 = str8;
                    str17 = str9;
                    str15 = str4;
                    configurablePoses2 = configurablePoses;
                    threePhotos2 = threePhotos;
                    centerOnly2 = centerOnly;
                    coroutineSingletons4 = coroutineSingletons;
                    dataCollector2 = dataCollector;
                    dataCollector = dataCollector2;
                    if (it.hasNext()) {
                    }
                }
                break;
            case 1:
                cameraProperties = cameraProperties2;
                File file3 = this.L$5;
                Selfie selfie3 = (Selfie) this.L$4;
                Iterator it6 = this.L$3;
                SubmitVerificationWorker submitVerificationWorker5 = this.L$2;
                ?? r6 = (List) this.L$1;
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                obj2 = ((Result) obj).value;
                submitVerificationWorker = submitVerificationWorker3;
                arrayList = r6;
                dataCollector = dataCollector2;
                file = file3;
                str = str14;
                submitVerificationWorker2 = submitVerificationWorker5;
                str3 = "][files][][type]";
                selfie = selfie3;
                str4 = str15;
                it2 = it6;
                str2 = str16;
                flowCollector = flowCollector5;
                if (Result.m4120exceptionOrNullimpl(obj2) == null) {
                }
                break;
            case 2:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                cameraProperties = cameraProperties2;
                Iterator it7 = this.L$3;
                SubmitVerificationWorker submitVerificationWorker6 = this.L$2;
                ?? r62 = (List) this.L$1;
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                obj3 = ((Result) obj).value;
                str4 = str15;
                dataCollector = dataCollector2;
                str5 = "][files][][name]";
                coroutineSingletons = coroutineSingletons4;
                str6 = "][files][][type]";
                configurablePoses = configurablePoses2;
                threePhotos = threePhotos2;
                centerOnly = centerOnly2;
                str7 = "][files][][capture-method]";
                it2 = it7;
                str = str14;
                submitVerificationWorker2 = submitVerificationWorker6;
                submitVerificationWorker = submitVerificationWorker3;
                arrayList = r62;
                str2 = str16;
                flowCollector = flowCollector6;
                m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(obj3);
                if (m4120exceptionOrNullimpl2 == null) {
                }
                break;
            case 4:
            case 5:
                cameraProperties = cameraProperties2;
                Iterator it8 = this.L$3;
                SubmitVerificationWorker submitVerificationWorker7 = this.L$2;
                ?? r63 = (List) this.L$1;
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                str4 = str15;
                dataCollector = dataCollector2;
                coroutineSingletons = coroutineSingletons4;
                str6 = "][files][][type]";
                configurablePoses = configurablePoses2;
                threePhotos = threePhotos2;
                centerOnly = centerOnly2;
                it2 = it8;
                str = str14;
                submitVerificationWorker2 = submitVerificationWorker7;
                submitVerificationWorker = submitVerificationWorker3;
                arrayList = r63;
                str2 = str16;
                flowCollector = flowCollector7;
                str8 = "][files][][name]";
                str9 = "][files][][capture-method]";
                it = it2;
                str3 = str6;
                str18 = str8;
                str17 = str9;
                str15 = str4;
                configurablePoses2 = configurablePoses;
                threePhotos2 = threePhotos;
                centerOnly2 = centerOnly;
                coroutineSingletons4 = coroutineSingletons;
                dataCollector2 = dataCollector;
                dataCollector = dataCollector2;
                if (it.hasNext()) {
                }
                break;
            case 6:
                cameraProperties = cameraProperties2;
                Iterator it9 = this.L$3;
                SubmitVerificationWorker submitVerificationWorker8 = this.L$2;
                ?? r64 = (List) this.L$1;
                FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                obj4 = ((Result) obj).value;
                str4 = str15;
                dataCollector = dataCollector2;
                coroutineSingletons = coroutineSingletons4;
                str6 = "][files][][type]";
                configurablePoses = configurablePoses2;
                threePhotos = threePhotos2;
                centerOnly = centerOnly2;
                str9 = "][files][][capture-method]";
                it2 = it9;
                str = str14;
                str8 = "][files][][name]";
                submitVerificationWorker2 = submitVerificationWorker8;
                submitVerificationWorker = submitVerificationWorker3;
                arrayList = r64;
                str2 = str16;
                flowCollector = flowCollector8;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj4);
                if (m4120exceptionOrNullimpl != null) {
                }
                it = it2;
                str3 = str6;
                str18 = str8;
                str17 = str9;
                str15 = str4;
                configurablePoses2 = configurablePoses;
                threePhotos2 = threePhotos;
                centerOnly2 = centerOnly;
                coroutineSingletons4 = coroutineSingletons;
                dataCollector2 = dataCollector;
                dataCollector = dataCollector2;
                if (it.hasNext()) {
                }
                break;
            case 7:
            case 8:
                cameraProperties = cameraProperties2;
                Iterator it10 = this.L$3;
                SubmitVerificationWorker submitVerificationWorker9 = this.L$2;
                ?? r65 = (List) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                str4 = str15;
                dataCollector = dataCollector2;
                coroutineSingletons = coroutineSingletons4;
                str6 = "][files][][type]";
                configurablePoses = configurablePoses2;
                threePhotos = threePhotos2;
                centerOnly = centerOnly2;
                str9 = "][files][][capture-method]";
                it2 = it10;
                str = str14;
                str8 = "][files][][name]";
                submitVerificationWorker2 = submitVerificationWorker9;
                submitVerificationWorker = submitVerificationWorker3;
                arrayList = r65;
                str2 = str16;
                flowCollector = flowCollector2;
                it = it2;
                str3 = str6;
                str18 = str8;
                str17 = str9;
                str15 = str4;
                configurablePoses2 = configurablePoses;
                threePhotos2 = threePhotos;
                centerOnly2 = centerOnly;
                coroutineSingletons4 = coroutineSingletons;
                dataCollector2 = dataCollector;
                dataCollector = dataCollector2;
                if (it.hasNext()) {
                }
                break;
            case 9:
                FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                flowCollector3 = flowCollector9;
                dataCollector = dataCollector2;
                coroutineSingletons3 = coroutineSingletons4;
                enqueueVerificationRequestWithRetry = obj;
                networkCallResult = (NetworkCallResult) enqueueVerificationRequestWithRetry;
                if (networkCallResult instanceof NetworkCallResult.Success) {
                }
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 10:
                networkCallResult = (NetworkCallResult) this.L$1;
                flowCollector3 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons3 = coroutineSingletons4;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                }
                return Unit.INSTANCE;
            case 11:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
