package com.onesignal.user.internal.migrations;

import ge.a0;
import ge.k0;
import ge.x;
import ge.x0;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import na.e;
import na.f;
import nd.i;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements ra.b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final yc.b _identityModelStore;
    private final f _operationRepo;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function2 {
        int label;

        public a(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return d.this.new a(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                f fVar = d.this._operationRepo;
                this.label = 1;
                if (fVar.awaitInitialized(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            if (d.this.isInBadState()) {
                com.onesignal.debug.internal.logging.b.warn$default("User with externalId:" + ((yc.a) d.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                d.this.recoverByAddingBackDroppedLoginOperation();
            }
            return Unit.f5554a;
        }
    }

    public d(f fVar, yc.b bVar, com.onesignal.core.internal.config.b bVar2) {
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this._operationRepo = fVar;
        this._identityModelStore = bVar;
        this._configModelStore = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((yc.a) this._identityModelStore.getModel()).getExternalId() == null || !com.onesignal.common.d.INSTANCE.isLocalId(((yc.a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(c0.a(zc.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        e.enqueue$default(this._operationRepo, new zc.f(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId(), ((yc.a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // ra.b
    public void start() {
        ne.e eVar = k0.f4372a;
        a0.s(x0.f4413d, ne.d.f7275i, new a(null), 2);
    }
}
