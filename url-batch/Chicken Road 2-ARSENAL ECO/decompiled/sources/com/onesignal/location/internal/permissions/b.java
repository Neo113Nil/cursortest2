package com.onesignal.location.internal.permissions;

import android.app.Activity;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.permissions.f;
import com.onesignal.core.internal.permissions.g;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o5.InterfaceC0564d;
import x2.C0729b;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class b implements f, com.onesignal.core.internal.startup.b, com.onesignal.common.events.d {
    public static final a Companion = new a(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final T1.f _applicationService;
    private final g _requestPermission;
    private String currPermission;
    private final com.onesignal.common.events.b events;
    private final com.onesignal.common.threading.d waiter;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.location.internal.permissions.b$b, reason: collision with other inner class name */
    public static final class C0052b extends j implements InterfaceC0743l {
        public static final C0052b INSTANCE = new C0052b();

        public C0052b() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return v.f5219a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a it) {
            i.e(it, "it");
            it.onLocationPermissionChanged(true);
        }
    }

    public static final class c extends j implements InterfaceC0743l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return v.f5219a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a it) {
            i.e(it, "it");
            it.onLocationPermissionChanged(false);
        }
    }

    public static final class d implements T1.d {
        public d() {
        }

        @Override // T1.d
        public void onActivityAvailable(Activity activity) {
            i.e(activity, "activity");
            if (activity instanceof PermissionsActivity) {
                return;
            }
            b.this._applicationService.removeActivityLifecycleHandler(this);
            b.showFallbackAlertDialog$present(b.this, activity);
        }

        @Override // T1.d
        public void onActivityStopped(Activity activity) {
            i.e(activity, "activity");
        }
    }

    public static final class e implements com.onesignal.core.internal.permissions.d {
        final /* synthetic */ Activity $activity;

        public static final class a extends T1.c {
            final /* synthetic */ b this$0;

            /* renamed from: com.onesignal.location.internal.permissions.b$e$a$a, reason: collision with other inner class name */
            public static final class C0053a extends j implements InterfaceC0743l {
                final /* synthetic */ boolean $hasPermission;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0053a(boolean z5) {
                    super(1);
                    this.$hasPermission = z5;
                }

                @Override // x5.InterfaceC0743l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.onesignal.location.internal.permissions.a) obj);
                    return v.f5219a;
                }

                public final void invoke(com.onesignal.location.internal.permissions.a it) {
                    i.e(it, "it");
                    it.onLocationPermissionChanged(this.$hasPermission);
                }
            }

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
                boolean hasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(hasPermission));
                this.this$0.events.fire(new C0053a(hasPermission));
            }
        }

        /* renamed from: com.onesignal.location.internal.permissions.b$e$b, reason: collision with other inner class name */
        public static final class C0054b extends j implements InterfaceC0743l {
            public static final C0054b INSTANCE = new C0054b();

            public C0054b() {
                super(1);
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.onesignal.location.internal.permissions.a) obj);
                return v.f5219a;
            }

            public final void invoke(com.onesignal.location.internal.permissions.a it) {
                i.e(it, "it");
                it.onLocationPermissionChanged(false);
            }
        }

        public e(Activity activity) {
            this.$activity = activity;
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.location.internal.permissions.c.INSTANCE.show(this.$activity);
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onDecline() {
            b.this.waiter.wake(Boolean.FALSE);
            b.this.events.fire(C0054b.INSTANCE);
        }
    }

    public b(g _requestPermission, T1.f _applicationService) {
        i.e(_requestPermission, "_requestPermission");
        i.e(_applicationService, "_applicationService");
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this.waiter = new com.onesignal.common.threading.d();
        this.events = new com.onesignal.common.events.b();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._applicationService.getCurrent();
        if (current == null || (current instanceof PermissionsActivity)) {
            this._applicationService.addActivityLifecycleHandler(new d());
            return true;
        }
        showFallbackAlertDialog$present(this, current);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFallbackAlertDialog$present(b bVar, Activity activity) {
        com.onesignal.core.internal.permissions.e eVar = com.onesignal.core.internal.permissions.e.INSTANCE;
        String string = activity.getString(C0729b.location_permission_name_for_title);
        i.d(string, "getString(...)");
        String string2 = activity.getString(C0729b.location_permission_settings_message);
        i.d(string2, "getString(...)");
        eVar.show(activity, string, string2, bVar.new e(activity));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0052b.INSTANCE);
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onReject(boolean z5) {
        if (z5 ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(c.INSTANCE);
    }

    public final Object prompt(boolean z5, String str, InterfaceC0564d interfaceC0564d) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z5, PERMISSION_TYPE, str, b.class);
        return this.waiter.waitForWake(interfaceC0564d);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.location.internal.permissions.a handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.location.internal.permissions.a handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }
}
