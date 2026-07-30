package com.onesignal.notifications.internal.limiting.impl;

import X5.c;
import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s3.e;
import t3.d;
import v2.f;
import x3.C1005a;

/* loaded from: classes.dex */
public final class a implements x3.b {
    private final f _applicationService;
    private final d _dataController;
    private final D3.a _notificationSummaryManager;

    /* renamed from: com.onesignal.notifications.internal.limiting.impl.a$a, reason: collision with other inner class name */
    public static final class C0064a extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0064a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimit(0, this);
        }
    }

    public static final class b extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(d _dataController, f _applicationService, D3.a _notificationSummaryManager) {
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationSummaryManager, "_notificationSummaryManager");
        this._dataController = _dataController;
        this._applicationService = _applicationService;
        this._notificationSummaryManager = _notificationSummaryManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00f9 -> B:11:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00fd -> B:12:0x00ff). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearOldestOverLimitStandard(int i2, V5.b bVar) {
        b bVar2;
        int i5;
        int length;
        Iterator it;
        a aVar;
        int i7;
        a aVar2;
        Iterator it2;
        Integer num;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i8 = bVar2.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i5 = bVar2.label;
                if (i5 != 0) {
                    V6.b.P(obj);
                    StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
                    length = (activeNotifications.length - C1005a.INSTANCE.getMaxNumberOfNotifications()) + i2;
                    if (length < 1) {
                        return Unit.f6114a;
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
                    return Unit.f6114a;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = bVar2.I$0;
                    Iterator it3 = (Iterator) bVar2.L$1;
                    a aVar4 = (a) bVar2.L$0;
                    V6.b.P(obj);
                    aVar = aVar4;
                    int i9 = i7 - 1;
                    if (i9 > 0) {
                        Iterator it4 = it3;
                        length = i9;
                        it = it4;
                        if (it.hasNext()) {
                            Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                            d dVar = aVar._dataController;
                            Intrinsics.b(num2);
                            int intValue = num2.intValue();
                            bVar2.L$0 = aVar;
                            bVar2.L$1 = it;
                            bVar2.L$2 = num2;
                            bVar2.I$0 = length;
                            bVar2.label = 1;
                            Object markAsDismissed = dVar.markAsDismissed(intValue, bVar2);
                            if (markAsDismissed != aVar3) {
                                it2 = it;
                                i7 = length;
                                num = num2;
                                aVar2 = aVar;
                                obj = markAsDismissed;
                                if (((Boolean) obj).booleanValue()) {
                                    it3 = it2;
                                    aVar = aVar2;
                                    int i92 = i7 - 1;
                                    if (i92 > 0) {
                                    }
                                } else {
                                    D3.a aVar5 = aVar2._notificationSummaryManager;
                                    Intrinsics.b(num);
                                    int intValue2 = num.intValue();
                                    bVar2.L$0 = aVar2;
                                    bVar2.L$1 = it2;
                                    bVar2.L$2 = null;
                                    bVar2.I$0 = i7;
                                    bVar2.label = 2;
                                    if (aVar5.updatePossibleDependentSummaryOnDismiss(intValue2, bVar2) != aVar3) {
                                        it3 = it2;
                                        aVar4 = aVar2;
                                        aVar = aVar4;
                                        int i922 = i7 - 1;
                                        if (i922 > 0) {
                                        }
                                    }
                                }
                            }
                            return aVar3;
                        }
                    }
                    return Unit.f6114a;
                }
                i7 = bVar2.I$0;
                num = (Integer) bVar2.L$2;
                it2 = (Iterator) bVar2.L$1;
                aVar2 = (a) bVar2.L$0;
                V6.b.P(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar32 = W5.a.f2787d;
        i5 = bVar2.label;
        if (i5 != 0) {
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
    @Override // x3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i2, V5.b bVar) {
        C0064a c0064a;
        int i5;
        a aVar;
        if (bVar instanceof C0064a) {
            c0064a = (C0064a) bVar;
            int i7 = c0064a.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0064a.label = i7 - Integer.MIN_VALUE;
                Object obj = c0064a.result;
                W5.a aVar2 = W5.a.f2787d;
                i5 = c0064a.label;
                if (i5 != 0) {
                    V6.b.P(obj);
                    try {
                        c0064a.L$0 = this;
                        c0064a.I$0 = i2;
                        c0064a.label = 1;
                    } catch (Throwable unused) {
                        aVar = this;
                        d dVar = aVar._dataController;
                        int maxNumberOfNotifications = C1005a.INSTANCE.getMaxNumberOfNotifications();
                        c0064a.L$0 = null;
                        c0064a.label = 3;
                    }
                } else if (i5 == 1 || i5 == 2) {
                    i2 = c0064a.I$0;
                    aVar = (a) c0064a.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (Throwable unused2) {
                        d dVar2 = aVar._dataController;
                        int maxNumberOfNotifications2 = C1005a.INSTANCE.getMaxNumberOfNotifications();
                        c0064a.L$0 = null;
                        c0064a.label = 3;
                    }
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                return Unit.f6114a;
            }
        }
        c0064a = new C0064a(bVar);
        Object obj2 = c0064a.result;
        W5.a aVar22 = W5.a.f2787d;
        i5 = c0064a.label;
        if (i5 != 0) {
        }
        return Unit.f6114a;
    }
}
