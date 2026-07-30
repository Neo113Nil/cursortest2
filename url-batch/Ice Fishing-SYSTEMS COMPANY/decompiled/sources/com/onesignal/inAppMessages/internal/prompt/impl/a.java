package com.onesignal.inAppMessages.internal.prompt.impl;

import com.bumptech.glide.f;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import kotlin.jvm.internal.h;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a extends b {
    private final W4.a _locationManager;

    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.a$a, reason: collision with other inner class name */
    public static final class C0209a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public C0209a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(W4.a _locationManager) {
        h.e(_locationManager, "_locationManager");
        this._locationManager = _locationManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(InterfaceC5133d interfaceC5133d) {
        C0209a c0209a;
        int i;
        boolean booleanValue;
        if (interfaceC5133d instanceof C0209a) {
            c0209a = (C0209a) interfaceC5133d;
            int i4 = c0209a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0209a.label = i4 - Integer.MIN_VALUE;
                Object obj = c0209a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0209a.label;
                if (i != 0) {
                    f.r(obj);
                    W4.a aVar = this._locationManager;
                    c0209a.label = 1;
                    obj = aVar.requestPermission(c0209a);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return b.a.PERMISSION_GRANTED;
                }
                if (booleanValue) {
                    throw new B0.c();
                }
                return b.a.PERMISSION_DENIED;
            }
        }
        c0209a = new C0209a(interfaceC5133d);
        Object obj2 = c0209a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0209a.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
