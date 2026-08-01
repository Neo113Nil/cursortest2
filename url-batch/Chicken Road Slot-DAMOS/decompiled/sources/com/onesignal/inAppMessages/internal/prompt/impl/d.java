package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.impl.b;
import kotlin.collections.i0;
import qb.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends b {
    private final n _notificationsManager;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.handlePrompt(this);
        }
    }

    public d(n nVar) {
        nVar.getClass();
        this._notificationsManager = nVar;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "push";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(ld.a aVar) {
        a aVar2;
        int i3;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    n nVar = this._notificationsManager;
                    aVar2.label = 1;
                    obj = nVar.requestPermission(true, aVar2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return !((Boolean) obj).booleanValue() ? b.a.PERMISSION_GRANTED : b.a.PERMISSION_DENIED;
            }
        }
        aVar2 = new a(aVar);
        Object obj2 = aVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
