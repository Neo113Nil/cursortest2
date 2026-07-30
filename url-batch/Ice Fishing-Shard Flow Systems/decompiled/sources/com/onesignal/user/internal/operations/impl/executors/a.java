package com.onesignal.user.internal.operations.impl.executors;

import R5.InterfaceC0168h;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r2.C0846a;

/* loaded from: classes.dex */
public final class a implements F2.d {
    public static final String CUSTOM_EVENT = "custom-event";
    public static final C0082a Companion = new C0082a(null);
    private final v2.f applicationService;
    private final S3.a customEventBackendService;
    private final A2.c deviceService;
    private final InterfaceC0168h eventMetadataJson$delegate;
    private final com.onesignal.core.internal.config.impl.c identityVerificationService;
    private final com.onesignal.user.internal.jwt.c jwtTokenStore;

    /* renamed from: com.onesignal.user.internal.operations.impl.executors.a$a, reason: collision with other inner class name */
    public static final class C0082a {
        public /* synthetic */ C0082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0082a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.p implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.user.internal.customEvents.impl.c invoke() {
            return new com.onesignal.user.internal.customEvents.impl.c(a.this.deviceService.getDeviceType().name(), com.onesignal.common.h.INSTANCE.getSdkVersion(), AndroidUtils.INSTANCE.getAppVersion(a.this.applicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
        }
    }

    public static final class c extends X5.c {
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.execute(null, this);
        }
    }

    public a(S3.a customEventBackendService, v2.f applicationService, A2.c deviceService, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
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
        this.eventMetadataJson$delegate = R5.i.b(new b());
    }

    private final com.onesignal.user.internal.customEvents.impl.c getEventMetadataJson() {
        return (com.onesignal.user.internal.customEvents.impl.c) this.eventMetadataJson$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // F2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends F2.g> list, V5.b bVar) {
        c cVar;
        int i2;
        try {
            if (bVar instanceof c) {
                cVar = (c) bVar;
                int i5 = cVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i5 - Integer.MIN_VALUE;
                    c cVar2 = cVar;
                    Object obj = cVar2.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = cVar2.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        F2.g gVar = (F2.g) CollectionsKt.o(list);
                        if (gVar instanceof U3.l) {
                            String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(gVar, this.jwtTokenStore, this.identityVerificationService);
                            S3.a aVar2 = this.customEventBackendService;
                            String appId = ((U3.l) gVar).getAppId();
                            String onesignalId = ((U3.l) gVar).getOnesignalId();
                            String externalId = gVar.getExternalId();
                            long timeStamp = ((U3.l) gVar).getTimeStamp();
                            String eventName = ((U3.l) gVar).getEventName();
                            String eventProperties = ((U3.l) gVar).getEventProperties();
                            com.onesignal.user.internal.customEvents.impl.c eventMetadataJson = getEventMetadataJson();
                            cVar2.label = 1;
                            if (aVar2.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, resolveJwt, cVar2) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                    }
                    return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i2 != 0) {
            }
            return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
        } catch (C0846a e7) {
            int i7 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e7.getStatusCode()).ordinal()];
            return i7 != 1 ? i7 != 2 ? new F2.a(F2.b.FAIL_NORETRY, null, null, null, 14, null) : new F2.a(F2.b.FAIL_UNAUTHORIZED, null, null, e7.getRetryAfterSeconds(), 6, null) : new F2.a(F2.b.FAIL_RETRY, null, null, e7.getRetryAfterSeconds(), 6, null);
        }
        cVar = new c(bVar);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = cVar22.label;
    }

    @Override // F2.d
    public List<String> getOperations() {
        return kotlin.collections.q.b(CUSTOM_EVENT);
    }
}
