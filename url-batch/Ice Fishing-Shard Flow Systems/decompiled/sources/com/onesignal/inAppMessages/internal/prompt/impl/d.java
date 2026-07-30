package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.impl.b;
import h3.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends b {
    private final n _notificationsManager;

    public static final class a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.handlePrompt(this);
        }
    }

    public d(n _notificationsManager) {
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        this._notificationsManager = _notificationsManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "push";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(V5.b bVar) {
        a aVar;
        int i2;
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
                    n nVar = this._notificationsManager;
                    aVar.label = 1;
                    obj = nVar.requestPermission(true, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                return !((Boolean) obj).booleanValue() ? b.a.PERMISSION_GRANTED : b.a.PERMISSION_DENIED;
            }
        }
        aVar = new a(bVar);
        Object obj2 = aVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
