package com.onesignal.notifications.internal.limiting.impl;

import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.h;
import p5.e;
import q5.d;
import q7.v;
import t4.f;
import u5.C5113a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements u5.b {
    private final f _applicationService;
    private final d _dataController;
    private final A5.a _notificationSummaryManager;

    /* renamed from: com.onesignal.notifications.internal.limiting.impl.a$a, reason: collision with other inner class name */
    public static final class C0233a extends AbstractC5219c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0233a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimit(0, this);
        }
    }

    public static final class b extends AbstractC5219c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(d _dataController, f _applicationService, A5.a _notificationSummaryManager) {
        h.e(_dataController, "_dataController");
        h.e(_applicationService, "_applicationService");
        h.e(_notificationSummaryManager, "_notificationSummaryManager");
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
    public final Object clearOldestOverLimitStandard(int i, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i4;
        int length;
        Iterator it;
        a aVar;
        int i9;
        a aVar2;
        Iterator it2;
        Integer num;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = bVar.label;
                v vVar = v.f40183a;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
                    length = (activeNotifications.length - C5113a.INSTANCE.getMaxNumberOfNotifications()) + i;
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
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i9 = bVar.I$0;
                    Iterator it3 = (Iterator) bVar.L$1;
                    a aVar3 = (a) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    aVar = aVar3;
                    int i11 = i9 - 1;
                    if (i11 > 0) {
                        Iterator it4 = it3;
                        length = i11;
                        it = it4;
                        if (it.hasNext()) {
                            Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                            d dVar = aVar._dataController;
                            h.b(num2);
                            int intValue = num2.intValue();
                            bVar.L$0 = aVar;
                            bVar.L$1 = it;
                            bVar.L$2 = num2;
                            bVar.I$0 = length;
                            bVar.label = 1;
                            Object markAsDismissed = dVar.markAsDismissed(intValue, bVar);
                            if (markAsDismissed != enumC5179a) {
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
                                    A5.a aVar4 = aVar2._notificationSummaryManager;
                                    h.b(num);
                                    int intValue2 = num.intValue();
                                    bVar.L$0 = aVar2;
                                    bVar.L$1 = it2;
                                    bVar.L$2 = null;
                                    bVar.I$0 = i9;
                                    bVar.label = 2;
                                    if (aVar4.updatePossibleDependentSummaryOnDismiss(intValue2, bVar) != enumC5179a) {
                                        it3 = it2;
                                        aVar3 = aVar2;
                                        aVar = aVar3;
                                        int i1122 = i9 - 1;
                                        if (i1122 > 0) {
                                        }
                                    }
                                }
                            }
                            return enumC5179a;
                        }
                    }
                    return vVar;
                }
                i9 = bVar.I$0;
                num = (Integer) bVar.L$2;
                it2 = (Iterator) bVar.L$1;
                aVar2 = (a) bVar.L$0;
                com.bumptech.glide.f.r(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = bVar.label;
        v vVar2 = v.f40183a;
        if (i4 != 0) {
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
    @Override // u5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i, InterfaceC5133d interfaceC5133d) {
        C0233a c0233a;
        int i4;
        a aVar;
        if (interfaceC5133d instanceof C0233a) {
            c0233a = (C0233a) interfaceC5133d;
            int i9 = c0233a.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0233a.label = i9 - Integer.MIN_VALUE;
                Object obj = c0233a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = c0233a.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    try {
                        c0233a.L$0 = this;
                        c0233a.I$0 = i;
                        c0233a.label = 1;
                    } catch (Throwable unused) {
                        aVar = this;
                        d dVar = aVar._dataController;
                        int maxNumberOfNotifications = C5113a.INSTANCE.getMaxNumberOfNotifications();
                        c0233a.L$0 = null;
                        c0233a.label = 3;
                    }
                } else if (i4 == 1 || i4 == 2) {
                    i = c0233a.I$0;
                    aVar = (a) c0233a.L$0;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (Throwable unused2) {
                        d dVar2 = aVar._dataController;
                        int maxNumberOfNotifications2 = C5113a.INSTANCE.getMaxNumberOfNotifications();
                        c0233a.L$0 = null;
                        c0233a.label = 3;
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return v.f40183a;
            }
        }
        c0233a = new C0233a(interfaceC5133d);
        Object obj2 = c0233a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = c0233a.label;
        if (i4 != 0) {
        }
        return v.f40183a;
    }
}
