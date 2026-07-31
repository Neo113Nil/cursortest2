package com.onesignal.inAppMessages.internal.prompt.impl;

import H5.r;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x2.InterfaceC0728a;

/* loaded from: classes.dex */
public final class a extends b {
    private final InterfaceC0728a _locationManager;

    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.a$a, reason: collision with other inner class name */
    public static final class C0040a extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public C0040a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(InterfaceC0728a _locationManager) {
        i.e(_locationManager, "_locationManager");
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
    public Object handlePrompt(InterfaceC0564d interfaceC0564d) {
        C0040a c0040a;
        int i7;
        boolean booleanValue;
        if (interfaceC0564d instanceof C0040a) {
            c0040a = (C0040a) interfaceC0564d;
            int i8 = c0040a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0040a.label = i8 - Integer.MIN_VALUE;
                Object obj = c0040a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0040a.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0728a interfaceC0728a = this._locationManager;
                    c0040a.label = 1;
                    obj = interfaceC0728a.requestPermission(c0040a);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return b.a.PERMISSION_GRANTED;
                }
                if (booleanValue) {
                    throw new r();
                }
                return b.a.PERMISSION_DENIED;
            }
        }
        c0040a = new C0040a(interfaceC0564d);
        Object obj2 = c0040a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0040a.label;
        if (i7 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
