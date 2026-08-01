package com.onesignal.notifications.internal.restoration.impl;

import android.service.notification.StatusBarNotification;
import bc.e;
import cc.d;
import ea.f;
import ge.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements lc.b {
    public static final C0061a Companion = new C0061a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final ub.a _badgeCountUpdater;
    private final d _dataController;
    private final ec.b _workManager;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f fVar, ec.b bVar, d dVar, ub.a aVar) {
        fVar.getClass();
        bVar.getClass();
        dVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._workManager = bVar;
        this._dataController = dVar;
        this._badgeCountUpdater = aVar;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(8:11|12|13|(3:16|(2:18|19)(1:21)|14)|22|23|24|25)(2:27|28))(2:29|30))(3:32|33|(2:35|19)(1:36))|31|13|(1:14)|22|23|24|25))|39|6|7|(0)(0)|31|13|(1:14)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Error restoring notification records! ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:14:0x0066, B:16:0x006c, B:23:0x0081, B:30:0x003f, B:31:0x005e, B:33:0x004c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // lc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(ld.a aVar) {
        b bVar;
        int i3;
        a aVar2;
        a aVar3;
        Iterator it;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar4 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.debug.internal.logging.b.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    d dVar = this._dataController;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = dVar.listNotificationsForOutstanding(visibleNotifications, bVar);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) bVar.L$1;
                        aVar3 = (a) bVar.L$0;
                        cf.c.M(obj);
                        while (it.hasNext()) {
                            cc.c cVar = (cc.c) it.next();
                            bVar.L$0 = aVar3;
                            bVar.L$1 = it;
                            bVar.label = 2;
                            if (aVar3.processNotification(cVar, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar) == aVar4) {
                                return aVar4;
                            }
                        }
                        aVar3._badgeCountUpdater.update();
                        return Unit.f5554a;
                    }
                    aVar2 = (a) bVar.L$0;
                    cf.c.M(obj);
                }
                aVar3 = aVar2;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                aVar3._badgeCountUpdater.update();
                return Unit.f5554a;
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar42 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        aVar3 = aVar2;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        aVar3._badgeCountUpdater.update();
        return Unit.f5554a;
    }

    @Override // lc.b
    public Object processNotification(cc.c cVar, int i3, ld.a aVar) {
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), cVar.getId(), cVar.getAndroidId(), new JSONObject(cVar.getFullData()), cVar.getCreatedAt(), true, false);
        if (i3 <= 0) {
            return Unit.f5554a;
        }
        Object i10 = a0.i(i3, aVar);
        return i10 == md.a.f6622d ? i10 : Unit.f5554a;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.restoration.impl.a$a, reason: collision with other inner class name */
    public static final class C0061a {
        public /* synthetic */ C0061a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0061a() {
        }
    }
}
