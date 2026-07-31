package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.customEvents.ICustomEventBackendService;
import com.onesignal.user.internal.customEvents.impl.CustomEventMetadata;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.TrackCustomEventOperation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomEventOperationExecutor.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\u0018\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0096@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/CustomEventOperationExecutor;", "Lcom/onesignal/core/internal/operations/IOperationExecutor;", "customEventBackendService", "Lcom/onesignal/user/internal/customEvents/ICustomEventBackendService;", "applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "(Lcom/onesignal/user/internal/customEvents/ICustomEventBackendService;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;)V", "eventMetadataJson", "Lcom/onesignal/user/internal/customEvents/impl/CustomEventMetadata;", "getEventMetadataJson", "()Lcom/onesignal/user/internal/customEvents/impl/CustomEventMetadata;", "eventMetadataJson$delegate", "Lkotlin/Lazy;", "operations", "", "", "getOperations", "()Ljava/util/List;", "execute", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "Lcom/onesignal/core/internal/operations/Operation;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomEventOperationExecutor implements IOperationExecutor {
    public static final String CUSTOM_EVENT = "custom-event";
    private final IApplicationService applicationService;
    private final ICustomEventBackendService customEventBackendService;
    private final IDeviceService deviceService;

    /* renamed from: eventMetadataJson$delegate, reason: from kotlin metadata */
    private final Lazy eventMetadataJson;
    private final IdentityVerificationService identityVerificationService;
    private final JwtTokenStore jwtTokenStore;

    /* compiled from: CustomEventOperationExecutor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CustomEventOperationExecutor(ICustomEventBackendService customEventBackendService, IApplicationService applicationService, IDeviceService deviceService, JwtTokenStore jwtTokenStore, IdentityVerificationService identityVerificationService) {
        Intrinsics.checkNotNullParameter(customEventBackendService, "customEventBackendService");
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        Intrinsics.checkNotNullParameter(deviceService, "deviceService");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(identityVerificationService, "identityVerificationService");
        this.customEventBackendService = customEventBackendService;
        this.applicationService = applicationService;
        this.deviceService = deviceService;
        this.jwtTokenStore = jwtTokenStore;
        this.identityVerificationService = identityVerificationService;
        this.eventMetadataJson = LazyKt.lazy(new Function0<CustomEventMetadata>() { // from class: com.onesignal.user.internal.operations.impl.executors.CustomEventOperationExecutor$eventMetadataJson$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CustomEventMetadata invoke() {
                IDeviceService iDeviceService;
                IApplicationService iApplicationService;
                iDeviceService = CustomEventOperationExecutor.this.deviceService;
                String name = iDeviceService.getDeviceType().name();
                String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                iApplicationService = CustomEventOperationExecutor.this.applicationService;
                return new CustomEventMetadata(name, sdkVersion, androidUtils.getAppVersion(iApplicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
            }
        });
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return CollectionsKt.listOf(CUSTOM_EVENT);
    }

    private final CustomEventMetadata getEventMetadataJson() {
        return (CustomEventMetadata) this.eventMetadataJson.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, Continuation<? super ExecutionResponse> continuation) {
        CustomEventOperationExecutor$execute$1 customEventOperationExecutor$execute$1;
        int i;
        try {
            if (continuation instanceof CustomEventOperationExecutor$execute$1) {
                customEventOperationExecutor$execute$1 = (CustomEventOperationExecutor$execute$1) continuation;
                if ((customEventOperationExecutor$execute$1.label & Integer.MIN_VALUE) != 0) {
                    customEventOperationExecutor$execute$1.label -= Integer.MIN_VALUE;
                    CustomEventOperationExecutor$execute$1 customEventOperationExecutor$execute$12 = customEventOperationExecutor$execute$1;
                    Object obj = customEventOperationExecutor$execute$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = customEventOperationExecutor$execute$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Operation operation = (Operation) CollectionsKt.first((List) list);
                        if (operation instanceof TrackCustomEventOperation) {
                            String resolveJwt = ExecutorsIvExtensionsKt.resolveJwt(operation, this.jwtTokenStore, this.identityVerificationService);
                            ICustomEventBackendService iCustomEventBackendService = this.customEventBackendService;
                            String appId = ((TrackCustomEventOperation) operation).getAppId();
                            String onesignalId = ((TrackCustomEventOperation) operation).getOnesignalId();
                            String externalId = operation.getExternalId();
                            long timeStamp = ((TrackCustomEventOperation) operation).getTimeStamp();
                            String eventName = ((TrackCustomEventOperation) operation).getEventName();
                            String eventProperties = ((TrackCustomEventOperation) operation).getEventProperties();
                            CustomEventMetadata eventMetadataJson = getEventMetadataJson();
                            customEventOperationExecutor$execute$12.label = 1;
                            if (iCustomEventBackendService.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, resolveJwt, customEventOperationExecutor$execute$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i != 0) {
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
        } catch (BackendException e) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
            if (i2 == 1) {
                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            if (i2 == 2) {
                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
            }
            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
        }
        customEventOperationExecutor$execute$1 = new CustomEventOperationExecutor$execute$1(this, continuation);
        CustomEventOperationExecutor$execute$1 customEventOperationExecutor$execute$122 = customEventOperationExecutor$execute$1;
        Object obj2 = customEventOperationExecutor$execute$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customEventOperationExecutor$execute$122.label;
    }
}
