package com.onesignal.notifications.internal.pushtoken;

import dd.f;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements com.onesignal.notifications.internal.pushtoken.a {
    private final ja.c _deviceService;
    private final kc.b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.retrievePushToken(this);
        }
    }

    public c(kc.b bVar, ja.c cVar) {
        bVar.getClass();
        cVar.getClass();
        this._pushRegistrator = bVar;
        this._deviceService = cVar;
        this.pushTokenStatus = f.NO_PERMISSION;
    }

    private final boolean pushStatusRuntimeError(f fVar) {
        return fVar.getValue() < -6;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final f getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.pushtoken.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePushToken(ld.a aVar) {
        a aVar2;
        int i3;
        c cVar;
        int value;
        f fVar;
        f fVar2;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    int i11 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i11 == 1) {
                        com.onesignal.debug.internal.logging.b.fatal$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
                    } else if (i11 != 2) {
                        kc.b bVar = this._pushRegistrator;
                        aVar2.L$0 = this;
                        aVar2.label = 1;
                        obj = bVar.registerForPush(aVar2);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        cVar = this;
                    } else {
                        com.onesignal.debug.internal.logging.b.fatal$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                        this.pushTokenStatus = f.OUTDATED_JETPACK_LIBRARY;
                    }
                    cVar = this;
                    return new d(cVar.pushToken, cVar.pushTokenStatus);
                }
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) aVar2.L$0;
                cf.c.M(obj);
                kc.a aVar4 = (kc.a) obj;
                value = aVar4.getStatus().getValue();
                fVar = f.SUBSCRIBED;
                if (value != fVar.getValue()) {
                    cVar.pushTokenStatus = aVar4.getStatus();
                } else if (aVar4.getStatus().getValue() < fVar.getValue()) {
                    if (cVar.pushToken == null && ((fVar2 = cVar.pushTokenStatus) == f.NO_PERMISSION || cVar.pushStatusRuntimeError(fVar2))) {
                        cVar.pushTokenStatus = aVar4.getStatus();
                    }
                } else if (cVar.pushStatusRuntimeError(cVar.pushTokenStatus)) {
                    cVar.pushTokenStatus = aVar4.getStatus();
                }
                cVar.pushToken = aVar4.getId();
                return new d(cVar.pushToken, cVar.pushTokenStatus);
            }
        }
        aVar2 = new a(aVar);
        Object obj2 = aVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        kc.a aVar42 = (kc.a) obj2;
        value = aVar42.getStatus().getValue();
        fVar = f.SUBSCRIBED;
        if (value != fVar.getValue()) {
        }
        cVar.pushToken = aVar42.getId();
        return new d(cVar.pushToken, cVar.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(f fVar) {
        fVar.getClass();
        this.pushTokenStatus = fVar;
    }
}
