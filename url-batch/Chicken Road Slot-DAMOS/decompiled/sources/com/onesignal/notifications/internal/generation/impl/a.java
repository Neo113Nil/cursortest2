package com.onesignal.notifications.internal.generation.impl;

import a4.j;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import ge.a0;
import ge.k0;
import ge.r1;
import ge.v1;
import ge.x;
import ge.x0;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import nd.i;
import org.json.JSONObject;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ec.a {
    private final ea.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final cc.d _dataController;
    private final fc.b _lifecycleService;
    private final dc.b _notificationDisplayer;
    private final mc.a _notificationSummaryManager;
    private final sa.a _time;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.generation.impl.a$a, reason: collision with other inner class name */
    public static final class C0052a extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0052a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.postProcessNotification(null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processCollapseKey(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends i implements Function2 {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ z $wantsToDisplay;
        int label;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a, reason: collision with other inner class name */
        public static final class C0053a extends i implements Function2 {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ z $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0053a(a aVar, com.onesignal.notifications.internal.f fVar, z zVar, com.onesignal.notifications.internal.c cVar, ld.a aVar2) {
                super(2, aVar2);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = zVar;
                this.$notification = cVar;
            }

            @Override // nd.a
            public final ld.a create(Object obj, ld.a aVar) {
                return new C0053a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, ld.a aVar) {
                return ((C0053a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                z zVar;
                md.a aVar = md.a.f6622d;
                int i3 = this.label;
                if (i3 == 0) {
                    cf.c.M(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f10164d = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        z zVar2 = this.$wantsToDisplay;
                        zVar2.f10164d = false;
                        com.onesignal.common.threading.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = zVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        zVar = zVar2;
                        obj = waitForWake;
                    }
                    return Unit.f5554a;
                }
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = (z) this.L$0;
                cf.c.M(obj);
                zVar.f10164d = ((Boolean) obj).booleanValue();
                return Unit.f5554a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.notifications.internal.f fVar, z zVar, com.onesignal.notifications.internal.c cVar, ld.a aVar) {
            super(2, aVar);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = zVar;
            this.$notification = cVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((f) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                ne.e eVar = k0.f4372a;
                r1 s3 = a0.s(x0.f4413d, ne.d.f7275i, new C0053a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null), 2);
                this.label = 1;
                if (s3.w(this) == aVar) {
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
    public static final class g extends i implements Function2 {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ z $wantsToDisplay;
        int label;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a, reason: collision with other inner class name */
        public static final class C0054a extends i implements Function2 {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ z $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0054a(a aVar, com.onesignal.notifications.internal.g gVar, z zVar, com.onesignal.notifications.internal.c cVar, ld.a aVar2) {
                super(2, aVar2);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = zVar;
                this.$notification = cVar;
            }

            @Override // nd.a
            public final ld.a create(Object obj, ld.a aVar) {
                return new C0054a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, ld.a aVar) {
                return ((C0054a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                z zVar;
                md.a aVar = md.a.f6622d;
                int i3 = this.label;
                if (i3 == 0) {
                    cf.c.M(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f10164d = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        z zVar2 = this.$wantsToDisplay;
                        zVar2.f10164d = false;
                        com.onesignal.common.threading.d displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = zVar2;
                        this.label = 1;
                        Object waitForWake = displayWaiter.waitForWake(this);
                        if (waitForWake == aVar) {
                            return aVar;
                        }
                        zVar = zVar2;
                        obj = waitForWake;
                    }
                    return Unit.f5554a;
                }
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = (z) this.L$0;
                cf.c.M(obj);
                zVar.f10164d = ((Boolean) obj).booleanValue();
                return Unit.f5554a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.notifications.internal.g gVar, z zVar, com.onesignal.notifications.internal.c cVar, ld.a aVar) {
            super(2, aVar);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = zVar;
            this.$notification = cVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                ne.e eVar = k0.f4372a;
                r1 s3 = a0.s(x0.f4413d, ne.d.f7275i, new C0054a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null), 2);
                this.label = 1;
                if (s3.w(this) == aVar) {
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
    public static final class h extends nd.c {
        int label;
        /* synthetic */ Object result;

        public h(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(ea.f fVar, dc.b bVar, com.onesignal.core.internal.config.b bVar2, cc.d dVar, mc.a aVar, fc.b bVar3, sa.a aVar2) {
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        dVar.getClass();
        aVar.getClass();
        bVar3.getClass();
        aVar2.getClass();
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._configModelStore = bVar2;
        this._dataController = dVar;
        this._notificationSummaryManager = aVar;
        this._lifecycleService = bVar3;
        this._time = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, ld.a aVar) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), aVar);
    }

    private final boolean isNotificationWithinTTL(com.onesignal.notifications.internal.c cVar) {
        if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            return cVar.getSentTime() + ((long) cVar.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r8.updatePossibleDependentSummaryOnDismiss(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(bc.d dVar, ld.a aVar) {
        C0052a c0052a;
        Object obj;
        int i3;
        a aVar2;
        if (aVar instanceof C0052a) {
            c0052a = (C0052a) aVar;
            int i10 = c0052a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0052a.label = i10 - Integer.MIN_VALUE;
                obj = c0052a.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0052a.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (!dVar.isNotificationToDisplay()) {
                        return Unit.f5554a;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
                    cc.d dVar2 = this._dataController;
                    int androidId = dVar.getAndroidId();
                    c0052a.L$0 = this;
                    c0052a.L$1 = dVar;
                    c0052a.label = 1;
                    obj = dVar2.markAsDismissed(androidId, c0052a);
                    if (obj != aVar3) {
                        aVar2 = this;
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (bc.d) c0052a.L$1;
                aVar2 = (a) c0052a.L$0;
                cf.c.M(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f5554a;
                }
                mc.a aVar4 = aVar2._notificationSummaryManager;
                int androidId2 = dVar.getAndroidId();
                c0052a.L$0 = null;
                c0052a.L$1 = null;
                c0052a.label = 2;
            }
        }
        c0052a = new C0052a(aVar);
        obj = c0052a.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0052a.label;
        if (i3 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r8.notificationReceived(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r8.markNotificationAsDismissed(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(bc.d dVar, boolean z10, boolean z11, ld.a aVar) {
        b bVar;
        int i3;
        a aVar2;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    bVar.L$0 = this;
                    bVar.L$1 = dVar;
                    bVar.Z$0 = z11;
                    bVar.label = 1;
                    if (saveNotification(dVar, z10, bVar) != aVar3) {
                        aVar2 = this;
                    }
                    return aVar3;
                }
                if (i3 == 1) {
                    z11 = bVar.Z$0;
                    dVar = (bc.d) bVar.L$1;
                    aVar2 = (a) bVar.L$0;
                    cf.c.M(obj);
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (bc.d) bVar.L$1;
                    aVar2 = (a) bVar.L$0;
                    cf.c.M(obj);
                    fc.b bVar2 = aVar2._lifecycleService;
                    bVar.L$0 = null;
                    bVar.L$1 = null;
                    bVar.label = 3;
                }
                if (!z11) {
                    bVar.L$0 = aVar2;
                    bVar.L$1 = dVar;
                    bVar.label = 2;
                }
                fc.b bVar22 = aVar2._lifecycleService;
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 3;
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        if (!z11) {
        }
        fc.b bVar222 = aVar2._lifecycleService;
        bVar.L$0 = null;
        bVar.L$1 = null;
        bVar.label = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(bc.d dVar, ld.a aVar) {
        c cVar;
        int i3;
        Integer num;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (dVar.isRestoring()) {
                        return Unit.f5554a;
                    }
                    if (!dVar.getJsonPayload().has("collapse_key") || "do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                        return Unit.f5554a;
                    }
                    String optString = dVar.getJsonPayload().optString("collapse_key");
                    cc.d dVar2 = this._dataController;
                    optString.getClass();
                    cVar.L$0 = dVar;
                    cVar.label = 1;
                    obj = dVar2.getAndroidIdFromCollapseKey(optString, cVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = (bc.d) cVar.L$0;
                    cf.c.M(obj);
                }
                num = (Integer) obj;
                if (num != null) {
                    dVar.getNotification().setAndroidNotificationId(num.intValue());
                }
                return Unit.f5554a;
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(bc.d dVar, boolean z10, boolean z11, ld.a aVar) {
        d dVar2;
        int i3;
        a aVar2;
        if (aVar instanceof d) {
            dVar2 = (d) aVar;
            int i10 = dVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = dVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (z10) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            dVar2.L$0 = this;
                            dVar2.L$1 = dVar;
                            dVar2.label = 1;
                            if (processCollapseKey(dVar, dVar2) != aVar3) {
                                aVar2 = this;
                            }
                            return aVar3;
                        }
                    }
                    if (z11) {
                        dVar2.label = 2;
                        if (markNotificationAsDismissed(dVar, dVar2) != aVar3) {
                            return null;
                        }
                    } else {
                        dVar.setNotificationToDisplay(false);
                        dVar2.label = 3;
                        if (postProcessNotification(dVar, true, false, dVar2) != aVar3) {
                            return null;
                        }
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 == 2 || i3 == 3) {
                        cf.c.M(obj);
                        return null;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (bc.d) dVar2.L$1;
                aVar2 = (a) dVar2.L$0;
                cf.c.M(obj);
                if (aVar2.shouldDisplayNotification(dVar)) {
                    return Boolean.FALSE;
                }
                dVar.setNotificationToDisplay(true);
                return Boolean.TRUE;
            }
        }
        dVar2 = new d(aVar);
        Object obj2 = dVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = dVar2.label;
        if (i3 != 0) {
        }
        if (aVar2.shouldDisplayNotification(dVar)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(9:16|17|(1:33)(1:21)|22|(1:24)(1:32)|25|(1:27)(1:31)|28|(1:30))|11|12))|36|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotification(bc.d dVar, boolean z10, ld.a aVar) {
        h hVar;
        int i3;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = hVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                    long optLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                    cc.d dVar2 = this._dataController;
                    String optString2 = customJSONObject.optString("i");
                    optString2.getClass();
                    String safeString = com.onesignal.common.e.safeString(jsonPayload, "grp");
                    boolean isNotificationToDisplay = dVar.isNotificationToDisplay();
                    int androidId = dVar.getAndroidId();
                    String valueOf = dVar.getTitle() != null ? String.valueOf(dVar.getTitle()) : null;
                    String valueOf2 = dVar.getBody() != null ? String.valueOf(dVar.getBody()) : null;
                    String jSONObject = jsonPayload.toString();
                    jSONObject.getClass();
                    hVar.label = 1;
                    if (dVar2.createNotification(optString2, safeString, optString, isNotificationToDisplay, z10, androidId, valueOf, valueOf2, optLong, jSONObject, hVar) == aVar2) {
                        return aVar2;
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
        hVar = new h(aVar);
        Object obj2 = hVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = hVar.label;
        if (i3 != 0) {
        }
        return Unit.f5554a;
    }

    private final boolean shouldDisplayNotification(bc.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(bc.d dVar) {
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

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) {
        jSONObject.getClass();
        return new JSONObject(jSONObject.optString(bc.c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0334, code lost:
    
        if (ge.a0.i(100, r3) == r4) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x031d, code lost:
    
        if (r6.postProcessNotification(r10, false, r11, r3) == r4) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02be, code lost:
    
        if (r8 == r4) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0215  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i3, JSONObject jSONObject, boolean z10, long j, ld.a aVar) {
        e eVar;
        int i10;
        JSONObject jSONObject2;
        boolean z11;
        long j3;
        a aVar2;
        Context context2;
        com.onesignal.notifications.internal.c cVar;
        long j10;
        Context context3;
        JSONObject jSONObject3;
        boolean z12;
        com.onesignal.notifications.internal.c cVar2;
        z zVar;
        bc.d dVar;
        int i11;
        int i12;
        f fVar;
        int i13;
        a aVar3;
        Object processHandlerResponse;
        boolean z13;
        int i14;
        bc.d dVar2;
        Boolean bool;
        boolean booleanValue;
        boolean z14;
        a aVar4;
        int i15;
        bc.d dVar3;
        z zVar2;
        a aVar5;
        boolean z15;
        g gVar;
        int i16;
        int i17;
        boolean z16;
        bc.d dVar4;
        a aVar6;
        Object processHandlerResponse2;
        int i18;
        bc.d dVar5;
        Object obj;
        int i19;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i20 = eVar.label;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                eVar.label = i20 - Integer.MIN_VALUE;
                Object obj2 = eVar.result;
                md.a aVar7 = md.a.f6622d;
                switch (eVar.label) {
                    case 0:
                        cf.c.M(obj2);
                        fc.b bVar = this._lifecycleService;
                        eVar.L$0 = this;
                        eVar.L$1 = context;
                        eVar.L$2 = jSONObject;
                        i10 = i3;
                        eVar.I$0 = i10;
                        eVar.Z$0 = z10;
                        eVar.J$0 = j;
                        eVar.label = 1;
                        obj2 = bVar.canReceiveNotification(jSONObject, eVar);
                        if (obj2 != aVar7) {
                            jSONObject2 = jSONObject;
                            z11 = z10;
                            j3 = j;
                            aVar2 = this;
                            context2 = context;
                            if (((Boolean) obj2).booleanValue()) {
                                return Unit.f5554a;
                            }
                            com.onesignal.notifications.internal.c cVar3 = new com.onesignal.notifications.internal.c(null, jSONObject2, i10, aVar2._time);
                            if (!z11) {
                                eVar.L$0 = aVar2;
                                eVar.L$1 = context2;
                                eVar.L$2 = jSONObject2;
                                eVar.L$3 = cVar3;
                                eVar.Z$0 = z11;
                                eVar.J$0 = j3;
                                eVar.label = 2;
                                Object isDuplicateNotification = aVar2.isDuplicateNotification(cVar3, eVar);
                                if (isDuplicateNotification != aVar7) {
                                    Context context4 = context2;
                                    cVar = cVar3;
                                    obj2 = isDuplicateNotification;
                                    j10 = j3;
                                    context3 = context4;
                                    jSONObject3 = jSONObject2;
                                    if (!((Boolean) obj2).booleanValue()) {
                                        return Unit.f5554a;
                                    }
                                    cVar3 = cVar;
                                    jSONObject2 = jSONObject3;
                                    context2 = context3;
                                    j3 = j10;
                                }
                            }
                            z12 = z11;
                            bc.d dVar6 = new bc.d(cVar3, jSONObject2);
                            dVar6.setShownTimeStamp(new Long(j3));
                            dVar6.setRestoring(z12);
                            z zVar3 = new z();
                            zVar3.f10164d = true;
                            com.onesignal.debug.internal.logging.b.info$default("Fire remoteNotificationReceived", null, 2, null);
                            try {
                                com.onesignal.notifications.internal.c cVar4 = cVar3;
                                a aVar8 = aVar2;
                                try {
                                    fVar = aVar8.new f(new com.onesignal.notifications.internal.f(context2, cVar3), zVar3, cVar4, null);
                                    zVar = zVar3;
                                    cVar2 = cVar4;
                                } catch (v1 e2) {
                                    e = e2;
                                    aVar2 = aVar8;
                                    zVar = zVar3;
                                    cVar2 = cVar4;
                                } catch (Throwable th) {
                                    th = th;
                                    aVar2 = aVar8;
                                    zVar = zVar3;
                                    cVar2 = cVar4;
                                }
                                try {
                                    eVar.L$0 = aVar2;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar6;
                                    eVar.L$3 = zVar;
                                    eVar.Z$0 = z12;
                                    eVar.I$0 = 0;
                                    eVar.label = 3;
                                } catch (v1 e9) {
                                    e = e9;
                                    dVar = dVar6;
                                    i12 = 0;
                                    com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + zVar.f10164d + '.', e);
                                    i13 = i12;
                                    boolean z17 = z12;
                                    aVar3 = aVar2;
                                    boolean z18 = zVar.f10164d;
                                    eVar.L$0 = aVar3;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar;
                                    eVar.L$3 = zVar;
                                    eVar.Z$0 = z17;
                                    eVar.I$0 = i13 == true ? 1 : 0;
                                    eVar.label = 4;
                                    processHandlerResponse = aVar3.processHandlerResponse(dVar, z18, z17, eVar);
                                    if (processHandlerResponse != aVar7) {
                                    }
                                    return aVar7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    dVar = dVar6;
                                    i11 = 0;
                                    com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                    i13 = i11;
                                    boolean z172 = z12;
                                    aVar3 = aVar2;
                                    boolean z182 = zVar.f10164d;
                                    eVar.L$0 = aVar3;
                                    eVar.L$1 = cVar2;
                                    eVar.L$2 = dVar;
                                    eVar.L$3 = zVar;
                                    eVar.Z$0 = z172;
                                    eVar.I$0 = i13 == true ? 1 : 0;
                                    eVar.label = 4;
                                    processHandlerResponse = aVar3.processHandlerResponse(dVar, z182, z172, eVar);
                                    if (processHandlerResponse != aVar7) {
                                    }
                                    return aVar7;
                                }
                            } catch (v1 e10) {
                                e = e10;
                                cVar2 = cVar3;
                                zVar = zVar3;
                            } catch (Throwable th3) {
                                th = th3;
                                cVar2 = cVar3;
                                zVar = zVar3;
                            }
                            if (a0.C(30000L, fVar, eVar) != aVar7) {
                                dVar = dVar6;
                                i13 = 0;
                                boolean z1722 = z12;
                                aVar3 = aVar2;
                                boolean z1822 = zVar.f10164d;
                                eVar.L$0 = aVar3;
                                eVar.L$1 = cVar2;
                                eVar.L$2 = dVar;
                                eVar.L$3 = zVar;
                                eVar.Z$0 = z1722;
                                eVar.I$0 = i13 == true ? 1 : 0;
                                eVar.label = 4;
                                processHandlerResponse = aVar3.processHandlerResponse(dVar, z1822, z1722, eVar);
                                if (processHandlerResponse != aVar7) {
                                    z13 = z1722;
                                    i14 = i13;
                                    dVar2 = dVar;
                                    bool = (Boolean) processHandlerResponse;
                                    if (bool != null) {
                                        return Unit.f5554a;
                                    }
                                    booleanValue = bool.booleanValue();
                                    if (!booleanValue) {
                                        z14 = z13;
                                        i19 = i14;
                                        if (!dVar2.isRestoring()) {
                                        }
                                        if (!z14) {
                                        }
                                    } else if (aVar3.shouldFireForegroundHandlers(dVar2)) {
                                        com.onesignal.debug.internal.logging.b.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                        zVar.f10164d = true;
                                        try {
                                            a aVar9 = aVar3;
                                            z zVar4 = zVar;
                                            try {
                                                gVar = aVar9.new g(new com.onesignal.notifications.internal.g(dVar2.getNotification()), zVar4, cVar2, null);
                                                aVar5 = aVar9;
                                                zVar2 = zVar4;
                                                try {
                                                    eVar.L$0 = aVar5;
                                                    eVar.L$1 = dVar2;
                                                    eVar.L$2 = zVar2;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z13;
                                                    eVar.I$0 = i14;
                                                    eVar.label = 5;
                                                } catch (v1 e11) {
                                                    e = e11;
                                                    z15 = z13;
                                                    com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + zVar2.f10164d + '.', e);
                                                    i16 = i14;
                                                    i17 = i16;
                                                    z16 = z15;
                                                    dVar4 = dVar2;
                                                    aVar6 = aVar5;
                                                    boolean z19 = zVar2.f10164d;
                                                    eVar.L$0 = aVar6;
                                                    eVar.L$1 = dVar4;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z16;
                                                    eVar.I$0 = i17;
                                                    eVar.label = 6;
                                                    processHandlerResponse2 = aVar6.processHandlerResponse(dVar4, z19, z16, eVar);
                                                    break;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    z15 = z13;
                                                    com.onesignal.debug.internal.logging.b.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                    i16 = i14;
                                                    i17 = i16;
                                                    z16 = z15;
                                                    dVar4 = dVar2;
                                                    aVar6 = aVar5;
                                                    boolean z192 = zVar2.f10164d;
                                                    eVar.L$0 = aVar6;
                                                    eVar.L$1 = dVar4;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z16;
                                                    eVar.I$0 = i17;
                                                    eVar.label = 6;
                                                    processHandlerResponse2 = aVar6.processHandlerResponse(dVar4, z192, z16, eVar);
                                                }
                                            } catch (v1 e12) {
                                                e = e12;
                                                aVar5 = aVar9;
                                                zVar2 = zVar4;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                aVar5 = aVar9;
                                                zVar2 = zVar4;
                                            }
                                        } catch (v1 e13) {
                                            e = e13;
                                            zVar2 = zVar;
                                            aVar5 = aVar3;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            zVar2 = zVar;
                                            aVar5 = aVar3;
                                        }
                                        if (a0.C(30000L, gVar, eVar) != aVar7) {
                                            z15 = z13;
                                            i16 = i14;
                                            i17 = i16;
                                            z16 = z15;
                                            dVar4 = dVar2;
                                            aVar6 = aVar5;
                                            boolean z1922 = zVar2.f10164d;
                                            eVar.L$0 = aVar6;
                                            eVar.L$1 = dVar4;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.Z$0 = z16;
                                            eVar.I$0 = i17;
                                            eVar.label = 6;
                                            processHandlerResponse2 = aVar6.processHandlerResponse(dVar4, z1922, z16, eVar);
                                        }
                                    } else {
                                        aVar4 = aVar3;
                                        i15 = i14;
                                        dVar3 = dVar2;
                                        if (booleanValue) {
                                            dVar2 = dVar3;
                                            i18 = i15;
                                            z14 = z13;
                                            aVar3 = aVar4;
                                            i19 = i18;
                                            if (!dVar2.isRestoring()) {
                                            }
                                            if (!z14) {
                                            }
                                        } else {
                                            dc.b bVar2 = aVar4._notificationDisplayer;
                                            eVar.L$0 = aVar4;
                                            eVar.L$1 = dVar3;
                                            eVar.L$2 = null;
                                            eVar.L$3 = null;
                                            eVar.Z$0 = z13;
                                            eVar.label = 7;
                                            Object displayNotification = bVar2.displayNotification(dVar3, eVar);
                                            if (displayNotification != aVar7) {
                                                dVar5 = dVar3;
                                                obj = displayNotification;
                                                z14 = z13;
                                                dVar2 = dVar5;
                                                i18 = ((Boolean) obj).booleanValue();
                                                aVar3 = aVar4;
                                                i19 = i18;
                                                if (!dVar2.isRestoring()) {
                                                    boolean z20 = i19 != 0;
                                                    eVar.L$0 = null;
                                                    eVar.L$1 = null;
                                                    eVar.L$2 = null;
                                                    eVar.L$3 = null;
                                                    eVar.Z$0 = z14;
                                                    eVar.label = 8;
                                                    break;
                                                }
                                                if (!z14) {
                                                    return Unit.f5554a;
                                                }
                                                eVar.L$0 = null;
                                                eVar.L$1 = null;
                                                eVar.L$2 = null;
                                                eVar.L$3 = null;
                                                eVar.label = 9;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar7;
                    case 1:
                        long j11 = eVar.J$0;
                        z11 = eVar.Z$0;
                        int i21 = eVar.I$0;
                        jSONObject2 = (JSONObject) eVar.L$2;
                        context2 = (Context) eVar.L$1;
                        a aVar10 = (a) eVar.L$0;
                        cf.c.M(obj2);
                        i10 = i21;
                        aVar2 = aVar10;
                        j3 = j11;
                        if (((Boolean) obj2).booleanValue()) {
                        }
                        break;
                    case 2:
                        j10 = eVar.J$0;
                        z11 = eVar.Z$0;
                        cVar = (com.onesignal.notifications.internal.c) eVar.L$3;
                        jSONObject3 = (JSONObject) eVar.L$2;
                        context3 = (Context) eVar.L$1;
                        aVar2 = (a) eVar.L$0;
                        cf.c.M(obj2);
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                        break;
                    case j.INTEGER_FIELD_NUMBER /* 3 */:
                        int i22 = eVar.I$0;
                        z12 = eVar.Z$0;
                        zVar = (z) eVar.L$3;
                        dVar = (bc.d) eVar.L$2;
                        cVar2 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        a aVar11 = (a) eVar.L$0;
                        try {
                            cf.c.M(obj2);
                            aVar2 = aVar11;
                            i13 = i22;
                        } catch (v1 e14) {
                            e = e14;
                            aVar2 = aVar11;
                            i12 = i22;
                            com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + zVar.f10164d + '.', e);
                            i13 = i12;
                            boolean z17222 = z12;
                            aVar3 = aVar2;
                            boolean z18222 = zVar.f10164d;
                            eVar.L$0 = aVar3;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = zVar;
                            eVar.Z$0 = z17222;
                            eVar.I$0 = i13 == true ? 1 : 0;
                            eVar.label = 4;
                            processHandlerResponse = aVar3.processHandlerResponse(dVar, z18222, z17222, eVar);
                            if (processHandlerResponse != aVar7) {
                            }
                            return aVar7;
                        } catch (Throwable th7) {
                            th = th7;
                            aVar2 = aVar11;
                            i11 = i22;
                            com.onesignal.debug.internal.logging.b.error("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            i13 = i11;
                            boolean z172222 = z12;
                            aVar3 = aVar2;
                            boolean z182222 = zVar.f10164d;
                            eVar.L$0 = aVar3;
                            eVar.L$1 = cVar2;
                            eVar.L$2 = dVar;
                            eVar.L$3 = zVar;
                            eVar.Z$0 = z172222;
                            eVar.I$0 = i13 == true ? 1 : 0;
                            eVar.label = 4;
                            processHandlerResponse = aVar3.processHandlerResponse(dVar, z182222, z172222, eVar);
                            if (processHandlerResponse != aVar7) {
                            }
                            return aVar7;
                        }
                        boolean z1722222 = z12;
                        aVar3 = aVar2;
                        boolean z1822222 = zVar.f10164d;
                        eVar.L$0 = aVar3;
                        eVar.L$1 = cVar2;
                        eVar.L$2 = dVar;
                        eVar.L$3 = zVar;
                        eVar.Z$0 = z1722222;
                        eVar.I$0 = i13 == true ? 1 : 0;
                        eVar.label = 4;
                        processHandlerResponse = aVar3.processHandlerResponse(dVar, z1822222, z1722222, eVar);
                        if (processHandlerResponse != aVar7) {
                        }
                        return aVar7;
                    case j.LONG_FIELD_NUMBER /* 4 */:
                        int i23 = eVar.I$0;
                        boolean z21 = eVar.Z$0;
                        zVar = (z) eVar.L$3;
                        dVar = (bc.d) eVar.L$2;
                        cVar2 = (com.onesignal.notifications.internal.c) eVar.L$1;
                        aVar3 = (a) eVar.L$0;
                        cf.c.M(obj2);
                        processHandlerResponse = obj2;
                        z13 = z21;
                        i14 = i23;
                        dVar2 = dVar;
                        bool = (Boolean) processHandlerResponse;
                        if (bool != null) {
                        }
                        break;
                    case j.STRING_FIELD_NUMBER /* 5 */:
                        i14 = eVar.I$0;
                        z15 = eVar.Z$0;
                        zVar2 = (z) eVar.L$2;
                        dVar2 = (bc.d) eVar.L$1;
                        aVar5 = (a) eVar.L$0;
                        try {
                            cf.c.M(obj2);
                            i16 = i14;
                        } catch (v1 e15) {
                            e = e15;
                            com.onesignal.debug.internal.logging.b.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + zVar2.f10164d + '.', e);
                            i16 = i14;
                            i17 = i16;
                            z16 = z15;
                            dVar4 = dVar2;
                            aVar6 = aVar5;
                            boolean z19222 = zVar2.f10164d;
                            eVar.L$0 = aVar6;
                            eVar.L$1 = dVar4;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z16;
                            eVar.I$0 = i17;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar6.processHandlerResponse(dVar4, z19222, z16, eVar);
                            break;
                        } catch (Throwable th8) {
                            th = th8;
                            com.onesignal.debug.internal.logging.b.error("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i16 = i14;
                            i17 = i16;
                            z16 = z15;
                            dVar4 = dVar2;
                            aVar6 = aVar5;
                            boolean z192222 = zVar2.f10164d;
                            eVar.L$0 = aVar6;
                            eVar.L$1 = dVar4;
                            eVar.L$2 = null;
                            eVar.L$3 = null;
                            eVar.Z$0 = z16;
                            eVar.I$0 = i17;
                            eVar.label = 6;
                            processHandlerResponse2 = aVar6.processHandlerResponse(dVar4, z192222, z16, eVar);
                        }
                        i17 = i16;
                        z16 = z15;
                        dVar4 = dVar2;
                        aVar6 = aVar5;
                        boolean z1922222 = zVar2.f10164d;
                        eVar.L$0 = aVar6;
                        eVar.L$1 = dVar4;
                        eVar.L$2 = null;
                        eVar.L$3 = null;
                        eVar.Z$0 = z16;
                        eVar.I$0 = i17;
                        eVar.label = 6;
                        processHandlerResponse2 = aVar6.processHandlerResponse(dVar4, z1922222, z16, eVar);
                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                        i17 = eVar.I$0;
                        z16 = eVar.Z$0;
                        dVar4 = (bc.d) eVar.L$1;
                        aVar6 = (a) eVar.L$0;
                        cf.c.M(obj2);
                        processHandlerResponse2 = obj2;
                        Boolean bool2 = (Boolean) processHandlerResponse2;
                        if (bool2 == null) {
                            return Unit.f5554a;
                        }
                        z13 = z16;
                        dVar3 = dVar4;
                        aVar4 = aVar6;
                        i15 = i17;
                        booleanValue = bool2.booleanValue();
                        if (booleanValue) {
                        }
                        break;
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        z14 = eVar.Z$0;
                        bc.d dVar7 = (bc.d) eVar.L$1;
                        a aVar12 = (a) eVar.L$0;
                        cf.c.M(obj2);
                        aVar4 = aVar12;
                        dVar5 = dVar7;
                        obj = obj2;
                        dVar2 = dVar5;
                        i18 = ((Boolean) obj).booleanValue();
                        aVar3 = aVar4;
                        i19 = i18;
                        if (!dVar2.isRestoring()) {
                        }
                        if (!z14) {
                        }
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        z14 = eVar.Z$0;
                        cf.c.M(obj2);
                        if (!z14) {
                        }
                        break;
                    case 9:
                        cf.c.M(obj2);
                        return Unit.f5554a;
                    default:
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        eVar = new e(aVar);
        Object obj22 = eVar.result;
        md.a aVar72 = md.a.f6622d;
        switch (eVar.label) {
        }
    }
}
