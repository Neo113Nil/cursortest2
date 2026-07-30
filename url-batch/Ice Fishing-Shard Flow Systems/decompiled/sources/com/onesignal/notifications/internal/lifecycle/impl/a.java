package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.g;
import i3.InterfaceC0544a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k3.InterfaceC0599a;
import kotlin.Unit;
import kotlin.collections.C0633l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;
import o6.C0809e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C0846a;
import s3.C0891b;
import w3.InterfaceC0991a;

/* loaded from: classes.dex */
public final class a implements w3.b, com.onesignal.notifications.internal.a {
    public static final C0063a Companion = new C0063a(null);
    private static final long MILLIS_PER_SECOND = 1000;
    private static final int RETRY_BACKOFF_MS = 15000;
    private final InterfaceC0544a _analyticsTracker;
    private final v2.f _applicationService;
    private final InterfaceC0599a _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final A2.c _deviceService;
    private final J3.a _influenceManager;
    private final A3.b _receiveReceiptWorkManager;
    private final Y3.b _subscriptionManager;
    private final I2.a _time;
    private final com.onesignal.common.events.b extOpenedCallback;
    private final com.onesignal.common.events.a extRemoteReceivedCallback;
    private final com.onesignal.common.events.b extWillShowInForegroundCallback;
    private final com.onesignal.common.events.a intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final C0633l unprocessedOpenedNotifs;

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0063a {
        public /* synthetic */ C0063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0063a() {
        }
    }

    public static final class b extends p implements Function1 {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h3.h) obj);
            return Unit.f6114a;
        }

        public final void invoke(h3.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onClick(this.$openedResult);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class d extends X5.j implements Function2 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ B $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(B b7, Activity activity, JSONObject jSONObject, V5.b bVar) {
            super(2, bVar);
            this.$canOpen = b7;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            d dVar = new d(this.$canOpen, this.$activity, this.$data, bVar);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            B b7;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                InterfaceC0991a interfaceC0991a = (InterfaceC0991a) this.L$0;
                B b8 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = b8;
                this.label = 1;
                obj = interfaceC0991a.canOpenNotification(activity, jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                b7 = b8;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b7 = (B) this.L$0;
                V6.b.P(obj);
            }
            b7.f6150d = ((Boolean) obj).booleanValue();
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0991a interfaceC0991a, V5.b bVar) {
            return ((d) create(interfaceC0991a, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class e extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public static final class f extends X5.j implements Function2 {
        final /* synthetic */ B $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(B b7, JSONObject jSONObject, V5.b bVar) {
            super(2, bVar);
            this.$canReceive = b7;
            this.$jsonPayload = jSONObject;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            f fVar = new f(this.$canReceive, this.$jsonPayload, bVar);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            B b7;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                InterfaceC0991a interfaceC0991a = (InterfaceC0991a) this.L$0;
                B b8 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = b8;
                this.label = 1;
                obj = interfaceC0991a.canReceiveNotification(jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                b7 = b8;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b7 = (B) this.L$0;
                V6.b.P(obj);
            }
            b7.f6150d = ((Boolean) obj).booleanValue();
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0991a interfaceC0991a, V5.b bVar) {
            return ((f) create(interfaceC0991a, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class g extends X5.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public g(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.confirmNotificationOpened(null, null, null, null, this);
        }
    }

    public static final class h extends p implements Function1 {
        final /* synthetic */ h3.m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h3.m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h3.j) obj);
            return Unit.f6114a;
        }

        public final void invoke(h3.j it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onWillDisplay(this.$willDisplayEvent);
        }
    }

    public static final class i extends p implements Function1 {
        final /* synthetic */ h3.k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h3.k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((h3.l) null);
            return Unit.f6114a;
        }

        public final void invoke(h3.l it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.a();
        }
    }

    public static final class j extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public j(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    public static final class k extends X5.j implements Function1 {
        final /* synthetic */ String $appId;
        final /* synthetic */ A2.a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, A2.a aVar, V5.b bVar) {
            super(1, bVar);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = aVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new k(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                a aVar2 = a.this;
                String str = this.$appId;
                String str2 = this.$notificationId;
                String str3 = this.$subscriptionId;
                A2.a aVar3 = this.$deviceType;
                this.label = 1;
                if (aVar2.confirmNotificationOpened(str, str2, str3, aVar3, this) == aVar) {
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

    public static final class l extends p implements Function1 {
        public static final l INSTANCE = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.f6114a;
        }

        public final void invoke(Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            if (!(ex instanceof C0846a)) {
                com.onesignal.debug.internal.logging.b.info("Unexpected error in notification opened confirmation", ex);
                return;
            }
            StringBuilder sb = new StringBuilder("Notification opened confirmation failed with statusCode: ");
            C0846a c0846a = (C0846a) ex;
            sb.append(c0846a.getStatusCode());
            sb.append(" response: ");
            sb.append(c0846a.getResponse());
            com.onesignal.debug.internal.logging.b.info$default(sb.toString(), null, 2, null);
        }
    }

    public static final class m extends p implements Function1 {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h3.h) obj);
            return Unit.f6114a;
        }

        public final void invoke(h3.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onClick(this.$openResult);
        }
    }

    public static final class n extends X5.c {
        int label;
        /* synthetic */ Object result;

        public n(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.openDestinationActivity(null, null, this);
        }
    }

    public static final class o extends X5.j implements Function2 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Activity activity, Intent intent, V5.b bVar) {
            super(2, bVar);
            this.$activity = activity;
            this.$intent = intent;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new o(this.$activity, this.$intent, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            this.$activity.startActivity(this.$intent);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((o) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public a(v2.f _applicationService, I2.a _time, com.onesignal.core.internal.config.c _configModelStore, J3.a _influenceManager, Y3.b _subscriptionManager, A2.c _deviceService, InterfaceC0599a _backend, A3.b _receiveReceiptWorkManager, InterfaceC0544a _analyticsTracker) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_receiveReceiptWorkManager, "_receiveReceiptWorkManager");
        Intrinsics.checkNotNullParameter(_analyticsTracker, "_analyticsTracker");
        this._applicationService = _applicationService;
        this._time = _time;
        this._configModelStore = _configModelStore;
        this._influenceManager = _influenceManager;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._backend = _backend;
        this._receiveReceiptWorkManager = _receiveReceiptWorkManager;
        this._analyticsTracker = _analyticsTracker;
        this.intLifecycleCallback = new com.onesignal.common.events.a();
        this.extRemoteReceivedCallback = new com.onesignal.common.events.a();
        this.extWillShowInForegroundCallback = new com.onesignal.common.events.b();
        this.extOpenedCallback = new com.onesignal.common.events.b();
        this.unprocessedOpenedNotifs = new C0633l();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(_applicationService.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0124, code lost:
    
        if (n6.AbstractC0792z.d(r5, r1) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0124 -> B:11:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmNotificationOpened(String str, String str2, String str3, A2.a aVar, V5.b bVar) {
        g gVar;
        a aVar2;
        int i2;
        String str4;
        String str5;
        String str6;
        A2.a aVar3;
        int i5;
        g gVar2;
        a aVar4;
        int i7;
        a aVar5;
        String str7;
        String str8;
        String str9;
        A2.a aVar6;
        int i8;
        C0846a e7;
        com.onesignal.common.g gVar3;
        char c7;
        InterfaceC0599a interfaceC0599a;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i9 = gVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.label = i9 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj = gVar.result;
                W5.a aVar7 = W5.a.f2787d;
                i2 = gVar.label;
                int i10 = 1;
                if (i2 != 0) {
                    V6.b.P(obj);
                    int maxNetworkRequestAttemptCount = com.onesignal.common.g.INSTANCE.getMaxNetworkRequestAttemptCount();
                    if (1 <= maxNetworkRequestAttemptCount) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        aVar3 = aVar;
                        i5 = maxNetworkRequestAttemptCount;
                        gVar2 = gVar;
                        aVar4 = aVar2;
                        i7 = 1;
                        interfaceC0599a = aVar4._backend;
                        gVar2.L$0 = aVar4;
                        gVar2.L$1 = str4;
                        gVar2.L$2 = str5;
                        gVar2.L$3 = str6;
                        gVar2.L$4 = aVar3;
                        gVar2.I$0 = i7;
                        gVar2.I$1 = i5;
                        gVar2.label = i10;
                        if (interfaceC0599a.updateNotificationAsOpened(str4, str5, str6, aVar3, gVar2) != aVar7) {
                        }
                        return aVar7;
                    }
                    return Unit.f6114a;
                }
                if (i2 == 1) {
                    i5 = gVar.I$1;
                    i8 = gVar.I$0;
                    aVar6 = (A2.a) gVar.L$4;
                    str9 = (String) gVar.L$3;
                    str8 = (String) gVar.L$2;
                    str7 = (String) gVar.L$1;
                    aVar5 = (a) gVar.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (C0846a e8) {
                        e7 = e8;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e7.getStatusCode()) == g.a.RETRYABLE || i8 >= gVar3.getMaxNetworkRequestAttemptCount()) {
                            throw e7;
                        }
                        long max = Math.max(e7.getRetryAfterSeconds() != null ? r13.intValue() * MILLIS_PER_SECOND : 0L, i8 * RETRY_BACKOFF_MS);
                        StringBuilder k7 = C4.p.k(i8, "Notification opened confirmation attempt ", " failed (statusCode: ");
                        k7.append(e7.getStatusCode());
                        k7.append("), retrying in ");
                        k7.append(max);
                        k7.append("ms");
                        c7 = 2;
                        com.onesignal.debug.internal.logging.b.info$default(k7.toString(), null, 2, null);
                        gVar.L$0 = aVar5;
                        gVar.L$1 = str7;
                        gVar.L$2 = str8;
                        gVar.L$3 = str9;
                        gVar.L$4 = aVar6;
                        gVar.I$0 = i8;
                        gVar.I$1 = i5;
                        gVar.label = 2;
                    }
                    return Unit.f6114a;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = gVar.I$1;
                i8 = gVar.I$0;
                aVar6 = (A2.a) gVar.L$4;
                str9 = (String) gVar.L$3;
                str8 = (String) gVar.L$2;
                str7 = (String) gVar.L$1;
                aVar5 = (a) gVar.L$0;
                V6.b.P(obj);
                c7 = 2;
                String str10 = str7;
                aVar3 = aVar6;
                str4 = str10;
                String str11 = str8;
                str6 = str9;
                str5 = str11;
                aVar4 = aVar5;
                gVar2 = gVar;
                if (i8 != i5) {
                    i7 = i8 + 1;
                    i10 = 1;
                    try {
                    } catch (C0846a e9) {
                        e7 = e9;
                        A2.a aVar8 = aVar3;
                        str7 = str4;
                        aVar6 = aVar8;
                        String str12 = str6;
                        str8 = str5;
                        str9 = str12;
                        i8 = i7;
                        gVar = gVar2;
                        aVar5 = aVar4;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e7.getStatusCode()) == g.a.RETRYABLE) {
                        }
                        throw e7;
                    }
                    interfaceC0599a = aVar4._backend;
                    gVar2.L$0 = aVar4;
                    gVar2.L$1 = str4;
                    gVar2.L$2 = str5;
                    gVar2.L$3 = str6;
                    gVar2.L$4 = aVar3;
                    gVar2.I$0 = i7;
                    gVar2.I$1 = i5;
                    gVar2.label = i10;
                    if (interfaceC0599a.updateNotificationAsOpened(str4, str5, str6, aVar3, gVar2) != aVar7) {
                        A2.a aVar9 = aVar3;
                        str7 = str4;
                        aVar6 = aVar9;
                        String str13 = str6;
                        str8 = str5;
                        str9 = str13;
                        i8 = i7;
                        gVar = gVar2;
                        aVar5 = aVar4;
                        return Unit.f6114a;
                    }
                    return aVar7;
                }
                return Unit.f6114a;
            }
        }
        aVar2 = this;
        gVar = aVar2.new g(bVar);
        Object obj2 = gVar.result;
        W5.a aVar72 = W5.a.f2787d;
        i2 = gVar.label;
        int i102 = 1;
        if (i2 != 0) {
        }
    }

    private final String getLatestNotificationId(JSONArray jSONArray) {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            Intrinsics.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return s3.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return s3.g.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e7) {
            e7.printStackTrace();
            return true;
        }
    }

    @Override // w3.b
    public void addExternalClickListener(h3.h callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers()) {
            C0633l c0633l = this.unprocessedOpenedNotifs;
            Intrinsics.checkNotNullParameter(c0633l, "<this>");
            if (c0633l != null ? !c0633l.isEmpty() : c0633l.iterator().hasNext()) {
                Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
                while (it.hasNext()) {
                    this.extOpenedCallback.fireOnMain(new b(s3.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
                }
                this.unprocessedOpenedNotifs.clear();
            }
        }
    }

    @Override // w3.b
    public void addExternalForegroundLifecycleListener(h3.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // w3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, V5.b bVar) {
        c cVar;
        int i2;
        B b7;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = cVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    B b8 = new B();
                    b8.f6150d = true;
                    com.onesignal.common.events.a aVar2 = this.intLifecycleCallback;
                    d dVar = new d(b8, activity, jSONObject, null);
                    cVar.L$0 = b8;
                    cVar.label = 1;
                    if (aVar2.suspendingFire(dVar, cVar) == aVar) {
                        return aVar;
                    }
                    b7 = b8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7 = (B) cVar.L$0;
                    V6.b.P(obj);
                }
                return Boolean.valueOf(b7.f6150d);
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(b7.f6150d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // w3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, V5.b bVar) {
        e eVar;
        int i2;
        B b7;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i5 = eVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.label = i5 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = eVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    B b8 = new B();
                    b8.f6150d = true;
                    com.onesignal.common.events.a aVar2 = this.intLifecycleCallback;
                    f fVar = new f(b8, jSONObject, null);
                    eVar.L$0 = b8;
                    eVar.label = 1;
                    if (aVar2.suspendingFire(fVar, eVar) == aVar) {
                        return aVar;
                    }
                    b7 = b8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7 = (B) eVar.L$0;
                    V6.b.P(obj);
                }
                return Boolean.valueOf(b7.f6150d);
            }
        }
        eVar = new e(bVar);
        Object obj2 = eVar.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = eVar.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(b7.f6150d);
    }

    @Override // w3.b
    public void externalNotificationWillShowInForeground(h3.m willDisplayEvent) {
        Intrinsics.checkNotNullParameter(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new h(willDisplayEvent));
    }

    @Override // w3.b
    public void externalRemoteNotificationReceived(h3.k notificationReceivedEvent) {
        Intrinsics.checkNotNullParameter(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new i(notificationReceivedEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // w3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, V5.b bVar) {
        j jVar;
        int i2;
        a aVar;
        JSONArray jSONArray2;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i5 = jVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jVar.label = i5 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = jVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                    A2.a deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        String oSNotificationIdFromJson = s3.c.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i7));
                        if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            com.onesignal.common.threading.b.suspendifyWithErrorHandling$default(true, new k(str, oSNotificationIdFromJson, id, deviceType, null), l.INSTANCE, null, 8, null);
                        }
                    }
                    s3.e eVar = s3.e.INSTANCE;
                    com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    InterfaceC0544a interfaceC0544a = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    Intrinsics.b(notificationId);
                    interfaceC0544a.trackOpenedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
                    String latestNotificationId = getLatestNotificationId(jSONArray);
                    if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                        this._applicationService.setEntryState(v2.b.NOTIFICATION_CLICK);
                        if (latestNotificationId != null) {
                            this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                        }
                    }
                    jVar2.L$0 = this;
                    jVar2.L$1 = jSONArray;
                    jVar2.label = 1;
                    if (openDestinationActivity(activity, jSONArray, jVar2) == aVar2) {
                        return aVar2;
                    }
                    aVar = this;
                    jSONArray2 = jSONArray;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray2 = (JSONArray) jVar2.L$1;
                    aVar = (a) jVar2.L$0;
                    V6.b.P(obj);
                }
                if (aVar.extOpenedCallback.getHasSubscribers()) {
                    aVar.unprocessedOpenedNotifs.addLast(jSONArray2);
                } else {
                    aVar.extOpenedCallback.fireOnMain(new m(s3.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray2, aVar._time)));
                }
                return Unit.f6114a;
            }
        }
        jVar = new j(bVar);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = jVar22.label;
        if (i2 != 0) {
        }
        if (aVar.extOpenedCallback.getHasSubscribers()) {
        }
        return Unit.f6114a;
    }

    @Override // w3.b
    public Object notificationReceived(s3.d dVar, V5.b bVar) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            s3.e eVar = s3.e.INSTANCE;
            com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.onesignal.common.f.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            InterfaceC0544a interfaceC0544a = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            Intrinsics.b(notificationId);
            interfaceC0544a.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        return Unit.f6114a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|(1:23))(1:24))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("No activity found to handle notification open intent.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Could not parse JSON to open notification activity.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Could not open notification activity.", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.notifications.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, V5.b bVar) {
        n nVar;
        int i2;
        if (bVar instanceof n) {
            nVar = (n) bVar;
            int i5 = nVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nVar.label = i5 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = nVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    C0891b c0891b = C0891b.INSTANCE;
                    Intrinsics.b(jSONObject);
                    Intent intentVisible = c0891b.create(activity, jSONObject).getIntentVisible();
                    if (intentVisible != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                        C0809e c0809e = s6.n.f7850a;
                        o oVar = new o(activity, intentVisible, null);
                        nVar.label = 1;
                        if (AbstractC0792z.t(c0809e, oVar, nVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
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
        nVar = new n(bVar);
        Object obj2 = nVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = nVar.label;
        if (i2 != 0) {
        }
        return Unit.f6114a;
    }

    @Override // w3.b
    public void removeExternalClickListener(h3.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    @Override // w3.b
    public void removeExternalForegroundLifecycleListener(h3.j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // w3.b
    public void setInternalNotificationLifecycleCallback(InterfaceC0991a interfaceC0991a) {
        this.intLifecycleCallback.set(interfaceC0991a);
    }

    public final void setupNotificationServiceExtension(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.verbose$default(r4.f.d("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e7) {
            e7.printStackTrace();
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        } catch (InstantiationException e9) {
            e9.printStackTrace();
        }
    }
}
