package com.onesignal.notifications.internal.summary.impl;

import android.app.NotificationManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import p5.e;
import q5.AbstractC4930b;
import q5.C4931c;
import q7.v;
import r5.InterfaceC4967c;
import r7.AbstractC4979j;
import t4.f;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import z5.AbstractC5279a;
import z5.InterfaceC5280b;

/* loaded from: classes2.dex */
public final class a implements A5.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final q5.d _dataController;
    private final InterfaceC5280b _notificationRestoreProcessor;
    private final InterfaceC4967c _summaryNotificationDisplayer;
    private final G4.a _time;

    /* renamed from: com.onesignal.notifications.internal.summary.impl.a$a, reason: collision with other inner class name */
    public static final class C0240a extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0240a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    public static final class b extends AbstractC5219c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
        }
    }

    public static final class d extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f _applicationService, q5.d _dataController, InterfaceC4967c _summaryNotificationDisplayer, com.onesignal.core.internal.config.c _configModelStore, InterfaceC5280b _notificationRestoreProcessor, G4.a _time) {
        h.e(_applicationService, "_applicationService");
        h.e(_dataController, "_dataController");
        h.e(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        h.e(_configModelStore, "_configModelStore");
        h.e(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        h.e(_time, "_time");
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
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z8, InterfaceC5133d interfaceC5133d) {
        b bVar;
        EnumC5179a enumC5179a;
        int i;
        a aVar;
        List list;
        Object androidIdForGroup;
        String str2;
        int i4;
        Integer num;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i9 = bVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.label = i9 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                enumC5179a = EnumC5179a.f41704n;
                i = bVar2.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    q5.d dVar = this._dataController;
                    bVar2.L$0 = this;
                    bVar2.L$1 = str;
                    bVar2.Z$0 = z8;
                    bVar2.label = 1;
                    obj = dVar.listNotificationsForGroup(str, bVar2);
                    if (obj != enumC5179a) {
                        aVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            com.bumptech.glide.f.r(obj);
                            return vVar;
                        }
                        if (i == 4) {
                            com.bumptech.glide.f.r(obj);
                            return vVar;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                        return vVar;
                    }
                    i4 = bVar2.I$0;
                    z8 = bVar2.Z$0;
                    list = (List) bVar2.L$2;
                    str2 = (String) bVar2.L$1;
                    aVar = (a) bVar2.L$0;
                    com.bumptech.glide.f.r(obj);
                    num = (Integer) obj;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (i4 == 0) {
                            e.INSTANCE.getNotificationManager(aVar._applicationService.getAppContext()).cancel(intValue);
                            q5.d dVar2 = aVar._dataController;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 3;
                            if (AbstractC4930b.markAsConsumed$default(dVar2, intValue, z8, null, false, bVar2, 12, null) != enumC5179a) {
                                return vVar;
                            }
                        } else if (i4 == 1) {
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 4;
                            if (aVar.restoreSummary(str2, bVar2) != enumC5179a) {
                                return vVar;
                            }
                        } else {
                            C4931c c4931c = (C4931c) AbstractC4979j.G(list);
                            p5.d dVar3 = new p5.d(new JSONObject(c4931c.getFullData()), aVar._time);
                            dVar3.setRestoring(true);
                            dVar3.setShownTimeStamp(new Long(c4931c.getCreatedAt()));
                            InterfaceC4967c interfaceC4967c = aVar._summaryNotificationDisplayer;
                            bVar2.L$0 = null;
                            bVar2.L$1 = null;
                            bVar2.L$2 = null;
                            bVar2.label = 5;
                        }
                        return enumC5179a;
                    }
                    return vVar;
                }
                z8 = bVar2.Z$0;
                str = (String) bVar2.L$1;
                a aVar2 = (a) bVar2.L$0;
                com.bumptech.glide.f.r(obj);
                aVar = aVar2;
                list = (List) obj;
                int size = list.size();
                q5.d dVar4 = aVar._dataController;
                bVar2.L$0 = aVar;
                bVar2.L$1 = str;
                bVar2.L$2 = list;
                bVar2.Z$0 = z8;
                bVar2.I$0 = size;
                bVar2.label = 2;
                androidIdForGroup = dVar4.getAndroidIdForGroup(str, true, bVar2);
                if (androidIdForGroup != enumC5179a) {
                    str2 = str;
                    i4 = size;
                    obj = androidIdForGroup;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                    return vVar;
                }
                return enumC5179a;
            }
        }
        bVar = new b(interfaceC5133d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        enumC5179a = EnumC5179a.f41704n;
        i = bVar22.label;
        v vVar2 = v.f40183a;
        if (i != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        q5.d dVar42 = aVar._dataController;
        bVar22.L$0 = aVar;
        bVar22.L$1 = str;
        bVar22.L$2 = list;
        bVar22.Z$0 = z8;
        bVar22.I$0 = size2;
        bVar22.label = 2;
        androidIdForGroup = dVar42.getAndroidIdForGroup(str, true, bVar22);
        if (androidIdForGroup != enumC5179a) {
        }
        return enumC5179a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i;
        a aVar;
        a aVar2;
        Iterator it;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = cVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    q5.d dVar = this._dataController;
                    cVar.L$0 = this;
                    cVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, cVar);
                    if (obj != enumC5179a) {
                        aVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) cVar.L$1;
                    aVar2 = (a) cVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    c cVar2 = cVar;
                    while (it.hasNext()) {
                        C4931c c4931c = (C4931c) it.next();
                        InterfaceC5280b interfaceC5280b = aVar2._notificationRestoreProcessor;
                        cVar2.L$0 = aVar2;
                        cVar2.L$1 = it;
                        cVar2.label = 2;
                        if (AbstractC5279a.processNotification$default(interfaceC5280b, c4931c, 0, cVar2, 2, null) == enumC5179a) {
                            return enumC5179a;
                        }
                    }
                    return v.f40183a;
                }
                aVar = (a) cVar.L$0;
                com.bumptech.glide.f.r(obj);
                aVar2 = aVar;
                it = ((List) obj).iterator();
                c cVar22 = cVar;
                while (it.hasNext()) {
                }
                return v.f40183a;
            }
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cVar.label;
        if (i != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        c cVar222 = cVar;
        while (it.hasNext()) {
        }
        return v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // A5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, InterfaceC5133d interfaceC5133d) {
        C0240a c0240a;
        int i;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar;
        Integer num;
        NotificationManager notificationManager2;
        Integer num2;
        if (interfaceC5133d instanceof C0240a) {
            c0240a = (C0240a) interfaceC5133d;
            int i4 = c0240a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0240a.label = i4 - Integer.MIN_VALUE;
                Object obj = c0240a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0240a.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    q5.d dVar = this._dataController;
                    c0240a.L$0 = this;
                    c0240a.L$1 = str;
                    c0240a.L$2 = notificationManager;
                    c0240a.label = 1;
                    androidIdForGroup = dVar.getAndroidIdForGroup(str, false, c0240a);
                    if (androidIdForGroup != enumC5179a) {
                        aVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                        return vVar;
                    }
                    notificationManager2 = (NotificationManager) c0240a.L$0;
                    com.bumptech.glide.f.r(obj);
                    Integer num3 = (Integer) obj;
                    notificationManager = notificationManager2;
                    num2 = num3;
                    if (num2 != null) {
                        notificationManager.cancel(num2.intValue());
                    }
                    return vVar;
                }
                NotificationManager notificationManager3 = (NotificationManager) c0240a.L$2;
                String str2 = (String) c0240a.L$1;
                aVar = (a) c0240a.L$0;
                com.bumptech.glide.f.r(obj);
                notificationManager = notificationManager3;
                str = str2;
                androidIdForGroup = obj;
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (!((com.onesignal.core.internal.config.b) aVar._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                        q5.d dVar2 = aVar._dataController;
                        int intValue = num.intValue();
                        c0240a.L$0 = null;
                        c0240a.L$1 = null;
                        c0240a.L$2 = null;
                        c0240a.label = 3;
                        if (dVar2.markAsDismissed(intValue, c0240a) == enumC5179a) {
                        }
                    } else if (h.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                        num2 = new Integer(e.GROUPLESS_SUMMARY_ID);
                        if (num2 != null) {
                        }
                    } else {
                        q5.d dVar3 = aVar._dataController;
                        c0240a.L$0 = notificationManager;
                        c0240a.L$1 = null;
                        c0240a.L$2 = null;
                        c0240a.label = 2;
                        Object androidIdForGroup2 = dVar3.getAndroidIdForGroup(str, true, c0240a);
                        if (androidIdForGroup2 != enumC5179a) {
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
                    return enumC5179a;
                }
                return vVar;
            }
        }
        c0240a = new C0240a(interfaceC5133d);
        Object obj2 = c0240a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0240a.label;
        v vVar2 = v.f40183a;
        if (i != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return vVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // A5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i, InterfaceC5133d interfaceC5133d) {
        d dVar;
        int i4;
        a aVar;
        String str;
        if (interfaceC5133d instanceof d) {
            dVar = (d) interfaceC5133d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = dVar.label;
                v vVar = v.f40183a;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    q5.d dVar2 = this._dataController;
                    dVar.L$0 = this;
                    dVar.label = 1;
                    obj = dVar2.getGroupId(i, dVar);
                    if (obj != enumC5179a) {
                        aVar = this;
                    }
                    return enumC5179a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                    return vVar;
                }
                aVar = (a) dVar.L$0;
                com.bumptech.glide.f.r(obj);
                str = (String) obj;
                if (str != null) {
                    dVar.L$0 = null;
                    dVar.label = 2;
                    if (aVar.internalUpdateSummaryNotificationAfterChildRemoved(str, true, dVar) == enumC5179a) {
                        return enumC5179a;
                    }
                }
                return vVar;
            }
        }
        dVar = new d(interfaceC5133d);
        Object obj2 = dVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = dVar.label;
        v vVar2 = v.f40183a;
        if (i4 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return vVar2;
    }

    @Override // A5.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z8, InterfaceC5133d interfaceC5133d) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z8, interfaceC5133d);
        return internalUpdateSummaryNotificationAfterChildRemoved == EnumC5179a.f41704n ? internalUpdateSummaryNotificationAfterChildRemoved : v.f40183a;
    }
}
