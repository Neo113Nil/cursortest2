package com.onesignal.user.internal.migrations;

import d2.e;
import d2.f;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.t;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import r3.C0617a;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class d implements com.onesignal.core.internal.startup.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final r3.b _identityModelStore;
    private final f _operationRepo;

    public static final class a extends g implements InterfaceC0743l {
        int label;

        public a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return d.this.new a(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                f fVar = d.this._operationRepo;
                this.label = 1;
                if (fVar.awaitInitialized(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            if (d.this.isInBadState()) {
                com.onesignal.debug.internal.logging.b.warn$default("User with externalId:" + ((C0617a) d.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                d.this.recoverByAddingBackDroppedLoginOperation();
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public d(f _operationRepo, r3.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        i.e(_operationRepo, "_operationRepo");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_configModelStore, "_configModelStore");
        this._operationRepo = _operationRepo;
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((C0617a) this._identityModelStore.getModel()).getExternalId() == null || !com.onesignal.common.d.INSTANCE.isLocalId(((C0617a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(t.a(s3.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        e.enqueue$default(this._operationRepo, new s3.f(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
    }
}
