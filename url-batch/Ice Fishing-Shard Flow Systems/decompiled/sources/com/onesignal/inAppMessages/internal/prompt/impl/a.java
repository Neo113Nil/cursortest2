package com.onesignal.inAppMessages.internal.prompt.impl;

import R5.k;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends b {
    private final Z2.a _locationManager;

    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.a$a, reason: collision with other inner class name */
    public static final class C0040a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public C0040a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(Z2.a _locationManager) {
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
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
    public Object handlePrompt(V5.b bVar) {
        C0040a c0040a;
        int i2;
        boolean booleanValue;
        if (bVar instanceof C0040a) {
            c0040a = (C0040a) bVar;
            int i5 = c0040a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0040a.label = i5 - Integer.MIN_VALUE;
                Object obj = c0040a.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0040a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    Z2.a aVar2 = this._locationManager;
                    c0040a.label = 1;
                    obj = aVar2.requestPermission(c0040a);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return b.a.PERMISSION_GRANTED;
                }
                if (booleanValue) {
                    throw new k();
                }
                return b.a.PERMISSION_DENIED;
            }
        }
        c0040a = new C0040a(bVar);
        Object obj2 = c0040a.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = c0040a.label;
        if (i2 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
