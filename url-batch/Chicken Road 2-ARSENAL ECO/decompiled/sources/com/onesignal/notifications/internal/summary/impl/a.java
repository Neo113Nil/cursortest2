package com.onesignal.notifications.internal.summary.impl;

import Q2.e;
import T1.f;
import a3.AbstractC0225a;
import a3.InterfaceC0226b;
import android.app.NotificationManager;
import g2.InterfaceC0391a;
import java.util.Iterator;
import java.util.List;
import k5.v;
import kotlin.jvm.internal.i;
import l5.AbstractC0506j;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements b3.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final R2.d _dataController;
    private final InterfaceC0226b _notificationRestoreProcessor;
    private final S2.c _summaryNotificationDisplayer;
    private final InterfaceC0391a _time;

    /* renamed from: com.onesignal.notifications.internal.summary.impl.a$a, reason: collision with other inner class name */
    public static final class C0071a extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0071a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    public static final class b extends AbstractC0607c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f _applicationService, R2.d _dataController, S2.c _summaryNotificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, InterfaceC0226b _notificationRestoreProcessor, InterfaceC0391a _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_dataController, "_dataController");
        i.e(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        i.e(_configModelStore, "_configModelStore");
        i.e(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._configModelStore = _configModelStore;
        this._notificationRestoreProcessor = _notificationRestoreProcessor;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(1:(1:(3:15|16|17)(2:20|21))(2:22|23))(2:24|25))(4:26|27|(3:29|(2:31|(0)(1:25))(1:(2:35|(0)(1:23))(1:37))|33)|17))(1:39))(3:43|(1:45)|33)|40|(4:42|27|(0)|17)|33))|49|6|7|8|(0)(0)|40|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r13.updateSummaryNotification(r15, r6) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z5, InterfaceC0564d interfaceC0564d) {
        b bVar;
        EnumC0580a enumC0580a;
        int i7;
        a aVar;
        List list;
        Object androidIdForGroup;
        String str2;
        int i8;
        Integer num;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                enumC0580a = EnumC0580a.f5697f;
                i7 = bVar2.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    R2.d dVar = this._dataController;
                    bVar2.L$0 = this;
                    bVar2.L$1 = str;
                    bVar2.Z$0 = z5;
                    bVar2.label = 1;
                    obj = dVar.listNotificationsForGroup(str, bVar2);
                    if (obj != enumC0580a) {
                        aVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            AbstractC0676f.w(obj);
                            return vVar;
                        }
                        if (i7 == 4) {
                            AbstractC0676f.w(obj);
                            return vVar;
                        }
                        if (i7 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return vVar;
                    }
                    i8 = bVar2.I$0;
                    z5 = bVar2.Z$0;
                    list = (List) bVar2.L$2;
                    str2 = (String) bVar2.L$1;
                    aVar = (a) bVar2.L$0;
                    AbstractC0676f.w(obj);
                    num = (Integer) obj;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (i8 == 0) {
                            e.INSTANCE.getNotificationManager(aVar._applicationService.getAppContext()).cancel(intValue);
                            R2.d dVar2 = aVar._dataController;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 3;
                            if (R2.b.markAsConsumed$default(dVar2, intValue, z5, null, false, bVar2, 12, null) != enumC0580a) {
                                return vVar;
                            }
                        } else if (i8 == 1) {
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 4;
                            if (aVar.restoreSummary(str2, bVar2) != enumC0580a) {
                                return vVar;
                            }
                        } else {
                            R2.c cVar = (R2.c) AbstractC0506j.E(list);
                            Q2.d dVar3 = new Q2.d(new JSONObject(cVar.getFullData()), aVar._time);
                            dVar3.setRestoring(true);
                            dVar3.setShownTimeStamp(new Long(cVar.getCreatedAt()));
                            S2.c cVar2 = aVar._summaryNotificationDisplayer;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 5;
                        }
                        return enumC0580a;
                    }
                    return vVar;
                }
                z5 = bVar2.Z$0;
                str = (String) bVar2.L$1;
                a aVar2 = (a) bVar2.L$0;
                AbstractC0676f.w(obj);
                aVar = aVar2;
                list = (List) obj;
                int size = list.size();
                R2.d dVar4 = aVar._dataController;
                bVar2.L$0 = aVar;
                bVar2.L$1 = str;
                bVar2.L$2 = list;
                bVar2.Z$0 = z5;
                bVar2.I$0 = size;
                bVar2.label = 2;
                androidIdForGroup = dVar4.getAndroidIdForGroup(str, true, bVar2);
                if (androidIdForGroup != enumC0580a) {
                    str2 = str;
                    i8 = size;
                    obj = androidIdForGroup;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                    return vVar;
                }
                return enumC0580a;
            }
        }
        bVar = new b(interfaceC0564d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        enumC0580a = EnumC0580a.f5697f;
        i7 = bVar22.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        R2.d dVar42 = aVar._dataController;
        bVar22.L$0 = aVar;
        bVar22.L$1 = str;
        bVar22.L$2 = list;
        bVar22.Z$0 = z5;
        bVar22.I$0 = size2;
        bVar22.label = 2;
        androidIdForGroup = dVar42.getAndroidIdForGroup(str, true, bVar22);
        if (androidIdForGroup != enumC0580a) {
        }
        return enumC0580a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        a aVar;
        a aVar2;
        Iterator it;
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
                    R2.d dVar = this._dataController;
                    cVar.L$0 = this;
                    cVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, cVar);
                    if (obj != enumC0580a) {
                        aVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) cVar.L$1;
                    aVar2 = (a) cVar.L$0;
                    AbstractC0676f.w(obj);
                    c cVar2 = cVar;
                    while (it.hasNext()) {
                        R2.c cVar3 = (R2.c) it.next();
                        InterfaceC0226b interfaceC0226b = aVar2._notificationRestoreProcessor;
                        cVar2.L$0 = aVar2;
                        cVar2.L$1 = it;
                        cVar2.label = 2;
                        if (AbstractC0225a.processNotification$default(interfaceC0226b, cVar3, 0, cVar2, 2, null) == enumC0580a) {
                            return enumC0580a;
                        }
                    }
                    return v.f5219a;
                }
                aVar = (a) cVar.L$0;
                AbstractC0676f.w(obj);
                aVar2 = aVar;
                it = ((List) obj).iterator();
                c cVar22 = cVar;
                while (it.hasNext()) {
                }
                return v.f5219a;
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        if (i7 != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        c cVar222 = cVar;
        while (it.hasNext()) {
        }
        return v.f5219a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // b3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, InterfaceC0564d interfaceC0564d) {
        C0071a c0071a;
        int i7;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar;
        Integer num;
        NotificationManager notificationManager2;
        Integer num2;
        if (interfaceC0564d instanceof C0071a) {
            c0071a = (C0071a) interfaceC0564d;
            int i8 = c0071a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0071a.label = i8 - Integer.MIN_VALUE;
                Object obj = c0071a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0071a.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    R2.d dVar = this._dataController;
                    c0071a.L$0 = this;
                    c0071a.L$1 = str;
                    c0071a.L$2 = notificationManager;
                    c0071a.label = 1;
                    androidIdForGroup = dVar.getAndroidIdForGroup(str, false, c0071a);
                    if (androidIdForGroup != enumC0580a) {
                        aVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return vVar;
                    }
                    notificationManager2 = (NotificationManager) c0071a.L$0;
                    AbstractC0676f.w(obj);
                    Integer num3 = (Integer) obj;
                    notificationManager = notificationManager2;
                    num2 = num3;
                    if (num2 != null) {
                        notificationManager.cancel(num2.intValue());
                    }
                    return vVar;
                }
                NotificationManager notificationManager3 = (NotificationManager) c0071a.L$2;
                String str2 = (String) c0071a.L$1;
                aVar = (a) c0071a.L$0;
                AbstractC0676f.w(obj);
                notificationManager = notificationManager3;
                str = str2;
                androidIdForGroup = obj;
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (!((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                        R2.d dVar2 = aVar._dataController;
                        int intValue = num.intValue();
                        c0071a.L$0 = null;
                        c0071a.L$1 = null;
                        c0071a.L$2 = null;
                        c0071a.label = 3;
                        if (dVar2.markAsDismissed(intValue, c0071a) == enumC0580a) {
                        }
                    } else if (i.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                        num2 = new Integer(e.GROUPLESS_SUMMARY_ID);
                        if (num2 != null) {
                        }
                    } else {
                        R2.d dVar3 = aVar._dataController;
                        c0071a.L$0 = notificationManager;
                        c0071a.L$1 = null;
                        c0071a.L$2 = null;
                        c0071a.label = 2;
                        Object androidIdForGroup2 = dVar3.getAndroidIdForGroup(str, true, c0071a);
                        if (androidIdForGroup2 != enumC0580a) {
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
                    return enumC0580a;
                }
                return vVar;
            }
        }
        c0071a = new C0071a(interfaceC0564d);
        Object obj2 = c0071a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0071a.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return vVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // b3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i7, InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i8;
        a aVar;
        String str;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = dVar.label;
                v vVar = v.f5219a;
                if (i8 != 0) {
                    AbstractC0676f.w(obj);
                    R2.d dVar2 = this._dataController;
                    dVar.L$0 = this;
                    dVar.label = 1;
                    obj = dVar2.getGroupId(i7, dVar);
                    if (obj != enumC0580a) {
                        aVar = this;
                    }
                    return enumC0580a;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return vVar;
                }
                aVar = (a) dVar.L$0;
                AbstractC0676f.w(obj);
                str = (String) obj;
                if (str != null) {
                    dVar.L$0 = null;
                    dVar.label = 2;
                    if (aVar.internalUpdateSummaryNotificationAfterChildRemoved(str, true, dVar) == enumC0580a) {
                        return enumC0580a;
                    }
                }
                return vVar;
            }
        }
        dVar = new d(interfaceC0564d);
        Object obj2 = dVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = dVar.label;
        v vVar2 = v.f5219a;
        if (i8 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return vVar2;
    }

    @Override // b3.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z5, InterfaceC0564d interfaceC0564d) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z5, interfaceC0564d);
        return internalUpdateSummaryNotificationAfterChildRemoved == EnumC0580a.f5697f ? internalUpdateSummaryNotificationAfterChildRemoved : v.f5219a;
    }
}
