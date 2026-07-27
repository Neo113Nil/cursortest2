package com.onesignal.user.internal.operations.impl.executors;

import K1.b;
import a.AbstractC0169a;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
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
import e5.g;
import f4.InterfaceC0428e;
import g4.AbstractC0465j;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class CustomEventOperationExecutor implements IOperationExecutor {
    public static final String CUSTOM_EVENT = "custom-event";
    public static final Companion Companion = new Companion(null);
    private final IApplicationService applicationService;
    private final ICustomEventBackendService customEventBackendService;
    private final IDeviceService deviceService;
    private final InterfaceC0428e eventMetadataJson$delegate;
    private final IdentityVerificationService identityVerificationService;
    private final JwtTokenStore jwtTokenStore;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

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
        i.e(customEventBackendService, "customEventBackendService");
        i.e(applicationService, "applicationService");
        i.e(deviceService, "deviceService");
        i.e(jwtTokenStore, "jwtTokenStore");
        i.e(identityVerificationService, "identityVerificationService");
        this.customEventBackendService = customEventBackendService;
        this.applicationService = applicationService;
        this.deviceService = deviceService;
        this.jwtTokenStore = jwtTokenStore;
        this.identityVerificationService = identityVerificationService;
        this.eventMetadataJson$delegate = AbstractC0169a.A(new CustomEventOperationExecutor$eventMetadataJson$2(this));
    }

    private final CustomEventMetadata getEventMetadataJson() {
        return (CustomEventMetadata) this.eventMetadataJson$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        CustomEventOperationExecutor$execute$1 customEventOperationExecutor$execute$1;
        int i2;
        ExecutionResponse executionResponse;
        try {
            if (interfaceC1218d instanceof CustomEventOperationExecutor$execute$1) {
                customEventOperationExecutor$execute$1 = (CustomEventOperationExecutor$execute$1) interfaceC1218d;
                int i3 = customEventOperationExecutor$execute$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    customEventOperationExecutor$execute$1.label = i3 - Integer.MIN_VALUE;
                    CustomEventOperationExecutor$execute$1 customEventOperationExecutor$execute$12 = customEventOperationExecutor$execute$1;
                    Object obj = customEventOperationExecutor$execute$12.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = customEventOperationExecutor$execute$12.label;
                    if (i2 != 0) {
                        g.y(obj);
                        Operation operation = (Operation) AbstractC0465j.F0(list);
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
                            if (iCustomEventBackendService.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, resolveJwt, customEventOperationExecutor$execute$12) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i2 != 0) {
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
        } catch (BackendException e3) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e3.getStatusCode()).ordinal()];
            if (i6 == 1) {
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e3.getRetryAfterSeconds(), 6, null);
            } else {
                if (i6 != 2) {
                    return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                }
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e3.getRetryAfterSeconds(), 6, null);
            }
            return executionResponse;
        }
        customEventOperationExecutor$execute$1 = new CustomEventOperationExecutor$execute$1(this, interfaceC1218d);
        CustomEventOperationExecutor$execute$1 customEventOperationExecutor$execute$122 = customEventOperationExecutor$execute$1;
        Object obj2 = customEventOperationExecutor$execute$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = customEventOperationExecutor$execute$122.label;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return b.W(CUSTOM_EVENT);
    }
}
