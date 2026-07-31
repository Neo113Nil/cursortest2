package com.onesignal.notifications.internal.generation.impl;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import H5.X;
import H5.g0;
import H5.r0;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.display.impl.a;
import g2.InterfaceC0391a;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class a implements T2.a {
    private final T1.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final R2.d _dataController;
    private final U2.b _lifecycleService;
    private final S2.b _notificationDisplayer;
    private final b3.a _notificationSummaryManager;
    private final InterfaceC0391a _time;

    /* renamed from: com.onesignal.notifications.internal.generation.impl.a$a, reason: collision with other inner class name */
    public static final class C0060a extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0060a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.postProcessNotification(null, false, false, this);
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
            return a.this.processCollapseKey(null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    public static final class e extends AbstractC0607c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    public static final class f extends q5.g implements InterfaceC0747p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ q $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a, reason: collision with other inner class name */
        public static final class C0061a extends q5.g implements InterfaceC0743l {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ q $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0061a(a aVar, com.onesignal.notifications.internal.f fVar, q qVar, com.onesignal.notifications.internal.c cVar, InterfaceC0564d interfaceC0564d) {
                super(1, interfaceC0564d);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = qVar;
                this.$notification = cVar;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
                return new C0061a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC0564d);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                q qVar;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                int i7 = this.label;
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f5231f = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        q qVar2 = this.$wantsToDisplay;
                        qVar2.f5231f = false;
                        com.onesignal.common.threading.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = qVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == enumC0580a) {
                            return enumC0580a;
                        }
                        qVar = qVar2;
                        obj = waitForWake;
                    }
                    return v.f5219a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                AbstractC0676f.w(obj);
                qVar.f5231f = ((Boolean) obj).booleanValue();
                return v.f5219a;
            }

            @Override // x5.InterfaceC0743l
            public final Object invoke(InterfaceC0564d interfaceC0564d) {
                return ((C0061a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.notifications.internal.f fVar, q qVar, com.onesignal.notifications.internal.c cVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = qVar;
            this.$notification = cVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                X launchOnIO = com.onesignal.common.threading.b.launchOnIO(new C0061a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((g0) launchOnIO).I(this) == enumC0580a) {
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
    }

    public static final class g extends q5.g implements InterfaceC0747p {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ q $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a, reason: collision with other inner class name */
        public static final class C0062a extends q5.g implements InterfaceC0743l {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ q $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0062a(a aVar, com.onesignal.notifications.internal.g gVar, q qVar, com.onesignal.notifications.internal.c cVar, InterfaceC0564d interfaceC0564d) {
                super(1, interfaceC0564d);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = qVar;
                this.$notification = cVar;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
                return new C0062a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, interfaceC0564d);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                q qVar;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                int i7 = this.label;
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f5231f = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        q qVar2 = this.$wantsToDisplay;
                        qVar2.f5231f = false;
                        com.onesignal.common.threading.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = qVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == enumC0580a) {
                            return enumC0580a;
                        }
                        qVar = qVar2;
                        obj = waitForWake;
                    }
                    return v.f5219a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                AbstractC0676f.w(obj);
                qVar.f5231f = ((Boolean) obj).booleanValue();
                return v.f5219a;
            }

            @Override // x5.InterfaceC0743l
            public final Object invoke(InterfaceC0564d interfaceC0564d) {
                return ((C0062a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.notifications.internal.g gVar, q qVar, com.onesignal.notifications.internal.c cVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = qVar;
            this.$notification = cVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((g) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                X launchOnIO = com.onesignal.common.threading.b.launchOnIO(new C0062a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((g0) launchOnIO).I(this) == enumC0580a) {
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
    }

    public static final class h extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(T1.f _applicationService, S2.b _notificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, R2.d _dataController, b3.a _notificationSummaryManager, U2.b _lifecycleService, InterfaceC0391a _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_notificationDisplayer, "_notificationDisplayer");
        i.e(_configModelStore, "_configModelStore");
        i.e(_dataController, "_dataController");
        i.e(_notificationSummaryManager, "_notificationSummaryManager");
        i.e(_lifecycleService, "_lifecycleService");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._configModelStore = _configModelStore;
        this._dataController = _dataController;
        this._notificationSummaryManager = _notificationSummaryManager;
        this._lifecycleService = _lifecycleService;
        this._time = _time;
    }

    private final long getEXTERNAL_CALLBACKS_TIMEOUT() {
        return 30000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, InterfaceC0564d interfaceC0564d) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), interfaceC0564d);
    }

    private final boolean isNotificationWithinTTL(com.onesignal.notifications.internal.c cVar) {
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            return cVar.getSentTime() + ((long) cVar.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(Q2.d dVar, InterfaceC0564d interfaceC0564d) {
        C0060a c0060a;
        Object obj;
        int i7;
        a aVar;
        if (interfaceC0564d instanceof C0060a) {
            c0060a = (C0060a) interfaceC0564d;
            int i8 = c0060a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0060a.label = i8 - Integer.MIN_VALUE;
                obj = c0060a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0060a.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (!dVar.isNotificationToDisplay()) {
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
                    R2.d dVar2 = this._dataController;
                    int androidId = dVar.getAndroidId();
                    c0060a.L$0 = this;
                    c0060a.L$1 = dVar;
                    c0060a.label = 1;
                    obj = dVar2.markAsDismissed(androidId, c0060a);
                    if (obj != enumC0580a) {
                        aVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return vVar;
                }
                dVar = (Q2.d) c0060a.L$1;
                aVar = (a) c0060a.L$0;
                AbstractC0676f.w(obj);
                if (((Boolean) obj).booleanValue()) {
                    b3.a aVar2 = aVar._notificationSummaryManager;
                    int androidId2 = dVar.getAndroidId();
                    c0060a.L$0 = null;
                    c0060a.L$1 = null;
                    c0060a.label = 2;
                    if (aVar2.updatePossibleDependentSummaryOnDismiss(androidId2, c0060a) == enumC0580a) {
                        return enumC0580a;
                    }
                }
                return vVar;
            }
        }
        c0060a = new C0060a(interfaceC0564d);
        obj = c0060a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0060a.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r8.notificationReceived(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r8.markNotificationAsDismissed(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(Q2.d dVar, boolean z5, boolean z6, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        a aVar;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = dVar;
                    bVar.Z$0 = z6;
                    bVar.label = 1;
                    if (saveNotification(dVar, z5, bVar) != enumC0580a) {
                        aVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 == 1) {
                    z6 = bVar.Z$0;
                    dVar = (Q2.d) bVar.L$1;
                    aVar = (a) bVar.L$0;
                    AbstractC0676f.w(obj);
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return v.f5219a;
                    }
                    dVar = (Q2.d) bVar.L$1;
                    aVar = (a) bVar.L$0;
                    AbstractC0676f.w(obj);
                    U2.b bVar2 = aVar._lifecycleService;
                    bVar.L$0 = null;
                    bVar.L$1 = null;
                    bVar.label = 3;
                }
                if (!z6) {
                    bVar.L$0 = aVar;
                    bVar.L$1 = dVar;
                    bVar.label = 2;
                }
                U2.b bVar22 = aVar._lifecycleService;
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 3;
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        if (!z6) {
        }
        U2.b bVar222 = aVar._lifecycleService;
        bVar.L$0 = null;
        bVar.L$1 = null;
        bVar.label = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(Q2.d dVar, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        Integer num;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (dVar.isRestoring()) {
                        return vVar;
                    }
                    if (dVar.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                        String optString = dVar.getJsonPayload().optString("collapse_key");
                        R2.d dVar2 = this._dataController;
                        i.b(optString);
                        cVar.L$0 = dVar;
                        cVar.label = 1;
                        obj = dVar2.getAndroidIdFromCollapseKey(optString, cVar);
                        if (obj == enumC0580a) {
                            return enumC0580a;
                        }
                    }
                    return vVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (Q2.d) cVar.L$0;
                AbstractC0676f.w(obj);
                num = (Integer) obj;
                if (num != null) {
                    dVar.getNotification().setAndroidNotificationId(num.intValue());
                }
                return vVar;
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(Q2.d dVar, boolean z5, boolean z6, InterfaceC0564d interfaceC0564d) {
        d dVar2;
        int i7;
        a aVar;
        if (interfaceC0564d instanceof d) {
            dVar2 = (d) interfaceC0564d;
            int i8 = dVar2.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i8 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = dVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (z5) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            dVar2.L$0 = this;
                            dVar2.L$1 = dVar;
                            dVar2.label = 1;
                            if (processCollapseKey(dVar, dVar2) != enumC0580a) {
                                aVar = this;
                            }
                            return enumC0580a;
                        }
                    }
                    if (z6) {
                        dVar2.label = 2;
                        if (markNotificationAsDismissed(dVar, dVar2) != enumC0580a) {
                            return null;
                        }
                    } else {
                        dVar.setNotificationToDisplay(false);
                        dVar2.label = 3;
                        if (postProcessNotification(dVar, true, false, dVar2) != enumC0580a) {
                            return null;
                        }
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return null;
                }
                dVar = (Q2.d) dVar2.L$1;
                aVar = (a) dVar2.L$0;
                AbstractC0676f.w(obj);
                if (aVar.shouldDisplayNotification(dVar)) {
                    return Boolean.FALSE;
                }
                dVar.setNotificationToDisplay(true);
                return Boolean.TRUE;
            }
        }
        dVar2 = new d(interfaceC0564d);
        Object obj2 = dVar2.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar2.label;
        if (i7 != 0) {
        }
        if (aVar.shouldDisplayNotification(dVar)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(9:16|17|(1:33)(1:21)|22|(1:24)(1:32)|25|(1:27)(1:31)|28|(1:30))|11|12))|36|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotification(Q2.d dVar, boolean z5, InterfaceC0564d interfaceC0564d) {
        h hVar;
        int i7;
        if (interfaceC0564d instanceof h) {
            hVar = (h) interfaceC0564d;
            int i8 = hVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.label = i8 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = hVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                    long optLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                    R2.d dVar2 = this._dataController;
                    String optString2 = customJSONObject.optString("i");
                    i.d(optString2, "optString(...)");
                    String safeString = com.onesignal.common.e.safeString(jsonPayload, "grp");
                    boolean isNotificationToDisplay = dVar.isNotificationToDisplay();
                    int androidId = dVar.getAndroidId();
                    String valueOf = dVar.getTitle() != null ? String.valueOf(dVar.getTitle()) : null;
                    String valueOf2 = dVar.getBody() != null ? String.valueOf(dVar.getBody()) : null;
                    String jSONObject = jsonPayload.toString();
                    i.d(jSONObject, "toString(...)");
                    hVar.label = 1;
                    if (dVar2.createNotification(optString2, safeString, optString, isNotificationToDisplay, z5, androidId, valueOf, valueOf2, optLong, jSONObject, hVar) == enumC0580a) {
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
        }
        hVar = new h(interfaceC0564d);
        Object obj2 = hVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = hVar.label;
        if (i7 != 0) {
        }
        return v.f5219a;
    }

    private final boolean shouldDisplayNotification(Q2.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(Q2.d dVar) {
        if (!this._applicationService.isInForeground()) {
            com.onesignal.debug.internal.logging.b.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!dVar.isRestoring()) {
            return true;
        }
        com.onesignal.debug.internal.logging.b.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        i.e(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(Q2.c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x031f, code lost:
    
        if (r15.postProcessNotification(r13, false, r9, r3) == r4) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02c4, code lost:
    
        if (r2 == r4) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c2  */
    @Override // T2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i7, JSONObject jSONObject, boolean z5, long j4, InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i8;
        a aVar;
        JSONObject jSONObject2;
        Context context2;
        boolean z6;
        int i9;
        long j7;
        JSONObject jSONObject3;
        long j8;
        a aVar2;
        Context context3;
        com.onesignal.notifications.internal.c cVar;
        boolean z7;
        a aVar3;
        com.onesignal.notifications.internal.c cVar2;
        q qVar;
        q qVar2;
        Q2.d dVar;
        int i10;
        long external_callbacks_timeout;
        f fVar;
        q qVar3;
        Q2.d dVar2;
        com.onesignal.notifications.internal.c cVar3;
        a aVar4;
        boolean z8;
        Boolean bool;
        boolean booleanValue;
        boolean z9;
        int i11;
        boolean z10;
        a aVar5;
        a aVar6;
        boolean z11;
        long external_callbacks_timeout2;
        g gVar;
        int i12;
        Q2.d dVar3;
        a aVar7;
        Q2.d dVar4;
        int i13;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i14 = eVar.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.label = i14 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = eVar.label;
                v vVar = v.f5219a;
                switch (i8) {
                    case 0:
                        AbstractC0676f.w(obj);
                        U2.b bVar = this._lifecycleService;
                        eVar.L$0 = this;
                        eVar.L$1 = context;
                        eVar.L$2 = jSONObject;
                        eVar.I$0 = i7;
                        eVar.Z$0 = z5;
                        eVar.J$0 = j4;
                        eVar.label = 1;
                        obj = bVar.canReceiveNotification(jSONObject, eVar);
                        if (obj != enumC0580a) {
                            aVar = this;
                            jSONObject2 = jSONObject;
                            context2 = context;
                            z6 = z5;
                            i9 = i7;
                            j7 = j4;
                            if (((Boolean) obj).booleanValue()) {
                                com.onesignal.notifications.internal.c cVar4 = new com.onesignal.notifications.internal.c(null, jSONObject2, i9, aVar._time);
                                if (!z6) {
                                    eVar.L$0 = aVar;
                                    eVar.L$1 = context2;
                                    eVar.L$2 = jSONObject2;
                                    eVar.L$3 = cVar4;
                                    eVar.Z$0 = z6;
                                    eVar.J$0 = j7;
                                    eVar.label = 2;
                                    Object isDuplicateNotification = aVar.isDuplicateNotification(cVar4, eVar);
                                    if (isDuplicateNotification != enumC0580a) {
                                        Context context4 = context2;
                                        jSONObject3 = jSONObject2;
                                        j8 = j7;
                                        aVar2 = aVar;
                                        context3 = context4;
                                        cVar = cVar4;
                                        obj = isDuplicateNotification;
                                        if (!((Boolean) obj).booleanValue()) {
                                            cVar4 = cVar;
                                            jSONObject2 = jSONObject3;
                                            context2 = context3;
                                            aVar = aVar2;
                                            j7 = j8;
                                        }
                                    }
                                }
                                z7 = z6;
                                Q2.d dVar5 = new Q2.d(cVar4, jSONObject2);
                                dVar5.setShownTimeStamp(new Long(j7));
                                dVar5.setRestoring(z7);
                                q qVar4 = new q();
                                qVar4.f5231f = true;
                                com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                                try {
                                    com.onesignal.notifications.internal.f fVar2 = new com.onesignal.notifications.internal.f(context2, cVar4);
                                    external_callbacks_timeout = aVar.getEXTERNAL_CALLBACKS_TIMEOUT();
                                    com.onesignal.notifications.internal.c cVar5 = cVar4;
                                    a aVar8 = aVar;
                                    try {
                                        fVar = aVar8.new f(fVar2, qVar4, cVar5, null);
                                        aVar3 = aVar8;
                                        qVar = qVar4;
                                        cVar2 = cVar5;
                                        try {
                                            eVar.L$0 = aVar3;
                                            eVar.L$1 = cVar2;
                                            eVar.L$2 = dVar5;
                                            eVar.L$3 = qVar;
                                            eVar.Z$0 = z7;
                                            eVar.I$0 = 0;
                                            eVar.label = 3;
                                        } catch (r0 e4) {
                                            e = e4;
                                            qVar2 = qVar;
                                            dVar = dVar5;
                                            i10 = 0;
                                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + qVar2.f5231f + '.', e);
                                            boolean z12 = z7;
                                            qVar3 = qVar2;
                                            boolean z13 = qVar3.f5231f;
                                            eVar.L$0 = aVar3;
                                            eVar.L$1 = cVar2;
                                            eVar.L$2 = dVar;
                                            eVar.L$3 = qVar3;
                                            eVar.Z$0 = z12;
                                            eVar.I$0 = i10;
                                            eVar.label = 4;
                                            obj = aVar3.processHandlerResponse(dVar, z13, z12, eVar);
                                            if (obj != enumC0580a) {
                                            }
                                            return enumC0580a;
                                        } catch (Throwable th) {
                                            th = th;
                                            qVar2 = qVar;
                                            dVar = dVar5;
                                            i10 = 0;
                                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                            boolean z122 = z7;
                                            qVar3 = qVar2;
                                            boolean z132 = qVar3.f5231f;
                                            eVar.L$0 = aVar3;
                                            eVar.L$1 = cVar2;
                                            eVar.L$2 = dVar;
                                            eVar.L$3 = qVar3;
                                            eVar.Z$0 = z122;
                                            eVar.I$0 = i10;
                                            eVar.label = 4;
                                            obj = aVar3.processHandlerResponse(dVar, z132, z122, eVar);
                                            if (obj != enumC0580a) {
                                            }
                                            return enumC0580a;
                                        }
                                    } catch (r0 e7) {
                                        e = e7;
                                        aVar3 = aVar8;
                                        qVar = qVar4;
                                        cVar2 = cVar5;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        aVar3 = aVar8;
                                        qVar = qVar4;
                                        cVar2 = cVar5;
                                    }
                                } catch (r0 e8) {
                                    e = e8;
                                    aVar3 = aVar;
                                    cVar2 = cVar4;
                                    qVar = qVar4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    aVar3 = aVar;
                                    cVar2 = cVar4;
                                    qVar = qVar4;
                                }
                                if (AbstractC0165z.u(external_callbacks_timeout, fVar, eVar) != enumC0580a) {
                                    qVar2 = qVar;
                                    dVar = dVar5;
                                    i10 = 0;
                                    boolean z1222 = z7;
                                    qVar3 = qVar2;
                                    boolean z1322 = qVar3.f5231f;
                                    eVar.L$0 = aVar3;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar;
                                    eVar.L$3 = qVar3;
                                    eVar.Z$0 = z1222;
                                    eVar.I$0 = i10;
                                    eVar.label = 4;
                                    obj = aVar3.processHandlerResponse(dVar, z1322, z1222, eVar);
                                    if (obj != enumC0580a) {
                                        dVar2 = dVar;
                                        cVar3 = cVar2;
                                        aVar4 = aVar3;
                                        z8 = z1222;
                                        bool = (Boolean) obj;
                                        if (bool != null) {
                                            booleanValue = bool.booleanValue();
                                            if (!booleanValue) {
                                                z9 = z8;
                                                if (!dVar2.isRestoring()) {
                                                }
                                                if (z9) {
                                                }
                                            } else if (aVar4.shouldFireForegroundHandlers(dVar2)) {
                                                com.onesignal.debug.internal.logging.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                                qVar3.f5231f = true;
                                                try {
                                                    com.onesignal.notifications.internal.g gVar2 = new com.onesignal.notifications.internal.g(dVar2.getNotification());
                                                    external_callbacks_timeout2 = aVar4.getEXTERNAL_CALLBACKS_TIMEOUT();
                                                    q qVar5 = qVar3;
                                                    a aVar9 = aVar4;
                                                    try {
                                                        gVar = aVar9.new g(gVar2, qVar5, cVar3, null);
                                                        aVar6 = aVar9;
                                                        try {
                                                            eVar.L$0 = aVar6;
                                                            eVar.L$1 = dVar2;
                                                            eVar.L$2 = qVar3;
                                                            eVar.L$3 = null;
                                                            eVar.Z$0 = z8;
                                                            eVar.I$0 = i10;
                                                            eVar.label = 5;
                                                        } catch (r0 e9) {
                                                            e = e9;
                                                            z11 = z8;
                                                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + qVar3.f5231f + '.', e);
                                                            i12 = i10;
                                                            z10 = z11;
                                                            dVar3 = dVar2;
                                                            aVar7 = aVar6;
                                                            boolean z14 = qVar3.f5231f;
                                                            eVar.L$0 = aVar7;
                                                            eVar.L$1 = dVar3;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.Z$0 = z10;
                                                            eVar.I$0 = i12;
                                                            eVar.label = 6;
                                                            obj = aVar7.processHandlerResponse(dVar3, z14, z10, eVar);
                                                            break;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            z11 = z8;
                                                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                            i12 = i10;
                                                            z10 = z11;
                                                            dVar3 = dVar2;
                                                            aVar7 = aVar6;
                                                            boolean z142 = qVar3.f5231f;
                                                            eVar.L$0 = aVar7;
                                                            eVar.L$1 = dVar3;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.Z$0 = z10;
                                                            eVar.I$0 = i12;
                                                            eVar.label = 6;
                                                            obj = aVar7.processHandlerResponse(dVar3, z142, z10, eVar);
                                                        }
                                                    } catch (r0 e10) {
                                                        e = e10;
                                                        aVar6 = aVar9;
                                                        qVar3 = qVar5;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        aVar6 = aVar9;
                                                        qVar3 = qVar5;
                                                    }
                                                } catch (r0 e11) {
                                                    e = e11;
                                                    aVar6 = aVar4;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    aVar6 = aVar4;
                                                }
                                                if (AbstractC0165z.u(external_callbacks_timeout2, gVar, eVar) != enumC0580a) {
                                                    z11 = z8;
                                                    i12 = i10;
                                                    z10 = z11;
                                                    dVar3 = dVar2;
                                                    aVar7 = aVar6;
                                                    boolean z1422 = qVar3.f5231f;
                                                    eVar.L$0 = aVar7;
                                                    eVar.L$1 = dVar3;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z10;
                                                    eVar.I$0 = i12;
                                                    eVar.label = 6;
                                                    obj = aVar7.processHandlerResponse(dVar3, z1422, z10, eVar);
                                                }
                                            } else {
                                                i11 = i10;
                                                z10 = z8;
                                                aVar5 = aVar4;
                                                if (booleanValue) {
                                                    z9 = z10;
                                                    i13 = i11;
                                                    aVar4 = aVar5;
                                                    i10 = i13;
                                                    if (!dVar2.isRestoring()) {
                                                    }
                                                    if (z9) {
                                                    }
                                                } else {
                                                    S2.b bVar2 = aVar5._notificationDisplayer;
                                                    eVar.L$0 = aVar5;
                                                    eVar.L$1 = dVar2;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z10;
                                                    eVar.label = 7;
                                                    obj = bVar2.displayNotification(dVar2, eVar);
                                                    if (obj != enumC0580a) {
                                                        z9 = z10;
                                                        dVar4 = dVar2;
                                                        dVar2 = dVar4;
                                                        i13 = ((Boolean) obj).booleanValue();
                                                        aVar4 = aVar5;
                                                        i10 = i13;
                                                        if (!dVar2.isRestoring()) {
                                                            boolean z15 = i10 != 0;
                                                            eVar.L$0 = null;
                                                            eVar.L$1 = null;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.Z$0 = z9;
                                                            eVar.label = 8;
                                                            break;
                                                        }
                                                        if (z9) {
                                                            eVar.L$0 = null;
                                                            eVar.L$1 = null;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.label = 9;
                                                            if (AbstractC0165z.d(100L, eVar) == enumC0580a) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return vVar;
                        }
                        return enumC0580a;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        j7 = eVar.J$0;
                        z6 = eVar.Z$0;
                        i9 = eVar.I$0;
                        jSONObject2 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        AbstractC0676f.w(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return vVar;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        j8 = eVar.J$0;
                        z6 = eVar.Z$0;
                        cVar = (com.onesignal.notifications.internal.c) eVar.L$3;
                        jSONObject3 = (JSONObject) eVar.L$2;
                        context3 = (Context) eVar.L$1;
                        aVar2 = (a) eVar.L$0;
                        AbstractC0676f.w(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return vVar;
                    case 3:
                        i10 = eVar.I$0;
                        z7 = eVar.Z$0;
                        qVar2 = (q) eVar.L$3;
                        dVar = (Q2.d) eVar.L$2;
                        cVar2 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        a aVar10 = (a) eVar.L$0;
                        try {
                            AbstractC0676f.w(obj);
                            aVar3 = aVar10;
                        } catch (r0 e12) {
                            e = e12;
                            aVar3 = aVar10;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + qVar2.f5231f + '.', e);
                            boolean z12222 = z7;
                            qVar3 = qVar2;
                            boolean z13222 = qVar3.f5231f;
                            eVar.L$0 = aVar3;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = qVar3;
                            eVar.Z$0 = z12222;
                            eVar.I$0 = i10;
                            eVar.label = 4;
                            obj = aVar3.processHandlerResponse(dVar, z13222, z12222, eVar);
                            if (obj != enumC0580a) {
                            }
                            return enumC0580a;
                        } catch (Throwable th7) {
                            th = th7;
                            aVar3 = aVar10;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            boolean z122222 = z7;
                            qVar3 = qVar2;
                            boolean z132222 = qVar3.f5231f;
                            eVar.L$0 = aVar3;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = qVar3;
                            eVar.Z$0 = z122222;
                            eVar.I$0 = i10;
                            eVar.label = 4;
                            obj = aVar3.processHandlerResponse(dVar, z132222, z122222, eVar);
                            if (obj != enumC0580a) {
                            }
                            return enumC0580a;
                        }
                        boolean z1222222 = z7;
                        qVar3 = qVar2;
                        boolean z1322222 = qVar3.f5231f;
                        eVar.L$0 = aVar3;
                        eVar.L$1 = cVar2;
                        eVar.L$2 = dVar;
                        eVar.L$3 = qVar3;
                        eVar.Z$0 = z1222222;
                        eVar.I$0 = i10;
                        eVar.label = 4;
                        obj = aVar3.processHandlerResponse(dVar, z1322222, z1222222, eVar);
                        if (obj != enumC0580a) {
                        }
                        return enumC0580a;
                    case 4:
                        int i15 = eVar.I$0;
                        boolean z16 = eVar.Z$0;
                        qVar3 = (q) eVar.L$3;
                        dVar2 = (Q2.d) eVar.L$2;
                        cVar3 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar4 = (a) eVar.L$0;
                        AbstractC0676f.w(obj);
                        z8 = z16;
                        i10 = i15;
                        bool = (Boolean) obj;
                        if (bool != null) {
                        }
                        return vVar;
                    case 5:
                        i10 = eVar.I$0;
                        z11 = eVar.Z$0;
                        qVar3 = (q) eVar.L$2;
                        dVar2 = (Q2.d) eVar.L$1;
                        aVar6 = (a) eVar.L$0;
                        try {
                            AbstractC0676f.w(obj);
                        } catch (r0 e13) {
                            e = e13;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + qVar3.f5231f + '.', e);
                            i12 = i10;
                            z10 = z11;
                            dVar3 = dVar2;
                            aVar7 = aVar6;
                            boolean z14222 = qVar3.f5231f;
                            eVar.L$0 = aVar7;
                            eVar.L$1 = dVar3;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z10;
                            eVar.I$0 = i12;
                            eVar.label = 6;
                            obj = aVar7.processHandlerResponse(dVar3, z14222, z10, eVar);
                            break;
                        } catch (Throwable th8) {
                            th = th8;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i12 = i10;
                            z10 = z11;
                            dVar3 = dVar2;
                            aVar7 = aVar6;
                            boolean z142222 = qVar3.f5231f;
                            eVar.L$0 = aVar7;
                            eVar.L$1 = dVar3;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z10;
                            eVar.I$0 = i12;
                            eVar.label = 6;
                            obj = aVar7.processHandlerResponse(dVar3, z142222, z10, eVar);
                        }
                        i12 = i10;
                        z10 = z11;
                        dVar3 = dVar2;
                        aVar7 = aVar6;
                        boolean z1422222 = qVar3.f5231f;
                        eVar.L$0 = aVar7;
                        eVar.L$1 = dVar3;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z10;
                        eVar.I$0 = i12;
                        eVar.label = 6;
                        obj = aVar7.processHandlerResponse(dVar3, z1422222, z10, eVar);
                    case 6:
                        i12 = eVar.I$0;
                        z10 = eVar.Z$0;
                        dVar3 = (Q2.d) eVar.L$1;
                        aVar7 = (a) eVar.L$0;
                        AbstractC0676f.w(obj);
                        Boolean bool2 = (Boolean) obj;
                        if (bool2 != null) {
                            boolean booleanValue2 = bool2.booleanValue();
                            i11 = i12;
                            booleanValue = booleanValue2;
                            dVar2 = dVar3;
                            aVar5 = aVar7;
                            if (booleanValue) {
                            }
                        }
                        return vVar;
                    case 7:
                        z9 = eVar.Z$0;
                        dVar4 = (Q2.d) eVar.L$1;
                        aVar5 = (a) eVar.L$0;
                        AbstractC0676f.w(obj);
                        dVar2 = dVar4;
                        i13 = ((Boolean) obj).booleanValue();
                        aVar4 = aVar5;
                        i10 = i13;
                        if (!dVar2.isRestoring()) {
                        }
                        if (z9) {
                        }
                        return vVar;
                    case 8:
                        z9 = eVar.Z$0;
                        AbstractC0676f.w(obj);
                        if (z9) {
                        }
                        return vVar;
                    case 9:
                        AbstractC0676f.w(obj);
                        return vVar;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(interfaceC0564d);
        Object obj2 = eVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = eVar.label;
        v vVar2 = v.f5219a;
        switch (i8) {
        }
    }
}
