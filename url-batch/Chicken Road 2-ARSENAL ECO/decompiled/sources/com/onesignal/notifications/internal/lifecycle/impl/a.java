package com.onesignal.notifications.internal.lifecycle.impl;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.g;
import g2.InterfaceC0391a;
import h3.InterfaceC0405a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k5.v;
import kotlin.jvm.internal.q;
import l5.C0504h;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import w3.InterfaceC0720b;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class a implements U2.b, com.onesignal.notifications.internal.a {
    public static final C0063a Companion = new C0063a(null);
    private static final long MILLIS_PER_SECOND = 1000;
    private static final int RETRY_BACKOFF_MS = 15000;
    private final G2.a _analyticsTracker;
    private final T1.f _applicationService;
    private final I2.a _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final Y1.c _deviceService;
    private final InterfaceC0405a _influenceManager;
    private final Y2.b _receiveReceiptWorkManager;
    private final InterfaceC0720b _subscriptionManager;
    private final InterfaceC0391a _time;
    private final com.onesignal.common.events.b extOpenedCallback;
    private final com.onesignal.common.events.a extRemoteReceivedCallback;
    private final com.onesignal.common.events.b extWillShowInForegroundCallback;
    private final com.onesignal.common.events.a intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final C0504h unprocessedOpenedNotifs;

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0063a {
        public /* synthetic */ C0063a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0063a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((F2.h) obj);
            return v.f5219a;
        }

        public final void invoke(F2.h it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onClick(this.$openedResult);
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class d extends q5.g implements InterfaceC0747p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ q $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q qVar, Activity activity, JSONObject jSONObject, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$canOpen = qVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            d dVar = new d(this.$canOpen, this.$activity, this.$data, interfaceC0564d);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(U2.a aVar, InterfaceC0564d interfaceC0564d) {
            return ((d) create(aVar, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                U2.a aVar = (U2.a) this.L$0;
                q qVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = qVar2;
                this.label = 1;
                obj = aVar.canOpenNotification(activity, jSONObject, this);
                if (obj == enumC0580a) {
                    return enumC0580a;
                }
                qVar = qVar2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                AbstractC0676f.w(obj);
            }
            qVar.f5231f = ((Boolean) obj).booleanValue();
            return v.f5219a;
        }
    }

    public static final class e extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public static final class f extends q5.g implements InterfaceC0747p {
        final /* synthetic */ q $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q qVar, JSONObject jSONObject, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$canReceive = qVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            f fVar = new f(this.$canReceive, this.$jsonPayload, interfaceC0564d);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(U2.a aVar, InterfaceC0564d interfaceC0564d) {
            return ((f) create(aVar, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                U2.a aVar = (U2.a) this.L$0;
                q qVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = qVar2;
                this.label = 1;
                obj = aVar.canReceiveNotification(jSONObject, this);
                if (obj == enumC0580a) {
                    return enumC0580a;
                }
                qVar = qVar2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                AbstractC0676f.w(obj);
            }
            qVar.f5231f = ((Boolean) obj).booleanValue();
            return v.f5219a;
        }
    }

    public static final class g extends AbstractC0607c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.confirmNotificationOpened(null, null, null, null, this);
        }
    }

    public static final class h extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ F2.m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(F2.m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((F2.j) obj);
            return v.f5219a;
        }

        public final void invoke(F2.j it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onWillDisplay(this.$willDisplayEvent);
        }
    }

    public static final class i extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ F2.k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(F2.k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // x5.InterfaceC0743l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((F2.l) null);
            return v.f5219a;
        }

        public final void invoke(F2.l it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.a();
        }
    }

    public static final class j extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    public static final class k extends q5.g implements InterfaceC0743l {
        final /* synthetic */ String $appId;
        final /* synthetic */ Y1.a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, Y1.a aVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = aVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new k(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                a aVar = a.this;
                String str = this.$appId;
                String str2 = this.$notificationId;
                String str3 = this.$subscriptionId;
                Y1.a aVar2 = this.$deviceType;
                this.label = 1;
                if (aVar.confirmNotificationOpened(str, str2, str3, aVar2, this) == enumC0580a) {
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
            return ((k) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class l extends kotlin.jvm.internal.j implements InterfaceC0743l {
        public static final l INSTANCE = new l();

        public l() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return v.f5219a;
        }

        public final void invoke(Exception ex) {
            kotlin.jvm.internal.i.e(ex, "ex");
            if (!(ex instanceof P1.a)) {
                com.onesignal.debug.internal.logging.b.info("Unexpected error in notification opened confirmation", ex);
                return;
            }
            StringBuilder sb = new StringBuilder("Notification opened confirmation failed with statusCode: ");
            P1.a aVar = (P1.a) ex;
            sb.append(aVar.getStatusCode());
            sb.append(" response: ");
            sb.append(aVar.getResponse());
            com.onesignal.debug.internal.logging.b.info$default(sb.toString(), null, 2, null);
        }
    }

    public static final class m extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((F2.h) obj);
            return v.f5219a;
        }

        public final void invoke(F2.h it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onClick(this.$openResult);
        }
    }

    public static final class n extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public n(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.openDestinationActivity(null, null, this);
        }
    }

    public static final class o extends q5.g implements InterfaceC0747p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Activity activity, Intent intent, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$activity = activity;
            this.$intent = intent;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new o(this.$activity, this.$intent, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((o) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            this.$activity.startActivity(this.$intent);
            return v.f5219a;
        }
    }

    public a(T1.f _applicationService, InterfaceC0391a _time, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0405a _influenceManager, InterfaceC0720b _subscriptionManager, Y1.c _deviceService, I2.a _backend, Y2.b _receiveReceiptWorkManager, G2.a _analyticsTracker) {
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_time, "_time");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.i.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.i.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.i.e(_backend, "_backend");
        kotlin.jvm.internal.i.e(_receiveReceiptWorkManager, "_receiveReceiptWorkManager");
        kotlin.jvm.internal.i.e(_analyticsTracker, "_analyticsTracker");
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
        this.unprocessedOpenedNotifs = new C0504h();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(_applicationService.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x012a -> B:11:0x013a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmNotificationOpened(String str, String str2, String str3, Y1.a aVar, InterfaceC0564d interfaceC0564d) {
        g gVar;
        a aVar2;
        int i7;
        String str4;
        String str5;
        String str6;
        Y1.a aVar3;
        g gVar2;
        a aVar4;
        int i8;
        int i9;
        a aVar5;
        String str7;
        String str8;
        String str9;
        Y1.a aVar6;
        int i10;
        int i11;
        P1.a e4;
        com.onesignal.common.g gVar3;
        if (interfaceC0564d instanceof g) {
            gVar = (g) interfaceC0564d;
            int i12 = gVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.label = i12 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj = gVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = gVar.label;
                v vVar = v.f5219a;
                int i13 = 1;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    int maxNetworkRequestAttemptCount = com.onesignal.common.g.INSTANCE.getMaxNetworkRequestAttemptCount();
                    if (1 <= maxNetworkRequestAttemptCount) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        aVar3 = aVar;
                        gVar2 = gVar;
                        aVar4 = aVar2;
                        i8 = 1;
                        i9 = maxNetworkRequestAttemptCount;
                        I2.a aVar7 = aVar4._backend;
                        gVar2.L$0 = aVar4;
                        gVar2.L$1 = str4;
                        gVar2.L$2 = str5;
                        gVar2.L$3 = str6;
                        gVar2.L$4 = aVar3;
                        gVar2.I$0 = i8;
                        gVar2.I$1 = i9;
                        gVar2.label = i13;
                        if (aVar7.updateNotificationAsOpened(str4, str5, str6, aVar3, gVar2) != enumC0580a) {
                        }
                    }
                    return vVar;
                }
                if (i7 == 1) {
                    i11 = gVar.I$1;
                    i10 = gVar.I$0;
                    aVar6 = (Y1.a) gVar.L$4;
                    str9 = (String) gVar.L$3;
                    str8 = (String) gVar.L$2;
                    str7 = (String) gVar.L$1;
                    aVar5 = (a) gVar.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (P1.a e7) {
                        e4 = e7;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e4.getStatusCode()) == g.a.RETRYABLE) {
                        }
                        throw e4;
                    }
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = gVar.I$1;
                i10 = gVar.I$0;
                Y1.a aVar8 = (Y1.a) gVar.L$4;
                String str10 = (String) gVar.L$3;
                String str11 = (String) gVar.L$2;
                String str12 = (String) gVar.L$1;
                a aVar9 = (a) gVar.L$0;
                AbstractC0676f.w(obj);
                gVar2 = gVar;
                i9 = i14;
                aVar4 = aVar9;
                aVar3 = aVar8;
                str4 = str12;
                str6 = str10;
                str5 = str11;
                char c7 = 2;
                if (i10 != i9) {
                    i8 = i10 + 1;
                    i13 = 1;
                    try {
                    } catch (P1.a e8) {
                        e4 = e8;
                        a aVar10 = aVar4;
                        i11 = i9;
                        gVar = gVar2;
                        aVar5 = aVar10;
                        Y1.a aVar11 = aVar3;
                        str7 = str4;
                        aVar6 = aVar11;
                        String str13 = str6;
                        str8 = str5;
                        str9 = str13;
                        i10 = i8;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e4.getStatusCode()) == g.a.RETRYABLE || i10 >= gVar3.getMaxNetworkRequestAttemptCount()) {
                            throw e4;
                        }
                        long max = Math.max(e4.getRetryAfterSeconds() != null ? r7.intValue() * MILLIS_PER_SECOND : 0L, i10 * RETRY_BACKOFF_MS);
                        c7 = 2;
                        com.onesignal.debug.internal.logging.b.info$default("Notification opened confirmation attempt " + i10 + " failed (statusCode: " + e4.getStatusCode() + "), retrying in " + max + "ms", null, 2, null);
                        gVar.L$0 = aVar5;
                        gVar.L$1 = str7;
                        gVar.L$2 = str8;
                        gVar.L$3 = str9;
                        gVar.L$4 = aVar6;
                        gVar.I$0 = i10;
                        gVar.I$1 = i11;
                        gVar.label = 2;
                        if (AbstractC0165z.d(max, gVar) != enumC0580a) {
                            a aVar12 = aVar5;
                            gVar2 = gVar;
                            i9 = i11;
                            aVar4 = aVar12;
                            String str14 = str7;
                            aVar3 = aVar6;
                            str4 = str14;
                            String str15 = str8;
                            str6 = str9;
                            str5 = str15;
                            if (i10 != i9) {
                            }
                            return vVar;
                        }
                    }
                    I2.a aVar72 = aVar4._backend;
                    gVar2.L$0 = aVar4;
                    gVar2.L$1 = str4;
                    gVar2.L$2 = str5;
                    gVar2.L$3 = str6;
                    gVar2.L$4 = aVar3;
                    gVar2.I$0 = i8;
                    gVar2.I$1 = i9;
                    gVar2.label = i13;
                    return aVar72.updateNotificationAsOpened(str4, str5, str6, aVar3, gVar2) != enumC0580a ? enumC0580a : vVar;
                }
                return vVar;
            }
        }
        aVar2 = this;
        gVar = aVar2.new g(interfaceC0564d);
        Object obj2 = gVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = gVar.label;
        v vVar2 = v.f5219a;
        int i132 = 1;
        if (i7 != 0) {
        }
    }

    private final String getLatestNotificationId(JSONArray jSONArray) {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return Q2.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return Q2.g.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e4) {
            e4.printStackTrace();
            return true;
        }
    }

    @Override // U2.b
    public void addExternalClickListener(F2.h callback) {
        kotlin.jvm.internal.i.e(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers()) {
            C0504h c0504h = this.unprocessedOpenedNotifs;
            kotlin.jvm.internal.i.e(c0504h, "<this>");
            if (c0504h.isEmpty()) {
                return;
            }
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new b(Q2.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
            this.unprocessedOpenedNotifs.clear();
        }
    }

    @Override // U2.b
    public void addExternalForegroundLifecycleListener(F2.j listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // U2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        q qVar;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    q qVar2 = new q();
                    qVar2.f5231f = true;
                    com.onesignal.common.events.a aVar = this.intLifecycleCallback;
                    d dVar = new d(qVar2, activity, jSONObject, null);
                    cVar.L$0 = qVar2;
                    cVar.label = 1;
                    if (aVar.suspendingFire(dVar, cVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    qVar = qVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) cVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return Boolean.valueOf(qVar.f5231f);
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        if (i7 != 0) {
        }
        return Boolean.valueOf(qVar.f5231f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // U2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i7;
        q qVar;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i8 = eVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.label = i8 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    q qVar2 = new q();
                    qVar2.f5231f = true;
                    com.onesignal.common.events.a aVar = this.intLifecycleCallback;
                    f fVar = new f(qVar2, jSONObject, null);
                    eVar.L$0 = qVar2;
                    eVar.label = 1;
                    if (aVar.suspendingFire(fVar, eVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    qVar = qVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) eVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return Boolean.valueOf(qVar.f5231f);
            }
        }
        eVar = new e(interfaceC0564d);
        Object obj2 = eVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar.label;
        if (i7 != 0) {
        }
        return Boolean.valueOf(qVar.f5231f);
    }

    @Override // U2.b
    public void externalNotificationWillShowInForeground(F2.m willDisplayEvent) {
        kotlin.jvm.internal.i.e(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new h(willDisplayEvent));
    }

    @Override // U2.b
    public void externalRemoteNotificationReceived(F2.k notificationReceivedEvent) {
        kotlin.jvm.internal.i.e(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new i(notificationReceivedEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // U2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC0564d interfaceC0564d) {
        j jVar;
        int i7;
        a aVar;
        JSONArray jSONArray2;
        if (interfaceC0564d instanceof j) {
            jVar = (j) interfaceC0564d;
            int i8 = jVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.label = i8 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = jVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                    Y1.a deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        String oSNotificationIdFromJson = Q2.c.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i9));
                        if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            com.onesignal.common.threading.b.suspendifyWithErrorHandling$default(true, new k(str, oSNotificationIdFromJson, id, deviceType, null), l.INSTANCE, null, 8, null);
                        }
                    }
                    Q2.e eVar = Q2.e.INSTANCE;
                    com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    G2.a aVar2 = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    kotlin.jvm.internal.i.b(notificationId);
                    aVar2.trackOpenedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
                    String latestNotificationId = getLatestNotificationId(jSONArray);
                    if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                        this._applicationService.setEntryState(T1.b.NOTIFICATION_CLICK);
                        if (latestNotificationId != null) {
                            this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                        }
                    }
                    jVar2.L$0 = this;
                    jVar2.L$1 = jSONArray;
                    jVar2.label = 1;
                    if (openDestinationActivity(activity, jSONArray, jVar2) == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                    jSONArray2 = jSONArray;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray2 = (JSONArray) jVar2.L$1;
                    aVar = (a) jVar2.L$0;
                    AbstractC0676f.w(obj);
                }
                if (aVar.extOpenedCallback.getHasSubscribers()) {
                    aVar.unprocessedOpenedNotifs.addLast(jSONArray2);
                } else {
                    aVar.extOpenedCallback.fireOnMain(new m(Q2.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray2, aVar._time)));
                }
                return v.f5219a;
            }
        }
        jVar = new j(interfaceC0564d);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = jVar22.label;
        if (i7 != 0) {
        }
        if (aVar.extOpenedCallback.getHasSubscribers()) {
        }
        return v.f5219a;
    }

    @Override // U2.b
    public Object notificationReceived(Q2.d dVar, InterfaceC0564d interfaceC0564d) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            Q2.e eVar = Q2.e.INSTANCE;
            com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.onesignal.common.f.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            G2.a aVar = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            kotlin.jvm.internal.i.b(notificationId);
            aVar.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return v.f5219a;
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
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, InterfaceC0564d interfaceC0564d) {
        n nVar;
        int i7;
        if (interfaceC0564d instanceof n) {
            nVar = (n) interfaceC0564d;
            int i8 = nVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                nVar.label = i8 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = nVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    Q2.b bVar = Q2.b.INSTANCE;
                    kotlin.jvm.internal.i.b(jSONObject);
                    Intent intentVisible = bVar.create(activity, jSONObject).getIntentVisible();
                    if (intentVisible != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                        I5.e eVar = M5.o.f1618a;
                        o oVar = new o(activity, intentVisible, null);
                        nVar.label = 1;
                        if (AbstractC0165z.t(eVar, oVar, nVar) == enumC0580a) {
                            return enumC0580a;
                        }
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                return v.f5219a;
            }
        }
        nVar = new n(interfaceC0564d);
        Object obj2 = nVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = nVar.label;
        if (i7 != 0) {
        }
        return v.f5219a;
    }

    @Override // U2.b
    public void removeExternalClickListener(F2.h listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    @Override // U2.b
    public void removeExternalForegroundLifecycleListener(F2.j listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // U2.b
    public void setInternalNotificationLifecycleCallback(U2.a aVar) {
        this.intLifecycleCallback.set(aVar);
    }

    public final void setupNotificationServiceExtension(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.verbose$default(W4.o.e("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
        } catch (IllegalAccessException e7) {
            e7.printStackTrace();
        } catch (InstantiationException e8) {
            e8.printStackTrace();
        }
    }
}
