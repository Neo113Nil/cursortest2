package com.onesignal.notifications.internal.permissions.impl;

import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import h3.r;
import kotlin.Unit;
import kotlin.collections.C0633l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0786t;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;
import n6.P;
import n6.o0;
import n6.x0;
import z3.InterfaceC1057a;
import z3.InterfaceC1058b;

/* loaded from: classes.dex */
public final class b implements com.onesignal.core.internal.permissions.f, InterfaceC1058b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0066b Companion = new C0066b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final v2.f _application;
    private final v2.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final H2.b _preferenceService;
    private final com.onesignal.core.internal.permissions.g _requestPermission;
    private boolean enabled;
    private final com.onesignal.common.events.b events;
    private long pollingWaitInterval;
    private final com.onesignal.common.threading.d pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.onesignal.common.threading.e waiter;

    public static final class a extends X5.j implements Function1 {
        int label;

        public a(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return b.this.new a(bVar);
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
                b bVar = b.this;
                this.label = 1;
                if (bVar.pollForPermission(this) == aVar) {
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

    /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$b, reason: collision with other inner class name */
    public static final class C0066b {
        public /* synthetic */ C0066b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0066b() {
        }
    }

    public static final class c extends p implements Function1 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z7) {
            super(1);
            this.$enabled = z7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1057a) obj);
            return Unit.f6114a;
        }

        public final void invoke(InterfaceC1057a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class d extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    public static final class e extends p implements Function1 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z7) {
            super(1);
            this.$enabled = z7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1057a) obj);
            return Unit.f6114a;
        }

        public final void invoke(InterfaceC1057a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class f extends X5.j implements Function2 {
        int label;

        public f(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new f(bVar);
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
            com.onesignal.common.threading.d dVar = b.this.pollingWaiter;
            this.label = 1;
            Object waitForWake = dVar.waitForWake(this);
            return waitForWake == aVar ? aVar : waitForWake;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((f) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class g extends X5.c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    public static final class h extends v2.c {

        public static final class a extends p implements Function0 {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m32invoke();
                return Unit.f6114a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
                this.this$0.pollingWaiter.wake();
            }
        }

        /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$h$b, reason: collision with other inner class name */
        public static final class C0067b extends p implements Function0 {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0067b(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m33invoke();
                return Unit.f6114a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
            }
        }

        public h() {
        }

        @Override // v2.c, v2.e
        public void onFocus(boolean z7) {
            super.onFocus(z7);
            com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new a(b.this));
        }

        @Override // v2.c, v2.e
        public void onUnfocused() {
            super.onUnfocused();
            com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new C0067b(b.this));
        }
    }

    public static final class i implements v2.d {
        public i() {
        }

        @Override // v2.d
        public void onActivityAvailable(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof PermissionsActivity) {
                return;
            }
            b.this._application.removeActivityLifecycleHandler(this);
            b.showFallbackAlertDialog$present(b.this, activity);
        }

        @Override // v2.d
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class j implements com.onesignal.core.internal.permissions.d {
        final /* synthetic */ Activity $activity;

        public static final class a extends v2.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // v2.c, v2.e
            public void onFocus(boolean z7) {
                if (z7) {
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

    public b(v2.f _application, com.onesignal.core.internal.permissions.g _requestPermission, v2.f _applicationService, H2.b _preferenceService, com.onesignal.core.internal.config.c _configModelStore) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_requestPermission, "_requestPermission");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_preferenceService, "_preferenceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new com.onesignal.common.threading.e();
        this.pollingWaiter = new com.onesignal.common.threading.d();
        this.events = new com.onesignal.common.events.b();
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.onesignal.core.internal.config.b) _configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        com.onesignal.common.threading.b.launchOnIO(new a(null));
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return s3.e.areNotificationsEnabled$default(s3.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z7) {
        this.enabled = z7;
        this.waiter.wake(Boolean.valueOf(z7));
        this.events.fire(new c(z7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(V5.b bVar) {
        d dVar;
        W5.a aVar;
        int i2;
        b bVar2;
        boolean notificationsEnabled;
        long j7;
        f fVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i5 = dVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.label = i5 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                aVar = W5.a.f2787d;
                i2 = dVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    bVar2 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (b) dVar.L$0;
                    V6.b.P(obj);
                }
                do {
                    notificationsEnabled = bVar2.notificationsEnabled();
                    if (bVar2.enabled != notificationsEnabled) {
                        bVar2.enabled = notificationsEnabled;
                        bVar2.events.fire(new e(notificationsEnabled));
                    }
                    j7 = bVar2.pollingWaitInterval;
                    fVar = bVar2.new f(null);
                    dVar.L$0 = bVar2;
                    dVar.label = 1;
                } while (AbstractC0792z.v(j7, fVar, dVar) != aVar);
                return aVar;
            }
        }
        dVar = new d(bVar);
        Object obj2 = dVar.result;
        aVar = W5.a.f2787d;
        i2 = dVar.label;
        if (i2 != 0) {
        }
        do {
            notificationsEnabled = bVar2.notificationsEnabled();
            if (bVar2.enabled != notificationsEnabled) {
            }
            j7 = bVar2.pollingWaitInterval;
            fVar = bVar2.new f(null);
            dVar.L$0 = bVar2;
            dVar.label = 1;
        } while (AbstractC0792z.v(j7, fVar, dVar) != aVar);
        return aVar;
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
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(r.notification_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        eVar.show(activity, string, string2, bVar.new j(activity));
    }

    @Override // z3.InterfaceC1058b
    public boolean getCanRequestPermission() {
        Intrinsics.b(this._preferenceService.getBool(com.onesignal.common.threading.a.BASE_THREAD_NAME, "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        return !r0.booleanValue();
    }

    @Override // z3.InterfaceC1058b, com.onesignal.common.events.d
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
    public void onReject(boolean z7) {
        if (z7 ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // z3.InterfaceC1058b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z7, V5.b bVar) {
        g frame;
        int i2;
        Object obj;
        b bVar2;
        if (bVar instanceof g) {
            frame = (g) bVar;
            int i5 = frame.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                frame.label = i5 - Integer.MIN_VALUE;
                Object obj2 = frame.result;
                Object obj3 = W5.a.f2787d;
                i2 = frame.label;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    frame.L$0 = this;
                    frame.Z$0 = z7;
                    frame.label = 1;
                    CoroutineContext context = frame.getContext();
                    AbstractC0792z.e(context);
                    V5.b b7 = W5.d.b(frame);
                    s6.f fVar = b7 instanceof s6.f ? (s6.f) b7 : null;
                    if (fVar == null) {
                        obj = Unit.f6114a;
                    } else {
                        AbstractC0786t abstractC0786t = fVar.f7827l;
                        if (abstractC0786t.G(context)) {
                            fVar.f7829n = Unit.f6114a;
                            fVar.f7010i = 1;
                            abstractC0786t.F(context, fVar);
                        } else {
                            x0 x0Var = new x0(x0.f7093i);
                            CoroutineContext j7 = context.j(x0Var);
                            Unit unit = Unit.f6114a;
                            fVar.f7829n = unit;
                            fVar.f7010i = 1;
                            abstractC0786t.F(j7, fVar);
                            if (x0Var.f7094e) {
                                P a7 = o0.a();
                                C0633l c0633l = a7.f7029m;
                                if (!(c0633l != null ? c0633l.isEmpty() : true)) {
                                    if (a7.f7027i >= 4294967296L) {
                                        fVar.f7829n = unit;
                                        fVar.f7010i = 1;
                                        a7.J(fVar);
                                    } else {
                                        a7.L(true);
                                        try {
                                            fVar.run();
                                            do {
                                            } while (a7.N());
                                        } finally {
                                            try {
                                            } finally {
                                            }
                                        }
                                    }
                                }
                                obj = Unit.f6114a;
                            }
                        }
                        obj = obj3;
                    }
                    Object obj4 = W5.a.f2787d;
                    if (obj == obj4) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (obj != obj4) {
                        obj = Unit.f6114a;
                    }
                    if (obj != obj3) {
                        bVar2 = this;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj2);
                    return obj2;
                }
                z7 = frame.Z$0;
                bVar2 = (b) frame.L$0;
                V6.b.P(obj2);
                if (!bVar2.notificationsEnabled()) {
                    return Boolean.TRUE;
                }
                if (bVar2.supportsNativePrompt) {
                    bVar2._requestPermission.startPrompt(z7, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
                } else {
                    if (!z7) {
                        return Boolean.FALSE;
                    }
                    bVar2.showFallbackAlertDialog();
                }
                com.onesignal.common.threading.e eVar = bVar2.waiter;
                frame.L$0 = null;
                frame.label = 2;
                Object waitForWake = eVar.waitForWake(frame);
                return waitForWake == obj3 ? obj3 : waitForWake;
            }
        }
        frame = new g(bVar);
        Object obj22 = frame.result;
        Object obj32 = W5.a.f2787d;
        i2 = frame.label;
        if (i2 != 0) {
        }
        if (!bVar2.notificationsEnabled()) {
        }
    }

    @Override // z3.InterfaceC1058b, com.onesignal.common.events.d
    public void subscribe(InterfaceC1057a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // z3.InterfaceC1058b, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC1057a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }
}
