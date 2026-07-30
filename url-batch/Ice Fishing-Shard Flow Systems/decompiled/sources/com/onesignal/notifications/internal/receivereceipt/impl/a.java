package com.onesignal.notifications.internal.receivereceipt.impl;

import A2.c;
import V5.b;
import k3.InterfaceC0599a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements A3.a {
    private final InterfaceC0599a _backend;
    private final c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a, reason: collision with other inner class name */
    public static final class C0068a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public C0068a(b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c _deviceService, InterfaceC0599a _backend) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        this._deviceService = _deviceService;
        this._backend = _backend;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        com.onesignal.debug.internal.logging.b.info$default("Receive receipt failed with statusCode: " + r0.getStatusCode() + " response: " + r0.getResponse(), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    @Override // A3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, b bVar) {
        C0068a c0068a;
        int i2;
        if (bVar instanceof C0068a) {
            c0068a = (C0068a) bVar;
            int i5 = c0068a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0068a.label = i5 - Integer.MIN_VALUE;
                C0068a c0068a2 = c0068a;
                Object obj = c0068a2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0068a2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    A2.a deviceType = this._deviceService.getDeviceType();
                    InterfaceC0599a interfaceC0599a = this._backend;
                    c0068a2.label = 1;
                    if (interfaceC0599a.updateNotificationAsReceived(str, str3, str2, deviceType, c0068a2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                return Unit.f6114a;
            }
        }
        c0068a = new C0068a(bVar);
        C0068a c0068a22 = c0068a;
        Object obj2 = c0068a22.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0068a22.label;
        if (i2 != 0) {
        }
        return Unit.f6114a;
    }
}
