package com.onesignal.notifications.internal.receivereceipt.impl;

import Y1.c;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements Y2.a {
    private final I2.a _backend;
    private final c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a, reason: collision with other inner class name */
    public static final class C0068a extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public C0068a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c _deviceService, I2.a _backend) {
        i.e(_deviceService, "_deviceService");
        i.e(_backend, "_backend");
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
    @Override // Y2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, InterfaceC0564d interfaceC0564d) {
        C0068a c0068a;
        int i7;
        if (interfaceC0564d instanceof C0068a) {
            c0068a = (C0068a) interfaceC0564d;
            int i8 = c0068a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0068a.label = i8 - Integer.MIN_VALUE;
                C0068a c0068a2 = c0068a;
                Object obj = c0068a2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0068a2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    Y1.a deviceType = this._deviceService.getDeviceType();
                    I2.a aVar = this._backend;
                    c0068a2.label = 1;
                    if (aVar.updateNotificationAsReceived(str, str3, str2, deviceType, c0068a2) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                return v.f5219a;
            }
        }
        c0068a = new C0068a(interfaceC0564d);
        C0068a c0068a22 = c0068a;
        Object obj2 = c0068a22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0068a22.label;
        if (i7 != 0) {
        }
        return v.f5219a;
    }
}
