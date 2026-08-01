package com.onesignal.notifications.internal.summary.impl;

import android.app.NotificationManager;
import bc.e;
import ea.f;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements mc.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final cc.d _dataController;
    private final lc.b _notificationRestoreProcessor;
    private final dc.c _summaryNotificationDisplayer;
    private final sa.a _time;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.summary.impl.a$a, reason: collision with other inner class name */
    public static final class C0062a extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0062a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f fVar, cc.d dVar, dc.c cVar, com.onesignal.core.internal.config.b bVar, lc.b bVar2, sa.a aVar) {
        fVar.getClass();
        dVar.getClass();
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._dataController = dVar;
        this._summaryNotificationDisplayer = cVar;
        this._configModelStore = bVar;
        this._notificationRestoreProcessor = bVar2;
        this._time = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(1:(1:(4:15|16|17|18)(2:21|22))(3:23|24|25))(3:26|27|28))(3:29|30|(3:32|(1:34)(1:(1:38)(1:40))|36)(2:42|43)))(1:44))(3:48|(1:50)|36)|45|(3:47|30|(0)(0))|36))|54|6|7|8|(0)(0)|45|(0)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (cc.b.markAsConsumed$default(r1, r14, r13, null, false, r6, 12, null) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r8.restoreSummary(r5, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
    
        if (r12.updateSummaryNotification(r14, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z10, ld.a aVar) {
        b bVar;
        md.a aVar2;
        int i3;
        a aVar3;
        List list;
        Object androidIdForGroup;
        String str2;
        int i10;
        Integer num;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                aVar2 = md.a.f6622d;
                i3 = bVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    cc.d dVar = this._dataController;
                    bVar2.L$0 = this;
                    bVar2.L$1 = str;
                    bVar2.Z$0 = z10;
                    bVar2.label = 1;
                    obj = dVar.listNotificationsForGroup(str, bVar2);
                    if (obj != aVar2) {
                        aVar3 = this;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        if (i3 == 4) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        if (i3 == 5) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i10 = bVar2.I$0;
                    z10 = bVar2.Z$0;
                    list = (List) bVar2.L$2;
                    str2 = (String) bVar2.L$1;
                    aVar3 = (a) bVar2.L$0;
                    cf.c.M(obj);
                    num = (Integer) obj;
                    if (num != null) {
                        return Unit.f5554a;
                    }
                    int intValue = num.intValue();
                    if (i10 == 0) {
                        e.INSTANCE.getNotificationManager(aVar3._applicationService.getAppContext()).cancel(intValue);
                        cc.d dVar2 = aVar3._dataController;
                        bVar2.L$0 = null;
                        bVar2.L$1 = null;
                        bVar2.L$2 = null;
                        bVar2.label = 3;
                    } else if (i10 == 1) {
                        bVar2.L$0 = null;
                        bVar2.L$1 = null;
                        bVar2.L$2 = null;
                        bVar2.label = 4;
                    } else {
                        cc.c cVar = (cc.c) CollectionsKt.x(list);
                        bc.d dVar3 = new bc.d(new JSONObject(cVar.getFullData()), aVar3._time);
                        dVar3.setRestoring(true);
                        dVar3.setShownTimeStamp(new Long(cVar.getCreatedAt()));
                        dc.c cVar2 = aVar3._summaryNotificationDisplayer;
                        bVar2.L$0 = null;
                        bVar2.L$1 = null;
                        bVar2.L$2 = null;
                        bVar2.label = 5;
                    }
                    return aVar2;
                }
                z10 = bVar2.Z$0;
                str = (String) bVar2.L$1;
                a aVar4 = (a) bVar2.L$0;
                cf.c.M(obj);
                aVar3 = aVar4;
                list = (List) obj;
                int size = list.size();
                cc.d dVar4 = aVar3._dataController;
                bVar2.L$0 = aVar3;
                bVar2.L$1 = str;
                bVar2.L$2 = list;
                bVar2.Z$0 = z10;
                bVar2.I$0 = size;
                bVar2.label = 2;
                androidIdForGroup = dVar4.getAndroidIdForGroup(str, true, bVar2);
                if (androidIdForGroup != aVar2) {
                    str2 = str;
                    i10 = size;
                    obj = androidIdForGroup;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                }
                return aVar2;
            }
        }
        bVar = new b(aVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        aVar2 = md.a.f6622d;
        i3 = bVar22.label;
        if (i3 != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        cc.d dVar42 = aVar3._dataController;
        bVar22.L$0 = aVar3;
        bVar22.L$1 = str;
        bVar22.L$2 = list;
        bVar22.Z$0 = z10;
        bVar22.I$0 = size2;
        bVar22.label = 2;
        androidIdForGroup = dVar42.getAndroidIdForGroup(str, true, bVar22);
        if (androidIdForGroup != aVar2) {
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, ld.a aVar) {
        c cVar;
        int i3;
        a aVar2;
        a aVar3;
        Iterator it;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                md.a aVar4 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    cc.d dVar = this._dataController;
                    cVar.L$0 = this;
                    cVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, cVar);
                    if (obj != aVar4) {
                        aVar2 = this;
                    }
                    return aVar4;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) cVar.L$1;
                    aVar3 = (a) cVar.L$0;
                    cf.c.M(obj);
                    c cVar2 = cVar;
                    while (it.hasNext()) {
                        cc.c cVar3 = (cc.c) it.next();
                        lc.b bVar = aVar3._notificationRestoreProcessor;
                        cVar2.L$0 = aVar3;
                        cVar2.L$1 = it;
                        cVar2.label = 2;
                        if (lc.a.processNotification$default(bVar, cVar3, 0, cVar2, 2, null) == aVar4) {
                            return aVar4;
                        }
                    }
                    return Unit.f5554a;
                }
                aVar2 = (a) cVar.L$0;
                cf.c.M(obj);
                aVar3 = aVar2;
                it = ((List) obj).iterator();
                c cVar22 = cVar;
                while (it.hasNext()) {
                }
                return Unit.f5554a;
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar42 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 != 0) {
        }
        aVar3 = aVar2;
        it = ((List) obj2).iterator();
        c cVar222 = cVar;
        while (it.hasNext()) {
        }
        return Unit.f5554a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        if (r11.markAsDismissed(r12, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // mc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, ld.a aVar) {
        C0062a c0062a;
        int i3;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar2;
        Integer num;
        NotificationManager notificationManager2;
        Integer num2;
        if (aVar instanceof C0062a) {
            c0062a = (C0062a) aVar;
            int i10 = c0062a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0062a.label = i10 - Integer.MIN_VALUE;
                Object obj = c0062a.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0062a.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    cc.d dVar = this._dataController;
                    c0062a.L$0 = this;
                    c0062a.L$1 = str;
                    c0062a.L$2 = notificationManager;
                    c0062a.label = 1;
                    androidIdForGroup = dVar.getAndroidIdForGroup(str, false, c0062a);
                    if (androidIdForGroup != aVar3) {
                        aVar2 = this;
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    notificationManager2 = (NotificationManager) c0062a.L$0;
                    cf.c.M(obj);
                    Integer num3 = (Integer) obj;
                    notificationManager = notificationManager2;
                    num2 = num3;
                    if (num2 != null) {
                        notificationManager.cancel(num2.intValue());
                    }
                    return Unit.f5554a;
                }
                NotificationManager notificationManager3 = (NotificationManager) c0062a.L$2;
                String str2 = (String) c0062a.L$1;
                aVar2 = (a) c0062a.L$0;
                cf.c.M(obj);
                notificationManager = notificationManager3;
                str = str2;
                androidIdForGroup = obj;
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (!((com.onesignal.core.internal.config.a) aVar2._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                        cc.d dVar2 = aVar2._dataController;
                        int intValue = num.intValue();
                        c0062a.L$0 = null;
                        c0062a.L$1 = null;
                        c0062a.L$2 = null;
                        c0062a.label = 3;
                    } else if (Intrinsics.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                        num2 = new Integer(e.GROUPLESS_SUMMARY_ID);
                        if (num2 != null) {
                        }
                    } else {
                        cc.d dVar3 = aVar2._dataController;
                        c0062a.L$0 = notificationManager;
                        c0062a.L$1 = null;
                        c0062a.L$2 = null;
                        c0062a.label = 2;
                        Object androidIdForGroup2 = dVar3.getAndroidIdForGroup(str, true, c0062a);
                        if (androidIdForGroup2 != aVar3) {
                            NotificationManager notificationManager4 = notificationManager;
                            obj = androidIdForGroup2;
                            notificationManager2 = notificationManager4;
                            Integer num32 = (Integer) obj;
                            notificationManager = notificationManager2;
                            num2 = num32;
                            if (num2 != null) {
                            }
                        }
                    }
                    return aVar3;
                }
                return Unit.f5554a;
            }
        }
        c0062a = new C0062a(aVar);
        Object obj2 = c0062a.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0062a.label;
        if (i3 != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return Unit.f5554a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6.internalUpdateSummaryNotificationAfterChildRemoved(r7, true, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // mc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i3, ld.a aVar) {
        d dVar;
        int i10;
        a aVar2;
        String str;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i11 = dVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                md.a aVar3 = md.a.f6622d;
                i10 = dVar.label;
                if (i10 != 0) {
                    cf.c.M(obj);
                    cc.d dVar2 = this._dataController;
                    dVar.L$0 = this;
                    dVar.label = 1;
                    obj = dVar2.getGroupId(i3, dVar);
                    if (obj != aVar3) {
                        aVar2 = this;
                    }
                    return aVar3;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = (a) dVar.L$0;
                cf.c.M(obj);
                str = (String) obj;
                if (str != null) {
                    return Unit.f5554a;
                }
                dVar.L$0 = null;
                dVar.label = 2;
            }
        }
        dVar = new d(aVar);
        Object obj2 = dVar.result;
        md.a aVar32 = md.a.f6622d;
        i10 = dVar.label;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    @Override // mc.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z10, ld.a aVar) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z10, aVar);
        return internalUpdateSummaryNotificationAfterChildRemoved == md.a.f6622d ? internalUpdateSummaryNotificationAfterChildRemoved : Unit.f5554a;
    }
}
