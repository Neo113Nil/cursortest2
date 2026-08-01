package com.onesignal.notifications.internal;

import ge.a0;
import ge.k0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nd.i;
import qb.j;
import qb.n;
import qb.o;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements n, ic.a, ea.e {
    private final ea.f _applicationService;
    private final cc.d _notificationDataController;
    private final fc.b _notificationLifecycleService;
    private final ic.b _notificationPermissionController;
    private final lc.c _notificationRestoreWorkManager;
    private final mc.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function1 {
        int label;

        public a(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return h.this.new a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                cc.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.deleteExpiredNotifications(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function1 {
        int label;

        public b(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return h.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                cc.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.markAsDismissedForOutstanding(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends i implements Function1 {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ld.a aVar) {
            super(1, aVar);
            this.$group = str;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return h.this.new c(this.$group, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((c) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                cc.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (dVar.markAsDismissedForGroup(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends i implements Function1 {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i3, ld.a aVar) {
            super(1, aVar);
            this.$id = i3;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return h.this.new d(this.$id, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((d) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r5.updatePossibleDependentSummaryOnDismiss(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                cc.d dVar = h.this._notificationDataController;
                int i10 = this.$id;
                this.label = 1;
                obj = dVar.markAsDismissed(i10, this);
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                mc.a aVar2 = h.this._summaryManager;
                int i11 = this.$id;
                this.label = 2;
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, ld.a aVar) {
            super(2, aVar);
            this.$fallbackToSettings = z10;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return h.this.new e(this.$fallbackToSettings, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    cf.c.M(obj);
                    return obj;
                }
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            ic.b bVar = h.this._notificationPermissionController;
            boolean z10 = this.$fallbackToSettings;
            this.label = 1;
            Object prompt = bVar.prompt(z10, this);
            return prompt == aVar ? aVar : prompt;
        }
    }

    public h(ea.f fVar, ic.b bVar, lc.c cVar, fc.b bVar2, cc.d dVar, mc.a aVar) {
        fVar.getClass();
        bVar.getClass();
        cVar.getClass();
        bVar2.getClass();
        dVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._notificationPermissionController = bVar;
        this._notificationRestoreWorkManager = cVar;
        this._notificationLifecycleService = bVar2;
        this._notificationDataController = dVar;
        this._summaryManager = aVar;
        this.permission = bc.e.areNotificationsEnabled$default(bc.e.INSTANCE, fVar.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.onesignal.common.events.b();
        fVar.addApplicationLifecycleHandler(this);
        bVar.subscribe(this);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(null), 1, null);
    }

    private final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(bc.e.areNotificationsEnabled$default(bc.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z10) {
        boolean mo18getPermission = mo18getPermission();
        setPermission(z10);
        if (mo18getPermission != z10) {
            this.permissionChangedNotifier.fireOnMain(new f(z10));
        }
    }

    @Override // qb.n
    /* renamed from: addClickListener */
    public void mo13addClickListener(qb.h hVar) {
        hVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addClickListener(handler: " + hVar + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(hVar);
    }

    @Override // qb.n
    /* renamed from: addForegroundLifecycleListener */
    public void mo14addForegroundLifecycleListener(j jVar) {
        jVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + jVar + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(jVar);
    }

    @Override // qb.n
    /* renamed from: addPermissionObserver */
    public void mo15addPermissionObserver(o oVar) {
        oVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + oVar + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(oVar);
    }

    @Override // qb.n
    /* renamed from: clearAllNotifications */
    public void mo16clearAllNotifications() {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // qb.n
    /* renamed from: getCanRequestPermission */
    public boolean mo17getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // qb.n
    /* renamed from: getPermission */
    public boolean mo18getPermission() {
        return this.permission;
    }

    @Override // ea.e
    public void onFocus(boolean z10) {
        refreshNotificationState();
    }

    @Override // ic.a
    public void onNotificationPermissionChanged(boolean z10) {
        setPermissionStatusAndFire(z10);
    }

    @Override // qb.n
    /* renamed from: removeClickListener */
    public void mo19removeClickListener(qb.h hVar) {
        hVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeClickListener(listener: " + hVar + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(hVar);
    }

    @Override // qb.n
    /* renamed from: removeForegroundLifecycleListener */
    public void mo20removeForegroundLifecycleListener(j jVar) {
        jVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + jVar + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(jVar);
    }

    @Override // qb.n
    /* renamed from: removeGroupedNotifications */
    public void mo21removeGroupedNotifications(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + str + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c(str, null), 1, null);
    }

    @Override // qb.n
    /* renamed from: removeNotification */
    public void mo22removeNotification(int i3) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeNotification(id: " + i3 + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new d(i3, null), 1, null);
    }

    @Override // qb.n
    /* renamed from: removePermissionObserver */
    public void mo23removePermissionObserver(o oVar) {
        oVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + oVar + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(oVar);
    }

    @Override // qb.n
    public Object requestPermission(boolean z10, ld.a aVar) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        ne.e eVar = k0.f4372a;
        return a0.B(le.o.f5995a, new e(z10, null), aVar);
    }

    public void setPermission(boolean z10) {
        this.permission = z10;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends p implements Function1 {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10) {
            super(1);
            this.$isEnabled = z10;
        }

        public final void invoke(o oVar) {
            oVar.getClass();
            oVar.onNotificationPermissionChange(this.$isEnabled);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o) obj);
            return Unit.f5554a;
        }
    }

    @Override // ea.e
    public void onUnfocused() {
    }
}
