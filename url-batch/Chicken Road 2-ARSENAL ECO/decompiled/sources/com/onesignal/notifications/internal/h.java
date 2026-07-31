package com.onesignal.notifications.internal;

import F2.n;
import F2.o;
import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import a3.InterfaceC0227c;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class h implements n, X2.a, T1.e {
    private final T1.f _applicationService;
    private final R2.d _notificationDataController;
    private final U2.b _notificationLifecycleService;
    private final X2.b _notificationPermissionController;
    private final InterfaceC0227c _notificationRestoreWorkManager;
    private final b3.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier;

    public static final class a extends q5.g implements InterfaceC0743l {
        int label;

        public a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return h.this.new a(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                R2.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.deleteExpiredNotifications(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends q5.g implements InterfaceC0743l {
        int label;

        public b(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return h.this.new b(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                R2.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.markAsDismissedForOutstanding(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class c extends j implements InterfaceC0732a {
        public c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public /* bridge */ /* synthetic */ Object invoke() {
            m29invoke();
            return v.f5219a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m29invoke() {
            h.this.refreshNotificationState();
        }
    }

    public static final class d extends q5.g implements InterfaceC0743l {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$group = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return h.this.new d(this.$group, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                R2.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (dVar.markAsDismissedForGroup(str, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class e extends q5.g implements InterfaceC0743l {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i7, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$id = i7;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return h.this.new e(this.$id, interfaceC0564d);
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
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                R2.d dVar = h.this._notificationDataController;
                int i8 = this.$id;
                this.label = 1;
                obj = dVar.markAsDismissed(i8, this);
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return v.f5219a;
                }
                AbstractC0676f.w(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                b3.a aVar = h.this._summaryManager;
                int i9 = this.$id;
                this.label = 2;
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class f extends q5.g implements InterfaceC0747p {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z5, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$fallbackToSettings = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return h.this.new f(this.$fallbackToSettings, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            X2.b bVar = h.this._notificationPermissionController;
            boolean z5 = this.$fallbackToSettings;
            this.label = 1;
            Object prompt = bVar.prompt(z5, this);
            return prompt == enumC0580a ? enumC0580a : prompt;
        }
    }

    public static final class g extends j implements InterfaceC0743l {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z5) {
            super(1);
            this.$isEnabled = z5;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o) obj);
            return v.f5219a;
        }

        public final void invoke(o it) {
            i.e(it, "it");
            it.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(T1.f _applicationService, X2.b _notificationPermissionController, InterfaceC0227c _notificationRestoreWorkManager, U2.b _notificationLifecycleService, R2.d _notificationDataController, b3.a _summaryManager) {
        i.e(_applicationService, "_applicationService");
        i.e(_notificationPermissionController, "_notificationPermissionController");
        i.e(_notificationRestoreWorkManager, "_notificationRestoreWorkManager");
        i.e(_notificationLifecycleService, "_notificationLifecycleService");
        i.e(_notificationDataController, "_notificationDataController");
        i.e(_summaryManager, "_summaryManager");
        this._applicationService = _applicationService;
        this._notificationPermissionController = _notificationPermissionController;
        this._notificationRestoreWorkManager = _notificationRestoreWorkManager;
        this._notificationLifecycleService = _notificationLifecycleService;
        this._notificationDataController = _notificationDataController;
        this._summaryManager = _summaryManager;
        this.permission = Q2.e.areNotificationsEnabled$default(Q2.e.INSTANCE, _applicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.onesignal.common.events.b();
        _applicationService.addApplicationLifecycleHandler(this);
        _notificationPermissionController.subscribe(this);
        com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(Q2.e.areNotificationsEnabled$default(Q2.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z5) {
        boolean mo23getPermission = mo23getPermission();
        setPermission(z5);
        if (mo23getPermission != z5) {
            this.permissionChangedNotifier.fireOnMain(new g(z5));
        }
    }

    @Override // F2.n
    /* renamed from: addClickListener */
    public void mo18addClickListener(F2.h listener) {
        i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addClickListener(handler: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(listener);
    }

    @Override // F2.n
    /* renamed from: addForegroundLifecycleListener */
    public void mo19addForegroundLifecycleListener(F2.j listener) {
        i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(listener);
    }

    @Override // F2.n
    /* renamed from: addPermissionObserver */
    public void mo20addPermissionObserver(o observer) {
        i.e(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(observer);
    }

    @Override // F2.n
    /* renamed from: clearAllNotifications */
    public void mo21clearAllNotifications() {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new b(null));
    }

    @Override // F2.n
    /* renamed from: getCanRequestPermission */
    public boolean mo22getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // F2.n
    /* renamed from: getPermission */
    public boolean mo23getPermission() {
        return this.permission;
    }

    @Override // T1.e
    public void onFocus(boolean z5) {
        com.onesignal.common.threading.b.runOnSerialIO(new c());
    }

    @Override // X2.a
    public void onNotificationPermissionChanged(boolean z5) {
        setPermissionStatusAndFire(z5);
    }

    @Override // T1.e
    public void onUnfocused() {
    }

    @Override // F2.n
    /* renamed from: removeClickListener */
    public void mo24removeClickListener(F2.h listener) {
        i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(listener);
    }

    @Override // F2.n
    /* renamed from: removeForegroundLifecycleListener */
    public void mo25removeForegroundLifecycleListener(F2.j listener) {
        i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(listener);
    }

    @Override // F2.n
    /* renamed from: removeGroupedNotifications */
    public void mo26removeGroupedNotifications(String group) {
        i.e(group, "group");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + group + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new d(group, null));
    }

    @Override // F2.n
    /* renamed from: removeNotification */
    public void mo27removeNotification(int i7) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeNotification(id: " + i7 + ')', null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new e(i7, null));
    }

    @Override // F2.n
    /* renamed from: removePermissionObserver */
    public void mo28removePermissionObserver(o observer) {
        i.e(observer, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(observer);
    }

    @Override // F2.n
    public Object requestPermission(boolean z5, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        return AbstractC0165z.t(M5.o.f1618a, new f(z5, null), interfaceC0564d);
    }

    public void setPermission(boolean z5) {
        this.permission = z5;
    }
}
