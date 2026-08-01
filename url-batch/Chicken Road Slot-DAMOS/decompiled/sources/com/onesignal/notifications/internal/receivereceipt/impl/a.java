package com.onesignal.notifications.internal.receivereceipt.impl;

import ja.c;
import kotlin.Unit;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements jc.a {
    private final tb.a _backend;
    private final c _deviceService;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a, reason: collision with other inner class name */
    public static final class C0059a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public C0059a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c cVar, tb.a aVar) {
        cVar.getClass();
        aVar.getClass();
        this._deviceService = cVar;
        this._backend = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        com.onesignal.debug.internal.logging.b.error$default("Receive receipt failed with statusCode: " + r0.getStatusCode() + " response: " + r0.getResponse(), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    @Override // jc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, ld.a aVar) {
        C0059a c0059a;
        int i3;
        if (aVar instanceof C0059a) {
            c0059a = (C0059a) aVar;
            int i10 = c0059a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0059a.label = i10 - Integer.MIN_VALUE;
                C0059a c0059a2 = c0059a;
                Object obj = c0059a2.result;
                md.a aVar2 = md.a.f6622d;
                i3 = c0059a2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ja.a deviceType = this._deviceService.getDeviceType();
                    tb.a aVar3 = this._backend;
                    c0059a2.label = 1;
                    if (aVar3.updateNotificationAsReceived(str, str3, str2, deviceType, c0059a2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            }
        }
        c0059a = new C0059a(aVar);
        C0059a c0059a22 = c0059a;
        Object obj2 = c0059a22.result;
        md.a aVar22 = md.a.f6622d;
        i3 = c0059a22.label;
        if (i3 != 0) {
        }
        return Unit.f5554a;
    }
}
