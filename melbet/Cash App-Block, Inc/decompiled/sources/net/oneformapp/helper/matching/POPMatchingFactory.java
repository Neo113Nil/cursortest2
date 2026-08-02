package net.oneformapp.helper.matching;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.multipass.common.ScopedSession;
import com.squareup.stafftasks.resources.TaskType;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.views.Brand;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridgeKt;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import squareup.cash.cryptocurrency.CryptoEligibilityStatus;

/* loaded from: classes8.dex */
public final class POPMatchingFactory implements Consumer, TypeCheckingProcedureCallbacks {
    public final /* synthetic */ int $r8$classId;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public POPMatchingFactory() {
        Class<?> cls;
        this.$r8$classId = 19;
        Lazy lazy = WebRtcManagerBridgeKt.webRtcWrapperExists$delegate;
        try {
            cls = Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            cls.newInstance();
        }
    }

    public static Map addFraudDetectionData(LinkedHashMap linkedHashMap, FraudDetectionData fraudDetectionData) {
        Object obj;
        Iterator it = ArraysKt___ArraysKt.toSet(new String[]{"source_data", "payment_method_data"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (linkedHashMap.containsKey((String) obj)) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return linkedHashMap;
        }
        Object obj2 = linkedHashMap.get(str);
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        if (map == null) {
            return linkedHashMap;
        }
        Map params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = EmptyMap.INSTANCE;
            params.getClass();
        }
        return MapsKt__MapsKt.plus(linkedHashMap, MapsKt__MapsJVMKt.mapOf(new Pair(str, MapsKt__MapsKt.plus(map, params))));
    }

    public static ScopedSession fromValue(int i) {
        if (i == 0) {
            return ScopedSession.SQUARE;
        }
        if (i == 1) {
            return ScopedSession.CAPITAL_PARTNERSHIPS;
        }
        if (i == 2) {
            return ScopedSession.BUYER;
        }
        if (i == 3) {
            return ScopedSession.CAPITAL_CONSUMER;
        }
        if (i == 4) {
            return ScopedSession.HIRING_WEB;
        }
        if (i != 5) {
            return null;
        }
        return ScopedSession.SQUARE_BUYER;
    }

    public static boolean isVideoCapture(GovernmentIdWorkflow.Input input) {
        input.getClass();
        VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(input);
        return videoCaptureMethod == VideoCaptureMethod.Stream || videoCaptureMethod == VideoCaptureMethod.Upload;
    }

    public static Brand lookup$3ds2sdk_release(String str, DefaultErrorReporter defaultErrorReporter) {
        Object obj;
        str.getClass();
        defaultErrorReporter.getClass();
        EnumEntriesList enumEntriesList = Brand.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (StringsKt__StringsJVMKt.equals(((Brand) obj).directoryServerName, StringsKt.trim(str).toString(), true)) {
                break;
            }
        }
        Object obj2 = (Brand) obj;
        if (obj2 != null) {
            Result.Companion companion = Result.Companion;
        } else {
            EnumEntriesList enumEntriesList2 = Brand.$ENTRIES;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList2, 10));
            ArrayIterator arrayIterator = new ArrayIterator(enumEntriesList2);
            while (arrayIterator.hasNext()) {
                arrayList.add(((Brand) arrayIterator.next()).directoryServerName);
            }
            Result.Companion companion2 = Result.Companion;
            obj2 = new Result.Failure(new SDKRuntimeException(NavAction$$ExternalSyntheticOutline0.m(arrayList, "Directory server name '", str, "' is not supported. Must be one of ", "."), null));
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
        if (m4120exceptionOrNullimpl != null) {
            defaultErrorReporter.reportError(m4120exceptionOrNullimpl);
        }
        Brand brand = Brand.Unknown;
        if (obj2 instanceof Result.Failure) {
            obj2 = brand;
        }
        return (Brand) obj2;
    }

    public static VideoCaptureMethod videoCaptureMethod(GovernmentIdWorkflow.Input input) {
        input.getClass();
        VideoCaptureConfig videoCaptureConfig = input.videoCaptureConfig;
        List list = videoCaptureConfig.videoCaptureMethods;
        if (!videoCaptureConfig.enabledCaptureFileTypes.contains(NextStep.GovernmentId.CaptureFileType.Video)) {
            return VideoCaptureMethod.None;
        }
        if (CollectionsKt.firstOrNull(list) == VideoCaptureMethod.Stream && !((Boolean) WebRtcManagerBridgeKt.webRtcWrapperExists$delegate.getValue()).booleanValue()) {
            VideoCaptureMethod videoCaptureMethod = VideoCaptureMethod.Upload;
            return list.contains(videoCaptureMethod) ? videoCaptureMethod : VideoCaptureMethod.None;
        }
        VideoCaptureMethod videoCaptureMethod2 = VideoCaptureMethod.Upload;
        if (list.contains(videoCaptureMethod2)) {
            return videoCaptureMethod2;
        }
        VideoCaptureMethod videoCaptureMethod3 = (VideoCaptureMethod) CollectionsKt.firstOrNull(list);
        return videoCaptureMethod3 == null ? VideoCaptureMethod.None : videoCaptureMethod3;
    }

    public static boolean webRtcConfigIsValid(GovernmentIdWorkflow.Input input) {
        input.getClass();
        VideoCaptureConfig videoCaptureConfig = input.videoCaptureConfig;
        return (videoCaptureConfig.enabledCaptureFileTypes.contains(NextStep.GovernmentId.CaptureFileType.Video) && CollectionsKt.firstOrNull(videoCaptureConfig.videoCaptureMethods) == VideoCaptureMethod.Stream && !((Boolean) WebRtcManagerBridgeKt.webRtcWrapperExists$delegate.getValue()).booleanValue()) ? false : true;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    public boolean assertEqualTypeConstructors(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (typeConstructor2 != null) {
            return typeConstructor.equals(typeConstructor2);
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 22:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ POPMatchingFactory(int i) {
        this.$r8$classId = i;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static TaskType m4317fromValue(int i) {
        if (i == 0) {
            return TaskType.DO_NOT_USE_TASK_TYPE;
        }
        if (i == 1) {
            return TaskType.REVIEW_PROFILE;
        }
        if (i == 2) {
            return TaskType.UPLOAD_DOCUMENT;
        }
        if (i == 3) {
            return TaskType.PAYROLL_ONBOARDING;
        }
        if (i != 4) {
            return null;
        }
        return TaskType.REVIEW_DOCUMENT;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static CryptoEligibilityStatus m4318fromValue(int i) {
        if (i == 0) {
            return CryptoEligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return CryptoEligibilityStatus.PENDING_APPROVAL;
        }
        if (i == 2) {
            return CryptoEligibilityStatus.CAN_BE_ELIGIBLE;
        }
        if (i == 3) {
            return CryptoEligibilityStatus.ELIGIBLE;
        }
        if (i != 4) {
            return null;
        }
        return CryptoEligibilityStatus.INELIGIBLE;
    }
}
