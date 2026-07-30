package com.onesignal.user.internal.migrations;

import F2.e;
import F2.f;
import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements com.onesignal.core.internal.startup.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final T3.b _identityModelStore;
    private final f _operationRepo;

    public static final class a extends j implements Function1 {
        int label;

        public a(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return d.this.new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                f fVar = d.this._operationRepo;
                this.label = 1;
                if (fVar.awaitInitialized(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            if (d.this.isInBadState()) {
                com.onesignal.debug.internal.logging.b.warn$default("User with externalId:" + ((T3.a) d.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                d.this.recoverByAddingBackDroppedLoginOperation();
            }
            return Unit.f6114a;
        }
    }

    public d(f _operationRepo, T3.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._operationRepo = _operationRepo;
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((T3.a) this._identityModelStore.getModel()).getExternalId() == null || !com.onesignal.common.d.INSTANCE.isLocalId(((T3.a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(E.a(U3.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        e.enqueue$default(this._operationRepo, new U3.f(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
    }
}
