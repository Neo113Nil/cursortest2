package com.onesignal.notifications.internal.permissions.impl;

import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import ge.a0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qb.r;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements pa.e, ic.b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0058b Companion = new C0058b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final ea.f _application;
    private final ea.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final qa.b _preferenceService;
    private final pa.f _requestPermission;
    private final x coroutineScope;
    private boolean enabled;
    private final com.onesignal.common.events.b events;
    private long pollingWaitInterval;
    private final com.onesignal.common.threading.c pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.i implements Function2 {
        int label;

        public a(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new a(aVar);
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
                b bVar = b.this;
                this.label = 1;
                if (bVar.pollForPermission(this) == aVar) {
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
    public static final class d extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.i implements Function2 {
        int label;

        public f(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new f(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((f) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
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
            com.onesignal.common.threading.c cVar = b.this.pollingWaiter;
            this.label = 1;
            Object waitForWake = cVar.waitForWake(this);
            return waitForWake == aVar ? aVar : waitForWake;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends nd.c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends ea.c {
        public h() {
        }

        @Override // ea.c, ea.e
        public void onFocus(boolean z10) {
            super.onFocus(z10);
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
            b.this.pollingWaiter.wake();
        }

        @Override // ea.c, ea.e
        public void onUnfocused() {
            super.onUnfocused();
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i implements pa.c {
        final /* synthetic */ Activity $activity;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends ea.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // ea.c, ea.e
            public void onFocus(boolean z10) {
                if (z10) {
                    return;
                }
                super.onFocus(false);
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                this.this$0.permissionPromptCompleted(AndroidUtils.INSTANCE.hasPermission(b.ANDROID_PERMISSION_STRING, true, this.this$0._applicationService));
            }
        }

        public i(Activity activity) {
            this.$activity = activity;
        }

        @Override // pa.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.notifications.internal.permissions.impl.a.INSTANCE.show(this.$activity);
        }

        @Override // pa.c
        public void onDecline() {
            b.this.permissionPromptCompleted(false);
        }
    }

    public b(ea.f fVar, pa.f fVar2, ea.f fVar3, qa.b bVar, com.onesignal.core.internal.config.b bVar2) {
        fVar.getClass();
        fVar2.getClass();
        fVar3.getClass();
        bVar.getClass();
        bVar2.getClass();
        this._application = fVar;
        this._requestPermission = fVar2;
        this._applicationService = fVar3;
        this._preferenceService = bVar;
        this._configModelStore = bVar2;
        this.waiter = new com.onesignal.common.threading.d();
        this.pollingWaiter = new com.onesignal.common.threading.c();
        this.events = new com.onesignal.common.events.b();
        le.d b10 = a0.b(a0.t("NotificationPermissionController"));
        this.coroutineScope = b10;
        this.enabled = notificationsEnabled();
        fVar2.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar2.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        a0.s(b10, null, new a(null), 3);
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(fVar.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return bc.e.areNotificationsEnabled$default(bc.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z10) {
        this.enabled = z10;
        this.waiter.wake(Boolean.valueOf(z10));
        this.events.fire(new c(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(ld.a aVar) {
        d dVar;
        md.a aVar2;
        int i3;
        b bVar;
        boolean notificationsEnabled;
        long j;
        f fVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                aVar2 = md.a.f6622d;
                i3 = dVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    bVar = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) dVar.L$0;
                    cf.c.M(obj);
                }
                do {
                    notificationsEnabled = bVar.notificationsEnabled();
                    if (bVar.enabled != notificationsEnabled) {
                        bVar.enabled = notificationsEnabled;
                        bVar.events.fire(new e(notificationsEnabled));
                    }
                    j = bVar.pollingWaitInterval;
                    fVar = bVar.new f(null);
                    dVar.L$0 = bVar;
                    dVar.label = 1;
                } while (a0.D(j, fVar, dVar) != aVar2);
                return aVar2;
            }
        }
        dVar = new d(aVar);
        Object obj2 = dVar.result;
        aVar2 = md.a.f6622d;
        i3 = dVar.label;
        if (i3 != 0) {
        }
        do {
            notificationsEnabled = bVar.notificationsEnabled();
            if (bVar.enabled != notificationsEnabled) {
            }
            j = bVar.pollingWaitInterval;
            fVar = bVar.new f(null);
            dVar.L$0 = bVar;
            dVar.label = 1;
        } while (a0.D(j, fVar, dVar) != aVar2);
        return aVar2;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new h());
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._application.getCurrent();
        if (current == null) {
            return false;
        }
        pa.d dVar = pa.d.INSTANCE;
        String string = current.getString(r.notification_permission_name_for_title);
        string.getClass();
        String string2 = current.getString(r.notification_permission_settings_message);
        string2.getClass();
        dVar.show(current, string, string2, new i(current));
        return true;
    }

    @Override // ic.b
    public boolean getCanRequestPermission() {
        this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE).getClass();
        return !r0.booleanValue();
    }

    @Override // ic.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // pa.e
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // pa.e
    public void onReject(boolean z10) {
        if (z10 ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ic.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z10, ld.a aVar) {
        g gVar;
        int i3;
        b bVar;
        if (aVar instanceof g) {
            gVar = (g) aVar;
            int i10 = gVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.label = i10 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = gVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    gVar.L$0 = this;
                    gVar.Z$0 = z10;
                    gVar.label = 1;
                    if (a0.E(gVar) != aVar2) {
                        bVar = this;
                    }
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z10 = gVar.Z$0;
                bVar = (b) gVar.L$0;
                cf.c.M(obj);
                if (!bVar.notificationsEnabled()) {
                    return Boolean.TRUE;
                }
                if (bVar.supportsNativePrompt) {
                    bVar._requestPermission.startPrompt(z10, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
                } else {
                    if (!z10) {
                        return Boolean.FALSE;
                    }
                    bVar.showFallbackAlertDialog();
                }
                com.onesignal.common.threading.d dVar = bVar.waiter;
                gVar.L$0 = null;
                gVar.label = 2;
                Object waitForWake = dVar.waitForWake(gVar);
                return waitForWake == aVar2 ? aVar2 : waitForWake;
            }
        }
        gVar = new g(aVar);
        Object obj2 = gVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = gVar.label;
        if (i3 != 0) {
        }
        if (!bVar.notificationsEnabled()) {
        }
    }

    @Override // ic.b, com.onesignal.common.events.d
    public void subscribe(ic.a aVar) {
        aVar.getClass();
        this.events.subscribe(aVar);
    }

    @Override // ic.b, com.onesignal.common.events.d
    public void unsubscribe(ic.a aVar) {
        aVar.getClass();
        this.events.subscribe(aVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$b, reason: collision with other inner class name */
    public static final class C0058b {
        public /* synthetic */ C0058b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0058b() {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10) {
            super(1);
            this.$enabled = z10;
        }

        public final void invoke(ic.a aVar) {
            aVar.getClass();
            aVar.onNotificationPermissionChanged(this.$enabled);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ic.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends p implements Function1 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10) {
            super(1);
            this.$enabled = z10;
        }

        public final void invoke(ic.a aVar) {
            aVar.getClass();
            aVar.onNotificationPermissionChanged(this.$enabled);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ic.a) obj);
            return Unit.f5554a;
        }
    }
}
