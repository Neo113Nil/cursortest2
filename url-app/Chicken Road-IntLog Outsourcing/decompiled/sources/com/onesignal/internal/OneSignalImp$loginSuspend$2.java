package com.onesignal.internal;

import B4.k;
import D4.InterfaceC0022w;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.LoginHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$loginSuspend$2", f = "OneSignalImp.kt", l = {873, 876}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$loginSuspend$2 extends h implements InterfaceC1445p {
    final /* synthetic */ String $externalId;
    final /* synthetic */ String $jwtBearerToken;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$loginSuspend$2(String str, String str2, OneSignalImp oneSignalImp, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$externalId = str;
        this.$jwtBearerToken = str2;
        this.this$0 = oneSignalImp;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$loginSuspend$2(this.$externalId, this.$jwtBearerToken, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$loginSuspend$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object suspendUntilInit;
        LoginHelper loginHelper;
        LoginHelper loginHelper2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        v vVar = v.f5689a;
        if (i2 == 0) {
            g.y(obj);
            LogLevel logLevel = LogLevel.DEBUG;
            StringBuilder sb = new StringBuilder("login(externalId: ");
            sb.append(this.$externalId);
            sb.append(", jwtBearerToken: ...");
            String str = this.$jwtBearerToken;
            sb.append(str != null ? k.m0(str) : null);
            sb.append(')');
            Logging.log(logLevel, sb.toString());
            OneSignalImp oneSignalImp = this.this$0;
            this.label = 1;
            suspendUntilInit = oneSignalImp.suspendUntilInit("login", this);
            if (suspendUntilInit == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    g.y(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        loginHelper = this.this$0.getLoginHelper();
        LoginHelper.LoginEnqueueContext switchUser$com_onesignal_core = loginHelper.switchUser$com_onesignal_core(this.$externalId, this.$jwtBearerToken);
        if (switchUser$com_onesignal_core == null) {
            return vVar;
        }
        loginHelper2 = this.this$0.getLoginHelper();
        this.label = 2;
        return loginHelper2.enqueueLogin$com_onesignal_core(switchUser$com_onesignal_core, this) == enumC1260a ? enumC1260a : vVar;
    }
}
