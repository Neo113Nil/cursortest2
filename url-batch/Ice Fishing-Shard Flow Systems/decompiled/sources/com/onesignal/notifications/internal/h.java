package com.onesignal.notifications.internal;

import X5.j;
import h3.n;
import h3.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;
import z3.InterfaceC1057a;
import z3.InterfaceC1058b;

/* loaded from: classes.dex */
public final class h implements n, InterfaceC1057a, v2.e {
    private final v2.f _applicationService;
    private final t3.d _notificationDataController;
    private final w3.b _notificationLifecycleService;
    private final InterfaceC1058b _notificationPermissionController;
    private final C3.c _notificationRestoreWorkManager;
    private final D3.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier;

    public static final class a extends j implements Function1 {
        int label;

        public a(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return h.this.new a(bVar);
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
                t3.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.deleteExpiredNotifications(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class b extends j implements Function1 {
        int label;

        public b(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return h.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                t3.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.markAsDismissedForOutstanding(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class c extends p implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m31invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m31invoke() {
            h.this.refreshNotificationState();
        }
    }

    public static final class d extends j implements Function1 {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, V5.b bVar) {
            super(1, bVar);
            this.$group = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return h.this.new d(this.$group, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                t3.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (dVar.markAsDismissedForGroup(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class e extends j implements Function1 {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i2, V5.b bVar) {
            super(1, bVar);
            this.$id = i2;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return h.this.new e(this.$id, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r5.updatePossibleDependentSummaryOnDismiss(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                t3.d dVar = h.this._notificationDataController;
                int i5 = this.$id;
                this.label = 1;
                obj = dVar.markAsDismissed(i5, this);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                D3.a aVar2 = h.this._summaryManager;
                int i7 = this.$id;
                this.label = 2;
            }
            return Unit.f6114a;
        }
    }

    public static final class f extends j implements Function2 {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z7, V5.b bVar) {
            super(2, bVar);
            this.$fallbackToSettings = z7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return h.this.new f(this.$fallbackToSettings, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            InterfaceC1058b interfaceC1058b = h.this._notificationPermissionController;
            boolean z7 = this.$fallbackToSettings;
            this.label = 1;
            Object prompt = interfaceC1058b.prompt(z7, this);
            return prompt == aVar ? aVar : prompt;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((f) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class g extends p implements Function1 {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z7) {
            super(1);
            this.$isEnabled = z7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o) obj);
            return Unit.f6114a;
        }

        public final void invoke(o it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(v2.f _applicationService, InterfaceC1058b _notificationPermissionController, C3.c _notificationRestoreWorkManager, w3.b _notificationLifecycleService, t3.d _notificationDataController, D3.a _summaryManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationPermissionController, "_notificationPermissionController");
        Intrinsics.checkNotNullParameter(_notificationRestoreWorkManager, "_notificationRestoreWorkManager");
        Intrinsics.checkNotNullParameter(_notificationLifecycleService, "_notificationLifecycleService");
        Intrinsics.checkNotNullParameter(_notificationDataController, "_notificationDataController");
        Intrinsics.checkNotNullParameter(_summaryManager, "_summaryManager");
        this._applicationService = _applicationService;
        this._notificationPermissionController = _notificationPermissionController;
        this._notificationRestoreWorkManager = _notificationRestoreWorkManager;
        this._notificationLifecycleService = _notificationLifecycleService;
        this._notificationDataController = _notificationDataController;
        this._summaryManager = _summaryManager;
        this.permission = s3.e.areNotificationsEnabled$default(s3.e.INSTANCE, _applicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.onesignal.common.events.b();
        _applicationService.addApplicationLifecycleHandler(this);
        _notificationPermissionController.subscribe(this);
        com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(s3.e.areNotificationsEnabled$default(s3.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z7) {
        boolean mo25getPermission = mo25getPermission();
        setPermission(z7);
        if (mo25getPermission != z7) {
            this.permissionChangedNotifier.fireOnMain(new g(z7));
        }
    }

    @Override // h3.n
    /* renamed from: addClickListener */
    public void mo20addClickListener(h3.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addClickListener(handler: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(listener);
    }

    @Override // h3.n
    /* renamed from: addForegroundLifecycleListener */
    public void mo21addForegroundLifecycleListener(h3.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(listener);
    }

    @Override // h3.n
    /* renamed from: addPermissionObserver */
    public void mo22addPermissionObserver(o observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(observer);
    }

    @Override // h3.n
    /* renamed from: clearAllNotifications */
    public void mo23clearAllNotifications() {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new b(null));
    }

    @Override // h3.n
    /* renamed from: getCanRequestPermission */
    public boolean mo24getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // h3.n
    /* renamed from: getPermission */
    public boolean mo25getPermission() {
        return this.permission;
    }

    @Override // v2.e
    public void onFocus(boolean z7) {
        com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // z3.InterfaceC1057a
    public void onNotificationPermissionChanged(boolean z7) {
        setPermissionStatusAndFire(z7);
    }

    @Override // v2.e
    public void onUnfocused() {
    }

    @Override // h3.n
    /* renamed from: removeClickListener */
    public void mo26removeClickListener(h3.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(listener);
    }

    @Override // h3.n
    /* renamed from: removeForegroundLifecycleListener */
    public void mo27removeForegroundLifecycleListener(h3.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(listener);
    }

    @Override // h3.n
    /* renamed from: removeGroupedNotifications */
    public void mo28removeGroupedNotifications(String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + group + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new d(group, null));
    }

    @Override // h3.n
    /* renamed from: removeNotification */
    public void mo29removeNotification(int i2) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeNotification(id: " + i2 + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new e(i2, null));
    }

    @Override // h3.n
    /* renamed from: removePermissionObserver */
    public void mo30removePermissionObserver(o observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(observer);
    }

    @Override // h3.n
    public Object requestPermission(boolean z7, V5.b bVar) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        return AbstractC0792z.t(s6.n.f7850a, new f(z7, null), bVar);
    }

    public void setPermission(boolean z7) {
        this.permission = z7;
    }
}
