package com.onesignal.location.internal;

import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.permissions.LocationPermissionController;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LocationManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.location.internal.LocationManager$requestPermission$2", f = "LocationManager.kt", i = {}, l = {110, 151, 156, 159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class LocationManager$requestPermission$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ Ref.BooleanRef $result;
    Object L$0;
    int label;
    final /* synthetic */ LocationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationManager$requestPermission$2(LocationManager locationManager, Ref.BooleanRef booleanRef, Continuation<? super LocationManager$requestPermission$2> continuation) {
        super(2, continuation);
        this.this$0 = locationManager;
        this.$result = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocationManager$requestPermission$2(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((LocationManager$requestPermission$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r2 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        if (r2 == r1) goto L65;
     */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IApplicationService iApplicationService;
        boolean z;
        ?? r17;
        boolean z2;
        Object startGetLocation;
        Object backgroundLocationPermissionLogic;
        Ref.BooleanRef booleanRef;
        IApplicationService iApplicationService2;
        Ref.BooleanRef booleanRef2;
        LocationPermissionController locationPermissionController;
        Object prompt;
        Ref.BooleanRef booleanRef3;
        Object startGetLocation2;
        IApplicationService iApplicationService3;
        IApplicationService iApplicationService4;
        ILocationCapturer iLocationCapturer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = null;
            if (!this.this$0.get_isShared()) {
                Logging.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            iApplicationService = this.this$0._applicationService;
            boolean hasPermission = androidUtils.hasPermission(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, true, iApplicationService);
            if (hasPermission) {
                z = false;
            } else {
                AndroidUtils androidUtils2 = AndroidUtils.INSTANCE;
                iApplicationService4 = this.this$0._applicationService;
                z = androidUtils2.hasPermission(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING, true, iApplicationService4);
                iLocationCapturer = this.this$0._capturer;
                iLocationCapturer.setLocationCoarse(true);
            }
            int androidSDKInt = AndroidUtils.INSTANCE.getAndroidSDKInt();
            if (androidSDKInt >= 29) {
                AndroidUtils androidUtils3 = AndroidUtils.INSTANCE;
                r17 = 0;
                iApplicationService3 = this.this$0._applicationService;
                z2 = androidUtils3.hasPermission(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, true, iApplicationService3);
            } else {
                r17 = 0;
                z2 = false;
            }
            if (androidSDKInt < 23) {
                if (hasPermission || z) {
                    this.label = 1;
                    startGetLocation2 = this.this$0.startGetLocation(this);
                } else {
                    Logging.info$default("Location permissions not added on AndroidManifest file < M", null, 2, null);
                    return Boxing.boxBoolean(r17);
                }
            } else if (!hasPermission) {
                AndroidUtils androidUtils4 = AndroidUtils.INSTANCE;
                String[] strArr = new String[3];
                strArr[r17] = LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING;
                strArr[1] = LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING;
                strArr[2] = LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING;
                List<String> listOf = CollectionsKt.listOf((Object[]) strArr);
                iApplicationService2 = this.this$0._applicationService;
                List<String> filterManifestPermissions = androidUtils4.filterManifestPermissions(listOf, iApplicationService2);
                if (filterManifestPermissions.contains(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING)) {
                    str = LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING;
                } else if (!filterManifestPermissions.contains(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING)) {
                    Logging.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                } else if (!z) {
                    str = LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING;
                } else if (androidSDKInt >= 29 && filterManifestPermissions.contains(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING)) {
                    str = LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING;
                }
                booleanRef2 = this.$result;
                if (str != null) {
                    locationPermissionController = this.this$0._locationPermissionController;
                    this.L$0 = booleanRef2;
                    this.label = 2;
                    prompt = locationPermissionController.prompt(true, str, this);
                    if (prompt != coroutine_suspended) {
                        booleanRef3 = booleanRef2;
                        z = ((Boolean) prompt).booleanValue();
                        booleanRef2 = booleanRef3;
                    }
                }
                booleanRef2.element = z;
            } else if (androidSDKInt >= 29 && !z2) {
                Ref.BooleanRef booleanRef4 = this.$result;
                this.L$0 = booleanRef4;
                this.label = 3;
                backgroundLocationPermissionLogic = this.this$0.backgroundLocationPermissionLogic(true, this);
                if (backgroundLocationPermissionLogic != coroutine_suspended) {
                    booleanRef = booleanRef4;
                    booleanRef.element = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
                }
            } else {
                this.$result.element = true;
                this.label = 4;
                startGetLocation = this.this$0.startGetLocation(this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.$result.element = true;
        } else if (i == 2) {
            booleanRef3 = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            prompt = obj;
            z = ((Boolean) prompt).booleanValue();
            booleanRef2 = booleanRef3;
            booleanRef2.element = z;
        } else if (i == 3) {
            booleanRef = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            backgroundLocationPermissionLogic = obj;
            booleanRef.element = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
