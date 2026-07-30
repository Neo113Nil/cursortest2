package com.onesignal.notifications.internal.summary.impl;

import android.app.NotificationManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import s3.e;
import t3.C0928c;
import u3.InterfaceC0947c;
import v2.f;

/* loaded from: classes.dex */
public final class a implements D3.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final t3.d _dataController;
    private final C3.b _notificationRestoreProcessor;
    private final InterfaceC0947c _summaryNotificationDisplayer;
    private final I2.a _time;

    /* renamed from: com.onesignal.notifications.internal.summary.impl.a$a, reason: collision with other inner class name */
    public static final class C0071a extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0071a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    public static final class b extends X5.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
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
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f _applicationService, t3.d _dataController, InterfaceC0947c _summaryNotificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, C3.b _notificationRestoreProcessor, I2.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._configModelStore = _configModelStore;
        this._notificationRestoreProcessor = _notificationRestoreProcessor;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(1:(1:(4:15|16|17|18)(2:21|22))(3:23|24|25))(3:26|27|28))(3:29|30|(3:32|(1:34)(1:(1:38)(1:40))|36)(2:42|43)))(1:44))(3:48|(1:50)|36)|45|(3:47|30|(0)(0))|36))|54|6|7|8|(0)(0)|45|(0)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (t3.AbstractC0927b.markAsConsumed$default(r1, r14, r13, null, false, r6, 12, null) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e9, code lost:
    
        if (r8.restoreSummary(r5, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        if (r12.updateSummaryNotification(r14, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z7, V5.b bVar) {
        b bVar2;
        W5.a aVar;
        int i2;
        a aVar2;
        List list;
        Object androidIdForGroup;
        String str2;
        int i5;
        Integer num;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i7 = bVar2.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i7 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                Object obj = bVar3.result;
                aVar = W5.a.f2787d;
                i2 = bVar3.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    t3.d dVar = this._dataController;
                    bVar3.L$0 = this;
                    bVar3.L$1 = str;
                    bVar3.Z$0 = z7;
                    bVar3.label = 1;
                    obj = dVar.listNotificationsForGroup(str, bVar3);
                    if (obj != aVar) {
                        aVar2 = this;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            V6.b.P(obj);
                            return Unit.f6114a;
                        }
                        if (i2 == 4) {
                            V6.b.P(obj);
                            return Unit.f6114a;
                        }
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    i5 = bVar3.I$0;
                    z7 = bVar3.Z$0;
                    list = (List) bVar3.L$2;
                    str2 = (String) bVar3.L$1;
                    aVar2 = (a) bVar3.L$0;
                    V6.b.P(obj);
                    num = (Integer) obj;
                    if (num != null) {
                        return Unit.f6114a;
                    }
                    int intValue = num.intValue();
                    if (i5 == 0) {
                        e.INSTANCE.getNotificationManager(aVar2._applicationService.getAppContext()).cancel(intValue);
                        t3.d dVar2 = aVar2._dataController;
                        bVar3.L$0 = null;
                        bVar3.L$1 = null;
                        bVar3.L$2 = null;
                        bVar3.label = 3;
                    } else if (i5 == 1) {
                        bVar3.L$0 = null;
                        bVar3.L$1 = null;
                        bVar3.L$2 = null;
                        bVar3.label = 4;
                    } else {
                        C0928c c0928c = (C0928c) CollectionsKt.o(list);
                        s3.d dVar3 = new s3.d(new JSONObject(c0928c.getFullData()), aVar2._time);
                        dVar3.setRestoring(true);
                        dVar3.setShownTimeStamp(new Long(c0928c.getCreatedAt()));
                        InterfaceC0947c interfaceC0947c = aVar2._summaryNotificationDisplayer;
                        bVar3.L$0 = null;
                        bVar3.L$1 = null;
                        bVar3.L$2 = null;
                        bVar3.label = 5;
                    }
                    return aVar;
                }
                z7 = bVar3.Z$0;
                str = (String) bVar3.L$1;
                a aVar3 = (a) bVar3.L$0;
                V6.b.P(obj);
                aVar2 = aVar3;
                list = (List) obj;
                int size = list.size();
                t3.d dVar4 = aVar2._dataController;
                bVar3.L$0 = aVar2;
                bVar3.L$1 = str;
                bVar3.L$2 = list;
                bVar3.Z$0 = z7;
                bVar3.I$0 = size;
                bVar3.label = 2;
                androidIdForGroup = dVar4.getAndroidIdForGroup(str, true, bVar3);
                if (androidIdForGroup != aVar) {
                    str2 = str;
                    i5 = size;
                    obj = androidIdForGroup;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                }
                return aVar;
            }
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        Object obj2 = bVar32.result;
        aVar = W5.a.f2787d;
        i2 = bVar32.label;
        if (i2 != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        t3.d dVar42 = aVar2._dataController;
        bVar32.L$0 = aVar2;
        bVar32.L$1 = str;
        bVar32.L$2 = list;
        bVar32.Z$0 = z7;
        bVar32.I$0 = size2;
        bVar32.label = 2;
        androidIdForGroup = dVar42.getAndroidIdForGroup(str, true, bVar32);
        if (androidIdForGroup != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, V5.b bVar) {
        c cVar;
        int i2;
        a aVar;
        a aVar2;
        Iterator it;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = cVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    t3.d dVar = this._dataController;
                    cVar.L$0 = this;
                    cVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, cVar);
                    if (obj != aVar3) {
                        aVar = this;
                    }
                    return aVar3;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) cVar.L$1;
                    aVar2 = (a) cVar.L$0;
                    V6.b.P(obj);
                    c cVar2 = cVar;
                    while (it.hasNext()) {
                        C0928c c0928c = (C0928c) it.next();
                        C3.b bVar2 = aVar2._notificationRestoreProcessor;
                        cVar2.L$0 = aVar2;
                        cVar2.L$1 = it;
                        cVar2.label = 2;
                        if (C3.a.processNotification$default(bVar2, c0928c, 0, cVar2, 2, null) == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.f6114a;
                }
                aVar = (a) cVar.L$0;
                V6.b.P(obj);
                aVar2 = aVar;
                it = ((List) obj).iterator();
                c cVar22 = cVar;
                while (it.hasNext()) {
                }
                return Unit.f6114a;
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        c cVar222 = cVar;
        while (it.hasNext()) {
        }
        return Unit.f6114a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r11.markAsDismissed(r12, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // D3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, V5.b bVar) {
        C0071a c0071a;
        int i2;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar;
        Integer num;
        NotificationManager notificationManager2;
        Integer num2;
        if (bVar instanceof C0071a) {
            c0071a = (C0071a) bVar;
            int i5 = c0071a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0071a.label = i5 - Integer.MIN_VALUE;
                Object obj = c0071a.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0071a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    t3.d dVar = this._dataController;
                    c0071a.L$0 = this;
                    c0071a.L$1 = str;
                    c0071a.L$2 = notificationManager;
                    c0071a.label = 1;
                    androidIdForGroup = dVar.getAndroidIdForGroup(str, false, c0071a);
                    if (androidIdForGroup != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    notificationManager2 = (NotificationManager) c0071a.L$0;
                    V6.b.P(obj);
                    Integer num3 = (Integer) obj;
                    notificationManager = notificationManager2;
                    num2 = num3;
                    if (num2 != null) {
                        notificationManager.cancel(num2.intValue());
                    }
                    return Unit.f6114a;
                }
                NotificationManager notificationManager3 = (NotificationManager) c0071a.L$2;
                String str2 = (String) c0071a.L$1;
                aVar = (a) c0071a.L$0;
                V6.b.P(obj);
                notificationManager = notificationManager3;
                str = str2;
                androidIdForGroup = obj;
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (!((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                        t3.d dVar2 = aVar._dataController;
                        int intValue = num.intValue();
                        c0071a.L$0 = null;
                        c0071a.L$1 = null;
                        c0071a.L$2 = null;
                        c0071a.label = 3;
                    } else if (Intrinsics.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                        num2 = new Integer(e.GROUPLESS_SUMMARY_ID);
                        if (num2 != null) {
                        }
                    } else {
                        t3.d dVar3 = aVar._dataController;
                        c0071a.L$0 = notificationManager;
                        c0071a.L$1 = null;
                        c0071a.L$2 = null;
                        c0071a.label = 2;
                        Object androidIdForGroup2 = dVar3.getAndroidIdForGroup(str, true, c0071a);
                        if (androidIdForGroup2 != aVar2) {
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
                    return aVar2;
                }
                return Unit.f6114a;
            }
        }
        c0071a = new C0071a(bVar);
        Object obj2 = c0071a.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0071a.label;
        if (i2 != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return Unit.f6114a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6.internalUpdateSummaryNotificationAfterChildRemoved(r7, true, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // D3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i2, V5.b bVar) {
        d dVar;
        int i5;
        a aVar;
        String str;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i7 = dVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.label = i7 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i5 = dVar.label;
                if (i5 != 0) {
                    V6.b.P(obj);
                    t3.d dVar2 = this._dataController;
                    dVar.L$0 = this;
                    dVar.label = 1;
                    obj = dVar2.getGroupId(i2, dVar);
                    if (obj != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                aVar = (a) dVar.L$0;
                V6.b.P(obj);
                str = (String) obj;
                if (str != null) {
                    return Unit.f6114a;
                }
                dVar.L$0 = null;
                dVar.label = 2;
            }
        }
        dVar = new d(bVar);
        Object obj2 = dVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i5 = dVar.label;
        if (i5 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    @Override // D3.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z7, V5.b bVar) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z7, bVar);
        return internalUpdateSummaryNotificationAfterChildRemoved == W5.a.f2787d ? internalUpdateSummaryNotificationAfterChildRemoved : Unit.f6114a;
    }
}
