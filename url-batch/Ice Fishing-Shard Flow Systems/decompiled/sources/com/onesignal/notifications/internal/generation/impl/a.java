package com.onesignal.notifications.internal.generation.impl;

import X5.j;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;
import n6.X;
import n6.f0;
import n6.q0;
import org.json.JSONObject;
import u3.InterfaceC0946b;
import v3.InterfaceC0972a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0972a {
    private final v2.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final t3.d _dataController;
    private final w3.b _lifecycleService;
    private final InterfaceC0946b _notificationDisplayer;
    private final D3.a _notificationSummaryManager;
    private final I2.a _time;

    /* renamed from: com.onesignal.notifications.internal.generation.impl.a$a, reason: collision with other inner class name */
    public static final class C0060a extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0060a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    public static final class b extends X5.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.postProcessNotification(null, false, false, this);
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
            return a.this.processCollapseKey(null, this);
        }
    }

    public static final class d extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    public static final class e extends X5.c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    public static final class f extends j implements Function2 {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ B $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a, reason: collision with other inner class name */
        public static final class C0061a extends j implements Function1 {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ B $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0061a(a aVar, com.onesignal.notifications.internal.f fVar, B b7, com.onesignal.notifications.internal.c cVar, V5.b bVar) {
                super(1, bVar);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = b7;
                this.$notification = cVar;
            }

            @Override // X5.a
            public final V5.b create(V5.b bVar) {
                return new C0061a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(V5.b bVar) {
                return ((C0061a) create(bVar)).invokeSuspend(Unit.f6114a);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                B b7;
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f6150d = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        B b8 = this.$wantsToDisplay;
                        b8.f6150d = false;
                        com.onesignal.common.threading.e displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = b8;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        b7 = b8;
                        obj = waitForWake;
                    }
                    return Unit.f6114a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b7 = (B) this.L$0;
                V6.b.P(obj);
                b7.f6150d = ((Boolean) obj).booleanValue();
                return Unit.f6114a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.notifications.internal.f fVar, B b7, com.onesignal.notifications.internal.c cVar, V5.b bVar) {
            super(2, bVar);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = b7;
            this.$notification = cVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                X launchOnIO = com.onesignal.common.threading.b.launchOnIO(new C0061a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((f0) launchOnIO).I(this) == aVar) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((f) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class g extends j implements Function2 {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ B $wantsToDisplay;
        int label;

        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a, reason: collision with other inner class name */
        public static final class C0062a extends j implements Function1 {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ B $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0062a(a aVar, com.onesignal.notifications.internal.g gVar, B b7, com.onesignal.notifications.internal.c cVar, V5.b bVar) {
                super(1, bVar);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = b7;
                this.$notification = cVar;
            }

            @Override // X5.a
            public final V5.b create(V5.b bVar) {
                return new C0062a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(V5.b bVar) {
                return ((C0062a) create(bVar)).invokeSuspend(Unit.f6114a);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                B b7;
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f6150d = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        B b8 = this.$wantsToDisplay;
                        b8.f6150d = false;
                        com.onesignal.common.threading.e displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = b8;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        b7 = b8;
                        obj = waitForWake;
                    }
                    return Unit.f6114a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b7 = (B) this.L$0;
                V6.b.P(obj);
                b7.f6150d = ((Boolean) obj).booleanValue();
                return Unit.f6114a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.notifications.internal.g gVar, B b7, com.onesignal.notifications.internal.c cVar, V5.b bVar) {
            super(2, bVar);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = b7;
            this.$notification = cVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                X launchOnIO = com.onesignal.common.threading.b.launchOnIO(new C0062a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null));
                this.label = 1;
                if (((f0) launchOnIO).I(this) == aVar) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((g) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class h extends X5.c {
        int label;
        /* synthetic */ Object result;

        public h(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(v2.f _applicationService, InterfaceC0946b _notificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, t3.d _dataController, D3.a _notificationSummaryManager, w3.b _lifecycleService, I2.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationSummaryManager, "_notificationSummaryManager");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        Intrinsics.checkNotNullParameter(_time, "_time");
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
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, V5.b bVar) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), bVar);
    }

    private final boolean isNotificationWithinTTL(com.onesignal.notifications.internal.c cVar) {
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            return cVar.getSentTime() + ((long) cVar.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r8.updatePossibleDependentSummaryOnDismiss(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(s3.d dVar, V5.b bVar) {
        C0060a c0060a;
        Object obj;
        int i2;
        a aVar;
        if (bVar instanceof C0060a) {
            c0060a = (C0060a) bVar;
            int i5 = c0060a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0060a.label = i5 - Integer.MIN_VALUE;
                obj = c0060a.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0060a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (!dVar.isNotificationToDisplay()) {
                        return Unit.f6114a;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
                    t3.d dVar2 = this._dataController;
                    int androidId = dVar.getAndroidId();
                    c0060a.L$0 = this;
                    c0060a.L$1 = dVar;
                    c0060a.label = 1;
                    obj = dVar2.markAsDismissed(androidId, c0060a);
                    if (obj != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                dVar = (s3.d) c0060a.L$1;
                aVar = (a) c0060a.L$0;
                V6.b.P(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f6114a;
                }
                D3.a aVar3 = aVar._notificationSummaryManager;
                int androidId2 = dVar.getAndroidId();
                c0060a.L$0 = null;
                c0060a.L$1 = null;
                c0060a.label = 2;
            }
        }
        c0060a = new C0060a(bVar);
        obj = c0060a.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0060a.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
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
    public final Object postProcessNotification(s3.d dVar, boolean z7, boolean z8, V5.b bVar) {
        b bVar2;
        int i2;
        a aVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    bVar2.L$0 = this;
                    bVar2.L$1 = dVar;
                    bVar2.Z$0 = z8;
                    bVar2.label = 1;
                    if (saveNotification(dVar, z7, bVar2) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i2 == 1) {
                    z8 = bVar2.Z$0;
                    dVar = (s3.d) bVar2.L$1;
                    aVar = (a) bVar2.L$0;
                    V6.b.P(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    dVar = (s3.d) bVar2.L$1;
                    aVar = (a) bVar2.L$0;
                    V6.b.P(obj);
                    w3.b bVar3 = aVar._lifecycleService;
                    bVar2.L$0 = null;
                    bVar2.L$1 = null;
                    bVar2.label = 3;
                }
                if (!z8) {
                    bVar2.L$0 = aVar;
                    bVar2.L$1 = dVar;
                    bVar2.label = 2;
                }
                w3.b bVar32 = aVar._lifecycleService;
                bVar2.L$0 = null;
                bVar2.L$1 = null;
                bVar2.label = 3;
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        if (!z8) {
        }
        w3.b bVar322 = aVar._lifecycleService;
        bVar2.L$0 = null;
        bVar2.L$1 = null;
        bVar2.label = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(s3.d dVar, V5.b bVar) {
        c cVar;
        int i2;
        Integer num;
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
                    if (dVar.isRestoring()) {
                        return Unit.f6114a;
                    }
                    if (!dVar.getJsonPayload().has("collapse_key") || "do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                        return Unit.f6114a;
                    }
                    String optString = dVar.getJsonPayload().optString("collapse_key");
                    t3.d dVar2 = this._dataController;
                    Intrinsics.b(optString);
                    cVar.L$0 = dVar;
                    cVar.label = 1;
                    obj = dVar2.getAndroidIdFromCollapseKey(optString, cVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (s3.d) cVar.L$0;
                    V6.b.P(obj);
                }
                num = (Integer) obj;
                if (num != null) {
                    dVar.getNotification().setAndroidNotificationId(num.intValue());
                }
                return Unit.f6114a;
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(s3.d dVar, boolean z7, boolean z8, V5.b bVar) {
        d dVar2;
        int i2;
        a aVar;
        if (bVar instanceof d) {
            dVar2 = (d) bVar;
            int i5 = dVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = dVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (z7) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            dVar2.L$0 = this;
                            dVar2.L$1 = dVar;
                            dVar2.label = 1;
                            if (processCollapseKey(dVar, dVar2) != aVar2) {
                                aVar = this;
                            }
                            return aVar2;
                        }
                    }
                    if (z8) {
                        dVar2.label = 2;
                        if (markNotificationAsDismissed(dVar, dVar2) != aVar2) {
                            return null;
                        }
                    } else {
                        dVar.setNotificationToDisplay(false);
                        dVar2.label = 3;
                        if (postProcessNotification(dVar, true, false, dVar2) != aVar2) {
                            return null;
                        }
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return null;
                }
                dVar = (s3.d) dVar2.L$1;
                aVar = (a) dVar2.L$0;
                V6.b.P(obj);
                if (aVar.shouldDisplayNotification(dVar)) {
                    return Boolean.FALSE;
                }
                dVar.setNotificationToDisplay(true);
                return Boolean.TRUE;
            }
        }
        dVar2 = new d(bVar);
        Object obj2 = dVar2.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = dVar2.label;
        if (i2 != 0) {
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
    public final Object saveNotification(s3.d dVar, boolean z7, V5.b bVar) {
        h hVar;
        int i2;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i5 = hVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hVar.label = i5 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = hVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                    long optLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                    t3.d dVar2 = this._dataController;
                    String optString2 = customJSONObject.optString("i");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    String safeString = com.onesignal.common.e.safeString(jsonPayload, "grp");
                    boolean isNotificationToDisplay = dVar.isNotificationToDisplay();
                    int androidId = dVar.getAndroidId();
                    String valueOf = dVar.getTitle() != null ? String.valueOf(dVar.getTitle()) : null;
                    String valueOf2 = dVar.getBody() != null ? String.valueOf(dVar.getBody()) : null;
                    String jSONObject = jsonPayload.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                    hVar.label = 1;
                    if (dVar2.createNotification(optString2, safeString, optString, isNotificationToDisplay, z7, androidId, valueOf, valueOf2, optLong, jSONObject, hVar) == aVar) {
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
        hVar = new h(bVar);
        Object obj2 = hVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = hVar.label;
        if (i2 != 0) {
        }
        return Unit.f6114a;
    }

    private final boolean shouldDisplayNotification(s3.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(s3.d dVar) {
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
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(s3.c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x033d, code lost:
    
        if (n6.AbstractC0792z.d(100, r3) == r4) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0325, code lost:
    
        if (r14.postProcessNotification(r12, false, r9, r3) == r4) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02c4, code lost:
    
        if (r2 != r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0272, code lost:
    
        if (n6.AbstractC0792z.u(r9, r15, r3) == r4) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021f  */
    @Override // v3.InterfaceC0972a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i2, JSONObject jSONObject, boolean z7, long j, V5.b bVar) {
        e eVar;
        int i5;
        boolean z8;
        a aVar;
        long j7;
        JSONObject jSONObject2;
        Context context2;
        boolean z9;
        Object obj;
        boolean z10;
        long j8;
        com.onesignal.notifications.internal.c cVar;
        s3.d dVar;
        B b7;
        com.onesignal.notifications.internal.c cVar2;
        B b8;
        com.onesignal.notifications.internal.c cVar3;
        s3.d dVar2;
        B b9;
        int i7;
        long external_callbacks_timeout;
        f fVar;
        com.onesignal.notifications.internal.c cVar4;
        a aVar2;
        B b10;
        Object processHandlerResponse;
        boolean z11;
        s3.d dVar3;
        com.onesignal.notifications.internal.c cVar5;
        a aVar3;
        Boolean bool;
        boolean booleanValue;
        boolean z12;
        a aVar4;
        int i8;
        boolean z13;
        int i9;
        s3.d dVar4;
        Object obj2;
        int i10;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                Object obj3 = eVar.result;
                W5.a aVar5 = W5.a.f2787d;
                switch (eVar.label) {
                    case 0:
                        V6.b.P(obj3);
                        w3.b bVar2 = this._lifecycleService;
                        eVar.L$0 = this;
                        eVar.L$1 = context;
                        eVar.L$2 = jSONObject;
                        i5 = i2;
                        eVar.I$0 = i5;
                        z8 = z7;
                        eVar.Z$0 = z8;
                        eVar.J$0 = j;
                        eVar.label = 1;
                        obj3 = bVar2.canReceiveNotification(jSONObject, eVar);
                        if (obj3 != aVar5) {
                            aVar = this;
                            j7 = j;
                            jSONObject2 = jSONObject;
                            context2 = context;
                            if (((Boolean) obj3).booleanValue()) {
                                return Unit.f6114a;
                            }
                            com.onesignal.notifications.internal.c cVar6 = new com.onesignal.notifications.internal.c(null, jSONObject2, i5, aVar._time);
                            if (z8) {
                                z9 = z8;
                                dVar = new s3.d(cVar6, jSONObject2);
                                dVar.setShownTimeStamp(new Long(j7));
                                dVar.setRestoring(z9);
                                b7 = new B();
                                b7.f6150d = true;
                                com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                                com.onesignal.notifications.internal.f fVar2 = new com.onesignal.notifications.internal.f(context2, cVar6);
                                external_callbacks_timeout = aVar.getEXTERNAL_CALLBACKS_TIMEOUT();
                                cVar4 = cVar6;
                                aVar2 = aVar;
                                fVar = aVar2.new f(fVar2, b7, cVar4, null);
                                b8 = b7;
                                cVar2 = cVar4;
                                eVar.L$0 = aVar;
                                eVar.L$1 = cVar2;
                                eVar.L$2 = dVar;
                                eVar.L$3 = b8;
                                eVar.Z$0 = z9;
                                eVar.I$0 = 0;
                                eVar.label = 3;
                                if (AbstractC0792z.u(external_callbacks_timeout, fVar, eVar) != aVar5) {
                                }
                            } else {
                                eVar.L$0 = aVar;
                                eVar.L$1 = context2;
                                eVar.L$2 = jSONObject2;
                                eVar.L$3 = cVar6;
                                eVar.Z$0 = z8;
                                eVar.J$0 = j7;
                                eVar.label = 2;
                                Object isDuplicateNotification = aVar.isDuplicateNotification(cVar6, eVar);
                                if (isDuplicateNotification != aVar5) {
                                    obj = isDuplicateNotification;
                                    z10 = z8;
                                    j8 = j7;
                                    cVar = cVar6;
                                    if (!((Boolean) obj).booleanValue()) {
                                        return Unit.f6114a;
                                    }
                                    cVar6 = cVar;
                                    j7 = j8;
                                    z9 = z10;
                                    dVar = new s3.d(cVar6, jSONObject2);
                                    dVar.setShownTimeStamp(new Long(j7));
                                    dVar.setRestoring(z9);
                                    b7 = new B();
                                    b7.f6150d = true;
                                    com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                                    try {
                                        com.onesignal.notifications.internal.f fVar22 = new com.onesignal.notifications.internal.f(context2, cVar6);
                                        external_callbacks_timeout = aVar.getEXTERNAL_CALLBACKS_TIMEOUT();
                                        cVar4 = cVar6;
                                        aVar2 = aVar;
                                        try {
                                            fVar = aVar2.new f(fVar22, b7, cVar4, null);
                                            b8 = b7;
                                            cVar2 = cVar4;
                                            try {
                                                eVar.L$0 = aVar;
                                                eVar.L$1 = cVar2;
                                                eVar.L$2 = dVar;
                                                eVar.L$3 = b8;
                                                eVar.Z$0 = z9;
                                                eVar.I$0 = 0;
                                                eVar.label = 3;
                                            } catch (q0 e7) {
                                                e = e7;
                                                cVar3 = cVar2;
                                                dVar2 = dVar;
                                                b9 = b8;
                                                i7 = 0;
                                                com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + b9.f6150d + '.', e);
                                                boolean z14 = z9;
                                                b10 = b9;
                                                boolean z15 = b10.f6150d;
                                                eVar.L$0 = aVar;
                                                eVar.L$1 = cVar3;
                                                eVar.L$2 = dVar2;
                                                eVar.L$3 = b10;
                                                eVar.Z$0 = z14;
                                                eVar.I$0 = i7;
                                                eVar.label = 4;
                                                processHandlerResponse = aVar.processHandlerResponse(dVar2, z15, z14, eVar);
                                                if (processHandlerResponse != aVar5) {
                                                }
                                                return aVar5;
                                            } catch (Throwable th) {
                                                th = th;
                                                cVar3 = cVar2;
                                                dVar2 = dVar;
                                                b9 = b8;
                                                i7 = 0;
                                                com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                                boolean z142 = z9;
                                                b10 = b9;
                                                boolean z152 = b10.f6150d;
                                                eVar.L$0 = aVar;
                                                eVar.L$1 = cVar3;
                                                eVar.L$2 = dVar2;
                                                eVar.L$3 = b10;
                                                eVar.Z$0 = z142;
                                                eVar.I$0 = i7;
                                                eVar.label = 4;
                                                processHandlerResponse = aVar.processHandlerResponse(dVar2, z152, z142, eVar);
                                                if (processHandlerResponse != aVar5) {
                                                }
                                                return aVar5;
                                            }
                                        } catch (q0 e8) {
                                            e = e8;
                                            aVar = aVar2;
                                            b8 = b7;
                                            cVar2 = cVar4;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            aVar = aVar2;
                                            b8 = b7;
                                            cVar2 = cVar4;
                                        }
                                    } catch (q0 e9) {
                                        e = e9;
                                        cVar2 = cVar6;
                                        b8 = b7;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cVar2 = cVar6;
                                        b8 = b7;
                                    }
                                    if (AbstractC0792z.u(external_callbacks_timeout, fVar, eVar) != aVar5) {
                                        cVar3 = cVar2;
                                        dVar2 = dVar;
                                        b9 = b8;
                                        i7 = 0;
                                        boolean z1422 = z9;
                                        b10 = b9;
                                        boolean z1522 = b10.f6150d;
                                        eVar.L$0 = aVar;
                                        eVar.L$1 = cVar3;
                                        eVar.L$2 = dVar2;
                                        eVar.L$3 = b10;
                                        eVar.Z$0 = z1422;
                                        eVar.I$0 = i7;
                                        eVar.label = 4;
                                        processHandlerResponse = aVar.processHandlerResponse(dVar2, z1522, z1422, eVar);
                                        if (processHandlerResponse != aVar5) {
                                            z11 = z1422;
                                            dVar3 = dVar2;
                                            cVar5 = cVar3;
                                            aVar3 = aVar;
                                            bool = (Boolean) processHandlerResponse;
                                            if (bool != null) {
                                                return Unit.f6114a;
                                            }
                                            booleanValue = bool.booleanValue();
                                            if (!booleanValue) {
                                                z12 = z11;
                                                if (dVar3.isRestoring()) {
                                                }
                                                if (!z12) {
                                                }
                                            } else if (aVar3.shouldFireForegroundHandlers(dVar3)) {
                                                com.onesignal.debug.internal.logging.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                                b10.f6150d = true;
                                                try {
                                                    com.onesignal.notifications.internal.g gVar = new com.onesignal.notifications.internal.g(dVar3.getNotification());
                                                    long external_callbacks_timeout2 = aVar3.getEXTERNAL_CALLBACKS_TIMEOUT();
                                                    B b11 = b10;
                                                    a aVar6 = aVar3;
                                                    try {
                                                        g gVar2 = aVar6.new g(gVar, b11, cVar5, null);
                                                        aVar4 = aVar6;
                                                    } catch (q0 e10) {
                                                        e = e10;
                                                        aVar4 = aVar6;
                                                        b10 = b11;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        aVar4 = aVar6;
                                                        b10 = b11;
                                                    }
                                                } catch (q0 e11) {
                                                    e = e11;
                                                    aVar4 = aVar3;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    aVar4 = aVar3;
                                                }
                                                try {
                                                    eVar.L$0 = aVar4;
                                                    eVar.L$1 = dVar3;
                                                    eVar.L$2 = b10;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z11;
                                                    eVar.I$0 = i7;
                                                    eVar.label = 5;
                                                    break;
                                                } catch (q0 e12) {
                                                    e = e12;
                                                    com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + b10.f6150d + '.', e);
                                                    i9 = i7;
                                                    z13 = z11;
                                                    boolean z16 = b10.f6150d;
                                                    eVar.L$0 = aVar4;
                                                    eVar.L$1 = dVar3;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z13;
                                                    eVar.I$0 = i9;
                                                    eVar.label = 6;
                                                    obj3 = aVar4.processHandlerResponse(dVar3, z16, z13, eVar);
                                                    break;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                    i9 = i7;
                                                    z13 = z11;
                                                    boolean z162 = b10.f6150d;
                                                    eVar.L$0 = aVar4;
                                                    eVar.L$1 = dVar3;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z13;
                                                    eVar.I$0 = i9;
                                                    eVar.label = 6;
                                                    obj3 = aVar4.processHandlerResponse(dVar3, z162, z13, eVar);
                                                }
                                            } else {
                                                aVar4 = aVar3;
                                                i8 = i7;
                                                z13 = z11;
                                                if (booleanValue) {
                                                    z12 = z13;
                                                    i10 = i8;
                                                    aVar3 = aVar4;
                                                    i7 = i10;
                                                    if (dVar3.isRestoring()) {
                                                    }
                                                    if (!z12) {
                                                    }
                                                } else {
                                                    InterfaceC0946b interfaceC0946b = aVar4._notificationDisplayer;
                                                    eVar.L$0 = aVar4;
                                                    eVar.L$1 = dVar3;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z13;
                                                    eVar.label = 7;
                                                    obj3 = interfaceC0946b.displayNotification(dVar3, eVar);
                                                    if (obj3 != aVar5) {
                                                        z12 = z13;
                                                        dVar4 = dVar3;
                                                        dVar3 = dVar4;
                                                        i10 = ((Boolean) obj3).booleanValue();
                                                        aVar3 = aVar4;
                                                        i7 = i10;
                                                        if (dVar3.isRestoring()) {
                                                            boolean z17 = i7 != 0;
                                                            obj2 = null;
                                                            eVar.L$0 = null;
                                                            eVar.L$1 = null;
                                                            eVar.L$2 = null;
                                                            eVar.L$3 = null;
                                                            eVar.Z$0 = z12;
                                                            eVar.label = 8;
                                                            break;
                                                        } else {
                                                            obj2 = null;
                                                        }
                                                        if (!z12) {
                                                            return Unit.f6114a;
                                                        }
                                                        eVar.L$0 = obj2;
                                                        eVar.L$1 = obj2;
                                                        eVar.L$2 = obj2;
                                                        eVar.L$3 = obj2;
                                                        eVar.label = 9;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar5;
                    case 1:
                        long j9 = eVar.J$0;
                        boolean z18 = eVar.Z$0;
                        int i12 = eVar.I$0;
                        jSONObject2 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        V6.b.P(obj3);
                        j7 = j9;
                        z8 = z18;
                        i5 = i12;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        break;
                    case 2:
                        j8 = eVar.J$0;
                        z10 = eVar.Z$0;
                        com.onesignal.notifications.internal.c cVar7 = (com.onesignal.notifications.internal.c) eVar.L$3;
                        jSONObject2 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        V6.b.P(obj3);
                        cVar = cVar7;
                        obj = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        i7 = eVar.I$0;
                        z9 = eVar.Z$0;
                        b9 = (B) eVar.L$3;
                        dVar2 = (s3.d) eVar.L$2;
                        cVar3 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar = (a) eVar.L$0;
                        try {
                            V6.b.P(obj3);
                        } catch (q0 e13) {
                            e = e13;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + b9.f6150d + '.', e);
                            boolean z14222 = z9;
                            b10 = b9;
                            boolean z15222 = b10.f6150d;
                            eVar.L$0 = aVar;
                            eVar.L$1 = cVar3;
                            eVar.L$2 = dVar2;
                            eVar.L$3 = b10;
                            eVar.Z$0 = z14222;
                            eVar.I$0 = i7;
                            eVar.label = 4;
                            processHandlerResponse = aVar.processHandlerResponse(dVar2, z15222, z14222, eVar);
                            if (processHandlerResponse != aVar5) {
                            }
                            return aVar5;
                        } catch (Throwable th7) {
                            th = th7;
                            com.onesignal.debug.internal.logging.b.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            boolean z142222 = z9;
                            b10 = b9;
                            boolean z152222 = b10.f6150d;
                            eVar.L$0 = aVar;
                            eVar.L$1 = cVar3;
                            eVar.L$2 = dVar2;
                            eVar.L$3 = b10;
                            eVar.Z$0 = z142222;
                            eVar.I$0 = i7;
                            eVar.label = 4;
                            processHandlerResponse = aVar.processHandlerResponse(dVar2, z152222, z142222, eVar);
                            if (processHandlerResponse != aVar5) {
                            }
                            return aVar5;
                        }
                        boolean z1422222 = z9;
                        b10 = b9;
                        boolean z1522222 = b10.f6150d;
                        eVar.L$0 = aVar;
                        eVar.L$1 = cVar3;
                        eVar.L$2 = dVar2;
                        eVar.L$3 = b10;
                        eVar.Z$0 = z1422222;
                        eVar.I$0 = i7;
                        eVar.label = 4;
                        processHandlerResponse = aVar.processHandlerResponse(dVar2, z1522222, z1422222, eVar);
                        if (processHandlerResponse != aVar5) {
                        }
                        return aVar5;
                    case 4:
                        int i13 = eVar.I$0;
                        boolean z19 = eVar.Z$0;
                        b10 = (B) eVar.L$3;
                        dVar3 = (s3.d) eVar.L$2;
                        cVar5 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar3 = (a) eVar.L$0;
                        V6.b.P(obj3);
                        processHandlerResponse = obj3;
                        z11 = z19;
                        i7 = i13;
                        bool = (Boolean) processHandlerResponse;
                        if (bool != null) {
                        }
                        break;
                    case 5:
                        i7 = eVar.I$0;
                        boolean z20 = eVar.Z$0;
                        b10 = (B) eVar.L$2;
                        dVar3 = (s3.d) eVar.L$1;
                        aVar4 = (a) eVar.L$0;
                        try {
                            V6.b.P(obj3);
                            z11 = z20;
                        } catch (q0 e14) {
                            e = e14;
                            z11 = z20;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + b10.f6150d + '.', e);
                            i9 = i7;
                            z13 = z11;
                            boolean z1622 = b10.f6150d;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = dVar3;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z13;
                            eVar.I$0 = i9;
                            eVar.label = 6;
                            obj3 = aVar4.processHandlerResponse(dVar3, z1622, z13, eVar);
                            break;
                        } catch (Throwable th8) {
                            th = th8;
                            z11 = z20;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i9 = i7;
                            z13 = z11;
                            boolean z16222 = b10.f6150d;
                            eVar.L$0 = aVar4;
                            eVar.L$1 = dVar3;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z13;
                            eVar.I$0 = i9;
                            eVar.label = 6;
                            obj3 = aVar4.processHandlerResponse(dVar3, z16222, z13, eVar);
                        }
                        i9 = i7;
                        z13 = z11;
                        boolean z162222 = b10.f6150d;
                        eVar.L$0 = aVar4;
                        eVar.L$1 = dVar3;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z13;
                        eVar.I$0 = i9;
                        eVar.label = 6;
                        obj3 = aVar4.processHandlerResponse(dVar3, z162222, z13, eVar);
                    case 6:
                        i9 = eVar.I$0;
                        z13 = eVar.Z$0;
                        s3.d dVar5 = (s3.d) eVar.L$1;
                        a aVar7 = (a) eVar.L$0;
                        V6.b.P(obj3);
                        dVar3 = dVar5;
                        aVar4 = aVar7;
                        Boolean bool2 = (Boolean) obj3;
                        if (bool2 == null) {
                            return Unit.f6114a;
                        }
                        boolean booleanValue2 = bool2.booleanValue();
                        i8 = i9;
                        booleanValue = booleanValue2;
                        if (booleanValue) {
                        }
                        break;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        z12 = eVar.Z$0;
                        dVar4 = (s3.d) eVar.L$1;
                        a aVar8 = (a) eVar.L$0;
                        V6.b.P(obj3);
                        aVar4 = aVar8;
                        dVar3 = dVar4;
                        i10 = ((Boolean) obj3).booleanValue();
                        aVar3 = aVar4;
                        i7 = i10;
                        if (dVar3.isRestoring()) {
                        }
                        if (!z12) {
                        }
                        break;
                    case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        z12 = eVar.Z$0;
                        V6.b.P(obj3);
                        obj2 = null;
                        if (!z12) {
                        }
                        break;
                    case 9:
                        V6.b.P(obj3);
                        return Unit.f6114a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(bVar);
        Object obj32 = eVar.result;
        W5.a aVar52 = W5.a.f2787d;
        switch (eVar.label) {
        }
    }
}
