package com.onesignal.inAppMessages.internal.prompt.impl;

import a2.r;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends b {
    private final ib.a _locationManager;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.a$a, reason: collision with other inner class name */
    public static final class C0033a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public C0033a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(ib.a aVar) {
        aVar.getClass();
        this._locationManager = aVar;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(ld.a aVar) {
        C0033a c0033a;
        int i3;
        boolean booleanValue;
        if (aVar instanceof C0033a) {
            c0033a = (C0033a) aVar;
            int i10 = c0033a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0033a.label = i10 - Integer.MIN_VALUE;
                Object obj = c0033a.result;
                md.a aVar2 = md.a.f6622d;
                i3 = c0033a.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ib.a aVar3 = this._locationManager;
                    c0033a.label = 1;
                    obj = aVar3.requestPermission(c0033a);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return b.a.PERMISSION_GRANTED;
                }
                if (!booleanValue) {
                    return b.a.PERMISSION_DENIED;
                }
                r.p();
                return null;
            }
        }
        c0033a = new C0033a(aVar);
        Object obj2 = c0033a.result;
        md.a aVar22 = md.a.f6622d;
        i3 = c0033a.label;
        if (i3 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
