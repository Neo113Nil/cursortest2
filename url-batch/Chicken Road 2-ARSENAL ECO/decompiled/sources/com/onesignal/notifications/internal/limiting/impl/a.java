package com.onesignal.notifications.internal.limiting.impl;

import Q2.e;
import R2.d;
import T1.f;
import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements V2.b {
    private final f _applicationService;
    private final d _dataController;
    private final b3.a _notificationSummaryManager;

    /* renamed from: com.onesignal.notifications.internal.limiting.impl.a$a, reason: collision with other inner class name */
    public static final class C0064a extends AbstractC0607c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0064a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimit(0, this);
        }
    }

    public static final class b extends AbstractC0607c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(d _dataController, f _applicationService, b3.a _notificationSummaryManager) {
        i.e(_dataController, "_dataController");
        i.e(_applicationService, "_applicationService");
        i.e(_notificationSummaryManager, "_notificationSummaryManager");
        this._dataController = _dataController;
        this._applicationService = _applicationService;
        this._notificationSummaryManager = _notificationSummaryManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00f9 -> B:11:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00fd -> B:12:0x00ff). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearOldestOverLimitStandard(int i7, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i8;
        int length;
        Iterator it;
        a aVar;
        int i9;
        a aVar2;
        Iterator it2;
        Integer num;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = bVar.label;
                v vVar = v.f5219a;
                if (i8 != 0) {
                    AbstractC0676f.w(obj);
                    StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
                    length = (activeNotifications.length - V2.a.INSTANCE.getMaxNumberOfNotifications()) + i7;
                    if (length < 1) {
                        return vVar;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                            treeMap.put(new Long(statusBarNotification.getNotification().when), new Integer(statusBarNotification.getId()));
                        }
                    }
                    it = treeMap.entrySet().iterator();
                    aVar = this;
                    if (it.hasNext()) {
                    }
                    return vVar;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i9 = bVar.I$0;
                    Iterator it3 = (Iterator) bVar.L$1;
                    a aVar3 = (a) bVar.L$0;
                    AbstractC0676f.w(obj);
                    aVar = aVar3;
                    int i11 = i9 - 1;
                    if (i11 > 0) {
                        Iterator it4 = it3;
                        length = i11;
                        it = it4;
                        if (it.hasNext()) {
                            Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                            d dVar = aVar._dataController;
                            i.b(num2);
                            int intValue = num2.intValue();
                            bVar.L$0 = aVar;
                            bVar.L$1 = it;
                            bVar.L$2 = num2;
                            bVar.I$0 = length;
                            bVar.label = 1;
                            Object markAsDismissed = dVar.markAsDismissed(intValue, bVar);
                            if (markAsDismissed != enumC0580a) {
                                it2 = it;
                                i9 = length;
                                num = num2;
                                aVar2 = aVar;
                                obj = markAsDismissed;
                                if (((Boolean) obj).booleanValue()) {
                                    it3 = it2;
                                    aVar = aVar2;
                                    int i112 = i9 - 1;
                                    if (i112 > 0) {
                                    }
                                } else {
                                    b3.a aVar4 = aVar2._notificationSummaryManager;
                                    i.b(num);
                                    int intValue2 = num.intValue();
                                    bVar.L$0 = aVar2;
                                    bVar.L$1 = it2;
                                    bVar.L$2 = null;
                                    bVar.I$0 = i9;
                                    bVar.label = 2;
                                    if (aVar4.updatePossibleDependentSummaryOnDismiss(intValue2, bVar) != enumC0580a) {
                                        it3 = it2;
                                        aVar3 = aVar2;
                                        aVar = aVar3;
                                        int i1122 = i9 - 1;
                                        if (i1122 > 0) {
                                        }
                                    }
                                }
                            }
                            return enumC0580a;
                        }
                    }
                    return vVar;
                }
                i9 = bVar.I$0;
                num = (Integer) bVar.L$2;
                it2 = (Iterator) bVar.L$1;
                aVar2 = (a) bVar.L$0;
                AbstractC0676f.w(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = bVar.label;
        v vVar2 = v.f5219a;
        if (i8 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r7.clearOldestOverLimitFallback(r6, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (clearOldestOverLimitStandard(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // V2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i7, InterfaceC0564d interfaceC0564d) {
        C0064a c0064a;
        int i8;
        a aVar;
        if (interfaceC0564d instanceof C0064a) {
            c0064a = (C0064a) interfaceC0564d;
            int i9 = c0064a.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0064a.label = i9 - Integer.MIN_VALUE;
                Object obj = c0064a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = c0064a.label;
                if (i8 != 0) {
                    AbstractC0676f.w(obj);
                    try {
                        c0064a.L$0 = this;
                        c0064a.I$0 = i7;
                        c0064a.label = 1;
                    } catch (Throwable unused) {
                        aVar = this;
                        d dVar = aVar._dataController;
                        int maxNumberOfNotifications = V2.a.INSTANCE.getMaxNumberOfNotifications();
                        c0064a.L$0 = null;
                        c0064a.label = 3;
                    }
                } else if (i8 == 1 || i8 == 2) {
                    i7 = c0064a.I$0;
                    aVar = (a) c0064a.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (Throwable unused2) {
                        d dVar2 = aVar._dataController;
                        int maxNumberOfNotifications2 = V2.a.INSTANCE.getMaxNumberOfNotifications();
                        c0064a.L$0 = null;
                        c0064a.label = 3;
                    }
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                return v.f5219a;
            }
        }
        c0064a = new C0064a(interfaceC0564d);
        Object obj2 = c0064a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = c0064a.label;
        if (i8 != 0) {
        }
        return v.f5219a;
    }
}
