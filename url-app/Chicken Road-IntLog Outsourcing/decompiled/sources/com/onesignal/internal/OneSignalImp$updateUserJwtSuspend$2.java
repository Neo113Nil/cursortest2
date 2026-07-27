package com.onesignal.internal;

import B4.k;
import D4.InterfaceC0022w;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$updateUserJwtSuspend$2", f = "OneSignalImp.kt", l = {885}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$updateUserJwtSuspend$2 extends h implements InterfaceC1445p {
    final /* synthetic */ String $externalId;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$updateUserJwtSuspend$2(String str, String str2, OneSignalImp oneSignalImp, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$externalId = str;
        this.$token = str2;
        this.this$0 = oneSignalImp;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$updateUserJwtSuspend$2(this.$externalId, this.$token, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$updateUserJwtSuspend$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object suspendUntilInit;
        JwtTokenStore jwtTokenStore;
        IOperationRepo operationRepo;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            Logging.log(LogLevel.DEBUG, "updateUserJwtSuspend(externalId: " + this.$externalId + ", token: ..." + k.m0(this.$token) + ')');
            OneSignalImp oneSignalImp = this.this$0;
            this.label = 1;
            suspendUntilInit = oneSignalImp.suspendUntilInit("updateUserJwt", this);
            if (suspendUntilInit == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        if (!this.this$0.isInitialized()) {
            throw new IllegalStateException("'initWithContext failed' before 'updateUserJwt'");
        }
        jwtTokenStore = this.this$0.getJwtTokenStore();
        jwtTokenStore.putJwt(this.$externalId, this.$token);
        operationRepo = this.this$0.getOperationRepo();
        operationRepo.forceExecuteOperations();
        return v.f5689a;
    }
}
