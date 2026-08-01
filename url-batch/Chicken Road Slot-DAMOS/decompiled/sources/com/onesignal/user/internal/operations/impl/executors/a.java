package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements na.d {
    public static final String CUSTOM_EVENT = "custom-event";
    public static final C0070a Companion = new C0070a(null);
    private final ea.f applicationService;
    private final xc.a customEventBackendService;
    private final ja.c deviceService;
    private final hd.g eventMetadataJson$delegate;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.user.internal.customEvents.impl.c invoke() {
            return new com.onesignal.user.internal.customEvents.impl.c(a.this.deviceService.getDeviceType().name(), com.onesignal.common.h.INSTANCE.getSdkVersion(), AndroidUtils.INSTANCE.getAppVersion(a.this.applicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.execute(null, this);
        }
    }

    public a(xc.a aVar, ea.f fVar, ja.c cVar) {
        aVar.getClass();
        fVar.getClass();
        cVar.getClass();
        this.customEventBackendService = aVar;
        this.applicationService = fVar;
        this.deviceService = cVar;
        this.eventMetadataJson$delegate = hd.h.b(new b());
    }

    private final com.onesignal.user.internal.customEvents.impl.c getEventMetadataJson() {
        return (com.onesignal.user.internal.customEvents.impl.c) this.eventMetadataJson$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // na.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends na.g> list, ld.a aVar) {
        c cVar;
        int i3;
        try {
            if (aVar instanceof c) {
                cVar = (c) aVar;
                int i10 = cVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i10 - Integer.MIN_VALUE;
                    c cVar2 = cVar;
                    Object obj = cVar2.result;
                    md.a aVar2 = md.a.f6622d;
                    i3 = cVar2.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        na.g gVar = (na.g) CollectionsKt.x(list);
                        if (gVar instanceof zc.l) {
                            xc.a aVar3 = this.customEventBackendService;
                            String appId = ((zc.l) gVar).getAppId();
                            String onesignalId = ((zc.l) gVar).getOnesignalId();
                            String externalId = ((zc.l) gVar).getExternalId();
                            long timeStamp = ((zc.l) gVar).getTimeStamp();
                            String eventName = ((zc.l) gVar).getEventName();
                            String eventProperties = ((zc.l) gVar).getEventProperties();
                            com.onesignal.user.internal.customEvents.impl.c eventMetadataJson = getEventMetadataJson();
                            cVar2.label = 1;
                            if (aVar3.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, cVar2) == aVar2) {
                                return aVar2;
                            }
                        }
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    return new na.a(na.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i3 != 0) {
            }
            return new na.a(na.b.SUCCESS, null, null, null, 14, null);
        } catch (z9.a e2) {
            return com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e2.getStatusCode()).ordinal()] == 1 ? new na.a(na.b.FAIL_RETRY, null, null, e2.getRetryAfterSeconds(), 6, null) : new na.a(na.b.FAIL_NORETRY, null, null, null, 14, null);
        }
        cVar = new c(aVar);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        md.a aVar22 = md.a.f6622d;
        i3 = cVar22.label;
    }

    @Override // na.d
    public List<String> getOperations() {
        return x.c(CUSTOM_EVENT);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.user.internal.operations.impl.executors.a$a, reason: collision with other inner class name */
    public static final class C0070a {
        public /* synthetic */ C0070a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0070a() {
        }
    }
}
