package com.onesignal.notifications.internal.pushtoken;

import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import w3.f;

/* loaded from: classes.dex */
public final class c implements com.onesignal.notifications.internal.pushtoken.a {
    private final Y1.c _deviceService;
    private final Z2.b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

    public static final class a extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.retrievePushToken(this);
        }
    }

    public c(Z2.b _pushRegistrator, Y1.c _deviceService) {
        i.e(_pushRegistrator, "_pushRegistrator");
        i.e(_deviceService, "_deviceService");
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
    public Object retrievePushToken(InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
        c cVar;
        int value;
        f fVar;
        f fVar2;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    int i9 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i9 == 1) {
                        com.onesignal.debug.internal.logging.b.info$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
                    } else if (i9 != 2) {
                        Z2.b bVar = this._pushRegistrator;
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = bVar.registerForPush(aVar);
                        if (obj == enumC0580a) {
                            return enumC0580a;
                        }
                        cVar = this;
                    } else {
                        com.onesignal.debug.internal.logging.b.info$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                        this.pushTokenStatus = f.OUTDATED_JETPACK_LIBRARY;
                    }
                    cVar = this;
                    return new d(cVar.pushToken, cVar.pushTokenStatus);
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.L$0;
                AbstractC0676f.w(obj);
                Z2.a aVar2 = (Z2.a) obj;
                value = aVar2.getStatus().getValue();
                fVar = f.SUBSCRIBED;
                if (value != fVar.getValue()) {
                    cVar.pushTokenStatus = aVar2.getStatus();
                } else if (aVar2.getStatus().getValue() < fVar.getValue()) {
                    if (cVar.pushToken == null && ((fVar2 = cVar.pushTokenStatus) == f.NO_PERMISSION || cVar.pushStatusRuntimeError(fVar2))) {
                        cVar.pushTokenStatus = aVar2.getStatus();
                    }
                } else if (cVar.pushStatusRuntimeError(cVar.pushTokenStatus)) {
                    cVar.pushTokenStatus = aVar2.getStatus();
                }
                cVar.pushToken = aVar2.getId();
                return new d(cVar.pushToken, cVar.pushTokenStatus);
            }
        }
        aVar = new a(interfaceC0564d);
        Object obj2 = aVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar.label;
        if (i7 != 0) {
        }
        Z2.a aVar22 = (Z2.a) obj2;
        value = aVar22.getStatus().getValue();
        fVar = f.SUBSCRIBED;
        if (value != fVar.getValue()) {
        }
        cVar.pushToken = aVar22.getId();
        return new d(cVar.pushToken, cVar.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(f fVar) {
        i.e(fVar, "<set-?>");
        this.pushTokenStatus = fVar;
    }
}
