package com.onesignal.location.internal.permissions;

import android.app.Activity;
import com.onesignal.common.AndroidUtils;
import ea.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.e;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements e, ra.b, com.onesignal.common.events.d {
    public static final a Companion = new a(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final f _applicationService;
    private final pa.f _requestPermission;
    private String currPermission;
    private final com.onesignal.common.events.b events;
    private final com.onesignal.common.threading.d waiter;

    public b(pa.f fVar, f fVar2) {
        fVar.getClass();
        fVar2.getClass();
        this._requestPermission = fVar;
        this._applicationService = fVar2;
        this.waiter = new com.onesignal.common.threading.d();
        this.events = new com.onesignal.common.events.b();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._applicationService.getCurrent();
        if (current == null) {
            return false;
        }
        pa.d dVar = pa.d.INSTANCE;
        String string = current.getString(ib.b.location_permission_name_for_title);
        string.getClass();
        String string2 = current.getString(ib.b.location_permission_settings_message);
        string2.getClass();
        dVar.show(current, string, string2, new d(current));
        return true;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // pa.e
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0044b.INSTANCE);
    }

    @Override // pa.e
    public void onReject(boolean z10) {
        if (z10 ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(c.INSTANCE);
    }

    public final Object prompt(boolean z10, String str, ld.a aVar) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z10, PERMISSION_TYPE, str, b.class);
        return this.waiter.waitForWake(aVar);
    }

    @Override // ra.b
    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.location.internal.permissions.a aVar) {
        aVar.getClass();
        this.events.subscribe(aVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.location.internal.permissions.a aVar) {
        aVar.getClass();
        this.events.subscribe(aVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d implements pa.c {
        final /* synthetic */ Activity $activity;

        public d(Activity activity) {
            this.$activity = activity;
        }

        @Override // pa.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.location.internal.permissions.c.INSTANCE.show(this.$activity);
        }

        @Override // pa.c
        public void onDecline() {
            b.this.waiter.wake(Boolean.FALSE);
            b.this.events.fire(C0046b.INSTANCE);
        }

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
                boolean hasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(hasPermission));
                this.this$0.events.fire(new C0045a(hasPermission));
            }

            /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
            /* renamed from: com.onesignal.location.internal.permissions.b$d$a$a, reason: collision with other inner class name */
            public static final class C0045a extends p implements Function1 {
                final /* synthetic */ boolean $hasPermission;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0045a(boolean z10) {
                    super(1);
                    this.$hasPermission = z10;
                }

                public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
                    aVar.getClass();
                    aVar.onLocationPermissionChanged(this.$hasPermission);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.onesignal.location.internal.permissions.a) obj);
                    return Unit.f5554a;
                }
            }
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.location.internal.permissions.b$d$b, reason: collision with other inner class name */
        public static final class C0046b extends p implements Function1 {
            public static final C0046b INSTANCE = new C0046b();

            public C0046b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.onesignal.location.internal.permissions.a) obj);
                return Unit.f5554a;
            }

            public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
                aVar.getClass();
                aVar.onLocationPermissionChanged(false);
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.location.internal.permissions.b$b, reason: collision with other inner class name */
    public static final class C0044b extends p implements Function1 {
        public static final C0044b INSTANCE = new C0044b();

        public C0044b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return Unit.f5554a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
            aVar.getClass();
            aVar.onLocationPermissionChanged(true);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return Unit.f5554a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
            aVar.getClass();
            aVar.onLocationPermissionChanged(false);
        }
    }
}
