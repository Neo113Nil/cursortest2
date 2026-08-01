package com.onesignal.notifications.internal.limiting.impl;

import android.service.notification.StatusBarNotification;
import bc.e;
import cc.d;
import ea.f;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.i0;
import nd.c;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements gc.b {
    private final f _applicationService;
    private final d _dataController;
    private final mc.a _notificationSummaryManager;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.limiting.impl.a$a, reason: collision with other inner class name */
    public static final class C0056a extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0056a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimit(0, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(d dVar, f fVar, mc.a aVar) {
        dVar.getClass();
        fVar.getClass();
        aVar.getClass();
        this._dataController = dVar;
        this._applicationService = fVar;
        this._notificationSummaryManager = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00f8 -> B:11:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00fc -> B:12:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearOldestOverLimitStandard(int i3, ld.a aVar) {
        b bVar;
        int i10;
        int length;
        Iterator it;
        a aVar2;
        int i11;
        a aVar3;
        Iterator it2;
        Integer num;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar4 = md.a.f6622d;
                i10 = bVar.label;
                if (i10 != 0) {
                    cf.c.M(obj);
                    StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
                    length = (activeNotifications.length - gc.a.INSTANCE.getMaxNumberOfNotifications()) + i3;
                    if (length < 1) {
                        return Unit.f5554a;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                            treeMap.put(new Long(statusBarNotification.getNotification().when), new Integer(statusBarNotification.getId()));
                        }
                    }
                    it = treeMap.entrySet().iterator();
                    aVar2 = this;
                    if (it.hasNext()) {
                    }
                    return Unit.f5554a;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i11 = bVar.I$0;
                    Iterator it3 = (Iterator) bVar.L$1;
                    a aVar5 = (a) bVar.L$0;
                    cf.c.M(obj);
                    aVar2 = aVar5;
                    int i13 = i11 - 1;
                    if (i13 > 0) {
                        Iterator it4 = it3;
                        length = i13;
                        it = it4;
                        if (it.hasNext()) {
                            Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                            d dVar = aVar2._dataController;
                            num2.getClass();
                            int intValue = num2.intValue();
                            bVar.L$0 = aVar2;
                            bVar.L$1 = it;
                            bVar.L$2 = num2;
                            bVar.I$0 = length;
                            bVar.label = 1;
                            Object markAsDismissed = dVar.markAsDismissed(intValue, bVar);
                            if (markAsDismissed != aVar4) {
                                it2 = it;
                                i11 = length;
                                num = num2;
                                aVar3 = aVar2;
                                obj = markAsDismissed;
                                if (((Boolean) obj).booleanValue()) {
                                    it3 = it2;
                                    aVar2 = aVar3;
                                    int i132 = i11 - 1;
                                    if (i132 > 0) {
                                    }
                                } else {
                                    mc.a aVar6 = aVar3._notificationSummaryManager;
                                    num.getClass();
                                    int intValue2 = num.intValue();
                                    bVar.L$0 = aVar3;
                                    bVar.L$1 = it2;
                                    bVar.L$2 = null;
                                    bVar.I$0 = i11;
                                    bVar.label = 2;
                                    if (aVar6.updatePossibleDependentSummaryOnDismiss(intValue2, bVar) != aVar4) {
                                        it3 = it2;
                                        aVar5 = aVar3;
                                        aVar2 = aVar5;
                                        int i1322 = i11 - 1;
                                        if (i1322 > 0) {
                                        }
                                    }
                                }
                            }
                            return aVar4;
                        }
                    }
                    return Unit.f5554a;
                }
                i11 = bVar.I$0;
                num = (Integer) bVar.L$2;
                it2 = (Iterator) bVar.L$1;
                aVar3 = (a) bVar.L$0;
                cf.c.M(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar42 = md.a.f6622d;
        i10 = bVar.label;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r7.clearOldestOverLimitFallback(r6, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (clearOldestOverLimitStandard(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // gc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i3, ld.a aVar) {
        C0056a c0056a;
        int i10;
        a aVar2;
        if (aVar instanceof C0056a) {
            c0056a = (C0056a) aVar;
            int i11 = c0056a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0056a.label = i11 - Integer.MIN_VALUE;
                Object obj = c0056a.result;
                md.a aVar3 = md.a.f6622d;
                i10 = c0056a.label;
                if (i10 != 0) {
                    cf.c.M(obj);
                    try {
                        c0056a.L$0 = this;
                        c0056a.I$0 = i3;
                        c0056a.label = 1;
                    } catch (Throwable unused) {
                        aVar2 = this;
                        d dVar = aVar2._dataController;
                        int maxNumberOfNotifications = gc.a.INSTANCE.getMaxNumberOfNotifications();
                        c0056a.L$0 = null;
                        c0056a.label = 3;
                    }
                } else if (i10 == 1 || i10 == 2) {
                    i3 = c0056a.I$0;
                    aVar2 = (a) c0056a.L$0;
                    try {
                        cf.c.M(obj);
                    } catch (Throwable unused2) {
                        d dVar2 = aVar2._dataController;
                        int maxNumberOfNotifications2 = gc.a.INSTANCE.getMaxNumberOfNotifications();
                        c0056a.L$0 = null;
                        c0056a.label = 3;
                    }
                } else {
                    if (i10 != 3) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            }
        }
        c0056a = new C0056a(aVar);
        Object obj2 = c0056a.result;
        md.a aVar32 = md.a.f6622d;
        i10 = c0056a.label;
        if (i10 != 0) {
        }
        return Unit.f5554a;
    }
}
