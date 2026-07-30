package com.onesignal.notifications.internal.permissions.impl;

import E7.l;
import E7.p;
import O7.AbstractC0395u;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import O7.P;
import O7.q0;
import O7.z0;
import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import e5.r;
import q7.v;
import r7.C4977h;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w5.InterfaceC5172a;
import w5.InterfaceC5173b;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class b implements com.onesignal.core.internal.permissions.f, InterfaceC5173b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0235b Companion = new C0235b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final t4.f _application;
    private final t4.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final F4.b _preferenceService;
    private final com.onesignal.core.internal.permissions.g _requestPermission;
    private boolean enabled;
    private final com.onesignal.common.events.b events;
    private long pollingWaitInterval;
    private final com.onesignal.common.threading.e pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.onesignal.common.threading.f waiter;

    public static final class a extends x7.h implements l {
        int label;

        public a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return b.this.new a(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.pollForPermission(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$b, reason: collision with other inner class name */
    public static final class C0235b {
        public /* synthetic */ C0235b(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0235b() {
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements l {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8) {
            super(1);
            this.$enabled = z8;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC5172a) obj);
            return v.f40183a;
        }

        public final void invoke(InterfaceC5172a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class d extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    public static final class e extends kotlin.jvm.internal.i implements l {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z8) {
            super(1);
            this.$enabled = z8;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC5172a) obj);
            return v.f40183a;
        }

        public final void invoke(InterfaceC5172a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class f extends x7.h implements p {
        int label;

        public f(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new f(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((f) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return obj;
            }
            com.bumptech.glide.f.r(obj);
            com.onesignal.common.threading.e eVar = b.this.pollingWaiter;
            this.label = 1;
            Object waitForWake = eVar.waitForWake(this);
            return waitForWake == enumC5179a ? enumC5179a : waitForWake;
        }
    }

    public static final class g extends AbstractC5219c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    public static final class h extends t4.c {

        public static final class a extends kotlin.jvm.internal.i implements E7.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // E7.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m37invoke();
                return v.f40183a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m37invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
                this.this$0.pollingWaiter.wake();
            }
        }

        /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$h$b, reason: collision with other inner class name */
        public static final class C0236b extends kotlin.jvm.internal.i implements E7.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236b(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // E7.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m38invoke();
                return v.f40183a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m38invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
            }
        }

        public h() {
        }

        @Override // t4.c, t4.e
        public void onFocus(boolean z8) {
            super.onFocus(z8);
            com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new a(b.this));
        }

        @Override // t4.c, t4.e
        public void onUnfocused() {
            super.onUnfocused();
            com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new C0236b(b.this));
        }
    }

    public static final class i implements t4.d {
        public i() {
        }

        @Override // t4.d
        public void onActivityAvailable(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            if (activity instanceof PermissionsActivity) {
                return;
            }
            b.this._application.removeActivityLifecycleHandler(this);
            b.showFallbackAlertDialog$present(b.this, activity);
        }

        @Override // t4.d
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }
    }

    public static final class j implements com.onesignal.core.internal.permissions.d {
        final /* synthetic */ Activity $activity;

        public static final class a extends t4.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // t4.c, t4.e
            public void onFocus(boolean z8) {
                if (z8) {
                    return;
                }
                super.onFocus(false);
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                this.this$0.permissionPromptCompleted(AndroidUtils.INSTANCE.hasPermission(b.ANDROID_PERMISSION_STRING, true, this.this$0._applicationService));
            }
        }

        public j(Activity activity) {
            this.$activity = activity;
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.notifications.internal.permissions.impl.a.INSTANCE.show(this.$activity);
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onDecline() {
            b.this.permissionPromptCompleted(false);
        }
    }

    public b(t4.f _application, com.onesignal.core.internal.permissions.g _requestPermission, t4.f _applicationService, F4.b _preferenceService, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.h.e(_application, "_application");
        kotlin.jvm.internal.h.e(_requestPermission, "_requestPermission");
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_preferenceService, "_preferenceService");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new com.onesignal.common.threading.f();
        this.pollingWaiter = new com.onesignal.common.threading.e();
        this.events = new com.onesignal.common.events.b();
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.onesignal.core.internal.config.b) _configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        com.onesignal.common.threading.c.launchOnIO(new a(null));
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return p5.e.areNotificationsEnabled$default(p5.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z8) {
        this.enabled = z8;
        this.waiter.wake(Boolean.valueOf(z8));
        this.events.fire(new c(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(InterfaceC5133d interfaceC5133d) {
        d dVar;
        EnumC5179a enumC5179a;
        int i4;
        b bVar;
        boolean notificationsEnabled;
        long j9;
        f fVar;
        if (interfaceC5133d instanceof d) {
            dVar = (d) interfaceC5133d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                enumC5179a = EnumC5179a.f41704n;
                i4 = dVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    bVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) dVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                do {
                    notificationsEnabled = bVar.notificationsEnabled();
                    if (bVar.enabled != notificationsEnabled) {
                        bVar.enabled = notificationsEnabled;
                        bVar.events.fire(new e(notificationsEnabled));
                    }
                    j9 = bVar.pollingWaitInterval;
                    fVar = bVar.new f(null);
                    dVar.L$0 = bVar;
                    dVar.label = 1;
                } while (AbstractC0399y.A(j9, fVar, dVar) != enumC5179a);
                return enumC5179a;
            }
        }
        dVar = new d(interfaceC5133d);
        Object obj2 = dVar.result;
        enumC5179a = EnumC5179a.f41704n;
        i4 = dVar.label;
        if (i4 != 0) {
        }
        do {
            notificationsEnabled = bVar.notificationsEnabled();
            if (bVar.enabled != notificationsEnabled) {
            }
            j9 = bVar.pollingWaitInterval;
            fVar = bVar.new f(null);
            dVar.L$0 = bVar;
            dVar.label = 1;
        } while (AbstractC0399y.A(j9, fVar, dVar) != enumC5179a);
        return enumC5179a;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new h());
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._application.getCurrent();
        if (current == null || (current instanceof PermissionsActivity)) {
            this._application.addActivityLifecycleHandler(new i());
            return true;
        }
        showFallbackAlertDialog$present(this, current);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFallbackAlertDialog$present(b bVar, Activity activity) {
        com.onesignal.core.internal.permissions.e eVar = com.onesignal.core.internal.permissions.e.INSTANCE;
        String string = activity.getString(r.notification_permission_name_for_title);
        kotlin.jvm.internal.h.d(string, "getString(...)");
        String string2 = activity.getString(r.notification_permission_settings_message);
        kotlin.jvm.internal.h.d(string2, "getString(...)");
        eVar.show(activity, string, string2, bVar.new j(activity));
    }

    @Override // w5.InterfaceC5173b
    public boolean getCanRequestPermission() {
        kotlin.jvm.internal.h.b(this._preferenceService.getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        return !r0.booleanValue();
    }

    @Override // w5.InterfaceC5173b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onReject(boolean z8) {
        if (z8 ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // w5.InterfaceC5173b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z8, InterfaceC5133d interfaceC5133d) {
        g gVar;
        int i4;
        Object obj;
        b bVar;
        if (interfaceC5133d instanceof g) {
            gVar = (g) interfaceC5133d;
            int i9 = gVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.label = i9 - Integer.MIN_VALUE;
                Object obj2 = gVar.result;
                Object obj3 = EnumC5179a.f41704n;
                i4 = gVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj2);
                    gVar.L$0 = this;
                    gVar.Z$0 = z8;
                    gVar.label = 1;
                    InterfaceC5138i context = gVar.getContext();
                    AbstractC0399y.g(context);
                    InterfaceC5133d f6 = w8.a.f(gVar);
                    T7.h hVar = f6 instanceof T7.h ? (T7.h) f6 : null;
                    Object obj4 = v.f40183a;
                    if (hVar != null) {
                        AbstractC0395u abstractC0395u = hVar.f3140w;
                        if (abstractC0395u.z()) {
                            hVar.f3142y = obj4;
                            hVar.f2550v = 1;
                            abstractC0395u.q(context, hVar);
                        } else {
                            z0 z0Var = new z0(z0.f2654v);
                            InterfaceC5138i n9 = context.n(z0Var);
                            hVar.f3142y = obj4;
                            hVar.f2550v = 1;
                            abstractC0395u.q(n9, hVar);
                            if (z0Var.f2655u) {
                                P a9 = q0.a();
                                C4977h c4977h = a9.f2570x;
                                if (!(c4977h != null ? c4977h.isEmpty() : true)) {
                                    if (a9.f2568v >= 4294967296L) {
                                        hVar.f3142y = obj4;
                                        hVar.f2550v = 1;
                                        a9.B(hVar);
                                    } else {
                                        a9.D(true);
                                        try {
                                            hVar.run();
                                            do {
                                            } while (a9.F());
                                        } finally {
                                            try {
                                            } finally {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = obj3;
                        if (obj == EnumC5179a.f41704n) {
                            obj4 = obj;
                        }
                        if (obj4 != obj3) {
                            bVar = this;
                        }
                    }
                    obj = obj4;
                    if (obj == EnumC5179a.f41704n) {
                    }
                    if (obj4 != obj3) {
                    }
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj2);
                    return obj2;
                }
                z8 = gVar.Z$0;
                bVar = (b) gVar.L$0;
                com.bumptech.glide.f.r(obj2);
                if (!bVar.notificationsEnabled()) {
                    return Boolean.TRUE;
                }
                if (bVar.supportsNativePrompt) {
                    bVar._requestPermission.startPrompt(z8, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
                } else {
                    if (!z8) {
                        return Boolean.FALSE;
                    }
                    bVar.showFallbackAlertDialog();
                }
                com.onesignal.common.threading.f fVar = bVar.waiter;
                gVar.L$0 = null;
                gVar.label = 2;
                Object waitForWake = fVar.waitForWake(gVar);
                return waitForWake == obj3 ? obj3 : waitForWake;
            }
        }
        gVar = new g(interfaceC5133d);
        Object obj22 = gVar.result;
        Object obj32 = EnumC5179a.f41704n;
        i4 = gVar.label;
        if (i4 != 0) {
        }
        if (!bVar.notificationsEnabled()) {
        }
    }

    @Override // w5.InterfaceC5173b, com.onesignal.common.events.d
    public void subscribe(InterfaceC5172a handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // w5.InterfaceC5173b, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC5172a handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.events.subscribe(handler);
    }
}
