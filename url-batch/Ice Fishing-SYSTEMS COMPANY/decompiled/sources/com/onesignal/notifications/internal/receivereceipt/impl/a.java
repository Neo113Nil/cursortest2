package com.onesignal.notifications.internal.receivereceipt.impl;

import com.bumptech.glide.f;
import h5.InterfaceC4569a;
import kotlin.jvm.internal.h;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x5.InterfaceC5213a;
import x7.AbstractC5219c;
import y4.EnumC5252a;
import y4.c;

/* loaded from: classes2.dex */
public final class a implements InterfaceC5213a {
    private final InterfaceC4569a _backend;
    private final c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a, reason: collision with other inner class name */
    public static final class C0237a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public C0237a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c _deviceService, InterfaceC4569a _backend) {
        h.e(_deviceService, "_deviceService");
        h.e(_backend, "_backend");
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
    @Override // x5.InterfaceC5213a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, InterfaceC5133d interfaceC5133d) {
        C0237a c0237a;
        int i;
        if (interfaceC5133d instanceof C0237a) {
            c0237a = (C0237a) interfaceC5133d;
            int i4 = c0237a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0237a.label = i4 - Integer.MIN_VALUE;
                C0237a c0237a2 = c0237a;
                Object obj = c0237a2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0237a2.label;
                if (i != 0) {
                    f.r(obj);
                    EnumC5252a deviceType = this._deviceService.getDeviceType();
                    InterfaceC4569a interfaceC4569a = this._backend;
                    c0237a2.label = 1;
                    if (interfaceC4569a.updateNotificationAsReceived(str, str3, str2, deviceType, c0237a2) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                return v.f40183a;
            }
        }
        c0237a = new C0237a(interfaceC5133d);
        C0237a c0237a22 = c0237a;
        Object obj2 = c0237a22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0237a22.label;
        if (i != 0) {
        }
        return v.f40183a;
    }
}
