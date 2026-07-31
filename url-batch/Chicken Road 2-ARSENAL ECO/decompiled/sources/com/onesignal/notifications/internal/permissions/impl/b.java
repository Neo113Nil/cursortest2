package com.onesignal.notifications.internal.permissions.impl;

import F2.r;
import H5.AbstractC0161v;
import H5.AbstractC0165z;
import H5.C0162w;
import H5.InterfaceC0163x;
import H5.P;
import H5.X;
import H5.g0;
import H5.p0;
import H5.y0;
import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import f2.InterfaceC0365b;
import k5.v;
import l5.C0504h;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class b implements com.onesignal.core.internal.permissions.f, X2.b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0066b Companion = new C0066b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final T1.f _application;
    private final T1.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final InterfaceC0365b _preferenceService;
    private final com.onesignal.core.internal.permissions.g _requestPermission;
    private boolean enabled;
    private final com.onesignal.common.events.b events;
    private long pollingWaitInterval;
    private final com.onesignal.common.threading.c pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.onesignal.common.threading.d waiter;

    public static final class a extends q5.g implements InterfaceC0743l {
        int label;

        public a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return b.this.new a(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.pollForPermission(this) == enumC0580a) {
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

    /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$b, reason: collision with other inner class name */
    public static final class C0066b {
        public /* synthetic */ C0066b(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0066b() {
        }
    }

    public static final class c extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z5) {
            super(1);
            this.$enabled = z5;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X2.a) obj);
            return v.f5219a;
        }

        public final void invoke(X2.a it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class d extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    public static final class e extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z5) {
            super(1);
            this.$enabled = z5;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X2.a) obj);
            return v.f5219a;
        }

        public final void invoke(X2.a it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class f extends q5.g implements InterfaceC0747p {
        int label;

        public f(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new f(interfaceC0564d);
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
            com.onesignal.common.threading.c cVar = b.this.pollingWaiter;
            this.label = 1;
            Object waitForWake = cVar.waitForWake(this);
            return waitForWake == enumC0580a ? enumC0580a : waitForWake;
        }
    }

    public static final class g extends AbstractC0607c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    public static final class h extends T1.c {

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0732a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // x5.InterfaceC0732a
            public /* bridge */ /* synthetic */ Object invoke() {
                m30invoke();
                return v.f5219a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
                this.this$0.pollingWaiter.wake();
            }
        }

        /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$h$b, reason: collision with other inner class name */
        public static final class C0067b extends kotlin.jvm.internal.j implements InterfaceC0732a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0067b(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // x5.InterfaceC0732a
            public /* bridge */ /* synthetic */ Object invoke() {
                m31invoke();
                return v.f5219a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m31invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
            }
        }

        public h() {
        }

        @Override // T1.c, T1.e
        public void onFocus(boolean z5) {
            super.onFocus(z5);
            com.onesignal.common.threading.b.runOnSerialIO(new a(b.this));
        }

        @Override // T1.c, T1.e
        public void onUnfocused() {
            super.onUnfocused();
            com.onesignal.common.threading.b.runOnSerialIO(new C0067b(b.this));
        }
    }

    public static final class i implements T1.d {
        public i() {
        }

        @Override // T1.d
        public void onActivityAvailable(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            if (activity instanceof PermissionsActivity) {
                return;
            }
            b.this._application.removeActivityLifecycleHandler(this);
            b.showFallbackAlertDialog$present(b.this, activity);
        }

        @Override // T1.d
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
        }
    }

    public static final class j implements com.onesignal.core.internal.permissions.d {
        final /* synthetic */ Activity $activity;

        public static final class a extends T1.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // T1.c, T1.e
            public void onFocus(boolean z5) {
                if (z5) {
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

    public b(T1.f _application, com.onesignal.core.internal.permissions.g _requestPermission, T1.f _applicationService, InterfaceC0365b _preferenceService, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.i.e(_application, "_application");
        kotlin.jvm.internal.i.e(_requestPermission, "_requestPermission");
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_preferenceService, "_preferenceService");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new com.onesignal.common.threading.d();
        this.pollingWaiter = new com.onesignal.common.threading.c();
        this.events = new com.onesignal.common.events.b();
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.onesignal.core.internal.config.b) _configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        com.onesignal.common.threading.b.launchOnIO(new a(null));
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return Q2.e.areNotificationsEnabled$default(Q2.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z5) {
        this.enabled = z5;
        this.waiter.wake(Boolean.valueOf(z5));
        this.events.fire(new c(z5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(InterfaceC0564d interfaceC0564d) {
        d dVar;
        EnumC0580a enumC0580a;
        int i7;
        b bVar;
        boolean notificationsEnabled;
        long j4;
        f fVar;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i8 = dVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.label = i8 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                enumC0580a = EnumC0580a.f5697f;
                i7 = dVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    bVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) dVar.L$0;
                    AbstractC0676f.w(obj);
                }
                do {
                    notificationsEnabled = bVar.notificationsEnabled();
                    if (bVar.enabled != notificationsEnabled) {
                        bVar.enabled = notificationsEnabled;
                        bVar.events.fire(new e(notificationsEnabled));
                    }
                    j4 = bVar.pollingWaitInterval;
                    fVar = bVar.new f(null);
                    dVar.L$0 = bVar;
                    dVar.label = 1;
                } while (AbstractC0165z.v(j4, fVar, dVar) != enumC0580a);
                return enumC0580a;
            }
        }
        dVar = new d(interfaceC0564d);
        Object obj2 = dVar.result;
        enumC0580a = EnumC0580a.f5697f;
        i7 = dVar.label;
        if (i7 != 0) {
        }
        do {
            notificationsEnabled = bVar.notificationsEnabled();
            if (bVar.enabled != notificationsEnabled) {
            }
            j4 = bVar.pollingWaitInterval;
            fVar = bVar.new f(null);
            dVar.L$0 = bVar;
            dVar.label = 1;
        } while (AbstractC0165z.v(j4, fVar, dVar) != enumC0580a);
        return enumC0580a;
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
        kotlin.jvm.internal.i.d(string, "getString(...)");
        String string2 = activity.getString(r.notification_permission_settings_message);
        kotlin.jvm.internal.i.d(string2, "getString(...)");
        eVar.show(activity, string, string2, bVar.new j(activity));
    }

    @Override // X2.b
    public boolean getCanRequestPermission() {
        kotlin.jvm.internal.i.b(this._preferenceService.getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        return !r0.booleanValue();
    }

    @Override // X2.b, com.onesignal.common.events.d
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
    public void onReject(boolean z5) {
        if (z5 ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // X2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z5, InterfaceC0564d interfaceC0564d) {
        g gVar;
        int i7;
        Object obj;
        b bVar;
        if (interfaceC0564d instanceof g) {
            gVar = (g) interfaceC0564d;
            int i8 = gVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.label = i8 - Integer.MIN_VALUE;
                Object obj2 = gVar.result;
                Object obj3 = EnumC0580a.f5697f;
                i7 = gVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj2);
                    gVar.L$0 = this;
                    gVar.Z$0 = z5;
                    gVar.label = 1;
                    InterfaceC0569i context = gVar.getContext();
                    X x6 = (X) context.m(C0162w.f1110g);
                    if (x6 != null && !x6.a()) {
                        throw ((g0) x6).w();
                    }
                    InterfaceC0564d m4 = AbstractC0676f.m(gVar);
                    M5.h hVar = m4 instanceof M5.h ? (M5.h) m4 : null;
                    Object obj4 = v.f5219a;
                    if (hVar != null) {
                        AbstractC0161v abstractC0161v = hVar.f1596i;
                        if (abstractC0161v.H()) {
                            hVar.f1598k = obj4;
                            hVar.f1026h = 1;
                            abstractC0161v.G(context, hVar);
                        } else {
                            y0 y0Var = new y0(y0.f1112h);
                            InterfaceC0569i v5 = context.v(y0Var);
                            hVar.f1598k = obj4;
                            hVar.f1026h = 1;
                            abstractC0161v.G(v5, hVar);
                            if (y0Var.f1113g) {
                                P a7 = p0.a();
                                C0504h c0504h = a7.f1046j;
                                if (!(c0504h != null ? c0504h.isEmpty() : true)) {
                                    if (a7.f1044h >= 4294967296L) {
                                        hVar.f1598k = obj4;
                                        hVar.f1026h = 1;
                                        a7.J(hVar);
                                    } else {
                                        a7.L(true);
                                        try {
                                            hVar.run();
                                            do {
                                            } while (a7.N());
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
                        if (obj == EnumC0580a.f5697f) {
                            obj4 = obj;
                        }
                        if (obj4 != obj3) {
                            bVar = this;
                        }
                    }
                    obj = obj4;
                    if (obj == EnumC0580a.f5697f) {
                    }
                    if (obj4 != obj3) {
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj2);
                    return obj2;
                }
                z5 = gVar.Z$0;
                bVar = (b) gVar.L$0;
                AbstractC0676f.w(obj2);
                if (!bVar.notificationsEnabled()) {
                    return Boolean.TRUE;
                }
                if (bVar.supportsNativePrompt) {
                    bVar._requestPermission.startPrompt(z5, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
                } else {
                    if (!z5) {
                        return Boolean.FALSE;
                    }
                    bVar.showFallbackAlertDialog();
                }
                com.onesignal.common.threading.d dVar = bVar.waiter;
                gVar.L$0 = null;
                gVar.label = 2;
                Object waitForWake = dVar.waitForWake(gVar);
                return waitForWake == obj3 ? obj3 : waitForWake;
            }
        }
        gVar = new g(interfaceC0564d);
        Object obj22 = gVar.result;
        Object obj32 = EnumC0580a.f5697f;
        i7 = gVar.label;
        if (i7 != 0) {
        }
        if (!bVar.notificationsEnabled()) {
        }
    }

    @Override // X2.b, com.onesignal.common.events.d
    public void subscribe(X2.a handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // X2.b, com.onesignal.common.events.d
    public void unsubscribe(X2.a handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.events.subscribe(handler);
    }
}
