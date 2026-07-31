package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import d2.C0317a;
import java.util.List;
import k5.InterfaceC0475e;
import l5.AbstractC0506j;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q3.InterfaceC0599a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class a implements d2.d {
    public static final String CUSTOM_EVENT = "custom-event";
    public static final C0082a Companion = new C0082a(null);
    private final T1.f applicationService;
    private final InterfaceC0599a customEventBackendService;
    private final Y1.c deviceService;
    private final InterfaceC0475e eventMetadataJson$delegate;
    private final com.onesignal.core.internal.config.impl.c identityVerificationService;
    private final com.onesignal.user.internal.jwt.c jwtTokenStore;

    /* renamed from: com.onesignal.user.internal.operations.impl.executors.a$a, reason: collision with other inner class name */
    public static final class C0082a {
        public /* synthetic */ C0082a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0082a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.j implements InterfaceC0732a {
        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.user.internal.customEvents.impl.c invoke() {
            return new com.onesignal.user.internal.customEvents.impl.c(a.this.deviceService.getDeviceType().name(), com.onesignal.common.h.INSTANCE.getSdkVersion(), AndroidUtils.INSTANCE.getAppVersion(a.this.applicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
        }
    }

    public static final class c extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.execute(null, this);
        }
    }

    public a(InterfaceC0599a customEventBackendService, T1.f applicationService, Y1.c deviceService, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        kotlin.jvm.internal.i.e(customEventBackendService, "customEventBackendService");
        kotlin.jvm.internal.i.e(applicationService, "applicationService");
        kotlin.jvm.internal.i.e(deviceService, "deviceService");
        kotlin.jvm.internal.i.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.i.e(identityVerificationService, "identityVerificationService");
        this.customEventBackendService = customEventBackendService;
        this.applicationService = applicationService;
        this.deviceService = deviceService;
        this.jwtTokenStore = jwtTokenStore;
        this.identityVerificationService = identityVerificationService;
        this.eventMetadataJson$delegate = AbstractC0521b.x(new b());
    }

    private final com.onesignal.user.internal.customEvents.impl.c getEventMetadataJson() {
        return (com.onesignal.user.internal.customEvents.impl.c) this.eventMetadataJson$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // d2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends d2.g> list, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        try {
            if (interfaceC0564d instanceof c) {
                cVar = (c) interfaceC0564d;
                int i8 = cVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i8 - Integer.MIN_VALUE;
                    c cVar2 = cVar;
                    Object obj = cVar2.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = cVar2.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        d2.g gVar = (d2.g) AbstractC0506j.E(list);
                        if (gVar instanceof s3.l) {
                            String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(gVar, this.jwtTokenStore, this.identityVerificationService);
                            InterfaceC0599a interfaceC0599a = this.customEventBackendService;
                            String appId = ((s3.l) gVar).getAppId();
                            String onesignalId = ((s3.l) gVar).getOnesignalId();
                            String externalId = gVar.getExternalId();
                            long timeStamp = ((s3.l) gVar).getTimeStamp();
                            String eventName = ((s3.l) gVar).getEventName();
                            String eventProperties = ((s3.l) gVar).getEventProperties();
                            com.onesignal.user.internal.customEvents.impl.c eventMetadataJson = getEventMetadataJson();
                            cVar2.label = 1;
                            if (interfaceC0599a.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, resolveJwt, cVar2) == enumC0580a) {
                                return enumC0580a;
                            }
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                    }
                    return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i7 != 0) {
            }
            return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
        } catch (P1.a e4) {
            int i9 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e4.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 2 ? new C0317a(d2.b.FAIL_NORETRY, null, null, null, 14, null) : new C0317a(d2.b.FAIL_UNAUTHORIZED, null, null, e4.getRetryAfterSeconds(), 6, null) : new C0317a(d2.b.FAIL_RETRY, null, null, e4.getRetryAfterSeconds(), 6, null);
        }
        cVar = new c(interfaceC0564d);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar22.label;
    }

    @Override // d2.d
    public List<String> getOperations() {
        return AbstractC0676f.n(CUSTOM_EVENT);
    }
}
