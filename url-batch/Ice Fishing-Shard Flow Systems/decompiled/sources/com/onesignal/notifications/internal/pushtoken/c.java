package com.onesignal.notifications.internal.pushtoken;

import Y3.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements com.onesignal.notifications.internal.pushtoken.a {
    private final A2.c _deviceService;
    private final B3.b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

    public static final class a extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.retrievePushToken(this);
        }
    }

    public c(B3.b _pushRegistrator, A2.c _deviceService) {
        Intrinsics.checkNotNullParameter(_pushRegistrator, "_pushRegistrator");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        this._pushRegistrator = _pushRegistrator;
        this._deviceService = _deviceService;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.pushtoken.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePushToken(V5.b bVar) {
        a aVar;
        int i2;
        c cVar;
        int value;
        f fVar;
        f fVar2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = aVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    int i7 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i7 == 1) {
                        com.onesignal.debug.internal.logging.b.info$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
                    } else if (i7 != 2) {
                        B3.b bVar2 = this._pushRegistrator;
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = bVar2.registerForPush(aVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        cVar = this;
                    } else {
                        com.onesignal.debug.internal.logging.b.info$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                        this.pushTokenStatus = f.OUTDATED_JETPACK_LIBRARY;
                    }
                    cVar = this;
                    return new d(cVar.pushToken, cVar.pushTokenStatus);
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.L$0;
                V6.b.P(obj);
                B3.a aVar3 = (B3.a) obj;
                value = aVar3.getStatus().getValue();
                fVar = f.SUBSCRIBED;
                if (value != fVar.getValue()) {
                    cVar.pushTokenStatus = aVar3.getStatus();
                } else if (aVar3.getStatus().getValue() < fVar.getValue()) {
                    if (cVar.pushToken == null && ((fVar2 = cVar.pushTokenStatus) == f.NO_PERMISSION || cVar.pushStatusRuntimeError(fVar2))) {
                        cVar.pushTokenStatus = aVar3.getStatus();
                    }
                } else if (cVar.pushStatusRuntimeError(cVar.pushTokenStatus)) {
                    cVar.pushTokenStatus = aVar3.getStatus();
                }
                cVar.pushToken = aVar3.getId();
                return new d(cVar.pushToken, cVar.pushTokenStatus);
            }
        }
        aVar = new a(bVar);
        Object obj2 = aVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
        }
        B3.a aVar32 = (B3.a) obj2;
        value = aVar32.getStatus().getValue();
        fVar = f.SUBSCRIBED;
        if (value != fVar.getValue()) {
        }
        cVar.pushToken = aVar32.getId();
        return new d(cVar.pushToken, cVar.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.pushTokenStatus = fVar;
    }
}
